/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2022-06-01 01:37:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.controller.meta.MetaAction;
import org.openxava.util.XavaPreferences;
import org.openxava.util.Is;
import org.openxava.util.Locales;
import org.openxava.controller.meta.MetaSubcontroller;
import java.util.Collection;
import org.openxava.web.Ids;
import org.openxava.util.EmailNotifications;
import org.openxava.controller.meta.MetaControllerElement;

public final class buttonBar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/Users/Danny/Desktop/openxava-6.6.3/workspace/Facturacion/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1425993068000L));
    _jspx_dependants.put("/xava/imports.jsp", Long.valueOf(1654047183720L));
    _jspx_dependants.put("/WEB-INF/lib/standard-jstlel.jar", Long.valueOf(1654047184930L));
    _jspx_dependants.put("jar:file:/C:/Users/Danny/Desktop/openxava-6.6.3/workspace/Facturacion/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/c-1_0.tld", Long.valueOf(1425993068000L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1654047184938L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.openxava.controller.meta.MetaAction");
    _jspx_imports_classes.add("org.openxava.controller.meta.MetaSubcontroller");
    _jspx_imports_classes.add("org.openxava.util.XavaPreferences");
    _jspx_imports_classes.add("java.util.Collection");
    _jspx_imports_classes.add("org.openxava.controller.meta.MetaControllerElement");
    _jspx_imports_classes.add("org.openxava.web.Ids");
    _jspx_imports_classes.add("org.openxava.util.EmailNotifications");
    _jspx_imports_classes.add("org.openxava.util.Locales");
    _jspx_imports_classes.add("org.openxava.util.Is");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005flink_0026_005fcssClass_005fargv_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fimage_0026_005faction_005fnobody;

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
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005flink_0026_005fcssClass_005fargv_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005fimage_0026_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fxava_005flink_0026_005fcssClass_005fargv_005faction.release();
    _005fjspx_005ftagPool_005fxava_005fimage_0026_005faction_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      org.openxava.web.style.Style style = null;
      style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (style == null){
        style = new org.openxava.web.style.Style();
        _jspx_page_context.setAttribute("style", style, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');
      out.write('\n');

org.openxava.controller.ModuleManager manager = (org.openxava.controller.ModuleManager) context.get(request, "manager", "org.openxava.controller.ModuleManager");
manager.setSession(session);
boolean onBottom = false;
String mode = request.getParameter("xava_mode");
if (mode == null) mode = manager.isSplitMode()?"detail":manager.getModeName();
boolean headerButtonBar = !manager.isSplitMode() || mode.equals("list");
boolean listFormats = !manager.isSplitMode() && mode.equals("list"); 

if (manager.isButtonBarVisible()) {

      out.write("\n");
      out.write("\t<div class=\"");
      out.print(style.getButtonBar());
      out.write("\"> \n");
      out.write("\t<div id=\"");
      if (_jspx_meth_xava_005fid_005f0(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("\t<span style=\"float: left\">\n");
      out.write("\t");

	java.util.Stack previousViews = (java.util.Stack) context.get(request, "xava_previousViews");
	if (manager.isDetailMode() && !manager.isDetailModeOnly() && previousViews.isEmpty()) { 
	
      out.write('\n');
      out.write('	');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "barButton.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("action", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(manager.getGoListAction()), request.getCharacterEncoding()), out, false);
      out.write('\n');
      out.write('	');
 
	} 

	Collection<MetaControllerElement> elements = manager.getMetaControllerElements(); 
	for (MetaControllerElement element : elements){
		if (!element.appliesToMode(mode)) continue;
		if (element instanceof MetaAction){
			MetaAction action = (MetaAction) element;
			if (!manager.actionApplies(action)) continue; 
			if (action.hasImage() || action.hasIcon()) {	
			
      out.write("\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "barButton.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("action", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(action.getQualifiedName()), request.getCharacterEncoding()), out, false);
      out.write("\t\t\n");
      out.write("\t\t\t");

			}
		}
		else if (element instanceof MetaSubcontroller){
			MetaSubcontroller subcontroller = (MetaSubcontroller) element;
			if (subcontroller.hasActionsInThisMode(mode)){
			
      out.write("\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "subButton.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("controller", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(subcontroller.getControllerName()), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("image", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(subcontroller.getImage()), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("icon", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(subcontroller.getIcon()), request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("\t\t\t");

			}
		}
	}
	
      out.write("\n");
      out.write("\t</span>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div id=\"");
      if (_jspx_meth_xava_005fid_005f1(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("\t<span style=\"float: right\">\n");
      out.write("\t<span style=\"float: left;\" class=\"");
      out.print(style.getListFormats());
      out.write("\">\n");
      out.write("\t");

	if (listFormats) { 	
		String tabObject = request.getParameter("tabObject");
		tabObject = (tabObject == null || tabObject.equals(""))?"xava_tab":tabObject;
		org.openxava.tab.Tab tab = (org.openxava.tab.Tab) context.get(request, tabObject);
		Collection<String> editors = org.openxava.web.WebEditors.getEditors(tab.getMetaTab());
		if (editors.size() > 1) for (String editor: editors) {
			String icon = org.openxava.web.WebEditors.getIcon(editor);
			if (icon == null) continue; 
			String selected = editor.equals(tab.getEditor())?style.getSelectedListFormat():"";
			if (Is.emptyString(editor)) editor = "__NONAME__"; 
	
      out.write('\n');
      out.write('	');
      //  xava:link
      org.openxava.web.taglib.LinkTag _jspx_th_xava_005flink_005f0 = (org.openxava.web.taglib.LinkTag) _005fjspx_005ftagPool_005fxava_005flink_0026_005fcssClass_005fargv_005faction.get(org.openxava.web.taglib.LinkTag.class);
      boolean _jspx_th_xava_005flink_005f0_reused = false;
      try {
        _jspx_th_xava_005flink_005f0.setPageContext(_jspx_page_context);
        _jspx_th_xava_005flink_005f0.setParent(null);
        // /xava/buttonBar.jsp(87,1) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005flink_005f0.setAction("ListFormat.select");
        // /xava/buttonBar.jsp(87,1) name = argv type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005flink_005f0.setArgv("editor=" + editor);
        // /xava/buttonBar.jsp(87,1) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005flink_005f0.setCssClass(selected);
        int _jspx_eval_xava_005flink_005f0 = _jspx_th_xava_005flink_005f0.doStartTag();
        if (_jspx_eval_xava_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\t\t<i class=\"mdi mdi-");
            out.print(icon);
            out.write("\" onclick=\"openxava.onSelectListFormat(event)\" title=\"");
            out.print(org.openxava.util.Labels.get(editor));
            out.write("\"></i>\n");
            out.write("\t");
            int evalDoAfterBody = _jspx_th_xava_005flink_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_xava_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005flink_0026_005fcssClass_005fargv_005faction.reuse(_jspx_th_xava_005flink_005f0);
        _jspx_th_xava_005flink_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005flink_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005flink_005f0_reused);
      }
      out.write("\t\t\t\n");
      out.write("\t");
				
		}
	}	
	
      out.write("\n");
      out.write("\t</span>\n");
      out.write("\t\t\n");
      out.write("\t");

	if (EmailNotifications.isEnabled(manager.getModuleName())) {
		if (EmailNotifications.isSubscribedCurrentUserToModule(manager.getModuleName())) {
	
      out.write("\n");
      out.write("\t\t\t<span class=\"");
      out.print(style.getSubscribed());
      out.write("\"> \n");
      out.write("\t\t\t\t");
      if (_jspx_meth_xava_005fimage_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</span>\n");
      out.write("\t");
  
		}
		else {
	
      out.write("\t\n");
      out.write("\t\t\t<span class=\"");
      out.print(style.getUnsubscribed());
      out.write("\"> \n");
      out.write("\t\t\t\t");
      if (_jspx_meth_xava_005fimage_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</span> \t\n");
      out.write("\t");

		}
	}

	
	if (XavaPreferences.getInstance().isHelpAvailable() && style.isHelpAvailable()) {
		String language = Locales.getCurrent().getLanguage();  
		String href = XavaPreferences.getInstance().getHelpPrefix(); 
		String suffix = XavaPreferences.getInstance().getHelpSuffix(); 
		String target = XavaPreferences.getInstance().isHelpInNewWindow() ? "_blank" : "";
		if (href.startsWith("http:") || href.startsWith("https:")) {
			if (href.endsWith("_")) href = href + language;
			if (!Is.emptyString(suffix)) href = href + suffix;
		}
		else {
			href = 
				"/" + manager.getApplicationName() + "/" + 
				href +
				manager.getModuleName() +
				"_" + language + 
				suffix;
		}
		String helpImage = null;
		if (style.getHelpImage() != null) helpImage = !style.getHelpImage().startsWith("/")?request.getContextPath() + "/" + style.getHelpImage():style.getHelpImage();
	
      out.write("\n");
      out.write("\t\t<span class=\"");
      out.print(style.getHelp());
      out.write("\">  \n");
      out.write("\t\t\t<a href=\"");
      out.print(href);
      out.write("\" target=\"");
      out.print(target);
      out.write("\">\n");
      out.write("\t\t\t\t");
 if (helpImage == null) { 
      out.write("\n");
      out.write("\t\t\t\t<i class=\"mdi mdi-help-circle\"></i>\n");
      out.write("\t\t\t\t");
 } else { 
      out.write("\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(href);
      out.write("\" target=\"");
      out.print(target);
      out.write("\"><img src=\"");
      out.print(helpImage);
      out.write("\"/></a>\n");
      out.write("\t\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t</span>\n");
      out.write("\t");

	}
	
      out.write("\n");
      out.write("\t&nbsp;\n");
      out.write("\t</span>\t\t\n");
      out.write("\t</div>\t<!-- modes -->\n");
      out.write("\t</div>\n");
      out.write("\t\n");
 } // end isButtonBarVisible 
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

  private boolean _jspx_meth_xava_005fid_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f0 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    boolean _jspx_th_xava_005fid_005f0_reused = false;
    try {
      _jspx_th_xava_005fid_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f0.setParent(null);
      // /xava/buttonBar.jsp(29,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_xava_005fid_005f0.setName("controllerElement");
      int _jspx_eval_xava_005fid_005f0 = _jspx_th_xava_005fid_005f0.doStartTag();
      if (_jspx_th_xava_005fid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f0);
      _jspx_th_xava_005fid_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fid_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005fid_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f1 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    boolean _jspx_th_xava_005fid_005f1_reused = false;
    try {
      _jspx_th_xava_005fid_005f1.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f1.setParent(null);
      // /xava/buttonBar.jsp(72,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_xava_005fid_005f1.setName("modes");
      int _jspx_eval_xava_005fid_005f1 = _jspx_th_xava_005fid_005f1.doStartTag();
      if (_jspx_th_xava_005fid_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f1);
      _jspx_th_xava_005fid_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fid_005f1, _jsp_getInstanceManager(), _jspx_th_xava_005fid_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_xava_005fimage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:image
    org.openxava.web.taglib.ImageTag _jspx_th_xava_005fimage_005f0 = (org.openxava.web.taglib.ImageTag) _005fjspx_005ftagPool_005fxava_005fimage_0026_005faction_005fnobody.get(org.openxava.web.taglib.ImageTag.class);
    boolean _jspx_th_xava_005fimage_005f0_reused = false;
    try {
      _jspx_th_xava_005fimage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fimage_005f0.setParent(null);
      // /xava/buttonBar.jsp(101,4) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_xava_005fimage_005f0.setAction("EmailNotifications.unsubscribe");
      int _jspx_eval_xava_005fimage_005f0 = _jspx_th_xava_005fimage_005f0.doStartTag();
      if (_jspx_th_xava_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fxava_005fimage_0026_005faction_005fnobody.reuse(_jspx_th_xava_005fimage_005f0);
      _jspx_th_xava_005fimage_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fimage_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005fimage_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_xava_005fimage_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:image
    org.openxava.web.taglib.ImageTag _jspx_th_xava_005fimage_005f1 = (org.openxava.web.taglib.ImageTag) _005fjspx_005ftagPool_005fxava_005fimage_0026_005faction_005fnobody.get(org.openxava.web.taglib.ImageTag.class);
    boolean _jspx_th_xava_005fimage_005f1_reused = false;
    try {
      _jspx_th_xava_005fimage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fimage_005f1.setParent(null);
      // /xava/buttonBar.jsp(108,4) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_xava_005fimage_005f1.setAction("EmailNotifications.subscribe");
      int _jspx_eval_xava_005fimage_005f1 = _jspx_th_xava_005fimage_005f1.doStartTag();
      if (_jspx_th_xava_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fxava_005fimage_0026_005faction_005fnobody.reuse(_jspx_th_xava_005fimage_005f1);
      _jspx_th_xava_005fimage_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fimage_005f1, _jsp_getInstanceManager(), _jspx_th_xava_005fimage_005f1_reused);
    }
    return false;
  }
}