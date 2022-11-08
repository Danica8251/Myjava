package tw.brad.myjava;

import tw.brad.myclass.BCrypt;

public class Brad79 {

	public static void main(String[] args) {
		
		String hash = "$2a$10$Yf6YrCxo3DquRwItlQjLyOWXrhZnPtiRtpFZX4LblVx9/5aN1FsAW\r\n";
		String passwd = "1234567";
		if (BCrypt.checkpw(passwd, hash)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		
	}

}
