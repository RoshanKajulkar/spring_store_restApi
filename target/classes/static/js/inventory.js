console.log("hello")

const xhr = new XMLHttpRequest();

xhr.open(
		 "GET", 
		 "/store/products");
  
// When response is ready
xhr.onload = function () {
	if (this.status === 200) {
  
		// Changing string data into JSON Object
		obj = JSON.parse(this.responseText);
		console.log(obj);
	}
}  
 
xhr.send();
