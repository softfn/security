<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="org.ralasafe.entitle.BusinessData"%>
<%
org.ralasafe.util.I18N i18n=org.ralasafe.util.I18N.getWebInstance( request );
BusinessData node=(BusinessData) request.getAttribute( "node" );
%>    


<form id="modifyForm" action="?oper=update" method="post">
	<input type="hidden" name="id" value="n<%=node.getId()%>"/>
	<input type="hidden" name="parentId" value="n<%=node.getPid()%>"/>
	<input type="hidden" name="isLeaf" value="<%=node.getIsLeaf()%>"/>
	<label><%=i18n.say( "Name" ) %></label>
	<input name="name" type="text" value="<%=node.getName() %>" size="50"/><br/>
	<label><%=i18n.say( "Description" ) %></label>
	<input name="description" type="text" value="<%=node.getDescription() %>" size="50"/><br/>
	
	<input type="submit" value="OK" />
</form>
<script language="javascript">
var modifyOptions = { 
    beforeSubmit:  beforeModify, 
    success:       afterModify,
    clearForm:     true
}; 

// bind form using 'ajaxForm' 
jQuery('#modifyForm').ajaxForm(modifyOptions); 
</script>