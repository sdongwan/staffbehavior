/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.4
 * Generated at: 2018-05-26 07:36:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.console;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class researchAnalyze_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/commons/include/system.jsp", Long.valueOf(1526483708263L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1520478021673L));
    _jspx_dependants.put("jar:file:/C:/Users/Administrator/Desktop/staffbehavior/staffbehavior/WebContent/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
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
      out.write("/assets/miniui/boot.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/miniui/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("\t\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/miniui/echarts.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\tbody{\r\n");
      out.write("\t\t\t    \twidth:100%;\r\n");
      out.write("\t\t\t    \theight:100%;\r\n");
      out.write("\t\t\t    \tmargin:0;\r\n");
      out.write("\t\t\t    \toverflow:hidden;\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    table tr td{\r\n");
      out.write("\t\t    \tpadding-left:10px;\r\n");
      out.write("\t\t    \tpadding-right:10px;\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    table{\r\n");
      out.write("\t\t    \tmargin-left: auto;\r\n");
      out.write("\t\t    \tmargin-right:auto;\r\n");
      out.write("    \t\t\tmargin-top: 25px;\t\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    .mini-button{\r\n");
      out.write("\t\t    \tcolor:#ffffff;\r\n");
      out.write("\t\t    \tbackground-color:#3498DB;\r\n");
      out.write("\t\t    \tborder-color:#3498DB;\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    .mini-button:active,.mini-button:hover{\r\n");
      out.write("\t\t    \tcolor:#3498DB;\r\n");
      out.write("\t\t    \tbackground-color:#ffffff;\r\n");
      out.write("\t\t    \tborder-color:#ffffff;\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    #win1{\r\n");
      out.write("\t\t    \tmargin-top:30px;\r\n");
      out.write("\t\t    \tmargin-left:auto;\r\n");
      out.write("\t\t    \tmargin-right:auto;\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t        \r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>部门<input id=\"deptCombo\" class=\"mini-combobox\" style=\"width:160px;\" textField=\"departName\" valueField=\"departId\" \r\n");
      out.write("\t\t\t\t\t        onvaluechanged=\"onDeptChanged\" url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/depart/getDepartList.do\"\r\n");
      out.write("\t\t\t\t\t        showNullItem=\"true\" emptyText=\"请选择部门\"\r\n");
      out.write("\t\t\t\t\t         />     \r\n");
      out.write("\t            </td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t职位\r\n");
      out.write("\t\t\t\t\t<input id=\"positionCombo\" onvaluechanged=\"onPositionChanged\" class=\"mini-combobox\" style=\"width:160px;\" textField=\"jobName\"  valueField=\"jobId\" emptyText=\"请选择职位\"/> \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t员工\r\n");
      out.write("\t\t\t\t\t<input id=\"staffCombo\" class=\"mini-combobox\" style=\"width:160px;\" textField=\"staffName\" valueField=\"staffId\" emptyText=\"请选择员工\"/> \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<a class=\"mini-button\" iconCls=\"fa fa-balance-scale\" style=\"width:100px;\" onclick=\"buildChart()\">行为评估</a>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t    <div id=\"win1\" style=\"width:580px;height:450px;\"\r\n");
      out.write("\t         showModal=\"true\" allowResize=\"true\">\r\n");
      out.write("\t        <div class=\"ct\" id=\"chart1\" style=\"height:100%;width:100%;\">></div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    \r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tmini.parse();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t    var deptCombo = mini.get(\"deptCombo\");\r\n");
      out.write("\t\t    var positionCombo = mini.get(\"positionCombo\");\r\n");
      out.write("\t        var staffCombo = mini.get(\"staffCombo\");\r\n");
      out.write("\t        \r\n");
      out.write("\t\t\tvar option = {\r\n");
      out.write("\t\t        color: ['#3398DB'],\r\n");
      out.write("\t\t        tooltip: {\r\n");
      out.write("\t\t            trigger: 'axis',\r\n");
      out.write("\t\t            axisPointer: {            // 坐标轴指示器，坐标轴触发有效\r\n");
      out.write("\t\t                type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'\r\n");
      out.write("\t\t            }\r\n");
      out.write("\t\t        },\r\n");
      out.write("\t\t        grid: {\r\n");
      out.write("\t\t            left: '3%',\r\n");
      out.write("\t\t            right: '4%',\r\n");
      out.write("\t\t            bottom: '3%',\r\n");
      out.write("\t\t            containLabel: true\r\n");
      out.write("\t\t        },\r\n");
      out.write("\t\t        yAxis: {\r\n");
      out.write("\t                min:0,\r\n");
      out.write("\t                max:5,\r\n");
      out.write("\t                axisLabel:{\r\n");
      out.write("\t                    formatter: function (value) {\r\n");
      out.write("\t\t\t\t\t\t\tvar texts = [];\r\n");
      out.write("\t\t\t\t\t\t\tif(value == 1){\r\n");
      out.write("\t\t\t\t\t\t\t\ttexts.push('非常不同意');\r\n");
      out.write("\t\t\t\t\t\t\t} else if (value == 2) {\r\n");
      out.write("\t\t\t\t\t\t\t\ttexts.push('比较不同意');\r\n");
      out.write("\t\t\t\t\t\t\t} else if (value == 3) {\r\n");
      out.write("\t\t\t\t\t\t\t\ttexts.push('一般');\r\n");
      out.write("\t\t\t\t\t\t\t} else if (value == 4){\r\n");
      out.write("\t\t\t\t\t\t\t\ttexts.push('比较同意');\r\n");
      out.write("\t\t\t\t\t\t\t} else if (value == 5){\r\n");
      out.write("\t\t\t\t\t\t\t\ttexts.push('非常同意');\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\ttexts.push('0');\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\treturn texts;\r\n");
      out.write("\t                    }\r\n");
      out.write("\t                }\r\n");
      out.write("                }\r\n");
      out.write("\t\t    };\r\n");
      out.write("\r\n");
      out.write("\t\t    function buildChart() {\r\n");
      out.write("\t\t    \tvar factor = [];\r\n");
      out.write("\t\t        var factorRatArray = [];\r\n");
      out.write("\t\t        var allFactor ;\r\n");
      out.write("\t\t        var chart1 = echarts.init(document.getElementById('chart1'));\r\n");
      out.write("\t\t        var staffName = staffCombo.getText();\r\n");
      out.write("\t\t        var staffId = staffCombo.getValue();\r\n");
      out.write("\t\t        var title = staffName+\"行为评估分析\"\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t        $.get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/factor/listFactor.do\",function(r){\r\n");
      out.write("\t\t        \tallFactor = r;\r\n");
      out.write("\t\t        \t\r\n");
      out.write("\t\t\t\t\tfor( var i=0;i<r.length;i++) {\r\n");
      out.write("\t\t\t        \tvar factorRatio = {};\r\n");
      out.write("\t\t\t\t\t\tfactor.push(r[i].factorName);\r\n");
      out.write("\t\t\t\t\t\tfactorRatio.name = r[i].factorName;\r\n");
      out.write("\t\t        \t\tfactorRatio.value = i;\r\n");
      out.write("\t\t        \t\tfactorRatArray.push(factorRatio);\r\n");
      out.write("\t\t\t\t\t}  \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\toption.xAxis = [\r\n");
      out.write("\t\t\t            {\r\n");
      out.write("\t\t\t                type: 'category',\r\n");
      out.write("\t\t\t                data: factor,\r\n");
      out.write("\t\t\t                axisTick: {\r\n");
      out.write("\t\t\t                    alignWithLabel: true\r\n");
      out.write("\t\t\t                }\r\n");
      out.write("\t\t\t            }\r\n");
      out.write("\t\t\t        ];\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t        \t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/researchResult/getResultByStaffId.do\",{staffId:staffId},function(r){\r\n");
      out.write("\t\t        \t\tvar data = [];\r\n");
      out.write("\t\t        \t\tfor(var i=0;i<r.length;i++){\r\n");
      out.write("\t\t        \t\t\tdata.push(r[i].researchReply);\r\n");
      out.write("\t\t        \t\t}\r\n");
      out.write("\t\t        \t\t\r\n");
      out.write("\t\t        \t\toption.series = [\r\n");
      out.write("\t\t\t\t            {\r\n");
      out.write("\t\t\t\t                name: '分数',\r\n");
      out.write("\t\t\t\t                type: 'bar',\r\n");
      out.write("\t\t\t\t                barWidth: '40%',\r\n");
      out.write("\t\t\t\t                data: data\r\n");
      out.write("\t\t\t\t            }\r\n");
      out.write("\t\t\t\t         ];\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t        \t\tvar result =0;\r\n");
      out.write("\t\t        \t\tfor(var i=0;i<allFactor.length;i++) {\r\n");
      out.write("\t\t        \t\t\tresult += data[i]* (allFactor[i].factorRatio)  \t\t\t\r\n");
      out.write("\t\t        \t\t}\r\n");
      out.write("\t\t        \t\t\r\n");
      out.write("\t\t        \t\tvar analyzeResult = \"评估通过\";\r\n");
      out.write("\t\t        \t\tif ( result >= allFactor.length*0.6 ) {\r\n");
      out.write("\t\t        \t\t\tanalyzeResult = \"评估通过\";\r\n");
      out.write("\t\t        \t\t} else {\r\n");
      out.write("\t\t        \t\t\tanalyzeResult = \"评估不合格\";\r\n");
      out.write("\t\t        \t\t}\r\n");
      out.write("\t\t        \t\t\r\n");
      out.write("\t\t \t\t        option.title = { \r\n");
      out.write("\t\t \t        \t\ttext: title,\r\n");
      out.write("\t\t \t\t            subtext: analyzeResult,\r\n");
      out.write("\t\t \t\t            x: 'center'\r\n");
      out.write("\t\t \t            };\r\n");
      out.write("\t\t        \t\tchart1.setOption(option);\r\n");
      out.write("\t\t        \t\t\r\n");
      out.write("\t\t        \t});\r\n");
      out.write("\t\t        \t\r\n");
      out.write("\t\t        \t\r\n");
      out.write("\t\t    \t});\r\n");
      out.write("\t\t    }\t\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    buildChart();\r\n");
      out.write("\r\n");
      out.write("\t        function onDeptChanged(e) {\r\n");
      out.write("\t            var departId = deptCombo.getValue();\r\n");
      out.write("\t            var url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/job/getJobNameAndId.do?departId=\" + departId;\r\n");
      out.write("\t            positionCombo.setValue(\"\");\r\n");
      out.write("\t            positionCombo.setUrl(url);\r\n");
      out.write("\t        }\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    function onPositionChanged(e) {\r\n");
      out.write("\t    \t  \tvar jobId = positionCombo.getValue();\r\n");
      out.write("\t            var url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/staff/getStaffByJobId.do?jobId=\" + jobId;\r\n");
      out.write("\t            staffCombo.setValue(\"\");\r\n");
      out.write("\t            staffCombo.setUrl(url);\r\n");
      out.write("\t            staffCombo.select(0);\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t</script>\r\n");
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
