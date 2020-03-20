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