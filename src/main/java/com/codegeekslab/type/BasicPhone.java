package com.codegeekslab.type;

import com.codegeekslab.device.CellPhone;

public class BasicPhone implements CellPhone {

	public void makeCall(int number, String app) {
		System.out.println("calling via " + app + " " + number);
	}

}
