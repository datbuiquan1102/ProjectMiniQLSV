var showMe = (id) => {
    	var option = confirm("Bạn có muốn xóa không");
    	if(option === true){
    		window.location.href = 'delete?sid='+id;
    }
};


var fillvaluemodal = (masv, hoten, namsinh, quequan) => {
	document.getElementById("modalmasv").value = masv;
	document.getElementById("modalhoten").value = hoten;
	document.getElementById("modalnamsinh").value = namsinh;
	document.getElementById("modalquequan").value = quequan;
}

var fillvalueidHD = (hoten, tendt, noithuctap, diem) =>{
	document.getElementById("modalhoten").value = hoten;
	document.getElementById("modaltendt").value = tendt;
	document.getElementById("modalnoithuctap").value = noithuctap;
	document.getElementById("modaldiem").value = diem;
}
