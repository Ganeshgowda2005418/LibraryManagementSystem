import database.CreateTables;
import ui.HomeFrame;

public class Main {

    public static void main(String[] args) {

       
        CreateTables.createTables();
        new HomeFrame();
    }
}