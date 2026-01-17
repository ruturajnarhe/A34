package basic;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
class BankDetails implements java.io.Serializable {
	String accountHolderName;
	String address;
	long accountNumber;
	transient String upiPin;
	transient long debitCardNumber;
	transient int cvv;
	transient long adharCardNumber;
	String panCardNumber;
	transient long contact;

	BankDetails(String accountHolderName, String address, long accountNumber, String upiPin, 
		    long debitCardNumber, int cvv, long adharCardNumber, String panCardNumber, long contact) {
			this.accountHolderName = accountHolderName;
			this.address = address;
			this.accountNumber = accountNumber;
			this.upiPin = upiPin;
			this.debitCardNumber = debitCardNumber;
			this.cvv = cvv;
			this.adharCardNumber = adharCardNumber;
			this.panCardNumber = panCardNumber;
			this.contact = contact;
	}
	public void displayBankDetails() {
		System.out.println("Account Holder Name : " + accountHolderName);
		System.out.println("Address : " + address);
		System.out.println("Account Number : " + accountNumber);
		System.out.println("UPI Pin : " + upiPin);
		System.out.println("Debit Card Number : " + debitCardNumber);
		System.out.println("cvv number : " + cvv);
		System.out.println("Adhar Card Number : " + adharCardNumber);
		System.out.println("Pan Card Number : " + panCardNumber);
		System.out.println("Contact : " + contact);
	}
}
class DriverExampleTransient {
	public static void main(String[] args) {
		BankDetails bankDetails = new BankDetails("Ramesh Kumar", "JM Road, Deccan, Pune", 9875_1234_5678_1235l, "1234", 
							  1234_5678_9012_3456l, 123, 9876_4567_1324l, "ABCDE1234A", 9876543210l);

		System.out.println("\nBefore serialization object data");
		bankDetails.displayBankDetails();


		// serialization process 
		try {
			FileOutputStream fos = new FileOutputStream("bankdetails.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(bankDetails);
			System.out.println("Serialization process complete");
		} catch(Exception e) {
			System.out.println("Something went wrong while serialization");
		}

		// de-serialization process
		try {
			FileInputStream fis = new FileInputStream("bankdetails.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			BankDetails afterSer = (BankDetails)ois.readObject();
			System.out.println("\nde-serialization process complete");
			System.out.println("\nAfter serialization object data");
			afterSer.displayBankDetails();
		} catch(Exception e) {
			System.out.println("Something went wrong while de-serialization");
		}
	}
}