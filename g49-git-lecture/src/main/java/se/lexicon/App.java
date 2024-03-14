package se.lexicon;

import java.util.Scanner;

public class App 
{
    /*public static void main( String[] args ) {
        Scanner scanner=new Scanner(System.in) ;
        System .out.println("enter name and last name");
        String contact= scanner.next();
        String fondContact = ContectData.findContact(contact);
        if (fondContact==null){
            System.out.println("not found");
        }else{
            System.out.println(contact);
        }


    }*/

    public static void main( String[] args ) {
        Scanner scanner=new Scanner(System.in) ;
        System.out.println("number ");

        String[] contactStorage= new String[Scanner.next()];
        for (int i=0;i< contactStorage.length;i++)

        System.out.println("First name  lastName");


        while (true) {
            System.out.println("enter lastname");
            String contact = scanner.next();
            String fondContact = ContectData.findContactBynumber(contact);
            if (fondContact == null) {
                System.out.println("not found");
            } else {
                System.out.println(fondContact);
            }
        }

    }

}