/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.4
 * Generated at: 2018-04-29 06:46:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.console.job;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jobList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/commons/include/system.jsp", Long.valueOf(1524664512295L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1520478021673L));
    _jspx_dependants.put("jar:file:/C:/Users/Administrator/Desktop/staffbehavior/staffbehavior/WebContent/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t\t<title>员工行为分析系统</title>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/miniui/boot.js\" type=\"text/javascript\"></script>");
      out.write("\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\tbody{\r\n");
      out.write("\t\t\t    \twidth:100%;\r\n");
      out.write("\t\t\t    \theight:100%;\r\n");
      out.write("\t\t\t    \tmargin:0;\r\n");
      out.write("\t\t\t    \toverflow:hidden;\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t        \r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<div>请选择部门</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input id=\"select1\" class=\"mini-treeselect\" url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/tree/staffTree.do\"\r\n");
      out.write("\t\t\t        textField=\"text\" valueField=\"id\" parentField=\"pid\" checkRecursive=\"true\" \r\n");
      out.write("\t\t\t        showFolderCheckBox=\"false\"  expandOnLoad=\"true\" showClose=\"true\" oncloseclick=\"onCloseClick\"\r\n");
      out.write("\t\t\t        popupWidth=\"200\"/>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t    <div id=\"datagrid1\" class=\"mini-datagrid\" style=\"width:100%;height:90%;\" allowResize=\"true\"\r\n");
      out.write("\t        url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/job/jobList.do\" contextMenu=\"#gridMenu\" idField=\"id\" multiSelect=\"true\">\r\n");
      out.write("\t        <div property=\"columns\">\r\n");
      out.write("\t            <div field=\"jobId\" width=\"120\" headerAlign=\"center\" allowSort=\"true\">职位编号</div>    \r\n");
      out.write("\t            <div field=\"jobName\" width=\"120\" headerAlign=\"center\" allowSort=\"true\">职位名称</div>    \r\n");
      out.write("                <div field=\"createTime\" width=\"100\">创建时间</div>\r\n");
      out.write("                <div field=\"updateTime\" width=\"100\">修改时间</div>\r\n");
      out.write("                <div field=\"remark\"  width=\"200\">备注</div>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    \r\n");
      out.write("\t    <ul id=\"gridMenu\" name=\"gridMenu\" class=\"mini-menu\" style=\"display:none;\" onbeforeopen=\"onBeforeOpen\">\r\n");
      out.write("            <li iconCls=\"icon-add\" onclick=\"onItemAdd\">增加</li>    \r\n");
      out.write("            <li iconCls=\"icon-edit\" onclick=\"onItemUpdate\">修改</li>\r\n");
      out.write("            <li iconCls=\"icon-remove\" onclick=\"onItemDel\">删除</li>                      \r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t    <script type=\"text/javascript\">\r\n");
      out.write("\t\t   mini.parse();\r\n");
      out.write("\t\t   var grid = mini.get(\"datagrid1\");\r\n");
      out.write("\t       grid.load();\r\n");
      out.write("\t       function onItemAdd() {\r\n");
      out.write("\t            mini.open({\r\n");
      out.write("\t                targetWindow: window,\r\n");
      out.write("\t                url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/job/add.do\",\r\n");
      out.write("\t                title: \"新增部门\", width: 500, height: 350,\r\n");
      out.write("\t                onload: function () {\r\n");
      out.write("\t                    var iframe = this.getIFrameEl();\r\n");
      out.write("\t                    var data = { action: \"new\" };\r\n");
      out.write("\t                    iframe.contentWindow.SetData(data);\r\n");
      out.write("\t                },\r\n");
      out.write("\t                ondestroy: function (action) {\r\n");
      out.write("\t                    grid.reload();\r\n");
      out.write("\t                }\r\n");
      out.write("\t            });\r\n");
      out.write("\t        }\r\n");
      out.write("\t\r\n");
      out.write("\t        function onItemUpdate() {\r\n");
      out.write("\t           var row = grid.getSelected();\r\n");
      out.write("\t           if (row) {\r\n");
      out.write("\t            mini.open({\r\n");
      out.write("\t                url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/job/update.do\",\r\n");
      out.write("\t                title: \"编辑员工\", width: 700, height: 400,\r\n");
      out.write("\t                onload: function () {\r\n");
      out.write("\t                    var iframe = this.getIFrameEl();\r\n");
      out.write("\t                    var data = { action: \"edit\", id: row.id };\r\n");
      out.write("\t                    iframe.contentWindow.SetData(data);\r\n");
      out.write("\t                },\r\n");
      out.write("\t                ondestroy: function (action) {\r\n");
      out.write("\t                    //var iframe = this.getIFrameEl();\r\n");
      out.write("\t                    grid.reload();\r\n");
      out.write("\t                }\r\n");
      out.write("\t            });\r\n");
      out.write("\t          } else {\r\n");
      out.write("\t              mini.alert(\"请选中一条记录\");\r\n");
      out.write("\t          }\r\n");
      out.write("      \t\t}\r\n");
      out.write("\t        \r\n");
      out.write("\t       function onItemDel() {\r\n");
      out.write("\t           var rows = grid.getSelecteds();\r\n");
      out.write("\t           if (rows.length > 0) {\r\n");
      out.write("\t               if (confirm(\"确定删除选中记录？\")) {\r\n");
      out.write("\t                   var ids = [];\r\n");
      out.write("\t                   for (var i = 0, l = rows.length; i < l; i++) {\r\n");
      out.write("\t                       var r = rows[i];\r\n");
      out.write("\t                       ids.push(r.id);\r\n");
      out.write("\t                   }\r\n");
      out.write("\t                   var id = ids.join(',');\r\n");
      out.write("\t                   grid.loading(\"操作中，请稍后......\");\r\n");
      out.write("\t                   $.ajax({\r\n");
      out.write("\t                       url: \"../data/AjaxService.aspx?method=RemoveEmployees&id=\" +id,\r\n");
      out.write("\t                       success: function (text) {\r\n");
      out.write("\t                           grid.reload();\r\n");
      out.write("\t                       }\r\n");
      out.write("\t                   });\r\n");
      out.write("\t               }\r\n");
      out.write("\t           } else {\r\n");
      out.write("\t               alert(\"请选中一条记录\");\r\n");
      out.write("\t           }\r\n");
      out.write("\t       \t}\r\n");
      out.write("      \r\n");
      out.write("\t      document.oncontextmenu = function()\r\n");
      out.write("\t      {\r\n");
      out.write("\t    \t  return false // 禁止鼠标右键菜单显示\r\n");
      out.write("\t      };   \r\n");
      out.write("\t      \r\n");
      out.write("\t      document.body.onmouseup = function(e){ // 在body里点击触发事件\r\n");
      out.write("\t         if(e.button===2){                  // 如果button=1（鼠标左键），button=2（鼠标右键），button=0（鼠标中间键）\r\n");
      out.write("\t             console.log(e);               // 将传进去的参数打印出来\r\n");
      out.write("\t             console.log(e.offsetY);      // 打印出鼠标点击的Y轴坐标\r\n");
      out.write("\t             console.log(e.offsetX);     // 打印出鼠标点击的X轴坐标\r\n");
      out.write("\t             mini.get(\"gridMenu\").showAtPos(e.offsetX,e.offsetY);\r\n");
      out.write("\t         }\r\n");
      out.write("\t      } \r\n");
      out.write("\t      \r\n");
      out.write("\t      function onBeforeOpen(e) {\r\n");
      out.write("\t    \t    var grid = mini.get(\"datagrid1\");\r\n");
      out.write("\t    \t    var menu = e.sender;\r\n");
      out.write("\t   \t        //阻止浏览器默认右键菜单\r\n");
      out.write("\t   \t        e.htmlEvent.preventDefault();\r\n");
      out.write("\t   \t        return;\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t    </script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /commons/include/system.jsp(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("ctx");
      // /commons/include/system.jsp(3,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/commons/include/system.jsp(3,0) '${pageContext.request.contextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
