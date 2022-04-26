var showMe = (id) => {
	var option = confirm("Bạn có muốn xóa không");
	if (option === true) {
		window.location.href = 'delete?sid=' + id;
	}
};


var fillvaluemodal = (masv, hoten, namsinh, quequan) => {
	document.getElementById("modalmasv").value = masv;
	document.getElementById("modalhoten").value = hoten;
	document.getElementById("modalnamsinh").value = namsinh;
	document.getElementById("modalquequan").value = quequan;
}

var fillvalueidHD = (magv, madt, sinhvien, noithuctap, diem, masv) => {
	document.getElementById("modalmagv").value = magv;
	document.getElementById("modalmadt").value = madt;
	console.log("madt", madt);
	console.log("inp", document.getElementById("modalmadt").value);
	document.getElementById("modalsinhvien").value = sinhvien;
	document.getElementById("modalnoithuctap").value = noithuctap;
	document.getElementById("modaldiem").value = diem;
	document.getElementById("modalmasv").value = masv;
}
var fillvalueidGV = (magv, hoten, luong) => {
	document.getElementById("modalmagv").value = magv;
	document.getElementById("modalhoten").value = hoten;
	document.getElementById("modalluong").value = luong;

}

var fillvaluebyDT = (madt, tendt, kinhphi, noithuctap) => {
	document.getElementById("modalmadt").value = madt;
	document.getElementById("modaltendt").value = tendt;
	document.getElementById("modalkinhphi").value = kinhphi;
	document.getElementById("modalnoithuctap").value = noithuctap;

}


var fillvalueKhoa = (makhoa) => {
	document.getElementById("idmakhoa").value = makhoa;
}

var fillvalueSVNotExist = (masv, tensv) => {
	document.getElementById("modalmasv").value = masv;
	document.getElementById("modaltensv").value = tensv;
}

var fillvaluegvbykhoa = (magv, tengv, luong, makhoa) => {
	console.log("magv", tengv);
	document.getElementById("modalmagv").value = magv;
	document.getElementById("modaltengv").value = tengv;
	document.getElementById("modalluong").value = luong;
	document.getElementById("modalmakhoa").value = makhoa;
}


var fillvaluesvbykhoa = (masv, hotensv, namsinh, quequan, makhoa) => {
	document.getElementById("modalmasv").value = masv;
	document.getElementById("modalhotensv").value = hotensv;
	document.getElementById("modalnamsinh").value = namsinh;
	document.getElementById("modalquequan").value = quequan;
	document.getElementById("modalmakhoa2").value = makhoa;
}
