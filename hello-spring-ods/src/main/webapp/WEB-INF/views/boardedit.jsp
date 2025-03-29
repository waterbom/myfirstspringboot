<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>게시글 수정</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        .edit-container {
            width: 80%;
            margin: auto;
        }
        .edit-container table {
            width: 100%;
            border-collapse: collapse;
        }
        .edit-container th, .edit-container td {
            border: 1px solid #ccc;
            padding: 8px;
            text-align: left;
        }
        .edit-container th {
            background-color: #f2f2f2;
            width: 20%;
        }
        .btn {
            padding: 8px 16px;
            background-color: #4CAF50;
            color: white;
            text-decoration: none;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            margin-right: 10px;
        }
        .btn:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="edit-container">
        <h1>게시글 수정</h1>
        <!-- 수정 폼. POST 방식으로 /board/edit-ods URL로 전송 -->
        <form action="${pageContext.request.contextPath}/board/edit-ods" method="post">
            <!-- 게시글 번호는 수정할 수 없으므로 hidden 필드로 전송 -->
            <input type="hidden" name="id" value="${board.id}" />
            <table>
                <tr>
                    <th>제목</th>
                    <td><input type="text" name="subject" value="${board.subject}" required /></td>
                </tr>
                <tr>
                    <th>내용</th>
                    <td><textarea name="content" rows="10" required>${board.content}</textarea></td>
                </tr>
                <tr>
                    <th>작성자 이메일</th>
                    <td><input type="email" name="email" value="${board.email}" required /></td>
                </tr>
                <tr>
                    <th>첨부 파일</th>
                    <td>
                        <!-- 기존 파일 정보 표시 및 새 파일 선택 (필요시) -->
                        <c:if test="${not empty board.fileName}">
                            기존 파일: ${board.fileName} <br/>
                        </c:if>
                        <input type="file" name="file" />
                    </td>
                </tr>
            </table>
            <div style="text-align: center; margin-top: 20px;">
                <input type="submit" value="수정 완료" class="btn" />
                <a href="${pageContext.request.contextPath}/board/detail-ods/${board.id}" class="btn">취소</a>
            </div>
        </form>
    </div>
</body>
</html>