public class Mathem {
    public static String calculate(int first, int second, String operator, String arbitr) {
        int res;
        switch(operator) {
            case "+": res = first + second; break;
            case "-": res = first - second; break;
            case "*": res = first * second; break;
            case "/": res = first / second; break;

            default: throw new IllegalStateException("Unexpected value: " + operator);
        }
        return (arbitr == "R") ? ConverterClass.arabicToRoman(res) : String.valueOf(res);
    }
}
