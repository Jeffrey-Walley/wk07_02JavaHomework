import org.w3c.dom.ls.LSOutput;

public class convertToInt {
    public static int converter(String petName) {
        int num01 = 0;
        int num02 = 0;
        char character;
        if (petName.length() >= 2) {
            character = Character.toLowerCase(petName.charAT(i));

            switch (character) {
                case '0':
                    num01 = 0;
                    break;
                case '1':
                case '5':
                case 'j':
                case 'a':
                    num01 = 1;
                    break;
                case '2':
                case 't':
                case 'k':
                case 'b':
                    num01 = 2;
                    break;
                case '3':
                case 'c':
                case 'u':
                case 'l':
                    num01 = 3;
                    break;
                case '4':
                case 'v':
                case 'm':
                case 'd':
                    num01 = 4;
                    break;
                case '5':
                case 'w':
                case 'n':
                case 'e':
                    num01 = 5;
                    break;
                case '6':
                case 'x':
                case 'o':
                case 'f':
                    num01 = 6;
                    break;
                case '7':
                case 'y':
                case 'r':
                case 'q':
                    num01 = 7;
                    break;
                case '8':
                case 'z':
                case 'q':
                case 'h':
                    num01 = 8;
                    break;
                case '9':
                case 'p':
                case 'i':
                    num01 = 9;
                    break;
                default:
                    num01 += 10;
                    break;
            }
            num02 += num01;
        }
    } else num02 = 11;
      return num02;
}
