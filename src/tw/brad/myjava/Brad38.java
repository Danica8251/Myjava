/* 
 * 迭代器 iterator, iterable 可迭代 
 * 在java中如果可以用for-each，基本上都是迭代
 * 
 * set：1.元素不會重複 
 *		2.沒有順序性
 *
 * list：1.元素可以重複
 * 		 2.有順序性 
 * */

package tw.brad.myjava;

import java.util.HashSet;
import java.util.Iterator;

public class Brad38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet set = new HashSet(); // 基本型別不會在裡面，在裡面的一定是物件
		set.add("Brad");
		set.add(new String("Brad"));
		set.add("Brad");
		set.add(123); // 基本型別 int 自動封箱 Integer Object (int => autoboxing => Integer Object)
		set.add(12.3); // 基本型別 double 自動封箱 double Object (double => autoboxing => double Object)
		set.add("iSpan"); // 基本型別 String 自動封箱 String Object (String => autoboxing => String Object)
		System.out.println(set.size());
		System.out.println(set); // 不保證輸出順序，因為有改寫 ToString
		
		// 迭代，不建議使用
//		Iterator iterator = set.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		// 只要可迭代就可for-each，建議使用for-each語法
		for (Object obj : set) {
			System.out.println(obj);
		}
	}
		


}
