package JavaProjects;

public class car {
String name = "f150";
String industry = "ford ";
int model = 2022 ;
String color = "black";
double price = 3499.99;
short engin = 8; 
boolean isSold = false;
double HouresPower = 710;

void racemod(){
     int HouresPower = 800;

    System.out.printf(" houers power  is improved %d the race mod activited ;) ",HouresPower);
   
}
void  echomod(){
    double HouresPower = 600;
    short engin = 6; 
    System.out.println(HouresPower + " "+ engin);
    System.out.println("econame mod is activited ");
    
}

//  constraint 
String name1;
int year;
boolean isSold1;

car(String name1,int year,boolean isSold1){
this.name1 =name1;
this.year =year;
this.isSold1=isSold1;

}


}