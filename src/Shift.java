import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Shift {
    static Map<Integer, String> cipherMap = new HashMap<Integer, String>();
    static Map<String, Integer> decipherMap = new HashMap<String, Integer>();
    static String answer = "";
    static int shiftNum = 0;


    public static void altEncryption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the shift amount:");
        shiftNum = scanner.nextInt();
        System.out.println("Please enter the letters to decode ALT(line by line, enter @ to EXIT):");
        String line = scanner.nextLine().toLowerCase();
        String encrypted = "";
        boolean forward = true;
        while (!line.equals("@")) {
            String parsed = "";
            for (int i = 0; i < line.length(); i++) {
                int curr;
                if (forward)
                    curr = decipherMap.get(line.substring(i, i + 1)) - shiftNum;
                else
                    curr = decipherMap.get(line.substring(i, i + 1)) + shiftNum;
                if (curr < 1)
                    curr += 26;
                else if (curr > 26)
                    curr -= 26;

                String currAns = cipherMap.get(curr);
                encrypted += currAns.toUpperCase();
                forward = !forward;
            }
            encrypted += parsed;
            line = scanner.nextLine().toLowerCase();
        }
        System.out.println(encrypted);
    }

    public static void altDecryption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the shift amount:");
        shiftNum = scanner.nextInt();
        System.out.println("Please enter the letters to decode ALT(line by line, enter @ to EXIT):");
        String line = scanner.nextLine().toLowerCase();
        String encrypted = "";
        boolean forward = false;
        while (!line.equals("@")) {
            String parsed = "";
            for (int i = 0; i < line.length(); i++) {
                int curr;
                if (forward)
                    curr = decipherMap.get(line.substring(i, i + 1)) - shiftNum;
                else
                    curr = decipherMap.get(line.substring(i, i + 1)) + shiftNum;
                if (curr < 1)
                    curr += 26;
                else if (curr > 26)
                    curr -= 26;

                String currAns = cipherMap.get(curr);
                encrypted += currAns.toUpperCase();
                forward = !forward;
            }
            encrypted += parsed;
            line = scanner.nextLine().toLowerCase();
        }
        System.out.println(encrypted);
    }

    public static void shift() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the shift amount(forwad):");
        shiftNum = scanner.nextInt();

        System.out.println("Please enter the letters to decode(line by line, enter @ to EXIT):");
        String line = scanner.nextLine().toLowerCase();
        while (!line.equals("@")) {
            String parsed = "";
            for (int i = 0; i < line.length(); i++) {
                int curr = decipherMap.get(line.substring(i, i + 1)) - shiftNum;
                if (curr < 1)
                    curr += 26;

                String currAns = cipherMap.get(curr);
                answer += currAns.toUpperCase();
            }
            answer += parsed;
            line = scanner.nextLine().toLowerCase();
        }

        System.out.println("This is the answer:\n" + answer);

    }

    public static void buildCipherMap() {
        cipherMap.put(1, "a");
        cipherMap.put(2, "b");
        cipherMap.put(3, "c");
        cipherMap.put(4, "d");
        cipherMap.put(5, "e");
        cipherMap.put(6, "f");
        cipherMap.put(7, "g");
        cipherMap.put(8, "h");
        cipherMap.put(9, "i");
        cipherMap.put(10, "j");
        cipherMap.put(11, "k");
        cipherMap.put(12, "l");
        cipherMap.put(13, "m");
        cipherMap.put(14, "n");
        cipherMap.put(15, "o");
        cipherMap.put(16, "p");
        cipherMap.put(17, "q");
        cipherMap.put(18, "r");
        cipherMap.put(19, "s");
        cipherMap.put(20, "t");
        cipherMap.put(21, "u");
        cipherMap.put(22, "v");
        cipherMap.put(23, "w");
        cipherMap.put(24, "x");
        cipherMap.put(25, "y");
        cipherMap.put(26, "z");
    }

    public static void buildDecipherMap() {
        decipherMap.put("a", 1);
        decipherMap.put("b", 2);
        decipherMap.put("c", 3);
        decipherMap.put("d", 4);
        decipherMap.put("e", 5);
        decipherMap.put("f", 6);
        decipherMap.put("g", 7);
        decipherMap.put("h", 8);
        decipherMap.put("i", 9);
        decipherMap.put("j", 10);
        decipherMap.put("k", 11);
        decipherMap.put("l", 12);
        decipherMap.put("m", 13);
        decipherMap.put("n", 14);
        decipherMap.put("o", 15);
        decipherMap.put("p", 16);
        decipherMap.put("q", 17);
        decipherMap.put("r", 18);
        decipherMap.put("s", 19);
        decipherMap.put("t", 20);
        decipherMap.put("u", 21);
        decipherMap.put("v", 22);
        decipherMap.put("w", 23);
        decipherMap.put("x", 24);
        decipherMap.put("y", 25);
        decipherMap.put("z", 26);
    }


    public static void main(String[] args) {
        buildCipherMap();
        buildDecipherMap();
        System.out.println("Welcome to Shift Cipher!");
        shift();
    }
}
