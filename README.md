<p align="center">
  <img src="art/lapl_logo.png">
  <br><br>
  <img src="https://img.shields.io/badge/license-apache_2.0-yellow?style=flat-square">
  <img src="https://img.shields.io/badge/current_release-1.0α-blue.svg?style=flat-square">
  <a href="https://www.freenode.net"><img src="https://img.shields.io/badge/irc-%23lapl-orange?style=flat-square"></a>
  <!--<a href="https://travis-ci.org/Lartu/ldpl"><img src="https://img.shields.io/travis/Lartu/ldpl/master?style=flat-square"></a>-->
</p>

**LAPL** is an interpreted programming language designed from the ground up to be useful. It features **dynamic typing**
but only **explicit casting**, **user-defined scoping**, **functions-within-functions**, etc. It's expressive, it's
probably quite similar to a language you already know, it has been designed to run on
Unix systems and it's very easy to learn. If you keep reading this readme, by the end of it you will be a LAPL expert.

excessively expressive, readable,
fast and easy to learn. It mimics plain English, in the likeness of the good parts of older programming languages like COBOL, with the desire that it can be understood by anybody. LDPL was designed to run on Unix systems, including AMD-64 Linux, macOS, ARMv8 Linux, Android Termux and both Intel and PowerPC OS X (tested from Tiger 10.4 onwards). It even supports UTF-8 out of the box.

# Learn LAPL in Y minutes!

```c++
// This is a single-line comment
# This is also a single-line comment
/*
    This is a multi-line comment.
*/
#*
    This is also a multi-line comment, in case you are feeling fancy.
*#

/*---------------------------------------------*\
| ASSIGNMENT, VARIABLES, VALUES AND EXPRESSIONS |
\*---------------------------------------------*/

// Variables names in LAPL start with the sigil $. Variable names
// can only contain characters a-Z, numbers and underscores (_).
$foo = 10;
$bar = "hello"; // Every statement in LAPL ends with a semicolon (;).
$biz = true; $foobiz = true; // Multiple statements can be in a single line.

$bar = $foo; // Variables are dynamically typed and created.

// There are three scalar types in LAPL: numbers, strings and booleans.
$number = -1.918237; // This is a number.
$string = "This is a string.";
$boolean = false; // This is a boolean.

// Expressions in LAPL are typed with one of these three scalar types.
// Types cannot be mixed within expressions without casting.

$number = ((12387 * 123) / (2 ** 89) - 5) % $number + 17;
$string = "Welcome!" & crlf & "Hi there!"[0] & "Hello!"[1,5] & lf;
$boolean = not ((7 > 9) and true) or false;
//$number = $number + $string <-- This would fail, of course.
$value1 = "12";
$value2 = 2 * num $value1; // This works, as num casts $value1 to a number.
$text = "The result is " & str $value2;

/*-----------------*\
| DISPLAYING VALUES |
\*-----------------*/

display "The display function can be used to print values to the screen.\n";
display "Multiple" " values of different types can be printed to the screen!" lf;
display "The result is " $value2 " (and not " 12387 ")!" crlf;

// lf is short for "\n" and crlf is short for "\r\n".

/*------*\
| BLOCKS |
\*------*/

{
    // This is a block.
    {
        // Blocks can have blocks inside them
        // Blocks can be used to group multiple statements.
        // Also each block has its own scope.
    }

    // When variable is assigned a value within a block, if the variable DID NOT
    // already exist in an outer scope, the variable will be defined only
    // for the current scope.
    {
        $n = 10;
    }
    // $n doesn't exist here.
    $a = 100;
    {
        // You can access variables from outer scopes from within a block.
        display $a lf;
        // When variable is assigned a value within a block, if the variable DID
        // exist in an outer scope, the variable from the outer scope will be 
        // modified.
        $a = 50;
        display $a lf;
    }
    // $a is now equal to 50 here.
    {
        // If you want to declare a LOCAL version with the same name as one
        // that already exists in an outer scope, you can use the var command.
        var $a = 999;
        // Now $a refers to a new variable $a that only exists in the scope
        // of this block and child blocks. Here, $a equals 999.
    }
    // Here, $a is still equal to 999.
}

{
    $textA = "You can write code inside a block just like you would";
    $textB = "anywhere else.";
    display $textA " " $textB lf;
}

/*---------*\
| IF BLOCKS |
\*---------*/

$name = "LAPL";

if $name == "LAPL" {
    display "Yay, LAPL!" lf;
}
else {
    display "Sad, no LAPL!" lf;
}

$age = 20000;

if $age > 1000 display "Woah you are old!" lf;

if $age < 0 display "What" lf;
else if $age < 5 display "You are under 5!" lf;
else display "You are over 5." lf;

// The if syntax is:
// if boolean_expression statement [else statement]
// Blocks, if blocks, while blocks and function declarations are also statements.

/*------------*\
| WHILE BLOCKS |
\*------------*/

$n = 10;
while $n < 10 {
    display "$n equals " $n lf;
    $n = $n + 1;
}

while $n > 0 $n = $n - 1;

// The while syntax is:
// while boolean_expression statement
// Blocks are also statements.

while $n < 100000
{
    $n = $n + 1;
    if $n == 50 break;          // Break and continue work
    if $n % 2 == 0 continue;    // as they work in most languages.
    display $n " is even!" lf;
}

/*---------*\
| FUNCTIONS |
\*---------*/

fun info()
{
    // Functions in LAPL can be declared using the fun command.
}

fun myFunction($name, $myName)
{
    display "Hello " $name "!" lf;
    display "My name is " $myName lf;
    if $myName == "LAPL"
    {
        display "Yay!" lf;
    }
    // Functions can take multiple parameters.
}

// Functions can be called like you would call them in most other languages.
myFunction("new user", "LAPL");

fun duplicate($n)
{
    $duplicate = $n * 2;
    // To return a value, store it in a variable with the same
    // name as the function.
    break; // You can use break to exit from a function.
    display "This won't be displayed." lf;
}

display "17 x 2 = " duplicate(17) lf;

// You can also declare single-statement functions.

fun triplicate($n) $triplicate = $n * 3;

// Functions ALWAYS create a new scope inside them, even if you don't
// use a block for the function body. Function parameters are always
// declared within the function scope.

/*-------*\
| EXITING |
\*-------*/

// You can end script execution at any time by calling exit.
exit;

display "This code won't be executed!" lf;
exit 1; // Exit can also take an exit code.
```
