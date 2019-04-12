#!/usr/bin/php7.1
<?php

# by dancal
function summary( $n ) {

	return ( $n < 0 ? $n *(-${n} + 1) / 2 + 1 :  $n * ( $n + 1) / 2);

}
echo "SUM = " . summary(100000000);

?>
