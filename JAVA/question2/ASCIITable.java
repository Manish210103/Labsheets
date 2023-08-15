public class ASCIITable {
    public static void main(String[] args) {
        int charsPerLine = 10;
        char startChar = '!'; 
        char endChar = '~'; 

        int count = 0; 
        System.out.print("\n");

        for (char c = startChar; c <= endChar; c++) {
            System.out.print(c + " "); 
            count++;

            if (count == charsPerLine) {
                System.out.println(); 
                count = 0; 
            }
        }
        System.out.println("\n");
    }
}
