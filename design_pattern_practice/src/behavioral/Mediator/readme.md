# Mediator pattern
- 


## class diagram

```mermaid
 classDiagram
    List <-- Client
    Collection <|--List
    ListIterator *-- List
    Iterator <|-- ListIterator
    
    class Collection {
         <<Interface>>
        +iterator(context)
    }
    
     class List {
        +iterator()
    }
    
    class Iterator {
         <<Interface>>
        +hasNext()
          +next()
    }
    
     class ListIterator {
        +hasNext()
         +next()
    } 
    
```