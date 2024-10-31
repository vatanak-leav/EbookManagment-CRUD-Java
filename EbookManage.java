import java.util.Scanner;
import java.util.ArrayList;
public class EbookManage {
    EbookData eData = new EbookData();
    Text t = new Text();
    Scanner sc = new Scanner(System.in);
    ArrayList<EbookData> bookList = new ArrayList<EbookData>();

    public int choiceInput() {
        System.out.println("\n\n----------------------------------------------------------------------------");
        System.out.print("                                                        Enter your choice: ");
        int choice = sc.nextInt();
        
        return choice;
    }
    
    public int returnToMenu(String massage){
        System.out.println("\n\n----------------------------------------------------------------------------");
        System.out.print(" BACK TO MENU-->[Any Number]    "+ massage      +"    Enter your choice: ");
        int choice = sc.nextInt();
        return choice;
    }

    public void addingBook(){
        System.out.print("                                                    How many book : ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("\n                ===========<<<<< ~ BOOK "+(i+1)+" ~ >>>>>===========            \n");
            System.out.print("                Book title  : ");
            eData.setTitle(sc.nextLine());
            System.out.print("                    Author  : ");
            eData.setAuthor(sc.nextLine());
            System.out.print("              Publish year  : ");
            eData.setpublishYear(sc.nextLine());
            System.out.print("                  Category  : ");
            eData.setcategory(sc.nextLine());
            System.out.print("                Book pages  : ");
            eData.setPage(sc.nextLine());
            System.out.print("                     Price  : ");
            eData.setPrice(sc.nextLine());

            bookList.add(new EbookData( eData.getTitle(),eData.getAuthor(), eData.getpublishYear(), eData.getcategory(), eData.getPage(), eData.getPrice()));

            t.successText();
        }
        
        
    }

    public void viewBook(){
        for (EbookData book : bookList) {
            System.out.println(book);
            System.out.println("----------------------------------------------------------------------------------\n");
        }
      
        
    }

    public void searchingBook(){
        System.out.println("                     ===========<<<<< ~ MENU ~ >>>>>===========            \n");
        System.out.println("                    |   SEARCH BY TITLE                [1]        |\n");
        System.out.println("                    |   SEARCH BY CATEGORY             [2]        |\n");
        System.out.println("                    |   BACK TO MANU                   [3]        |");

        String search;
        boolean found = false;

        switch (choiceInput()) {

            //search by title
            case 1:
                System.out.print("\033c");

                t.searchtext();
                sc.nextLine();

                System.out.print("\n                              Enter book Title: ");
                search = sc.nextLine();
                System.out.println("\n");
                
                t.Header();   // print header

                for (EbookData book : bookList) {
                    if (book.getTitle().equals(search)) {
                        System.out.println(book);
                        System.out.println("----------------------------------------------------------------------------------\n");
                        found = true;
                    }
                }
                if(found == false){
                    System.out.println("\n\n                     !!!!!!!!!!<<<<< ~ NO BOOK FOUND ~ >>>>>!!!!!!!!!!            \n");
                }  
                break;

            //search by category
            case 2:
                System.out.print("\033c");

                t.searchtext();
                sc.nextLine();    

                System.out.print("                               Enter book Category: ");
                search=sc.nextLine();
                System.out.println("\n");

                t.Header();
                for (EbookData book : bookList) {
                    if (book.getcategory().equals(search)) {
                        System.out.println(book);
                        System.out.println("----------------------------------------------------------------------------------\n");
                        found = true;
                    }
                    
                }

                if(found == false){
                    System.out.println("\n\n                      !!!!!!!!!!<<<<< ~ NO BOOK FOUND ~ >>>>>!!!!!!!!!!            \n");
                }

                break;

            //back to manu
            case 3:

                EbookControl e = new EbookControl();
                e.control();
                break;

            default:           

                System.out.println("                     !!!!!!!!!!<<<<< ~ INVALID INPUT ~ >>>>>!!!!!!!!!!            \n");
                t.delay(2000);
                System.out.println("\033c");
                searchingBook();
        }

    }

    public void updatingBook() {
        System.out.print("\n                               Enter book title: ");
        String searchTitle = sc.next();
        boolean found = false;
    
        for (EbookData book : bookList) {
            if (book.getTitle().equals(searchTitle)) {
                found = true;
                System.out.println("\n                ===========<<<<< ~ BOOK FOUND ~ >>>>>===========            \n");
                System.out.println("          Select fields to update..... \n");
                System.out.println("          [1]  Title");
                System.out.println("          [2]  Author");
                System.out.println("          [3]  Publish Year");
                System.out.println("          [4]  Category");
                System.out.println("          [5]  Number of Pages");
                System.out.println("          [6]  Price");
                System.out.println("          [7]  Update all fields\n");

                switch (choiceInput()) {
                    case 1:
                        sc.nextLine();
                        System.out.print("                 New Book Title  : ");
                        book.setTitle(sc.nextLine());
                        t.updatesuccess();
                        break;
                    case 2:
                        sc.nextLine();
                        System.out.print("                      New Author : ");
                        book.setAuthor(sc.nextLine());
                        t.updatesuccess();
                        break;
                    case 3:
                        sc.nextLine();
                        System.out.print("                New Publish Year : ");
                        book.setpublishYear(sc.nextLine());
                        t.updatesuccess();
                        break;
                    case 4:
                        sc.nextLine();
                        System.out.print("                    New Category : ");
                        book.setcategory(sc.nextLine());
                        t.updatesuccess();
                        break;
                    case 5:
                        sc.nextLine();
                        System.out.print("                       New Pages : ");
                        book.setPage(sc.nextLine());
                        t.updatesuccess();
                        break;
                    case 6:
                        sc.nextLine();
                        System.out.print("                       New Price : ");
                        book.setPrice(sc.nextLine());
                        t.updatesuccess();
                        break;
                    case 7:
                        sc.nextLine();
                        System.out.print("                 New Book title  : ");
                        book.setTitle(sc.nextLine());
                        System.out.print("                     New Author  : ");
                        book.setAuthor(sc.nextLine());
                        System.out.print("                New Publish Year : ");
                        book.setpublishYear(sc.nextLine());
                        System.out.print("                    New Category : ");
                        book.setcategory(sc.nextLine());
                        System.out.print("                       New Pages : ");
                        book.setPage(sc.nextLine());
                        System.out.print("                       New Price : ");
                        book.setPrice(sc.nextLine());

                        t.updatesuccess();
                        break;
                    default:
                        System.out.print("\n");
                        t.invalidText();
                        break;
                }
    
                break;
            }
        }
    
        if (found == false) {
            System.out.println("\n                     !!!!!!!!!!<<<<< ~ BOOK NOT FOUND ~ >>>>>!!!!!!!!!!            \n");
        }
    }
            
            public void deletingBook(){
                System.out.print("\n                               Enter book title: ");
                String searchTitle = sc.next();
                boolean found = false;
                for (EbookData book : bookList) {
                    if (book.getTitle().equals(searchTitle)) {
                        bookList.remove(book);
                        found = true;
                        t.deletesuccess();
                        break;
                    }
                }
                if (found == false) {
                    System.out.println("\n                     !!!!!!!!!!<<<<< ~ BOOK NOT FOUND ~ >>>>>!!!!!!!!!!            \n");
                }
            }
        }

    



