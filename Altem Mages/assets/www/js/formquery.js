function submitForm(){
	alert('enter submit form');
	var arrayObjects = $('#myform').serializeArray();
	var arrayString = JSON.stringify(arrayObjects);
	alert(arrayString);
	window.PhoneGapInterface.submitForm(arrayString);
}