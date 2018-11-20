/**
 * please include qatest.html while running the program 
 */


var person = [
{name:"Alice", age:23},
{name:"Bob", age:15},
{name:"Doug", age:22},
{name:"Chris", age:21}]

displayPerson();

$("#sort").on("click", function(){
	var sortVal = $("#sortBy").val();
	sortBy(sortVal);
	})
	
	
function sortBy(sortVal) {
	if(sortVal == "age"){
		person.sort(function(a, b){return a.age - b.age});
	}else if(sortVal == "name"){
		person.sort(function(a, b){
	    var x = a.name.toLowerCase();
	    var y = b.name.toLowerCase();
	    if (x < y) {return -1;}
	    if (x > y) {return 1;}
	    return 0;});
	}else{
		console.log("Please select sort By")
	}
    displayPerson();
}

function displayPerson() {
	var data="";
	for(var counter = 0; counter<person.length; counter++){
		data += person[counter].name + " " + person[counter].age + "<br>";
	}
  document.getElementById("demo").innerHTML = data;

}

