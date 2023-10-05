package my.classs;
import other.classes.*;

public class Main {
    public static void main(String[] args) {
        Ward[] wardList = new Ward[100];

        wardList[0] = new Ward();

        wardList[1] = new Ward("Harry", false);

        wardList[2] = new Ward(55,"Thomas", true);

        wardList[3] = new Ward(wardList[2]);

        for(int i=0; i<4; i++){
            wardList[i].print();
        }

        System.out.println("\nTotal count of places: " + Ward.totalCount(wardList));
        System.out.println("Total count of wards with free places: " + Ward.countOfWardsWithFreePlaces(wardList));
    }
}

