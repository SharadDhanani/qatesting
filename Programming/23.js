/**
 * Copy and modify one of the above loops (from the previous question) to print the name of the number (include the word minus if needed) before the number itself. eg. minus one -1 one 1
 */


var dg = ['zero','one','two','three','four',
'five','six','seven','eight','nine']; 

for (var number = -3; number <= 9; number++) {
  if(Math.sign(number) == -1){
	  console.log('Minus ' + dg[Math.abs(number)]);
  }else{
	  console.log(dg[number]);
  }
}

