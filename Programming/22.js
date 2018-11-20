/**
 * Write 2 different types of loops in javascript or python that do the same thing, they print all values from -3 to 9 (inclusive bounds) that are odd.
 */

//Using For loop

for (var number = -3; number <= 9; number++) {
  if(Math.abs(number%2) == 1 )  console.log('Odd Number ' + number);
}


//Using While loop
var counter = -3;
while (counter < 10) {
     if(Math.abs(counter%2) == 1 )  console.log('Odd Number ' + counter);
    counter++;
}

