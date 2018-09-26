<?php
	if(isset($_GET['Name']) && isset($_GET['Chat'])){
		$Name = $_GET['Name'];
		$Chat = $_GET['Chat'];
		
		$file = fopen("chat.txt","a");
		fwrite($file,$Name);
		fwrite($file,",");
		fwrite($file,$Chat);
		fwrite($file,"\n");
		fclose($file);
		echo "New chat added";
		
	}
	else echo "Fill All Fields";
?>