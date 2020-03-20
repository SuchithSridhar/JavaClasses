package javaclasses;

import java.util.Arrays;

class Main{
    public static void main(String[] args){
        System.out.println("Program Begins");
        createRoom();
        sortingDemo();
    }

    static void createRoom(){
        System.out.println("-------------------- Demo of Classes and Inheritance --------------------");
        Room my_room = new Room(12,14,4);

        printAllTheseStrings(
            ("The area of the room : "+ my_room.area()),
            ("The volume of the room : "+my_room.volume()),
            ("The height of the room : " + my_room.height)
        );
        // variable number of arguments

        
        System.out.println();

        Bedroom newroom = new Bedroom(10, 10, 4, 22);
        newroom.specifications();
        System.out.println("--------------------------------------------------------------------------");
    }

    static void abstractions(){
        System.out.println("--------------------"
        + " Demo of Abstract and Multiple inheritance "
        + "--------------------");

    }

    static void printAllTheseStrings(String...var_name){
        for(String item:var_name){
            System.out.println(item);
        }
    }

    static void sortingDemo(){
        int[] example = new int[5];
        int[] array = {12,16,2,8,11};

        example[1] = 1;

        System.out.println("--------------------"
        + " Sorting Demo "
        + "--------------------");


        System.out.println("Initial array - " + Arrays.toString(array));
        System.out.println("Sorting...");
        array = sortArray(array);
        System.out.println("Sorted array - " + Arrays.toString(array));

        
    }

    static int[] sortArray(int[] array){
        int n = array.length;
        int temp, j;
        for(int i=0; i<n; i++){
            temp = array[i];
            j = i - 1;
            while(j>=0 && array[j]>temp){
                array[j+1]=array[j];
                j--;
            }
            array[j+1] = temp;

        }

        return array;
    }
}