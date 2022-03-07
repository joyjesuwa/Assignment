function displayType(id, name) {
    console.log(typeof (id) + "," + typeof (name));
}
displayType(1, "Joy");
displayType("Jesuwa", 2);
//==============================================
function displayType1(id, name) {
    console.log(typeof (id) + "," + typeof (name));
}
displayType1(true, "Joy");
displayType1(["Jesuwa", "Joy"], 2);
displayType1([5, 3], "JJJ");
//================================================
function displayType2(id, name) {
    id.toString();
    name.toString();
    //id.toFixed();//No gaurentee to be number
    //name.toUpperCase();//No gaurentee to be string
    console.log(typeof (id) + "," + typeof (name));
}
displayType2(3, "Joy");
displayType2("Jesuwa", 2);
displayType1(true, "Joy");
displayType2([5, 3], "JJJ");
console.log(displayType2);
//=============================================
