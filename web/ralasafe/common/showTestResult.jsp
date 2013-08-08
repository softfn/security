
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="org.ralasafe.entitle.ScriptTestResult"%>  
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Map"%>  
<%
org.ralasafe.util.I18N i18n=org.ralasafe.util.I18N.getWebInstance( request );
ScriptTestResult testResult=(ScriptTestResult) request.getAttribute( "testResult" );
if( testResult.isValid() ) {
	// test passed!
%>

<font color="green"><%=i18n.say( "Test_passed" )%></font>
<%	
} else if( testResult.isFailed() ) {
%>
<font color="red"><%=i18n.say( "Runtime_exception" )%>: <pre><%=testResult.getErrorMessage()%></pre></font>
<%	
} else {
%>
<font color="red">
<%=i18n.say( "Test_failed" )%><br/>
<%=i18n.say( "Variable" )%><br/>

<%
	for( Iterator iter=testResult.getVariableMap().entrySet().iterator(); iter.hasNext(); ) {
		Map.Entry entry=(Map.Entry) iter.next();
	%>
	<%=entry.getKey() %>=<%=entry.getValue()%><br/>
	<%		
	}
%>

</font>
<%	
}
%>