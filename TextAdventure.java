import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class TextAdventure {
    public static void main(String[] args) {
        AdventureModel game = new AdventureModel();
        game.start();
    }
}

class AdventureModel {
    private Adventurer player;
    private Room currentRoom;

    public void start() 
    {
        player = new Adventurer();
        currentRoom = generateMap();

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println(currentRoom.getDescription());
        System.out.println("Exits: " + currentRoom.getExits());

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("> ");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }
            processCommand(command);
        }
        scanner.close();
    }

    private void processCommand(String command) {
        String[] parts = command.split(" ");
        String action = parts[0].toLowerCase();
        String target = (parts.length > 1) ? parts[1].toLowerCase() : "";

        switch (action)
        {
            case "go":
                if (currentRoom.hasExit(target)) {
                    currentRoom = currentRoom.getExit(target);
                    System.out.println(currentRoom.getDescription());
                    System.out.println("Exits: " + currentRoom.getExits());
                } else {
                    System.out.println("You can't go that way.");
                }
                break;
            case "look":
                System.out.println(currentRoom.getDescription());
                System.out.println("Exits: " + currentRoom.getExits());
                break;
            case "take":
                Item item = currentRoom.getItem(target);
                if (item != null) {
                    player.takeItem(item);
                    currentRoom.removeItem(item);
                    System.out.println("You took the " + item.getName());
                } else {
                    System.out.println("There's no such item here.");
                }
                break;
            case "drop":
                item = player.getItem(target);
                if (item != null) {
                    player.dropItem(item);
                    currentRoom.addItem(item);
                    System.out.println("You dropped the " + item.getName());
                } else {
                    System.out.println("You don't have that item.");
                }
                break;
            default:
                System.out.println("Invalid command.");
                break;
        }
    }

    private Room generateMap() {
        Room livingRoom = new Room("Living Room", "You are in a cozy living room.");
        Room kitchen = new Room("Kitchen", "You are in a tidy kitchen.");
        Room bedroom = new Room("Bedroom", "You are in a comfortable bedroom.");

        livingRoom.addExit("east", kitchen);
        kitchen.addExit("west", livingRoom);
        kitchen.addExit("north", bedroom);
        bedroom.addExit("south", kitchen);

        livingRoom.addItem(new Item("key", "A shiny key"));
        kitchen.addItem(new Item("knife", "A sharp knife"));

        return livingRoom; // Starting room
    }
}

class Adventurer {
    private Inventory inventory;

    public Adventurer() {
        inventory = new Inventory();
    }

    public void takeItem(Item item) {
        inventory.addItem(item);
    }

    public void dropItem(Item item) {
        inventory.removeItem(item);
    }

    public Item getItem(String itemName) {
        return inventory.getItem(itemName);
    }
}

class Room {
    private String name;
    private String description;
    private HashMap<String, Room> exits;
    private ArrayList<Item> items;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.exits = new HashMap<>();
        this.items = new ArrayList<>();
    }

    public void addExit(String direction, Room room) {
        exits.put(direction.toLowerCase(), room);
    }

    public Room getExit(String direction) {
        return exits.get(direction.toLowerCase());
    }

    public boolean hasExit(String direction) {
        return exits.containsKey(direction.toLowerCase());
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public Item getItem(String itemName) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }

    public String getDescription() {
        return description;
    }

    public String getExits() {
        return String.join(", ", exits.keySet());
    }
}

class Item {
    private String name;
    private String description;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public Item getItem(String itemName) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }
}
