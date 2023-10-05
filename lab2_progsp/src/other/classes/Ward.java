package other.classes;

public class Ward {
    private int numberOfPlaces;
    private String doctorSurname;
    private boolean freePlaces;

    static int objectsCount = 0;

    public Ward() {
        objectsCount++;
    }

    public Ward(String doctorSurname, boolean freePlaces) {
        this.doctorSurname = doctorSurname;
        this.freePlaces = freePlaces;
        objectsCount++;
    }

    public Ward(int numberOfPlaces, String doctorSurname, boolean freePlaces) {
        this.numberOfPlaces = numberOfPlaces;
        this.doctorSurname = doctorSurname;
        this.freePlaces = freePlaces;
        objectsCount++;
    }

    public Ward(Ward object) {
        this.numberOfPlaces = object.numberOfPlaces;
        this.doctorSurname = object.doctorSurname;
        this.freePlaces = object.freePlaces;
        objectsCount++;
    }

    public void setSurname(String doctorSurname) {
        this.doctorSurname = doctorSurname;
    }

    public void setNumberOfPlaces(int numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }

    public void setFreePlaces(boolean freePlaces) {
        this.freePlaces = freePlaces;
    }

    public String getDoctorSurname() {
        return doctorSurname;
    }

    public boolean isFreePlaces() {
        return freePlaces;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void print() {
        System.out.println("\nИнформация о палате:");
        if (freePlaces) {
            System.out.println("Есть свободные места");
        } else {
            System.out.println("Нет свободных мест");
        }
        System.out.println("Имя врача: " + doctorSurname);
        System.out.println("Количество мест: " + numberOfPlaces);
    }

    public static int totalCount(Ward[] wardList) {

        int count = 0;
        for (int i = 0; i < objectsCount; i++) {
            count += wardList[i].getNumberOfPlaces();
        }
        return count;
    }

    public static int countOfWardsWithFreePlaces(Ward[] wardList) {

        int count = 0;
        for (int i = 0; i < objectsCount; i++) {
            if(wardList[i].isFreePlaces()){
                count++;
            }
        }
        return count;
    }
}