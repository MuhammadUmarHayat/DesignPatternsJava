public interface Component 
{
   void operation();
}

public class ConcreteComponent implements Component 
{
   @Override
   public void operation() {
      System.out.println("ConcreteComponent operation.");
   }
}
public abstract class Decorator implements Component {
   protected Component component;

   public Decorator(Component component) {
      this.component = component;
   }

   @Override
   public void operation() {
      component.operation();
   }
}


public class ConcreteDecoratorA extends Decorator {
   public ConcreteDecoratorA(Component component) {
      super(component);
   }

   @Override
   public void operation() {
      super.operation();
      System.out.println("ConcreteDecoratorA operation.");
   }
}

public class ConcreteDecoratorB extends Decorator {
   public ConcreteDecoratorB(Component component) {
      super(component);
   }

   @Override
   public void operation() {
      super.operation();
      System.out.println("ConcreteDecoratorB operation.");
   }
}

public static void main(String[] args) {
   Component component = new ConcreteComponent();
   component = new ConcreteDecoratorA(component);
   component = new ConcreteDecoratorB(component);

   component.operation();
}
