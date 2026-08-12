abstract class Media {
    String title;
    int lateDays;

    Media(String title, int lateDays) {
        this.title = title;
        this.lateDays = lateDays;
    }

    abstract double lateFee();
}

class Book extends Media {

    Book(String title, int lateDays) {
        super(title, lateDays);
    }

    double lateFee() {
        return lateDays * 5;
    }
}

class DVD extends Media {

    DVD(String title, int lateDays) {
        super(title, lateDays);
    }

    double lateFee() {
        return lateDays * 10;
    }
}

class Magazine extends Media {

    Magazine(String title, int lateDays) {
        super(title, lateDays);
    }

    double lateFee() {
        return lateDays * 3;
    }
}

public class mediatest {
    public static void main(String[] args) {

        Media[] media = {
            new Book("Spiderman", 3),
            new DVD("Avenger DVD", 2),
            new Magazine("Tech Magazine", 4)
        };

        double total = 0;

        for

        for (Media m : media) {

            double fee = m.lateFee();

            System.out.println(m.title + " Late Fee = " + fee);

            total = total + fee;
        }

        System.out.println("Total Late Fee = " + total);
    }
}