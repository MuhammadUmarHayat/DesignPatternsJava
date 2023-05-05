// Define the subsystem classes
class SubsystemA {
    public void operationA() {
        System.out.println("SubsystemA.operationA");
    }
}

class SubsystemB {
    public void operationB() {
        System.out.println("SubsystemB.operationB");
    }
}

class SubsystemC {
    public void operationC() {
        System.out.println("SubsystemC.operationC");
    }
}

// Create the facade class
class Facade 
{
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;
    private SubsystemC subsystemC;

    public Facade() 
    {
        subsystemA = new SubsystemA();
        subsystemB = new SubsystemB();
        subsystemC = new SubsystemC();
    }

    public void operation() 
    {
        subsystemA.operationA();
        subsystemB.operationB();
        subsystemC.operationC();
    }
}

// Use the facade class
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operation();
    }
}
