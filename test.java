package task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM--dd");
		List<Date> list = new ArrayList<>(10);
//		for(int i=0; i<10; i++) {
//			try {
//				Date date = dateformat.parse("09-12");
//				list.add(date);
//			}catch(ParseException e) {
//				e.printStackTrace();
//			}
//		}
		
		try {
			for(int i=0; i<10; i++) {
				Date date = dateformat.parse("09-12");
				list.add(date);
			}
		}catch(ParseException e) {
			e.printStackTrace();
		}
	}	

}
