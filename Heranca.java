import java.util.Arrays;

public class Heranca{
    public static void main(String args[]) {
        Student marcos = new Student("Marcos", 21, "684903", new String[]{"AED", "BD"});
        Teacher gabriel = new Teacher("Gabriel", 55, 10500, 80);
        System.out.println(marcos); //toString
        System.out.println(gabriel); //toString
    }
}

class Person {
    private String name;
    private int year;

    public Person(String name, int year) {
        System.out.println("Uma pessoa foi criada");
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
        return "Person{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}

class Student extends Person {
    private String code;
    private String[] disciplines;

    public Student(String name, int year, String code, String[] disciplines) {
        super(name, year);
        this.code = code;
        this.disciplines = disciplines;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String[] getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(String[] disciplines) {
        this.disciplines = disciplines;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nStudent{" +
                "code='" + code + '\'' +
                ", disciplines=" + Arrays.toString(disciplines) +
                '}';
    }
}

class Teacher extends Person{
    private int salary;
    private int workload;

    public Teacher(String name, int year, int salary, int workload) {
        super(name, year);
        this.salary = salary;
        this.workload = workload;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTeacher{" +
                "salary=" + salary +
                ", workload=" + workload +
                '}';
    }
}