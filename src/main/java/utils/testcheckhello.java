package utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.testng.annotations.Test;

public class testcheckhello {

	@Test()
	public void verify() {

		String timeStamp1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss")
				.format(new Timestamp(System.currentTimeMillis()));

		String generated_timestamp = timeStamp1.replace(".", "_");

		StringBuffer str = new StringBuffer(generated_timestamp);
		str.delete(0, 8);
		str.delete(2, str.length());

		// String str = "hello";
		StringBuffer available_points = new StringBuffer("8,750 Pts");
		// String str = available_points.toString().replace("_", "");
		// String arg = "Pts";

		// String currency_symbol =
		// available_points.toString().substring(available_points.length() -
		// (arg.length() + 5),
		// available_points.length()-5);

		// available_points.delete(available_points.length() - (arg.length() + 6),
		// available_points.length());
		available_points.delete(available_points.length() - 4, available_points.length());
		// available_points.delete(0, available_points.length() - 10);
		// String str;
		/*
		 * String currency_symbol = available_points.toString()
		 * .substring(available_points.length() - (arg.length() + 5),
		 * available_points.length() - 5);
		 * available_points.delete(available_points.length() - (arg.length() + 6),
		 * available_points.length());
		 */

		// String currency_symbol = available_points.toString().substring(0,
		// arg.length());
		// available_points.delete(0, 19);
		// available_points.delete(0,available_points.length()-30);

		// available_points.delete(93, available_points.length());

		// String currency_symbol =
		// available_points.toString().substring(available_points.length() -
		// (arg.length() + 5),
		// available_points.length()-5);
		// available_points.delete(available_points.length() - (arg.length() + 6),
		// available_points.length());
		// str = available_points.toString().replace(",", "");

		// message.substring(10, 11);
		// int code = 50 * Integer.parseInt(message.substring(9, 11).toString());
		// int code = Integer.parseInt(message.toString());

		// message.delete(0, 4);
		// message.delete(message.length() - 3, message.length());

		// message.delete(0, 8);
		// message.delete(message.length() - Integer.parseInt(arg) , message.length());
		// int expected = budget_amount * Integer.parseInt(message.toString());
		// System.out.println("Expected points should be " + expected);

		// message.delete(0, 8);
		// message.delete(message.length() - 7, message.length());

		// System.out.println("Length of string is " + str.length());

		// String str = available_points.toString().replace(",", "");
		// int value = Integer.parseInt(str);
		// return Integer.parseInt(str);

		// float code1 = Float.parseFloat(message.toString());
		// int code = (int) Float.parseFloat(message.toString());
		// int code = 10 * Integer.parseInt(message.toString());

		// code = 10 * code;
		// System.out.println(message.substring(9, 11));
		// System.out.println("Result is " + Integer.parseInt(str));
		System.out.println("Result is " + str);
		// System.out.println("Currency is " + currency_symbol);

		// System.out.println("Result is " + value);
	}

}
