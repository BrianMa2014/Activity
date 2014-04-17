  <%@ page pageEncoding="GBK"%>
  <html>
      <head>
          <title>录入产品信息</title>
      </head>
      <body>
          <%-- 向saveProduct动作提交产品信息 --%>
          <form action="saveProduct"> 
              <table width="100%">
                  <tr>
                      <td align="center">
                          产品编号：
                          <input type="text" name="productID" maxlength="4" />
                          <p>
                              产品名称：
                              <input type="text" name="productName" />
                          <p>
  
                              产品价格：
                              <input type="text" name="price" />
                      </td>
                  </tr>
                  <tr>
                      <td align="center">
                          <br>
                          <input type="submit" value=" 保存 " />
                      </td>
                  </tr>
              </table>
          </form>
      </body>
  </html>
