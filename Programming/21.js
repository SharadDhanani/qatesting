/**
 * Given the javascript code below; what gets printed and why? Can you rewrite the code to make it better somehow? 
 * (if so, explain why it's better) var x = 1; if (x = 5) { console.log("x is 5"); } else { console.log("x is not 5"); }
 */

var x = 1; 
if (x = 5) 
{ 
	console.log("x is 5"); //This gets printed as the if condition has assignment operator
} else { 
	console.log("x is not 5"); 
}

//If the requirement is to check whether x is equal to 5

if (x == 5) 
{ 
	console.log("x is 5"); 
} else { 
	console.log("x is not 5"); 
}