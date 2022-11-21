# Decorator Pattern 
- wrap another object to add functionality to it 
- add behavior without affecting others
- compose behavior dynamically by using subclasses of decorated object
- utilize both inheritance and composition 
- alternative of subclasses 



```mermaid
 classDiagram
    Component <|-- ConcreteComponent
    Component  <|--Decorator
    Decorator *-- Component
    Decorator <|-- ConcreteDecorator
  
    class Component {
        +operation()
    }
    
    class ConcreteComponent {
          +operation()
    }
    
    class Decorator {
          -component
         +operation()
    }
    
    class ConcreteDecorator {
          +operation()
    }
    
```