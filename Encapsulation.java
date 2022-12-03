package Concepts;

public class Encapsulation {

private int passcode = 993;	

	public int getPasscode() {
	return passcode;
}

public void setPasscode(int passcode) {
	this.passcode = passcode;
}

	public static void main(String[] args) {
		Encapsulation obj = new  Encapsulation();
		System.out.println(obj.getPasscode());
        obj.setPasscode(242);
		System.out.println(obj.getPasscode());

	}

}