# CommonListAdapter
리사이클러뷰에 **다양한 Multi view type**을 적용시켜서 보여주기 위한 adapter 입니다.  
또한 추가하고 싶은 view type이 생기더라라도 **adapter를 수정하지 않도록** 추상화 하였습니다.  

### 추가하고 싶은 viewtype이 있다면
- enum class인 ViewType에 추가하려는 viewtype을 생성
- CommonViewHolder를 상속하는 새로운 ViewHolder클래스를 생성
- CommonViewHolderFactory에 새로 생성한 ViewHolder 클래스 추가

## 결과
left : a클릭시 a.json 의 결과물을 보여주는 recyclerview.   
right: b클릭시 b.json 의 결과물을 보여주는 recyclerview. 

<p align="center">
    <img src="https://user-images.githubusercontent.com/62279741/179174321-d0e65074-dbfa-4962-ade5-e07d46919719.jpg"  width="20%"/>
  <img src="https://user-images.githubusercontent.com/62279741/179174325-2bfa6a67-8086-41cd-b615-6afe435c82ad.jpg"  width="20%"/>
</p>

## json overview
path : app/src/main/assets

a.json
<pre>
<code>
{
  "viewItems": [
    {
      "viewType": "TWO_LINE_TEXT",
      "viewObject": {
        "titleText": "서울대입구역",
        "descText": "서울특별시 관악구 남부순환로 지하 1822"
      }
    },{
      "viewType": "ONE_LINE_TEXT",
      "viewObject": {
        "titleText": "서울대입구역"
      }
    },{
      "viewType": "ONE_IMAGE",
      "viewObject": {
        "imageVO" : {
          "url": "https://w.namu.la/s/c5d3d06335e8a4e19f201594792520e66212780df53f6a9085ca022538933500e74d2674f72521f0d19489c1a325497811b97d55b740179ed24e321051ba6dd9f059abd29dbc67681ad907cf5cd789ccc9874d7bfbe2df88c91afc38d8c2edde340bc3b48f5da9f4f463d216b27e373d",
          "width": 1024,
          "height": 765
        }
      }
    }
  ]
}
</code>
</pre>
b.json
<pre>
<code>
{
  "viewItems": [
    {
      "viewType": "ONE_LINE_TEXT",
      "viewObject": {
        "titleText": "정자역"
      }
    },{
      "viewType": "ONE_IMAGE",
      "viewObject": {
        "imageVO" : { //판교역
          "url": "https://w.namu.la/s/785497ed5645e9da8382e6f063ddf5ae71e2e6579979976dd2d34a5c570c5b0673f7622eda1ee6c6d09953599a3c0631d2bbc45dfc0bfa217577db40795aa8020f7442cd0d20adc940bf51efe0244a69518530142ac2dabe506cde6555431149a2d19e75aa376e1fb99c08a90e244c33",
          "width": 1024,
          "height": 765
        }
      }
    },{
      "viewType": "ONE_IMAGE",
      "viewObject": {
        "imageVO" : { //사당역
          "url": "https://w.namu.la/s/c5d3d06335e8a4e19f201594792520e66212780df53f6a9085ca022538933500e74d2674f72521f0d19489c1a325497811b97d55b740179ed24e321051ba6dd9f059abd29dbc67681ad907cf5cd789ccc9874d7bfbe2df88c91afc38d8c2edde340bc3b48f5da9f4f463d216b27e373d",
          "width": 1024,
          "height": 765
        }
      }
    }
  ]
}
</code>
</p>
