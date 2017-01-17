/* Tarek Salama
   Driver class that tests both the Secret and Password classes */

public class Program2
{
	public static void main (String[] args)
	{
		/* Creates a reference "pass" and tests two objects for both the Secret and Password classes */

		Encryptable pass = new Secret ("I am Batman");
		System.out.println ("Secret: " + pass);
		pass.encrypt();
		System.out.println ("Encrypted: " + pass);
		pass.decrypt();
		System.out.println ("Decrypted: " + pass + "\n");

		pass = new Password ("wordpass");
		System.out.println ("Password: " + pass);
		pass.encrypt();
		System.out.println ("Encrypted: " + pass);
		pass.decrypt();
      	System.out.println ("Decrypted: " + pass);
	}
}