function test(){
	var otherFile = window.PhoneGapInterface.getHtmlFileName();
	document.getElementById('cardHolder').innerHTML = otherFile;
	
}

$(document).ready(function() {
  // Handler for .ready() called.
  alert('ready');
});

function anotherTest(){
	alert('test21');
	document.getElementById('cardHolder').innerHTML = 'yoyoyoy';
}

