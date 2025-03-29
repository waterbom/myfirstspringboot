<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>게시글 상세 조회</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        .detail-container {
            width: 80%;
            margin: auto;
        }
        .detail-container table {
            width: 100%;
            border-collapse: collapse;
        }
        .detail-container th, .detail-container td {
            border: 1px solid #ccc;
            padding: 8px;
            text-align: left;
        }
        .detail-container th {
            background-color: #f2f2f2;
            width: 20%;
        }
        .detail-actions {
            margin-top: 20px;
            text-align: center;
        }
        .detail-actions a, .detail-actions input[type="submit"] {
            margin: 0 10px;
            padding: 8px 16px;
            background-color: #4CAF50;
            color: white;
            text-decoration: none;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        .detail-actions a:hover, .detail-actions input[type="submit"]:hover {
            background-color: #45a049;
        }
        /* 삭제 폼의 스타일 조정 */
        .delete-form {
            display: inline;
        }
    </style>
</head>
<body>
    <div class="detail-container">
        <h1>게시글 상세 조회</h1>
        <table>
            <tr>
                <th>번호</th>
                <td>${board.id}</td>
            </tr>
            <tr>
                <th>제목</th>
                <td>${board.subject}</td>
            </tr>
            <tr>
                <th>내용</th>
                <td>${board.content}</td>
            </tr>
            <tr>
                <th>작성자 이메일</th>
                <td>${board.email}</td>
            </tr>
            <tr>
                <th>조회수</th>
                <td>${board.viewCnt}</td>
            </tr>
            <tr>
                <th>작성일</th>
                <td>${board.crtDt}</td>
            </tr>
            <tr>
                <th>수정일</th>
                <td>${board.mdfyDt}</td>
            </tr>
            <tr>
                <th>파일 이름</th>
                <td>${board.fileName}</td>
            </tr>
            <tr>
                <th>원본 파일 이름</th>
                <td>${board.originFileName}</td>
            </tr>
        </table>
        
        <div class="detail-actions">
            <a href="${pageContext.request.contextPath}/board/list-ods">목록으로</a>
            <a href="${pageContext.request.contextPath}/board/edit-ods/${board.id}">수정하기</a>
            <form action="${pageContext.request.contextPath}/board/delete-ods/${board.id}" method="post" class="delete-form" onsubmit="return confirm('삭제하시겠습니까?');">
                <input type="submit" value="삭제하기" />
            </form>
        </div>
    </div>
</body>
</html>