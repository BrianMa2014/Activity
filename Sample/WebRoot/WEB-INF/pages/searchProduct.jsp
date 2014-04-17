 <%@ page pageEncoding="GBK"%>
  <html>
      <head>
          <title>查询产品信息</title>
      </head>
      <body>
          <%--  向searchProduct动作提交查询请求 --%>
          <form action="searchProduct">
              <table width="100%">
                  <tr>
                      <td align="center">
                          产品名称：
                          <input type="text" name="productName" />
                      </td>
                  </tr>
                  <tr>
                      <td align="center">
                          <br>
                          <input type="submit" value=" 查询 " />
                      </td>
                  </tr>
              </table>
          </form>
      </body>
  </html>