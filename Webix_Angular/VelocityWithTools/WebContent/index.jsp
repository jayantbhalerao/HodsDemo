<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="velocity" uri="http://velocity.apache.org/velocity-view" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is a jsp page using Velocity Template</h1>

	<velocity:view>
		#if( $XHTML )
			#set($br = "<br />")
		#else
			#set($br = "<br>")
		#end
		
		$br
		$br
		$br
		
		Custom Tool : $custTool.message
		
		$br
		$br
		
		Count : #foreach($i in [1..5])$i #end
		
		$br
		$br
		
		Hashmap:$br
		first add foo: $map.put("foo",$foo)$br
		then add bar: $map.put("bar",$bar)$br
		$br
		and that gives us $map
		
		$br
		$br
		
		Date from dateTool : $date.medium
		
		$br
		$br
		
		#if( $isSimple )
			This is simple#if( $XHTML ) xhtml#end app version ${version}.
		#end

		$br
		$br

		Click <a href="index.vm">here</a> to see this VTL markup as a normal template.
	</velocity:view>
</body>
</html>