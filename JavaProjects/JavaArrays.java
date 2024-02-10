package JavaProjects;

public class JavaArrays {
    public static void main(String[] args ){
        // first way to make an array :
        String[] friends = {"ahmed","yonis","ali","Jasem","hassan","hassin"};
        // and to change anything of this array is using the index 
        friends[1] =  "Youssef";
        for(int i=0 ; i<=friends.length-1; i++){
            System.out.println("my friend is "+friends[i]);
        }
        //System.out.println("My friend's name is : "+friends[1]);

        // the second way to make an array :
        int [] numbers = new int [5];   // it will create an array with five null'
        numbers[0]= 10;
        numbers[1]=12;
        numbers[2]=14;
        numbers[3]=16;
        numbers[4]=18;
    
        for(int i=0 ; i<numbers.length; i++){
            System.out.println("my number is "+numbers[i]);
        }
    }
}
class TwoDarray {
    public static void main (String[]args) {
            
    // 2d array 
    // first way 
    String[][] food = {{"burger","pizza"},{"soft drink","water"}}; 
        
    for(int i =0 ; i<food.length ; i++) {
        for(int k=0;k<food[i].length;k++){
            System.out.println(food[i][k] + "\t");

        }

    }
    

    //second way 
    String [][] Sports = new String[2][2];
    Sports[0][0]="basketball";
    Sports[0][1]="football";
    Sports[1][0]="tennis";
    Sports[1][1]="volyball";

    for(int j=0;j<Sports.length;j++ ) {
        for(int i=0;i<Sports[j].length;i++) {
            System.out.print(Sports[j][i]+"\t\t");
        }System.out.println();
    }
}

}
