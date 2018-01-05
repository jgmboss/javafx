package Controller;

import Views.Main;
import Views.ViewManager;

public class EditController {

    public static void Temp (){

        System.out.println("It works!");

    }
    public static void confirm(){
        //saves changes to database
        Main.stage.setScene(ViewManager.viewManager());
    }

    public static void toView(){

        Main.stage.setScene(ViewManager.viewManager());
    }
}
