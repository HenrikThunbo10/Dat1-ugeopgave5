package Task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Room Room1 = new Room(2, 4, 3);
        Room Room2 = new Room(3, 5, 4);
        Room Room3 = new Room(4, 6, 5);

        ArrayList<Room> roomCollection = new ArrayList<Room>();
        roomCollection.add(Room1);
        roomCollection.add(Room2);
        roomCollection.add(Room3);

        Building Building1 = new Building(roomCollection, 1, 2, false);

        countLampsInBuilding(Building1);
        isNormal(Building1);
    }

    public static void countLampsInBuilding(Building Building1) {
        int total = 0;
        for (Room s : Building1.getRooms()) {
            total = total + s.getNumberOfLamps();
            System.out.println(s.getNumberOfLamps());
        }
        System.out.println(total);
    }

    public static boolean isNormal(Building Building1){
        if (Building1.getNumberOfFloors() > Building1.getRooms().size()) {
            System.out.println("The nr of floors is bigger than the nr of rooms on the building");
            return true;

        }
        else {
            System.out.println("This is an odd building");
            return false;

        }

    }

}
