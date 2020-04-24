package com.sample.mask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.Collections;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class StoreActivity extends AppCompatActivity {
    private static final String TAG = StoreActivity.class.getSimpleName();
    private RecyclerView storeListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        setTitle("판매처 목록");

        storeListView = findViewById(R.id.store_list);
        storeListView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        double longitude = getIntent().getDoubleExtra("longitude", 0);
        double latitude = getIntent().getDoubleExtra("latitude", 0);
        Log.i("StoreActivity", "경도=" + longitude + ", 위도=" + latitude);

        fetchStoreSale(latitude, longitude, 5000);
    }

    private void fetchStoreSale(double lat, double lng, int m) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://8oi9s0nnth.apigw.ntruss.com").addConverterFactory(GsonConverterFactory.create()).build();
        MaskApi maskApi = retrofit.create(MaskApi.class);
        maskApi.getStoresByGeo(lat, lng, m).enqueue(new Callback<StoreSaleResult>() {
            @Override
            public void onResponse(Call<StoreSaleResult> call, Response<StoreSaleResult> response) {
                if (response.code() == 200) {
                    StoreSaleResult result = response.body();
                    updateList(result);
                }
            }

            @Override
            public void onFailure(Call<StoreSaleResult> call, Throwable t) {

            }
        });
    }

    private void updateList(StoreSaleResult result) {
        if (result.stores != null && result.stores.size() > 0) {
            Collections.sort(result.stores);
            //Collections.sort(result.stores, new Store.NameSorter());
            //Collections.sort(result.stores, new Store.StockAtSorter());
            StoreAdapter adapter = new StoreAdapter(result.stores);
            storeListView.setAdapter(adapter);
        }
    }
}
