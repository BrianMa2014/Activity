<%@ page pageEncoding="GBK"%>
<%-- 引用Struts tag--%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
      <head>
          <title>主界面</title>
      </head>
      <body>
          <table align="center" cellpadding="10" width="100%">
              <tr>
                  <td align="right" width="50%">
                  <%-- 使用Struts tag--%>
  <a href="${pageContext.request.contextPath }/product.do?method=toAddProduct">录入产品信息</a>
                  </td>
                  <td>
  <a href="${pageContext.request.contextPath }/product.do?method=toSearchProduct">录入产品信息</a>
                  </td>
              </tr>
          </table>
      </body>
  </html>