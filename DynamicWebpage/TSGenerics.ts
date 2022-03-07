function getArray(items:any[]) : any[]{
	return new Array().concat(items);
}
let array1=getArray([3,4,2,5,7,6,8,9,1,3,2]);
let array2=getArray(['One','Two','Three','four']);
array1.push("Five");
array2.push(555);
console.log(array1);
console.log(array2);
console.log(array1[2]);
console.log(array2[1]);
//================================================
function getmyArray<T>(items:T[]) : T[]{//specifying data type
	return new Array<T>().concat(items);
}
let array3=getmyArray<number>([3,4,2,5,7,6,8,9,1,3,2]);//After ES6 no need to specify <number> <string>
let array4=getmyArray<string>(['One','Two','Three','four']);
array1.push("Five");
array2.push(555);
console.log(array3);
console.log(array4);
console.log(array3[2]);
console.log(array4[1]);
console.log(typeof(array3));
console.log(typeof(array4));
console.log(typeof(array3[1]));
console.log(typeof(array4[2]));
//========================================