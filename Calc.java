public class Calc {
    public  static String calc(String value1, String value2, String value3,
                               String arbitr1, String arbitr2) throws Exception{
        String num1 = value1;
        String num2 = value2;
        String oper = value3;
        String arb1 = arbitr1;
        String arb2 = arbitr2;
        String res;
        if(arb1.equals(arb2) && arb1 == "A"){
            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            res = Mathem.calculate(n1, n2, oper,arbitr1);
            return res;

        }
        else if(arb1.equals(arb2) && arb1 == "R"){
            int n1 = ConverterClass.romanToArabic(num1);
            int n2 = ConverterClass.romanToArabic(num2);
            res = Mathem.calculate(n1, n2, oper,arbitr1);
            return res;

        }
        else{
            throw new Exception("Неверный ввод!");
        }


    }

}
