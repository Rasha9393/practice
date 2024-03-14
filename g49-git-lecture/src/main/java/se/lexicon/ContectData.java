package se.lexicon;


public class ContectData {

  // private static String [] contactStorage = {"AAAA,aaaa","BBB,bbbb","CCCC,cccc"};
   public static String findContact(String contactToFind){
       for(String element : contactStorage){
           if (contactToFind.equalsIgnoreCase(element)){
               return element;
           }

       }
       return null;

   }
    public static String findContactBynumber(String contactToFindbynumber){
        for(String element : contactStorage){
            String[] parts = element.split(",");


            if (contactToFindbynumber.equalsIgnoreCase(parts[1])){
                return parts[0];
            }

        }
        return null;
   }
}
