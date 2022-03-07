function getArray(items) {
    return new Array().concat(items);
}
var array1 = getArray([3, 4, 2, 5, 7, 6, 8, 9, 1, 3, 2]);
var array2 = getArray(['One', 'Two', 'Three', 'four']);
array1.push("Five");
array2.push(555);
console.log(array1);
console.log(array2);
console.log(array1[2]);
console.log(array2[1]);
//================================================
function getmyArray(items) {
    return new Array().concat(items);
}
var array3 = getmyArray([3, 4, 2, 5, 7, 6, 8, 9, 1, 3, 2]); //After ES6 no need to specify <number> <string>
var array4 = getmyArray(['One', 'Two', 'Three', 'four']);
array1.push("Five");
array2.push(555);
console.log(array3);
console.log(array4);
console.log(array3[2]);
console.log(array4[1]);
console.log(typeof (array3));
console.log(typeof (array4));
console.log(typeof (array3[1]));
console.log(typeof (array4[2]));
//========================================
