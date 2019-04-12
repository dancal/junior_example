<?php
	echo "START TIME: ".date("D M j G:i:s T Y")."\n";
	$a = 0;
	for($i=1;$i<=100000000;$i++){
		$a+=$i;
	}
	echo "SUM : ".$a."\n";
	echo "END TIME : ".date("D M j G:i:s T Y");
