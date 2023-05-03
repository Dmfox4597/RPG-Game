//Michael Fox 
// Cpsc 1060
//Lab 005 
// RPG GAME 





import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class Main{
    public static HouseMap newHouse(){
        // I am setting up the entire house and each room with this.
        HouseMap map = new HouseMap();
        Room LevelOne = new Room("LevelOne","This is level One Nothing is too Challenging here, There is one riddle and that is to just figure out how to escape\n If I were you I might try to leave more than once.");
        Room LevelTwo = new Room("LevelTwo","Ahh you figured out how to finally advance.");
        Room LevelThree = new Room("LevelThree","Level Three is a pretty chill place, but some reason alot of people get stuch here.");
        Room LevelFour = new Room("LevelFour","Level Four is by far my favorite level, I really like how the question is easier.");
        Room LevelFive = new Room("LevelFive","Now to level five, I stopped making the riddles at this point and started to ask my friends");
        Room LevelSix = new Room("LevelSix","Man your good at riddles I hope you dont fail now.");
        Room LevelSeven = new Room("LevelSeven","Good Ole Seven, This is the last level, I think this riddle is BS, but sucks to suck.");

        // Adding rooms to each part of the house 
         map.addRoom(LevelOne);
         LevelOne.addExit("LevelTwo");
         map.addRoom(LevelTwo);
         LevelTwo.addExit("LevelOne");
         LevelTwo.addExit("LevelThree");
         map.addRoom(LevelThree);
         LevelThree.addExit("LevelTwo");
         LevelThree.addExit("LevelFour");
         map.addRoom(LevelFour);
        LevelFour.addExit("LevelThree");
         LevelFour.addExit("LevelFive");
         map.addRoom(LevelSeven);
         LevelSeven.addExit("LevelSix");
         LevelSeven.addExit("Exit");
         map.addRoom(LevelFive);
         LevelFive.addExit("LevelFour");
         LevelFive.addExit("LevelSix");
         map.addRoom(LevelSix);
         LevelSix.addExit("LevelFive");
         LevelSix.addExit("LevelSeven");


        return map;
    }

    
    public static String getExits(String userInput, Scanner scnr, HouseMap map, String[] rooms) {
        //Forcing users to acutally pick the correct exit.
        Boolean realRoom = false;
        while (!realRoom) {
            System.out.println("Please choose an exit");
            scnr.nextLine();
            userInput = scnr.nextLine();
            for (int i = 0; i < 7; i++) {
                if (userInput.equalsIgnoreCase(rooms[i]) || userInput.equalsIgnoreCase("exit")) {
                    realRoom = true;
                }
            }
            if (!realRoom) {
                System.out.println("Invalid exit.");
            }
        }

        return userInput;
    }
    public static Item LevelOne(Scanner scnr, Inventory playerInventory) {
        //I Am making riddles for each level as we advance through the entire house. 
        String Guess="";
        String riddleAnswer = "Newspaper";
        Boolean correctAns = false;
        Item lockpick = new Item("A lockpick", "You looked under the rug and found yourself a lockpick it may be used later");
        System.out.println("Whats black and white and read all over");
        System.out.println();
        System.out.println("Please type what you think it is");
        Guess = scnr.next();
        // Forces you riddle to be correct
        while (!correctAns) {
            if(Guess.equalsIgnoreCase(riddleAnswer)) {
                correctAns = true;
                System.out.println("woah you acutally got it correct");
                System.out.println();
                System.out.println("Now onto level two");
            }
            else {
                System.out.println("I dont do this whole incorrect lets guess again thing.");
                System.out.println("The monster is moving one step closer to you so better get a move on.");
                Guess = scnr.next();
            }
        }
        return lockpick;                
    }
    public static Item LevelTwo(Scanner scnr, Inventory playerInventory) {
        // Level two riddles 
        String Guess="";
        String riddleAnswer = "Michael";
        Boolean correctAns = false;
        Item cookie = new Item("A cookie", "You can have yourself a cookie to eat later if your hungry");
        System.out.println();
        System.out.println("Congrats you made it to the next level");
        System.out.println("Michael's mom has four kids, January,Febuary,March.");
        System.out.println("What is the last kids name");
        System.out.println();
        System.out.println("Please answer below.");
        Guess = scnr.next();
        //Level Two riddle correct 
        while (!correctAns) {
            if(Guess.equalsIgnoreCase(riddleAnswer)) {
                correctAns = true;
                System.out.println("woah you acutally got it correct");
                System.out.println();
                System.out.println("You found an old cookie you may use this cookie for later task or even eat if your hungry.");
            }
            else {
                System.out.println("No hint. lets guess again.");
                Guess = scnr.next();
            }
        }
        return cookie;                
    }
    public static Item LevelThree(Scanner scnr, Inventory playerInventory) {
        // LEvel Three Riddles 
        String Guess="";
        String riddleAnswer = "M";
        Boolean correctAns = false;
        Item football = new Item("A football", "You know have a source of entertainment I guess");
         System.out.println();
        System.out.println("Congrats you made it to the next level");
        System.out.println("What occurs once in a minute, twice in a moment, and never in a thousand years");
        System.out.println("please awnser what you could use");
        System.out.println();
        Guess = scnr.next();
        //Level Three riddles correct 
        while (!correctAns) {
            if(Guess.equalsIgnoreCase(riddleAnswer)) {
                correctAns = true;
                System.out.println("woah you acutally got it correct");
                System.out.println();
                System.out.println("What is this A Football, Now you can be here forever and entertain me");
            }
            else {
                System.out.println("Okay I am kinda sorry if this one hurts but I would just put one letter");
                Guess = scnr.next();
            }
        }
        return football;                
    }
    public static Item LevelFour(Scanner scnr, Inventory playerInventory) {
        //Level Four Riddles 
        String Guess="";
        String riddleAnswer = "Bottle";
        Boolean correctAns = false;
        Item AnkleMonitor = new Item("A AnkleMonitor", "WHAT?? You have been trapped and an ankle monitor has been put on your leg ");
         System.out.println();
        System.out.println("Congrats you made it to the next level");
        System.out.println("What has a neck but no head?");
        System.out.println("please awnser what you could use");
        System.out.println();
        Guess = scnr.next();
        //Level Four Riddles correct 
        while (!correctAns) {
            if(Guess.equalsIgnoreCase(riddleAnswer)) {
                correctAns = true;
                System.out.println("woah you acutally got it correct");
                System.out.println();
                System.out.println("WHAT?? You have been trapped and an ankle monitor has been put on your leg ");
            }
            else {
                System.out.println("I dont do this whole incorrect lets guess again.");
                Guess = scnr.next();
            }
        }
        return AnkleMonitor;                
    }
    public static Item LevelFive(Scanner scnr, Inventory playerInventory) {
        //Level Five riddles 
        String Guess="";
        String riddleAnswer = "Yourself";
        Boolean correctAns = false;
        Item Hammer = new Item("A Hammer", "You found a hammer it may be used to break an item later.");
         System.out.println();
        System.out.println("Congrats you made it to the next level");
        System.out.println("Your driving a bus\n Your bus has 16 people on it\n First stop 10 get off and nine get on\n at second stop six people get off and three people get on\n at your third stop 11 people get off and two get on.");
        System.out.println("What is the name of the bus driver?");
        System.out.println();
        Guess = scnr.next();
        //Level five riddles correct 
        while (!correctAns) {
            if(Guess.equalsIgnoreCase(riddleAnswer)) {
                correctAns = true;
                System.out.println("woah you acutally got it correct");
                System.out.println();
                System.out.println("Maybe we will use this later to get out");
            }
            else {
                System.out.println("I dont do this whole incorrect lets guess again thing.");
                System.out.println("Okayyy Fine, Read it carefully");
                Guess = scnr.next();
            }
        }
        return Hammer;                
    }
    public static Item LevelSix(Scanner scnr, Inventory playerInventory) {
        //Level six Riddles 
        String Guess="";
        String riddleAnswer = "Hen";
        Boolean correctAns = false;
        Item Book = new Item("A Physics Book", "lets turn on the flash light \nYou must now lockpick the door ");
         System.out.println();
        System.out.println("Congrats you made it to the next level");
        System.out.println("A rooster lays an egg on top of a mountain\n What animal laid the egg");
        System.out.println("please awnser below");
        System.out.println();
        Guess = scnr.next();
        //Level six riddles are needed to be correct 
        while (!correctAns) {
            if(Guess.equalsIgnoreCase(riddleAnswer)) {
                correctAns = true;
                System.out.println("woah you acutally got it correct");
                System.out.println();
                System.out.println("What is this a physics book, yeah you wont be needing that physics sucks");
            }
            else {
                System.out.println("Do Roosters even lay eggs?? Try again");
                Guess = scnr.next();
            }
        }
        return Book;                
    }
    public static Item LevelSeven(Scanner scnr, Inventory playerInventory) {
        //laslty Level seven riddles 
        String Guess="";
        String riddleAnswer = "Wet";
        Boolean correctAns = false;
        Item Phone = new Item("A Phone", "You got to the end now you get a phone, Oh wait it is dead LOL");
         System.out.println();
        System.out.println("Congrats you made it to the next level");
        System.out.println("If you throw a blue stone into the red sea what does it become");
        System.out.println("Please awnser below");
        System.out.println();
        Guess = scnr.next();
        //Level seven Riddles correct. 
        while (!correctAns) {
            if(Guess.equalsIgnoreCase(riddleAnswer)) {
                correctAns = true;
                System.out.println("woah you acutally got it correct");
                System.out.println();
                System.out.println("Idk Why you think a phone would help, its dead.");
            }
            else {
                System.out.println("What happens when something is in water, Man these riddles are fun");
                    Guess = scnr.next();
            }
        }
        return Phone;                
    }

    public static boolean exitRoom(Scanner scnr, Inventory playerInventory){
        // Variables for each item you have obtained 
        Boolean playerHasKeyOne = false;
        Boolean playerHasKeyTwo = false;
        Boolean playerHasKeyThree = false;
        Boolean playerHasKeyFour = false;
        Boolean playerHasKeyFive = false;
        Boolean playerHasKeySix = false;
        Boolean playerHasKeySeven = false;
        Boolean playerCanExit = false;

        // making sure you have gotten every item you said you would need 
        for(int i = 0; i < playerInventory.getSize(); i++) {
            if(playerInventory.getItem(i).getItemName().equalsIgnoreCase("A LockPick")){
                playerHasKeyOne = true;
            }
            else if(playerInventory.getItem(i).getItemName().equalsIgnoreCase("A Cookie")) {
                playerHasKeyTwo = true;
            }
            else if(playerInventory.getItem(i).getItemName().equalsIgnoreCase("A Football")) {
                playerHasKeyThree = true;
            }
            else if(playerInventory.getItem(i).getItemName().equalsIgnoreCase("A AnkleMonitor")) {
                playerHasKeyFour = true;
            }
            else if(playerInventory.getItem(i).getItemName().equalsIgnoreCase("A Hammer")) {
                playerHasKeyFive = true;
            }
            else if(playerInventory.getItem(i).getItemName().equalsIgnoreCase("A Physics Book")) {
                playerHasKeySix = true;
            }
            else if(playerInventory.getItem(i).getItemName().equalsIgnoreCase("A Phone")) {
                playerHasKeySeven = true;
            }
        }

        // Letting you exit if your items are what you need to get 
        if(playerHasKeyTwo == true&&playerHasKeyThree==true && playerHasKeyFour == true && playerHasKeyFive == true && playerHasKeySix == true && playerHasKeySeven==true) {
            System.out.println("Wait You have an idea\n You broke your ankle monitor with the hammer.");
            System.out.println("knock knock knock");
            System.out.println("Police, We are coming in");
            System.out.println("Congrats you are free, the police have saved you except you may go to jail.");
            System.out.println("Did you find the hidden Item so that you could get out of this jail cell MUAHAHAHAH");

            playerCanExit = true;
        }
        else{
            System.out.println("It looks like youre still missing some things before you can exit.");
        }
        
        return playerCanExit;
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Inventory playerInventory = new Inventory();
        HouseMap map= newHouse();

        //Easiest way to set rooms up top compare 
        String[] rooms = new String[8];
        rooms[0] = "LevelOne";
        rooms[1] = "LevelTwo";
        rooms[2] = "LevelThree";
        rooms[3] = "LevelFour";
        rooms[4] = "LevelFive";
        rooms[5] = "LevelSix";
        rooms[6] = "LevelSeven";
        rooms[7]="Exit";
        
        //Varibles for correct awnsers used 
        Boolean Correct;
        String userInput = "LevelOne";
        String userYesNo = "";
        Room currentRoom;
        String userName;

        // Starting the game out stroing 
        System.out.println("Name NOW!");
        userName = scnr.nextLine();
        System.out.println("\nWelcome to my Escape tower. I will see how far you can go with these riddles before the monster catches you\n");

        do {
            currentRoom = map.getRoom(userInput);
           System.out.println("\n" + map.getRoom(userInput).toString());


            userInput = getExits(userInput, scnr, map, rooms);
            // Gives the player the item needed as they pass through every room.   
            if (userInput.equalsIgnoreCase("LevelOne")) {
                playerInventory.addItem(LevelOne(scnr, playerInventory));
            }
            if (userInput.equalsIgnoreCase("LevelTwo")) {
                playerInventory.addItem(LevelTwo(scnr, playerInventory));
            }
            if (userInput.equalsIgnoreCase("LevelThree")) {
                playerInventory.addItem(LevelThree(scnr, playerInventory));
            }
            if (userInput.equalsIgnoreCase("LevelFour")) {
                playerInventory.addItem(LevelFour(scnr, playerInventory));
            }
            if (userInput.equalsIgnoreCase("LevelFive")) {
                playerInventory.addItem(LevelFive(scnr, playerInventory));
            }
            if (userInput.equalsIgnoreCase("LevelSix")) {
                playerInventory.addItem(LevelSix(scnr, playerInventory));
            }
            if (userInput.equalsIgnoreCase("LevelSeven")) {
                playerInventory.addItem(LevelSeven(scnr, playerInventory));
            }
            if (userInput.equalsIgnoreCase("Exit")) {
                playerInventory.setIfEscape(exitRoom(scnr, playerInventory));
            }

            playerInventory.addStep();

        } while (!playerInventory.getEscape());

        String fileName = String.format("%s's_Escape_Room_Result.txt", userName);
        FileOutputStream fileStream = null;
        try {
            fileStream = new FileOutputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find " + fileName);
        }
        PrintWriter outFS = new PrintWriter(fileStream);
        outFS.printf("Congratulations %s! You did the riddle tower.!\n", userName);
        outFS.printf("%s you took %d turns to escape the house!\n", userName, playerInventory.getSteps());
        outFS.close();
    }
}
    

