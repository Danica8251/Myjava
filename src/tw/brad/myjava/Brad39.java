package tw.brad.myjava;

import java.util.HashSet;
import java.util.TreeSet;

public class Brad39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HashSet 寫法
//		HashSet<Integer> lotters = new HashSet<>();
////		lotters.add(12); // 泛型
////		lotters.add((byte)12); // byte => int => autboxing =>Integer 沒有這樣寫的
//		
//		while (lotters.size() < 6) {
//			lotters.add((int)(Math.random() * 49 + 1));
//		}
//		System.out.println(lotters);
//	}
		
		// TreeSet 寫法
		TreeSet<Integer> lotters = new TreeSet<>();
//		lotters.add(12); // 泛型
//		lotters.add((byte)12); // byte => int => autboxing =>Integer 沒有這樣寫的
		
		while (lotters.size() < 6) {
			lotters.add((int)(Math.random() * 49 + 1));
		}
		System.out.println(lotters);
	}

}

/* 練習用 while coding 撲克牌洗牌 */
