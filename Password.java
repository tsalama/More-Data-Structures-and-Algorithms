/* Tarek Salama
   Password class stores, encrypts, and decrypts a password */

import java.util.Random;

public class Password implements Encryptable
{
	private final static int ABC = 26;

	private String password;
	private boolean encrypted;
   	private Random generator;

   	/* Constructor stores the original password */
   	public Password (String pass)
	{
		password = pass;
		encrypted = false;
		generator = new Random();
   	}

    /* Encrypts password by placing a random character in between each password character */
    public void encrypt()
	{
    	if (!encrypted)
    	{
        	String temp = "";

         	for (int i = 0; i < password.length(); i++)
         	{
            temp = temp + password.charAt(i);

            temp = temp + (char)(generator.nextInt(ABC) + 'a');
         	}

         	password = temp;
         	encrypted = true;
      	}
	}

	/* Decrypts and returns password */
	public String decrypt()
   	{
   	   if (encrypted)
   	   {
		   String temp = "";

		   for (int i = 0; i < password.length(); i = i + 2)
              temp = temp + password.charAt(i);

           password = temp;
           encrypted = false;
   	   }

      	return password;
   	}

   	/* Returns password if encrypted */
   	public boolean isEncrypted()
	{
   		return encrypted;
	}

	/* Returns password */
	public String toString()
	{
		return password;
  	}
}