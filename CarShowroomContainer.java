import java.util.*;

public class CarShowroomContainer {
    Map<String, CarShowroom> salons;

    public CarShowroomContainer(){
        salons = new HashMap<String,CarShowroom>();
    }
    public void addCenter(String x, double y){
        for(String i: salons.keySet()){
            if(x == i){
                System.out.println("Jest juz salon o takiej nazwie");
                return;
            }
        }
        CarShowroom newCarSh = new CarShowroom(x,y);
        this.salons.put(x,newCarSh);
    }
    public void removeCenter(String x){
        if (salons.containsKey(x)){
            salons.remove(x);
        }
        else {
            System.out.println("Nie ma takiego salonu");
        }
    }
    public void findEmpty(){
        // Map.Entry Ser ma liste
        // Map.Entry to jakas mapa z danymi wartosicami
        for (Map.Entry<String, CarShowroom> entry : salons.entrySet()) {
             if (entry.getValue().carNum() == 0) {
                System.out.println("Pusty salon: " + entry.getKey());
            }
        }
    }
    public void summanary(){
        for (Map.Entry<String, CarShowroom> entry : salons.entrySet()) {
            System.out.println("Showroom name: " + entry.getKey());
            System.out.println("How much is the showroom filled (0 - none, 1 - full): " + entry.getValue().calculateProc());
        }
    }
}
