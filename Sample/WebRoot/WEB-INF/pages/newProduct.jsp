  <%@ page pageEncoding="GBK"%>
  <html>
      <head>
          <title>¼���Ʒ��Ϣ</title>
      </head>
      <body>
          <%-- ��saveProduct�����ύ��Ʒ��Ϣ --%>
          <form action="saveProduct"> 
              <table width="100%">
                  <tr>
                      <td align="center">
                          ��Ʒ��ţ�
                          <input type="text" name="productID" maxlength="4" />
                          <p>
                              ��Ʒ���ƣ�
                              <input type="text" name="productName" />
                          <p>
  
                              ��Ʒ�۸�
                              <input type="text" name="price" />
                      </td>
                  </tr>
                  <tr>
                      <td align="center">
                          <br>
                          <input type="submit" value=" ���� " />
                      </td>
                  </tr>
              </table>
          </form>
      </body>
  </html>
