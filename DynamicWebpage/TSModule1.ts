export class sample1{
	greeting : string="Hello world";
	sayHello1():string{
		return "welcome";
	}
}


//============================
export class sample{
    public greeting:string = "Hello Friend How Are your?";
    constructor(){}
     sayHello(): string{
        return "grreting";
    }
}
//===========================
export let age:number=20;
export class Employee{
	empCode:number;
	empName:string;
	constructor(name:string, code:number){
		this.empCode=code;
		this.empName=name;
	}
	displayEmployee():void
{
	console.log(this.empCode+","+this.empName);
}}
let companyName:string="XYZ Corporation";
//====================================
import * as shortImport from "./variables_export";  
 
console.log(shortImport.age);
let emp = new shortImport.Employee("Dr. Tarkeshwar Barua", 2);
console.log(emp.displayEmployee());



