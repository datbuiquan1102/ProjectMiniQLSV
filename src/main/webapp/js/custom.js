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
var fillvalueidGV = (magv, hoten, luong) =>{
	document.getElementById("modalmagv").value = magv;
	document.getElementById("modalhoten").value = hoten;
	document.getElementById("modalluong").value = luong;
	
}

var fillvaluebyDT= (madt, tendt, kinhphi, noithuctap) =>{
	document.getElementById("modalmadt").value = madt;
	document.getElementById("modaltendt").value = tendt;
	document.getElementById("modalkinhphi").value = kinhphi;
	document.getElementById("modalnoithuctap").value = noithuctap;
	
}

