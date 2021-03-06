<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/apps/tourismaustralia/components/global.jsp" %>
<%@ page import="com.australia.www.components.content.tagCloud.TagCloud" %>
<c:set var="tagCloud" value="<%=new TagCloud(slingRequest)%>"/>
<div class="tagcloud-container">
    <div class="tagcloud">
        <c:if test="${not empty tagCloud.title}">
        <span class="tagcloud-explore-by">${tagCloud.title}</span>
        </c:if>
        <c:if test="${not empty tagCloud.tags}">
        <ul>
            <c:forEach items="${tagCloud.tags}" var="tag">
                <li><span class="btn-tag-item"><c:out value="${tag}"/></span></li>
            </c:forEach>
        </ul>
        </c:if>
    </div>
</div>