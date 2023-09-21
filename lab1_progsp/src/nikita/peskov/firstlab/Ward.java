package nikita.peskov.firstlab;

public class Ward {
    private int numOfPlaces;
    private String doc_surname;
    private boolean free_places;

    public Ward() {
    }

    public Ward(int numOfPlaces, String doc_surname, boolean free_places) {
        this.numOfPlaces = numOfPlaces;
        this.doc_surname = doc_surname;
        this.free_places = free_places;
    }

    public void setSurname(String doc_surname) {
        this.doc_surname = doc_surname;
    }
    public void setNumOfPlaces(int numOfPlaces) {
        this.numOfPlaces = numOfPlaces;
    }
    public void setFreePlaces(boolean free_places) {
        this.free_places = free_places;
    }

    public String getSurname() {
        return doc_surname;
    }
    public boolean isFreePlaces() {
        return free_places;
    }
    public int getNumOfPlaces() {
        return numOfPlaces;
    }

    public void print() {
        System.out.println("\nИнформация о палате:");
        if(free_places) {
            System.out.println("Есть свободные места");
        } else {
            System.out.println("Нет свободных мест");
        }
        System.out.println("Имя врача: " + doc_surname);
        System.out.println("Количество мест: " + numOfPlaces);
    }
}