package com.sample.mask;

import com.naver.maps.map.overlay.OverlayImage;

public class Store implements Comparable<Store> {
    public String addr;
    public String code;
    public String created_at;
    public double lat;
    public double lng;
    public String name;
    public String remain_stat;
    public String stock_at;
    public String type;

    public int getAmount() {
        if ("plenty".equalsIgnoreCase(remain_stat)) {
            return 0;
        } else if ("some".equalsIgnoreCase(remain_stat)) {
            return 1;
        } else if ("few".equalsIgnoreCase(remain_stat)) {
            return 2;
        } else if ("empty".equalsIgnoreCase(remain_stat)) {
            return 3;
        } else if ("break".equalsIgnoreCase(remain_stat)) {
            return 4;
        } else {
            return 5;
        }
    }

    @Override
    public int compareTo(Store other) {
        return getAmount() - other.getAmount();
    }
}
