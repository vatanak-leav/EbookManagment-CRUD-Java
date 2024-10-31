public class Text {
    public void welcome(){
        System.out.println("\n\n============================================================================");
        System.out.println("                       Welcome to Ebook Management System             ");
        System.out.println("============================================================================\n");
    }
    public void menutext(){
        System.out.println("                     ===========<<<<< ~ MENU ~ >>>>>===========            \n");
        System.out.println("                    |   Add new books                [1]        |");
        System.out.println("                    |   View books                   [2]        |");
        System.out.println("                    |   Search books                 [3]        |");
        System.out.println("                    |   Update books                 [4]        |");
        System.out.println("                    |   Delete books                 [5]        |");
        System.out.println("                    |   Exit                         [6]        |");
    }
    public void Header(){
        System.out.printf("| %-20s | %-12s | %5s | %-12s | %-4s | %-8s | %n", "TITLE", "AUTHOR", "YEAR", "CATEGORY", "PAGE", "PRICE");
        
        System.out.println("==================================================================================\n");
    }
    public void addtext(){
        System.out.println("\n\n============================================================================");
        System.out.println("                       Adding new books to the system...       ");
        System.out.println("============================================================================\n");
    }
    public void viewtext(){
        System.out.println("\n\n============================================================================");
        System.out.println("                       Viewing books in the system...        ");
        System.out.println("============================================================================\n");
    }
    public void searchtext(){
        System.out.println("\n\n============================================================================");
        System.out.println("                       Searching books in the system...    ");
        System.out.println("============================================================================\n");
    }
    public void updatetext(){
        System.out.println("\n\n============================================================================");
        System.out.println("                       Updating books in the system...    ");
        System.out.println("============================================================================\n");
    }
    public void deletetext(){
        System.out.println("\n\n============================================================================");
        System.out.println("                       Deleting books from the system...    ");
        System.out.println("============================================================================\n");
    }
    public void exitText(){
        System.out.println("\n\n============================================================================");
        System.out.println("                     Thank you for using Ebook Management System!  ");
        System.out.println("============================================================================\n");
    }
    public void invalidText(){
        System.out.println("                     !!!!!!!!!!<<<<< ~ INVALID INPUT ~ >>>>>!!!!!!!!!!            \n");
    }

    public void successText(){
        System.out.println("\n                               <<<<< ~ SUCCESS ~ >>>>>                      \n");
    }

    public void updatesuccess(){
        System.out.println("\n                ===========<<<<< ~ UPDATED SUCCESSFULLY ~ >>>>>===========            \n");
    }

    public void deletesuccess(){
        System.out.println("\n                ===========<<<<< ~ DELETED SUCCESSFULLY ~ >>>>>===========            \n");
    }

    public void delay(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
