package DAO;

import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import MODEL.DeTaiModel;
import MODEL.GiangVienModel;
import MODEL.HDModel;
import MODEL.HuongDanModel;
import MODEL.KhoaModel;
import MODEL.SinhVienModel;

public class Test {
	public static void main(String[] args) {
//
//		GiangVienDAO gvdao = new GiangVienDAO();
//		List<GiangVienModel> listgv = gvdao.getGVInKhoa(1001);
//		System.out.println(listgv);

		GiangVienDAO dao = new GiangVienDAO();
		GiangVienModel gv = dao.getGVbyID("12");
		System.out.println(gv);
	}
}
