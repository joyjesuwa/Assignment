function displayType<T,U>(id:T,name:U):void{
	console.log(typeof(id)+","+typeof(name));
}
displayType<number,string>(1,"Joy");
displayType<string,number>("Jesuwa",2);
//==============================================
function displayType1<T,U>(id:T,name:U):void{
	console.log(typeof(id)+","+typeof(name));
}
displayType1<boolean,string>(true,"Joy");
displayType1<string[],number>(["Jesuwa","Joy"],2);
displayType1<number[],string>([5,3],"JJJ");
//================================================
function displayType2<T,U>(id:T,name:U):void{
	id.toString();
	name.toString();
	//id.toFixed();//No gaurentee to be number
	//name.toUpperCase();//No gaurentee to be string
	console.log(typeof(id)+","+typeof(name));
}
displayType2<number,string>(3,"Joy");
displayType2<string,number>("Jesuwa",2);
displayType1<boolean,string>(true,"Joy");
displayType2<number[],string>([5,3],"JJJ");
console.log(displayType2);
//=============================================