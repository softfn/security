
    
<% if( !searchName.equals("")||totalNumber>15 ) { %>
<form id="searchForm">
<input type="text" name="name" value="<%=searchName %>" />
<input type="submit" value="<%=i18n.say( "search" )%>" />
</form>
<% } %>