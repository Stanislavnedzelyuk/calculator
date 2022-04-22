import java.util.regex.Pattern;

public class SplitNum {
    public static String[] valArray(String value) throws Exception{
        String val = value.strip();
        String[] str;
        String[] rez = new String[3];
        int indexpl = val.indexOf("+");
        int indexmn = val.indexOf("-");
        int indexpr = val.indexOf("*");
        int indexdr = val.indexOf("/");
        if(indexpl != -1){
            str = val.split(Pattern.quote("+"), 2);
            rez[0] = str[0].strip();
            rez[1] = str[1].strip();
            rez[2] = "+";
            return rez;
        }
        else if(indexmn != -1){
            str = val.split(Pattern.quote("-"), 2);
            rez[0] = str[0].strip();
            rez[1] = str[1].strip();
            rez[2] = "-";
            return rez;
        }
        else if(indexpr != -1){
            str = val.split(Pattern.quote("*"), 2);
            rez[0] = str[0].strip();
            rez[1] = str[1].strip();
            rez[2] = "*";
            return rez;
        }
        else if(indexdr != -1){
            str = val.split(Pattern.quote("/"),2);
            rez[0] = str[0].strip();
            rez[1] = str[1].strip();
            rez[2] = "/";
            return rez;
        }
        else {
            throw new Exception("Неверный ввод!");
        }


    }
}