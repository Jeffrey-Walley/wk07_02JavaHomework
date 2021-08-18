public class AsciiChar {
    public static void printNumbers() {
        for (int i = 0; i <= 9; i++) {
            if (i == 9) {
                System.out.print(i + ".\n");
            } else System.out.print(i + ", ");
        }

    }

    public static void printLowerCase() {
        for (char character = 'a'; character <= 'z'; character++) {
            if (character == 'z') {
                System.out.print(character + ".\n");
            } else System.out.print(character + ", ");
        }
    }

    public static void printUpperCase() {
        for (char character = 'A'; character <= 'Z'; character++) {
            if (character == 'Z') {
                System.out.print(character + ".\n");
            } else System.out.print(character + ", ");
        }
    }
}