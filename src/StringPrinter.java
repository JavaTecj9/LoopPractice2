public class StringPrinter {

    public String str;

    public static void printString (String str) {
        for (int i = 0; i <= str.length() -1; i++)
            System.out.println("Character: " + str.charAt(i));

    }

    public static void reversePrintString (String str) {
        int i;
        for (i = str.length() -1; i >= 0; i--) {
            System.out.println("Character " + str.charAt(i));
        }

    }

}
