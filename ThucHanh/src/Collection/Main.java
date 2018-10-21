package Collection;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List list = new ArrayList<>();


		for (int i=0;i<10;i++) {
			SinhVien sv = new SinhVien("nguyen van a"+i, "00"+i, i+10);
		list.add(sv);
		}
		for (int i=0;i<list.size();i++) {
			Object get =list.get(i);
			if (get instanceof SinhVien) {
				SinhVien sv =(SinhVien) get;
				list.get(i);
				System.out.println(sv);
			}
		}
	}
	

}
