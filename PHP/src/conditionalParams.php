<?php
/**
 * Custom function to calculate the area of a shape.
 *
 * @param string $shape The shape ('circle' or 'rectangle').
 * @param float|int $param1 The first parameter (radius for circle, length for rectangle).
 * @param float|int $param2 The second parameter (optional for circle, width for rectangle).
 * @return float The area of the shape.
 */
function calculateArea($shape, $param1, $param2 = null) {
    if ($shape === 'circle') {
        return $param1 * $param1 * pi();
    } elseif ($shape === 'rectangle') {
        return $param1 * ($param2 ?? 0);
    } else {
        return 0;
    }
}

// Testing overloaded behavior
$circleArea = calculateArea('circle', 5);
$rectangleArea = calculateArea('rectangle', 4, 6);

echo "Area of circle: $circleArea<br>";
echo "Area of rectangle: $rectangleArea<br>";
