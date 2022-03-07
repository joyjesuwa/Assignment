document.writeln("External JavaScript");
/*window.alert(""Alert message");*/
var x=10;
let y=15;
const z=x+y;
document.writeln("Value of x:"+x);
document.writeln("Value of y:"+y);
document.writeln("Value of z:"+z);

while(x<20){
    document.writeln("Printing Value X "+x);
    x++;
}
do{
    document.writeln("Printing Value X "+x);
    x++;
}while(x<30);
/* This is comment*/
// document.writeln("Tarkeshwar" + x)
for(;x<50;x++){
    document.writeln("Tarkeshwar" + x)
}
function addition(a,b){
    return a+b
}
function subtraction(a,b){
    return a-b
}    
document.writeln("Subtration of "+x+" and "+y+" : "+subtraction(x,y));


var name=prompt("What is your name");
document.writeln("Your name is"+name);

isNaN(x)
document.writeln("x is not a number"+isNaN('3456'));
document.writeln("name is not a number"+isNaN(name));