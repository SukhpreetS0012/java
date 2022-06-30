import java.util.*;

class PasswordValidation {

  public static void main(String[] args) {

    final int NUM_Lower_LETTERS = 2;
    final int NUM_Upper_LETTERS = 2;
    final int NUM_DIGITS = 2;
    int upperCount = 0,lowerCount = 0, digitCount = 0;

    System.out.println("Enter a valid password that contain at least 6 Characters, digits and letters");

    Scanner in = new Scanner(System.in);
    String input = in.nextLine();

    int inputlen = input.length();

    // Character:
    for (int i = 0; i < inputlen; i++) {

      char ch = input.charAt(i);
      if (Character.isUpperCase(ch))

        upperCount++;

      else if (Character.isLowerCase(ch))

        lowerCount++;
      else if (Character.isDigit(ch))

        digitCount++;
    }

    if (upperCount >= NUM_Upper_LETTERS && lowerCount >= NUM_Lower_LETTERS && digitCount >= NUM_DIGITS )//&& inputlen > 6)
      System.out.println("Valid password");
    else {

      System.out.println("The password doesn't contains :");

      if (upperCount < NUM_Upper_LETTERS )

        System.out.println("less uppercase letters ");
		
      if (upperCount < NUM_Lower_LETTERS )

        System.out.println("less lowercase letters ");


      if (digitCount < NUM_DIGITS)
        System.out.println("less digits ");
    }
  }
}
