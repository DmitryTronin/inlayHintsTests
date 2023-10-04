<?php

function foo($iii, $baz, $qux, $quux, $corge, $grault, $garply) {
    return true;
}

$bar = foo(
    'III',
    'BAZ',
    'QUX',
    'QUUX',
    'CORGE',
    'GRAULT',
    'GARPLY'
);


function test(int $number, string ...$example){}

$arrayOfArgs = ["one", "two" , "three"];

test(123,...$arrayOfArgs);

test(
    123,
    ...$arrayOfArgs
);