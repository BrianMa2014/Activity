<%@ page pageEncoding="GBK"%>
<%-- ����Struts tag--%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
      <head>
          <title>������</title>
      </head>
      <body>
          <table align="center" cellpadding="10" width="100%">
              <tr>
                  <td align="right" width="50%">
                  <%-- ʹ��Struts tag--%>
  <a href="${pageContext.request.contextPath }/product.do?method=toAddProduct">¼���Ʒ��Ϣ</a>
                  </td>
                  <td>
  <a href="${pageContext.request.contextPath }/product.do?method=toSearchProduct">¼���Ʒ��Ϣ</a>
                  </td>
              </tr>
          </table>
      </body>
  </html>