import {sample1} from "./TSModule1";
let s=new sample();
console.log(s.sayHello());
//=====================================
import {sample} from "./TSModule1";
let sample1=new sample();
console.log(sample1.greeting);
console.log(sample1.sayHello());
//===================================
import {age} from"./TSModule1";
import {Employee} from "./TSModule1";
//cannot import without export assignment to the variable or class
console.log(age);
let emp:Employee=new Employee("Joy Jesuwa",2);
console.log(emp.displayEmployee());
//===========================
import {age as old} from "./TSModule1";
import {Employee} from "./TSModule1";
//import {companyName} from "./variables_export";
// can't import without export assignment to the variable or class'
 
console.log(old);
let emp:Employee= new Employee("Dr. Tarkeshwar Barua", 2);
console.log(emp.displayEmployee());
