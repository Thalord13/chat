<?php
	
	$filename = "chat.txt";
	
	if(file_exists($filename)){
		$file=file($filename);
		echo"<table border width='100%'>";
		echo "<tr>";
			echo "<th>Sender</th>";
			echo "<th>Message</th>";
		echo "</tr>";
		foreach($file as $record){
			echo "<tr>"; 
			$fields=explode(",",$record);
			foreach($fields as $f){
				echo"<td>$f</td>";
			}
			echo"</tr>";
		}
		echo "</table>";
	}
	else{
		echo "No Chat Found";
	}
?>