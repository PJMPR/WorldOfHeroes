<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	Podaj id gracza:<input type="text" id="id"/>
	<button id="showCharacters">Pokaż postacie</button>
	<div id="content"></div>
	
	<script type="text/javascript" src="scripts/jquery.js"></script>
	<script type="text/javascript">
		
		var textbox = $('#id');
		var button = $('#showCharacters');
		var content = $('#content');
		
		button.click(function(){
			
			var id = textbox.val();
			
			$.ajax({
				  url: "rest/players/"+id+"/characters",
				  method:'GET',
				  success: function( result ) {
						var characters ='';
					  for(var i= 0; i<result.length;i++){
						  characters = characters.concat("<p>");
						  characters = characters.concat(result[i].name);
						  characters = characters.concat(" ");
						  characters = characters.concat(result[i].faction);
						  characters = characters.concat(" ");
						  characters = characters.concat(result[i].race);
						  characters = characters.concat(" ");
						  characters = characters.concat(result[i].job);
						  characters = characters.concat(" ");
						  characters = characters.concat(result[i].lvl);
						  characters = characters.concat("</p>");
						}
					  content.html(characters);
				  }
				});
			
		});
		
	</script>
</body>
</html>