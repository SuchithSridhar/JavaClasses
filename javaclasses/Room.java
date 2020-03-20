package javaclasses;
class Room{
    int height;
    int length;
    int breadth;
    
    Room(int x, int y, int z){
        System.out.println("Initialize Room Object");
        height = z;
        length = x;
        breadth = y;
    }

    int area(){
        return (int)(length * breadth);
    }

    int volume(){
        return (int)(area() * height);
    }

}

class Bedroom extends Room{
    int items;

    Bedroom(int x, int y, int z, int items){
        super(x,y,z);
        this.items = items;
        
    }

    void specifications(){
        String[] printing = new String[4];
        printing[0] = "The Specifications of the bedroom are :";
        printing[1] = "Area : " + area();
        printing[2] = "Volume : " + volume();
        printing[3] = "Items : " + this.items;

        for (String item:printing){
            System.out.println(item);
        }
    }
}