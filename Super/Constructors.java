package Super;

public class Constructors {
    public Constructors() {
        System.out.println("Initiallized.");
    }
}

class SubConstructors extends Constructors {
    public SubConstructors() {
        super();
        System.out.println("Sub Initiallized.");
    }
}

class ConstructorsMain {
    public static void main(String[] args) {
        SubConstructors sc = new SubConstructors();
    }
}