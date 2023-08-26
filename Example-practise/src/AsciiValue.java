public class AsciiValue {
    public static void main(String[] args) {
        int ch = 'a';

        int Ascii = ch;

        // ad you can also char cast to int

        int castAscii = (int) ch;

        System.out.println("The ascii value is" + ch + Ascii);
        System.out.println(" The ascii value is" + ch + castAscii);
    }
}
