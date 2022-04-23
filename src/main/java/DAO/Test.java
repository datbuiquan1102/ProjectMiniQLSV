package DAO;

import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import MODEL.DeTaiModel;
import MODEL.GiangVienModel;
import MODEL.HDModel;
import MODEL.HuongDanModel;
import MODEL.InformationdDisplayByKhoaModel;
import MODEL.KhoaModel;
import MODEL.SinhVienModel;

public class Test {
	public static void main(String[] args) {
//
//		GiangVienDAO gvdao = new GiangVienDAO();
//		List<GiangVienModel> listgv = gvdao.getGVInKhoa(1001);
//		System.out.println(listgv);
		
//		KhoaDAO dao = new KhoaDAO();
//		List<GiangVienModel> list = dao.getGVbyIDKhoa("1002");
//		System.out.println(list);
		
//		InformationdDisplayByKhoaDAO dao = new InformationdDisplayByKhoaDAO();
//		List<InformationdDisplayByKhoaModel> list = dao.getAllIDByKhoa();
//		System.out.println(list);
		
		HuongDanDAO dao = new HuongDanDAO();
		List<HuongDanModel> list= dao.getSVNotExistHD();
		System.out.println(list);
	}
}
