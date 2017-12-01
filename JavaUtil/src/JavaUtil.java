import java.util.*;

public class JavaUtil {

     /**SAISIE UTILISATEUR**/
     /*Scanner scanner = new Scanner(System.in);*/

    /**RECUPERER UNE SAISIE UTILISATEUR**/
    /*String string = scanner.nextLine();*/

    /**-------------//////   PROPRIETE PC  \\\\\\-------------**/

    /**--------   AFFICHER LES PROPRIETES DU PC  ---------------**/

    public void printProperties() {

        Properties props = System.getProperties();
        Enumeration<?> propertyNames = props.propertyNames();
        String key = "";

        while (propertyNames.hasMoreElements()) {
            key = (String) propertyNames.nextElement();

            System.out.println(key + "=" + props.getProperty(key));
        }
    }

    /**-------------- CONFIGURER LES PROPRIETES PC --------**/

    public void setProperty(String property, String value){

        System.setProperty(property, value);
    }

    /**-------------- PRENDRE LES PROPRIETES PC --------**/
    public void getProperty(String property){

        System.getProperty(property);
    }

    /**-----------------------------------------------------------**/


    /**-------------- ////// METHODE POUR String \\\\\\--------**/

    /** --------------- TESTER L'EGALITE DE DEUX Strings    -----------**/
    public boolean testStringEquality(String s1, String s2){
        if (s1.equals(s2)){
            return true;
        }else{
            return false;
        }
    }
    // en cas d'egalité la methode renvoi true

    /** --------------- TESTER L'EGALITE DE DEUX Strings SANS CASS    -----------**/
    public boolean testStringEqualityIgnoreCase(String s1, String s2){
        if (s1.equalsIgnoreCase(s2)){
            return true;
        }else{
            return false;
        }
    }

    /** --------------- TESTER L'ORDRE DE Strings    -----------**/
    public int getOrderOfString(String s1, String s2){
        return s1.compareTo(s2);
    }

    /** --------------- INVERSER UNE CHAINE DE CARACTERE PAR LES LETTRES    -----------**/
    public String reverStringByLetter(String chaine){
        StringBuilder sb = new StringBuilder(chaine);
        String reverString = sb.reverse().toString();

        return reverString;
    }


    /** --------------- INVERSER UNE CHAINE DE CARACTERE PAR MOT    -----------**/
    public String reverseStringByWord(String chaine){
        Stack<Object> stack = new Stack<Object>();
        StringTokenizer strTok = new StringTokenizer(chaine);
        while(strTok.hasMoreTokens()){
            stack.push(strTok.nextElement());
        }
        StringBuilder reverseString = new StringBuilder();
        while(!stack.empty()){
            reverseString.append(stack.pop());
            reverseString.append(" ");
        }
        return reverseString.toString();

    }

    /** --------------- TRANSFORME UNE CHAINE DE CARACTERE EN MAJUSCULE -----------**/
    public String getUpperCaseString(String s){
        return s.toUpperCase();
    }

    /** --------------- TRANSFORME UNE CHAINE DE CARACTERE EN MINUSCULE -----------**/
    public String getLowerCaseString(String s){
        return s.toLowerCase();
    }

    /** --------------- TRANSFORME UNE CHAINE DE CARACTERE SANS ESPACE AU DEBUT ET A LA FIN -----------**/
    public String getStringWithoutSpace(String s){
        return s.trim();
    }


    /** --------------- DECOUPER UNE CHAINE DE CARACTERE EN ENLEVENT LES SEPARATEUR (, ; - _ ) -----------**/
    public String[] parseStringWithSeparator(String s, String separator){
        return s.split(separator);
    }

    /** --------------- AFFICHE UNE CHAINE DE CARACTERE LETTRE PAR LETTRE -----------**/
    public void printStringCharByChar(String s){
        for(int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }

    /** ------------ TRANSFORMER UN CALENDAR EN DATE------------ **/






}
