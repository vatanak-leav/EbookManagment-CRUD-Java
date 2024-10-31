////===This is not the main class===////
// This is the class that will control the system

import java.util.Scanner;


public class EbookControl{
    Scanner sc = new Scanner(System.in);
    Text t = new Text();
    EbookManage manage = new EbookManage();


    //////=======System control===========//////////
    public void control(){
        do{
            System.out.println("\033c");
            t.welcome();
            t.menutext();
            switch(manage.choiceInput()){
                case 1:
                    do{
                        
                        addbook();

                    }while (true);

                /////----View all----/////
                case 2:

                    do{

                        viewbook();

                        if(manage.returnToMenu("Add another book-->[1]") == 1){
                            
                            System.out.println("\033c");    //clearscreen

                                addbook();            //add another book

                        }else{

                            System.out.println("\033c");    //clearscreen
                            control();

                        }      

                    }while(true);

                ////----Search-----////
                case 3:

                    do{

                        searchbook();
                        
                    }while (true);

                ////----Update----////
                case 4:

                    do{

                        updatebook();

                    }while(true);

                ////----Delete----////
                case 5:
                    do{

                        deletebook();

                    }while (true) ;

                ////----Exit----////
                case 6:
                    t.exitText();
                    t.delay(2000);
                    System.out.println("\033c");
                    System.exit(0);
                    break;

                default:
                    t.invalidText();
                    t.delay(2000);
                    System.out.println("\033c");
                    control();
                    
                }
        }while (true);
    }      
    public void addbook(){
        System.out.println("\033c");
        t.addtext();
        manage.addingBook();

        if(manage.returnToMenu("Add another book-->[1]") == 1){

            System.out.println("\033c"); 
            addbook();

        }else{

            System.out.println("\033c");
            control();
        }
    }
    
    public void viewbook(){
        System.out.println("\033c");
        t.viewtext();
        t.Header();
        manage.viewBook();
    }

    public void searchbook(){

        System.out.println("\033c");
        t.searchtext();
        manage.searchingBook();
        
        if(manage.returnToMenu("Search another book-->[1]") == 1){

            System.out.println("\033c"); 
            
            searchbook();       //search another book 

        }else{

            System.out.println("\033c");
            control();            //back to manu

        }
    } 

    public void updatebook(){
        System.out.println("\033c");
        t.updatetext();
        manage.updatingBook();
        if(manage.returnToMenu("Update another book-->[1]") == 1){

            System.out.println("\033c"); 
            updatebook();   //update anotherbook 

        }else{

            System.out.println("\033c");
            control();         //back to manu
        }

    }

    public void deletebook(){
        System.out.println("\033c");
        t.deletetext();
        manage.deletingBook();

        if(manage.returnToMenu("Delete another book-->[1]") == 1){

            System.out.println("\033c"); 
            deletebook();

        }else{

            System.out.println("\033c");
            control();
        }
    }
}

   

    