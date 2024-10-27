package System.scr;

import System.scr.Controller.PetController;
import System.scr.Model.Pet;
import System.scr.Services.IRepository;
import System.scr.Services.PetRepository;
import System.scr.UserInterface.ConsoleMenu;

public class Program {
    public static void main(String[] args) throws Exception {

        IRepository <Pet> myFarm = new PetRepository();
        PetController controller = new PetController(myFarm);
        new ConsoleMenu (controller).start();
    }
}    