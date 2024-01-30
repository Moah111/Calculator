package le.anh.study;

import CasioFx570.Casio;

public class MayTinh {

	public void phanTach(String str) {
		char[] strChar = str.toCharArray();
		//		'2', '+', '3'  
		String so1 = "";
		String toanTu = "";
		String so2 = "";
		for (int i = 0; i < strChar.length; i++) {
			if (isNumber(strChar[i])) {
				if (toanTu.equals("")) {
					so1 = so1 + strChar[i];
					continue;
				}
				so2 = so2 + strChar[i];
			} else {
				toanTu = toanTu + strChar[i];
			}
		}
		System.out.println(calculate(Integer.parseInt(so1), Integer.parseInt(so2), toanTu));
	}
	
	public float calculate(int so1, int so2, String toanTu) {
		if (toanTu.equals("+")) {
			
		}
		switch(toanTu) {
			case "+" : return (float)so1 + so2;
			case "-" : return (float)so1 - so2;
			case "*" : return (float)so1 * so2;
			case "/" : return (float)so1 / so2;
			case "^" : return (float)Casio.tinhLT(so1, so2);

		}
		return 0;
	}
	
	public boolean isNumber(char value) {
		try {
			Integer.parseInt(value + "");
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	
	public static void main(String[] args) {
		MayTinh mt = new MayTinh();
		mt.phanTach("23^2");
	}
}
