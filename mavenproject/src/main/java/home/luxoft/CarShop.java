

package home.luxoft;

import java.util.Map;


public interface CarShop {
    
    void addnewcar (String carmarc, Integer carcost);
    void removenewcar (String carmarc);
    void getAllcarsforItMark(String carmarc);
}
