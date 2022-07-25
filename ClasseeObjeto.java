public class ClasseeObjeto {
    public static void main(String args[]) {
        Car honda = new Car("Honda", 2020);
        Car fiat = new Car("Fiat", 2022);

        System.out.println(honda); //toString
        System.out.println(fiat); //toString
    }
}

class Car {
    private String name;
    private int year;

    public Car(String name, int year) {
        System.out.println("Um carro foi criado");
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}