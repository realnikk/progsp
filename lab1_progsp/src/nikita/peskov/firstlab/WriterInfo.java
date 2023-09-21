package nikita.peskov.firstlab;

public class WriterInfo {
    public static void printInfo(Ward ward) {
        ward.print();
    }
    public static void print2(Ward ward) {
        System.out.println("\nИнформация о палате (через стат метод):");
        if(ward.isFreePlaces()) {
            System.out.println("Есть свободные места");
        } else {
            System.out.println("Нет свободных мест");
        }
        System.out.println("Имя врача: " + ward.getSurname());
        System.out.println("Количество мест: " + ward.getNumOfPlaces());
    }
}
