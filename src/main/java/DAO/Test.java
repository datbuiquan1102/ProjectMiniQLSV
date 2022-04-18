package DAO;

import java.util.ArrayList;
import java.util.List;

import MODEL.HDModul;
import MODEL.HuongDanModel;
import MODEL.KhoaModel;
import MODEL.SinhVienModel;

public class Test {
	public static void main(String[] args) {
		KhoaDAO dao = new KhoaDAO();
		List<KhoaModel> list = dao.getKhoaDAO();
		for (KhoaModel khoaModel : list) {
			System.out.println(khoaModel);
		}
	}
}
