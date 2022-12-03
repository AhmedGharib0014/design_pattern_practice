# Flyweight Pattern 
- minimize use of memory by sharing data between similarly typed objects 
- make more efficient use of memory 
- large number of immutable stateless objects (String in java)
- pattern of patterns (utilize factory)
- encompasses creating and structure 
- like caching in map 
- in example:-
  - item is the  immutable stateless objects
  - catalog is the FlywieghtFactory
  - although there are more than 3 orders the created items is only 3 

```mermaid
 classDiagram
    FlywieghtFactory <-- Client
    ConcreteFlywiesght <-- Client
    FlywieghtFactory *-- Flyweight
    Flyweight <|-- ConcreteFlywiesght
    
    class Client {
    }
    
    class FlywieghtFactory {
         getFlywieght(key);
    }
    
    class Flyweight {
         operation()
    }
    
    class ConcreteFlywiesght {
         operation()
    }
    
```