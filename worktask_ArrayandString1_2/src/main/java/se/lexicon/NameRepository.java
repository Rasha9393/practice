/* package se.lexicon;
    import java.util.Arrays;

    public class NameRepository {

        static String[] names = new String[0];

        public static String find(final String fullName) {
            for (String name : names) {
                if (name.equalsIgnoreCase(fullName)) {
                    return name;
                }
            }
            return null;
        }

        public static boolean add(final String fullName) {
            String foundFulName = find(fullName);
            if (foundFulName != null) {
                return false;
            }
            String[] newNames = Arrays.copyOf(names, names.length + 1); // ["Erik Svensson", null]
            newNames[newNames.length - 1] = fullName;
            names = newNames;
            return true;
        }

        public static int getSize() {
            return names.length;
        }

        public static String[] findByFirstName(final String firstName) {

            for (String element : names) {
                String[] parts = element.split(" ");
                if (firstName.equalsIgnoreCase(parts[0])) {
                    return parts[0];
                    return parts[1];
                }
            }
            return null;
        }

        public static String findContactBylastname() {

            for (String element : names) {
                String[] parts = element.split(" ");
                if (lastName.equalsIgnoreCase(parts[1])) {
                    return parts[0];
                    return parts[1];
                }
            }
            return null;

        }

        public static boolean remove ( final String fullName){
            for (String element :names){
                String[] parts = element.split(" ");
                if (fullName.equalsIgnoreCase(parts[0])){
                    parts[0]=null;

                }
                if (parts[0]== null){
                    System.out.println( "Deleted sussessfully");

                }else{
                    System.out.println( "Not Delelted");
                }
            }
        }
    }*/
