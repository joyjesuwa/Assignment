let a=3;
let b="Tarkeshwar";
//b=<string>a;
//a=<number>b;
let c="Hello World";
let array=[4,"hello",true];
console.log(typeof(array));
let kb=<number>a;
let abc=a as number;
//=========================
let subtract=function(x:number, y:number):number{
    return x-y;
}
let result=subtract(2,5);
console.log(result);
//==================================
function greeting(name: string): void {
    console.log("Hello " + name + ", How are you?");
}
greeting("Dr. Tarkeshwar Barua");
function addtion(a: number, b: number): number {
    return a + b;
}
//=====================================
 function sayHello(name:string, msg?:string): string {    return "Hi,"+name+". "+msg;
}
console.log(sayHello("Dr. Tarkeshwar Barua"));
console.log(sayHello("Dr. Tarkeshwar Barua","Good Morning"));
//===========================================
 function add(a:number, b:number):number;function add(a:string, b:string):string;
function add(a: any, b:any):any{
    return a+b;
}
console.log(add(65,5));
console.log(add("Tarkeshwar","Barua"));
//============================================
function greet(name:string, ...msg:string[]): string {
    return "Hi,"+name+". "+msg.join(", ")+"!";
}
console.log(greet("Dr. Tarkeshwar Barua"));
console.log(greet("Dr. Tarkeshwar Barua","Good Morning","Good Afternoon","Good Evening"));
//==========================================================
interface IEmployee{    empCode:number;
    empName:string;
    //salray:(number) => number;
    getEmpName(number):string;  // abstract function
}
let obj:IEmployee ={empCode:1,
                    empName:"Tarkeshwar",
                    getEmpName(number):string{return "Tarkeshwar";}};
console.log(obj.getEmpName);
console.log(obj);
console.log(obj.empCode);
console.log(obj.empName);
//==================================================================
interface IEmployee{
    empCode:number;
    empName:string;
    //salray:(number) => number;
    getEmpName(number):string;  // abstract function
}
let obj1:IEmployee ={empCode:1,
                    empName:"Tarkeshwar",
                    getEmpName(number):string{return "Tarkeshwar";}};
console.log(obj1.getEmpName(1));
console.log(obj1);
console.log(obj1.empCode);
console.log(obj1.empName);
//==========================================================================
interface KeyValueProcessor{  // functional interface    (key: number, value:string):void;
};
function  addKeyValue(key:number, value:string):void{
    console.log(key+", "+value);
}
function  updateKeyValue(key:number, value:string):void{
    console.log(key+", "+value);
}
let myobj:KeyValueProcessor = addKeyValue;
myobj(1,"Tarkesh");
let myobj1:KeyValueProcessor = updateKeyValue;
myobj(2,"Barua");
//===================================================
interface IEmployee{
    empCode:number;
    empName:string;
    getsalray:(number) => number;
    getEmpName(number):string;  // abstract function
}
let obj:IEmployee ={empCode:1,
                    empName:"Tarkeshwar",
                    getsalray(num):number{
                        return 100;
                    },
                    getEmpName(number):string{
                        return "Tarkeshwar";
                        }
                    };
console.log(obj.getEmpName(1));
console.log(obj);
console.log(obj.empCode);
console.log(obj.empName);
//==========================================
class Employee implements IEmployee {
    empCode: number;
    empName: string;
    constructor(empCode: number, empName: string) {
        this.empCode = empCode;
 
    }
    getsalray(num): number {
        return 100;
    }
    getEmpName(number): string {
        return "Tarkeshwar";
    }
}
//===================================================
class Student{
	private rollNumber:number;
	private stdName:string;
	constructor(enrollment:number,name:string){
		this.rollNumber=enrollment;
		this.stdName=name;
	}
	getName():number{
		return this.rollNumber;
	}
	getRollNumber():number{
		return 3434;
	}
}
//======================================================================
class Person{
    name : string;
    constructor(name:string){
        this.name=name;
    }
}
class CompanyEmployee extends Person{
    empCode:number;
    constructor(code:number, empName:string){
        super(empName);
        this.empCode=code;
    }
    displayName():void{
        console.log(this.empCode+", "+this.empCode);
    }
}
let newObj:CompanyEmployee=new CompanyEmployee(1,"Tarkesh");
newObj.displayName();
//=========================================================
interface Iperson{
    name:string;
    display():void;
}
interface IEmployee1{
    empCode:number;
}
class Employee1 implements IEmployee1,Iperson{
    empCode:number;
    name: string;
    constructor(empcode:number, empname:string){
        this.empCode=empcode;
        this.name=empname;
    }
    display():void{
        console.log(this.empCode+", "+this.name);
    }
}
let yourObj:Iperson=new Employee1(1,"Tarkesh");
let yourObj1:IEmployee1=new Employee1(2,"Barua");
yourObj.display();
console.log(yourObj1.empCode);
//====================================================

class Person1{
	name:string;
}
interface IEmployee extends Person1{
	empCode:number;
}
let emp:IEmployee1 = {empCode:2,name:"Joy Jesuwa"};
console.log(emp);
//=====================================================




