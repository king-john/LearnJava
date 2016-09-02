<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script src="http://code.jquery.com/jquery-1.5.2.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#but1").click(function(){
		//指定访问服务的地址
		var wsUrl = "http://10.8.8.143:8089/markInfoService?wsdl";
		//构造请求体
		var soap = '<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">'
						+'<soap:Body>'
							+'<ns2:teacherMark xmlns:ns2="http://10.8.8.143:8089/markInfoService?wsdl">'
								+'<arg0>EbJ2XjT8pLh8sxjoVzBzBuLzR34/MPdJejshTX28fOlpvPppJSeQqNgrcnZZP0TmzVOzQSQztYg67yJOBvZocdaIgtbh9j4bsWUFvSLSsOb4T4WcJEQY8CAWl2VxwqpOlC5TSxKkOZAfyjGabwGhrw==</arg0>'
							+'</ns2:teacherMark>'
						+'</soap:Body>'
				    +'</soap:Envelope>';
		$.ajax({
				url:wsUrl,
				type:'post',
				dataType:'xml',
				contentType:'text/xml;charset=UTF-8',
				data:soap,
				success:function(data){
					alert('OK!');
					var o = $(data);
					alert(o.find('return').eq(0).text());
				},
				error:function(){
					alert('error!');
				}
				});
	});
});
</script>
<body>
 <input type="button" value="发送jquery的ajax请求" id="but1">
</body>
</html>