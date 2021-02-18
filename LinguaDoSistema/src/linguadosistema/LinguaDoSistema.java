package linguadosistema;

import java.util.Locale;

public class LinguaDoSistema {

    public static void main(String[] args) {
     Locale loc = Locale.getDefault();
        System.out.println(loc.getDisplayLanguage());
        System.out.println(loc.getLanguage());
    }
    
}
