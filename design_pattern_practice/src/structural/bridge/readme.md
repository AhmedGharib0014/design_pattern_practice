# Bridge Pattern 
- two separate abstraction and implementation hierarchies 
- details won't be right to begin with 
- expect changes from both sides (client and product) 
- ix between them is required 
- uses :-
  - interfaces and abstract class
  - composition over inheritance 
  - more than composition 
  - expect changes from both sides
  - u have two products and every one can change independently
- pitfalls
  - complex

```mermaid
 classDiagram
    Abstaction <|--RefinedAbstraction
    Abstaction *-- Implementor
    Implementor <|-- ConcreteImplementorA
    Implementor <|-- ConcreteImplementorB
    Shape <|-- ShapeImpl
    Plateform <|-- PlateformImpl
    Bridge <|-- Plateform

    class Abstaction {
        +operation()
    }
    
    class RefinedAbstraction {
    }
    
    class Implementor {
         <<interface>>
        +operationImpl()
    }
    
    class ConcreteImplementorA {
        +operationImpl()
    } 
    
    class ConcreteImplementorB {
        +operationImpl()
    } 
    
    
    classs Shape(){
         <<interface>>
        +draw()
    }
    
    class ShapeImpl {
        +draw()
    } 
    
    
     classs Plateform(){
         <<interface>>
        +drawShpe(Shape shape)
    }
    
    class PlateformImpl {
         +drawShpe(Shape shape)
    } 
    
    
    class Bridge {
         -Platefom plateform 
         +draw(Shape shape)
    } 
    
```