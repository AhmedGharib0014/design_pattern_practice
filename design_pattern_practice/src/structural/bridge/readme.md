# Bridge Pattern 
- works with new code while the adaptor works with legacy code 
- decouple abstraction ans implementation 
- changes in abstraction won't affect the client
- details won't be right to begin with 
- expect changes from both sides (client and product)
- uses :-
  - interfaces and abstract class
  - composition over inheritance 
  - more than composition 
  - expect changes from both sides
  - u have two products and every one can change independently

```mermaid
 classDiagram
    Abstaction |--RefinedAbstraction
    Abstaction *-- Implementor
    Implementor |-- ConcreteImplementorA
    Implementor |-- ConcreteImplementorB

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
    
```