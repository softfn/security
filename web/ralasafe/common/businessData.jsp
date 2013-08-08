
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.ralasafe.db.sql.xml.DefineVariable" %>
<%@ page import="org.ralasafe.servlet.AbstractPolicyDesignHandler" %>
<%@ page import="org.ralasafe.db.sql.xml.HintValue" %>

<%
org.ralasafe.util.I18N i18n=org.ralasafe.util.I18N.getWebInstance( request );

DefineVariable var=(DefineVariable) request.getAttribute( "variable" );
String oper="addVariable";
String name="";
String key="";
String varIndex="-1";
String id=request.getParameter( "id" );

if( var!=null ) {
	HintValue value=var.getHintValue();
	
	varIndex=request.getParameter( "index" );
	oper="updateVariable";
	key=value.getKey();
	name=var.getName();
}
%>


	<input type="hidden" name="oper" value="<%=oper%>"/>
	<input type="hidden" name="id" value="<%=id%>"/>
	<input type="hidden" name="type" value="hintValue"/>
	<input type="hidden" name="index" value="<%=varIndex%>"/>
	<label><%=i18n.say( "Variable_name" )%></label>
	<input type="text" name="name" value="<%=name%>" class="required"/>
	<br/>
	<label><%=i18n.say( "Business_data_attribute" )%></label>
	<input type="text" name="key" value="<%=key%>" class="required"/>
