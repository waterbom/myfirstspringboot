<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>게시판 목록</title>
    <style>
        table { border-collapse: collapse; width: 80%; margin: 20px auto; }
        th, td { border: 1px solid #ccc; padding: 8px; text-align: center; }
        th { background-color: #f2f2f2; }
        .write-button {
            display: inline-block;
            padding: 8px 16px;
            background-color: #4CAF50;
            color: white;
            text-decoration: none;
            border-radius: 4px;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
    <h1 style="text-align:center;">게시판 목록</h1>
    <div style="width:80%; margin:0 auto;">
        <p>게시글 수: ${totalCount}</p>
        <p>조회한 게시글의 수: ${boardList.size()}</p>
        <!-- 글쓰기 버튼 추가 -->
        <div style="text-align:right; margin-bottom:10px;">
            <a href="${pageContext.request.contextPath}/board/write-ods" class="write-button">글쓰기</a>
        </div>
        <table>
            <thead>
                <tr>
                    <th>번호</th>
                    <th>제목</th>
                    <th>작성자</th>
                    <th>작성일</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="board" items="${boardList}">
                    <tr>
                        <td>${board.id}</td>
                        <td>
                            <a href="<c:url value='/board/detail/${board.id}'/>">
                                ${board.subject}
                            </a>
                        </td>
                        <td>${board.email}</td>
                        <td>${board.crtDt}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>