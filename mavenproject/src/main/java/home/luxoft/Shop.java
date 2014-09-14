package home.luxoft;

import java.util.*;


/**
 *
 * @author acer
 */
public class Shop implements CarShop{
     
    
  
    public static String mark;
    public static String markremove;
    public static Integer cost;
     public static String markfind;
     
    public static Map<String,Integer> sortedmap = new HashMap<String, Integer>();
    public static void main(String[] args) {
        
        
         Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);
         Scanner scanner2 = new Scanner(System.in);
         Scanner scanner3 = new Scanner(System.in);
         
        sortedmap.clear();
        System.out.println("Add mark of car and it cost:");
      
      while (sortedmap.size()<4) {
     if(scanner.hasNextLine()) {
          mark = scanner.nextLine();}
     if(scanner.hasNextInt()){
      cost = scanner.nextInt();
     }
     shop.addnewcar(mark, cost);
      }   
      
     
     
      if (!sortedmap.isEmpty()) {
     
       System.out.println("Enter mark of car that you want to delete from catalog");

    
     if (scanner2.hasNextLine()) {
     markremove = scanner2.nextLine();
     shop.removenewcar(markremove);
      }
   
      System.out.println("What mark you want to find in shop: ");

      if(scanner3.hasNextLine()) {
     markfind = scanner3.nextLine();
     shop.getAllcarsforItMark(markfind);
      } 
      
     
        
    } }

    public void addnewcar(String carmarc, Integer carcost) {
       sortedmap.put(carmarc, carcost);
    }

    public void removenewcar(String carmarc) {
      
    
        sortedmap.remove(carmarc); 
    }

    public void getAllcarsforItMark(String carmarc) {
 //for (String key : sortedmap.keySet()) {    
if(sortedmap.containsKey(carmarc)) {
    System.out.println("Mark: "+ carmarc + " Cost: "+ sortedmap.get(carmarc));
}

    else {System.out.println("There isnt "+ carmarc + " in shop catalog ");}        
   
        
    } // }
      


    };
    
 
    

