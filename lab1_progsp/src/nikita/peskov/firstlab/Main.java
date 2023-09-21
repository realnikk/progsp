package nikita.peskov.firstlab;

public class Main {
    public static void main(String[] args) {
        Ward ward1 = new Ward();
        ward1.print();

        Ward ward2 = new Ward(100, "Donald", true);
        ward2.print();

        ward2.setSurname("Hoover");
        WriterInfo.printInfo(ward2);

        ward2.setSurname("Franklin");
        WriterInfo.print2(ward2);
    }
}

