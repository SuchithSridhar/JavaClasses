

class Main{
    public static void main(String[] args){
        System.out.println("Program Begins");
        createRoom();
    }

    static void createRoom(){
        Room my_room = new Room(12,14,4);
        System.out.println("The area of the room : "+ my_room.area());
        System.out.println("The volume of the room : "+my_room.volume());
        System.out.println("The height of the room : " + my_room.height);
    }
}