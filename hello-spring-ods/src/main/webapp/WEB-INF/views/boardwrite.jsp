<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>게시글 작성</title>
    <style>
        table { border-collapse: collapse; width: 80%; margin: 20px auto; }
        td { padding: 8px; }
        input[type="text"], input[type="email"], textarea { width: 100%; }
    </style>
</head>
<body>
    <h1 style="text-align:center;">게시글 작성</h1>
    <form action="${pageContext.request.contextPath}/board/write-ods" method="post" enctype="multipart/form-data">
        <table>
            <tr>
                <td>제목:</td>
                <td><input type="text" name="subject" required /></td>
            </tr>
            <tr>
                <td>내용:</td>
                <td><textarea name="content" rows="10" required></textarea></td>
            </tr>
            <tr>
                <td>작성자 이메일:</td>
                <td><input type="email" name="email" required /></td>
            </tr>
            <tr>
                <td>첨부 파일:</td>
                <td><input type="file" name="file" /></td>
            </tr>
            <tr>
                <td colspan="2" style="text-align:center;">
                    <input type="submit" value="작성 완료" />
                </td>
            </tr>
        </table>
    </form>
</body>
</html>