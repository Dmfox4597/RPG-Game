
import java.util.ArrayList;

public class Room
{
    String name;
    String description;
    ArrayList<String> exits;
   
    
   
    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        exits = new ArrayList<String>();
    }
// Creates a name for the rooms
    public void roomSetName(String name) {
        this.name = name;
    }
    
    // A getter for my room name 
    public String roomGetName() {
        return this.name;
    }

    //sets the room description
    public void roomSetDesc(String description) {
        this.description = description;
    }

    //gets the room description
    public String roomGetDesc() {
        return this.description;
    }

    //creates a room to ecit 
    public void addExit(String exit) {
        exits.add(exit);
    }

    //list all of the exits of a room
    public String listExits() {
        String exitsList = "";
        for(int i = 0; i < exits.size(); i++) {
            exitsList += exits.get(i) + "\n";
        }
        return exitsList;
    }

    
    //makes the room code 
    public String toString() {
        String listExits = listExits();

        String roomString = this.name + ": " + this.description;
        roomString += "\n\nExits:\n" + listExits;

        return roomString;
    }
}
