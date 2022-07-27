# board_project
나만의 항해 블로그(게시판)를 만들어보기
-------------------------------
## API 설계
![1](https://user-images.githubusercontent.com/107388110/181154151-de568a4e-c8dd-40a6-9ff7-fe2659befbe6.PNG)

------------------------
## 결론부터 말하자면 폭망
### 원인 : 
```
1.앞단에서 너무 욕심내서 건들다보니 버튼과 모달을 사용하는 부분에서 도무지 연동할 방법을 생각하지 못함
2.GET 해서 가져오는 password를 어떻게든 controller에서 해결하려다보니 ajax 기능 구현에서 많이 꼬임
3.서버에 배포해보니까 src에 있는 이미지가 구현이 안됨
```
-------------------------

### 실패코드
``` javascript
function addHTML(id, title, username, modifiedAt) {
        // 1. HTML 태그를 만듭니다.
        let tempHtml = `<table>
                                <tr class="row100 body" id="${id}-list">
                                    <td class="cell100 column1" id="${id}-title"><a onclick="detail(${id})" id="detail_link">${title}</a></td>
                                    <td class="cell100 column2" id="${id}-username">${username}</td>
                                    <td class="cell100 column3" id="${id}-createdAt">${modifiedAt}</td>
                                    <td class="cell100 column4"><button class="button is-danger" id="${id}-modal_btn" onclick="deleteOne('${id}')">삭제</button>

                                    </td>

                                </tr>
                          </table>`
        // 2. #cards-box 에 HTML을 붙인다.
        $('#board_list').append(tempHtml);
    }
```
--------------------------
#### 분석
1. 버튼을 클릭하면 modal 나오고 거기에 비밀번호를 작성해서 기존의 password와 같은지 비교하고 결과값을 리턴
2. modal과 버튼, onClick function, ajax에서 도저히 수습이 안될정도로 번져나갔다
3. 스프링에 대한 지식을 쌓아야하는데 앞단에서 2일을 거의 잠을 안자고 하게되니까 시간에 대한 압박감이 너무 느껴졌따

-------------------------------
결론 : 앞단의 고생도 알게되었지만 스프링 기본기를 쌓을 시간을 많이 날려먹었다. view에 대한 코드도 많이 쳐봐야겠음.
