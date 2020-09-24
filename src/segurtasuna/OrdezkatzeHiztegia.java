package segurtasuna;

public class OrdezkatzeHiztegia {
    private String hiztegia = "ZXCVBNMASDFGHJKLQWERTYUIOP";

    public String zifratu (String mezua){
        String emaitza = "", gehitu = "";
        Character act = 'A';
        for (int i = 0; i < mezua.length(); i++){
            act = mezua.charAt(i);
            if (act.equals(' ')){
                gehitu = " ";
            }else {
                int zenb = act.hashCode();
                //Mayuscula ahal da ?
                if (zenb >= 97) { //Minuscula da
                    zenb = zenb - 32;
                }//Bestela mayuscula
                gehitu = hiztegia.substring(zenb - 65, zenb - 64);
            }
            emaitza = emaitza + gehitu;
        }
        return emaitza;
    }

    public String deszifratu (String kripto){
        String emaitza = "", gehitu = "";
        Character act = 'A';
        for (int i = 0; i < kripto.length(); i++){
            act = kripto.charAt(i);
            if (act.equals(' ')){
                gehitu = " ";
            }else {
                int zenb = act.hashCode();
                //Mayuscula ahal da ?
                if (zenb >= 97) { //Minuscula da
                    zenb = zenb - 32;
                }//Bestela mayuscula
                int index = hiztegia.indexOf((char)zenb) + 65;
                gehitu = Character.toString((char)index);
            }
            emaitza = emaitza + gehitu;
        }
        return emaitza;
    }
}
