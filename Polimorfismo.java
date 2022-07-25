public class Polimorfismo {
    public static void main(String args[]) {
        BrazilianPerson marcos = new PhysicalPerson("Marcos", 21, "45574271893", "17.986.889-5");
        BrazilianPerson marcosEmpresa = new LegalEntity("MarcosEmpresa", 21, "99.344.553/0001-29");

        BrazilianPerson[] persons = new BrazilianPerson[2];
        persons[0] = marcos;
        persons[1] = marcosEmpresa;

        for(BrazilianPerson person : persons) {
            System.out.println(person);
            person.printDocuments();
            System.out.println("\n");
        }
    }
}

class BrazilianPerson {
    private String name;
    private int year;

    public BrazilianPerson(String name, int year) {
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

    public void printDocuments() {
        System.out.println("Sem documentos");
    }

    @Override
    public String toString() {
        return "BrazilianPerson{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}

class PhysicalPerson extends BrazilianPerson {
    private String CPF;
    private String RG;

    public PhysicalPerson(String name, int year, String CPF, String RG) {
        super(name, year);
        this.CPF = CPF;
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void printDocuments() {
        System.out.println("CPF:"+CPF+
                "\nRG:"+RG);
    }
}

class LegalEntity extends BrazilianPerson{
    private String CNPJ;

    public LegalEntity(String name, int year, String CNPJ) {
        super(name, year);
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void printDocuments() {
        System.out.println("CNPJ:"+CNPJ);
    }
}
