function myFunction(){
	var name="Joy Jesuwa";
	function printName(){
		alert("This is my name:"+name);
		console.log(name);
	}
	printName();
}
myFunction();
//var yourFunction=myFunction();
//yourFuction();

//==================================

function addition(a){
	return function(y){
		return a+y;
	};
}
var first=addition(5);//passing value to a
var second=addition(10);
console.log("5+15="+first(15));
console.log("10+30="+second(30));//passing value to y

//===========================================