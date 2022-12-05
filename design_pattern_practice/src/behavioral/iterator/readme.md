# iterator pattern
- provide navigation without exposing structure of an object
- traverse container
- decouple the data from algorithm used to traverse it
- sequential 
- interface base


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