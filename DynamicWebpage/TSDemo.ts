abstract class Person{
	name : string; //creating variable
	constructor(name : string){//creating constructor
		this.name=name;
	}
	display(): void{//concreate method
		console.log(this.name);
	}
	abstract find(string : string):Person; //Abstract methods must be implemented in the child class
}
class Employee extends Person{
	empCode: number;
	constructor(name:string, code:number){
		//this name=name;
		super(name);
		this.empCode=code;
	}
    find(string: string): Person {
	return new Employee(string, 1);
        //throw new Error("Method not implemented.");
    }
	
}
let emp : Person = new Employee("Joy",111);
emp.display();
let emp2 : Person = emp.find("Jesuwa");
console.log(emp.display);
console.log(emp2.display);

//==============================================

abstract class Person1{
	abstract name : string; //creating variable
	//constructor(name : string){//creating constructor
	//	this.name=name;
	//}
	display(): void{//concreate method
		console.log(this.name);
	}
	abstract find(name : string):Person; //Abstract methods must be implemented in the child class
}
class Employee1 extends Person1{
    name: string;
	empCode: number;
	constructor(name:string, code:number){
		//this name=name;
		super();
		this.empCode=code;
		this.name=name;
	}
    find(name: string): Person {
	return new Employee(name, 1);
        //throw new Error("Method not implemented.");
    }
	
}
let emp1 : Person1 = new Employee1("Joy",111);
emp.display();
let emp21 : Person = emp1.find("Jesuwa");
console.log(emp1.display);
console.log(emp21.display);
//===============================================================
interface IEmployee{
	empCode: number;
	empName:string;
}
let emp3:Readonly<IEmployee>={
	empCode:1,empName:"Joy"
}
let emp4:IEmployee={
	empCode:1,empName:"Joy"
}
emp4.empCode=3;
emp4.empName="Joy Jesuwa";
//===============================
class Circle{
	static PI:number=3.1435633;
	static calculateArea(radius:number):number{
	return this.PI*radius*radius;
}}
//newCircle:Circle = new Circle();
console.log(Circle.PI);
console.log(Circle.calculateArea(5.3345));
//=========================================
