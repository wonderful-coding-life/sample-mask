# sample-mask
공적마스크 판매처 및 재고현황 Open API를 이용한 샘플 마스크 어플리케이션입니다.

공적마스크 Open API의 설명
https://app.swaggerhub.com/apis-docs/Promptech/public-mask-info/20200307-oas3#/StoreSaleResult

안드로이드 앱에 네이버 지도 추가하기
http://blog.naver.com/ndskr/221880849812


### 네이버 지도 추가하기
네이버 클라우드 콘솔에서 추가한 앱의 인증정보(Client ID)를 Android Manifest.xml의 application element 내에 meta-data로 추가합니다.
```
<meta-data android:name="com.naver.maps.map.CLIENT_ID" android:value="1xwgvvq8ps" />
```
Android Manifest.xml에 필요 권한 추가합니다. 네이버 지도를 사용하기 위해 INTERNET 권한과, 네이버 지도에서 현재 위치 검색을 위해 LOCATION 권한이 필요합니다.
```
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
```
