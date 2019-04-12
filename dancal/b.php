#!/usr/bin/php7.1
<?php


$nTotal	= 0;
for( $i=1; $i <= 100000000; $i++ ) {
	$nTotal += $i;
}

echo "SUM = " . $nTotal;
?>
