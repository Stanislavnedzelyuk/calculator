public class ArbitrNum {
    public static String valArbitr(String value) throws Exception{
        String val = value;
        int num;
        String type;
        String[] rom = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        int rc = 0;
        try {
            num = Integer.parseInt(val);
            if(num >= 0 && num <= 10){
                type = "A";
                return type;
            }else {
                throw new Exception("Неверный ввод!");
            }

        } catch(Exception ex) {
            for(String i:rom){
                if(i.equals(val)){
                    rc += 1;
                    break;
                }
            }
            if(rc == 0){
                throw new Exception("Неверный ввод!");
            }
            else{
                type = "R";
                return type;
            }
        }



    }
}