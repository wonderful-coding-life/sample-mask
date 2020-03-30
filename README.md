# sample-mask
공적마스크 판매처 및 재고현황 Open API를 이용한 샘플 마스크 어플리케이션입니다.

공적마스크 Open API의 설명
https://app.swaggerhub.com/apis-docs/Promptech/public-mask-info/20200307-oas3#/StoreSaleResult

안드로이드 앱에 네이버 지도 추가하기
http://blog.naver.com/ndskr/221880849812


### 네이버 지도 추가하기
네이버 클라우드 콘솔에서 생성한 클라이언트 아이디를 Manifest.xml에 meta-data로 추가합니다.
아래 value 영역을 수정합니다.
```
<meta-data android:name="com.naver.maps.map.CLIENT_ID" android:value="1xwgvvq8ps" />
```
