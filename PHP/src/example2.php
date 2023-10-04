<?php
/**
 * Custom function to calculate the sum of two numbers.
 *
 * @param int $num1 The first number.
 * @param int $num2 The second number.
 * @return int The sum of the two numbers.
 */
function customSum($num1, $num2) {
    return $num1 + $num2;
}

/**
 * Custom function to find the maximum value among three numbers.
 *
 * @param int $num1 The first number.
 * @param int $num2 The second number.
 * @param int $num3 The third number.
 * @return int The maximum among the three numbers.
 */
function customMax($num1, $num2, $num3) {
    return max($num1, $num2, $num3);
}

// Sample numbers
$a = 10;
$b = 5;
$c = 15;

// Inlay function argument parameter hints should show the specified types and parameter names
$sumResult = customSum($a, $b);
$maxResult = customMax($a, $b, $c);

// Output the results
echo "Sum of $a and $b: $sumResult<br>";
echo "Maximum among $a, $b, and $c: $maxResult<br>";
