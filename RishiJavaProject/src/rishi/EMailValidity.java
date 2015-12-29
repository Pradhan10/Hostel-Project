package rishi;
import java.util.Scanner;

class EMailValidity {
	public void MailCheck(String Mid) {
		boolean f1 = false, f2 = false, f3 = false, f4 = false, f5 = false;
		int PosOfAtTheRate = 0, PosOfDot = 0;
		for (int i = 0; i < Mid.length(); i++) {
			// Test to check condition 1
			if (Mid.charAt(i) == '@') {
				if (true) {
					f1 = true;
					PosOfAtTheRate = i;
				} else
					System.out.println("There should be only one @");
			}
			if (Mid.charAt(i) == '.') {
				PosOfDot = i;
			}
		}

		if (Mid.charAt(0) == '@') {
			System.out.println("A word befor @ must appear");
		} else {
			// Test for condition 2
			f2 = true;
		}
		if (PosOfDot > PosOfAtTheRate) {
			f3 = true;
			f4 = true;
		} else
			System.out
					.println(" '.' after @ or word between @ and ' .' Missing ");
		if (Mid.charAt(PosOfDot + 1) == 'c') {
			f5 = true;
		} else
			System.out.println("A word after . must appear");
		if (f1 & f2 & f3 & f4 & f5 == true) {
			System.out.println("Valid Email ID");
		} else
			System.out.println("Invalid EMail id ");
	}
}
