package Controller;

import Views.Edit;
import Views.Main;
import Views.ViewUsers;

public class OneItemSelectController {
    public static void Temp (){

        System.out.println("It works!");

    }
    public static void toView (){

        Main.stage.setScene(ViewUsers.viewUsers());
    }
    public static void toEdit (){

        Main.stage.setScene(Edit.edit());
    }

}
