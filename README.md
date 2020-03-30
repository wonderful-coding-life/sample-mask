# sample-mask
공적마스크 판매처 및 재고현황 Open API를 이용한 샘플 마스크 어플리케이션입니다.

공적마스크 Open API의 설명
https://app.swaggerhub.com/apis-docs/Promptech/public-mask-info/20200307-oas3#/StoreSaleResult

안드로이드 앱에 네이버 지도 추가하기
http://blog.naver.com/ndskr/221880849812


### 네이버 지도 추가하기
국내 지도의 경우 구글맵 보다는 네이버맵이 좀 더 많은 정보를 담고 있고, 또한 사람들에게 익숙해져 있기 때문에 보편적으로 많이 사용하는 편입니다.
예전에는 네이버 개발자 센터에서 지도 API를 제공하였으나 현재에는 네이버 클라우드에서 지도 API를 제공하고 있습니다.
네이버 클리우드에 계정이 없다면 네이버 클리우드 콘솔에 접속하여 먼저 계정을 생성하고 지도를 사용하고자 하는 어플리케이션을 안드로이드 패키지 이름과 함께 등록합니다.
등록된 어플리케이션에서 Mobile Dynamic Map 서비스 추가하면 네이버 지도 사용 준비 완료

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
