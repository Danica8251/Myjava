package tw.brad.myjava;

import java.util.LinkedList;

public class Brad40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		LinkedList<String> list = new LinkedList<>(); // 泛型
//		list.add("A");
//		list.add(0, "B");
//		for (String v : list) {
//			System.out.println(v);
//		}
//		System.out.println("---");
//		list.add(1, "C");
//		for (String v : list) {
//			System.out.println(v);
//		}

		
		/* 原為ABCDE，不改變位置，改為輸出ECDBA */
		LinkedList<String> list = new LinkedList<>(); // 泛型
		list.add(0,"A"); // 0為首位，A第一
		list.add(0,"B"); // B搶第一，把A往後擠
		list.add(0,"C"); // C搶第一，把B、A往後擠
		list.add(0,"D"); // D搶第一，把C、B、A往後擠
		list.add(0,"E"); // E搶第一，把D、C、B、A往後擠
		for (String v : list) {
			System.out.println(v);
		}
		
		
	}

}
