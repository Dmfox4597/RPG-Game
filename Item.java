// Makes an item for the Rooms 
public class Item {
    String itemName;
    String itemDescription;

    //Creates items for room to use
    public Item(String itemName, String itemDescription) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    //return the name of an item
    public String getItemName() {
        return itemName;
    }

    //return the description of an item
    public String getItemDesc() {
        return itemDescription;
    }
}