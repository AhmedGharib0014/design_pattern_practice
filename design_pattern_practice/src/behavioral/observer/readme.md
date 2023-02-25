# observer pattern
- when  a subject need to be observed from one or more observers
- subject has one to many observers
- publisher and subscriber
- use asynchronous fashion
- subject contains state that observers need to listen too.


## class diagram

```mermaid
 classDiagram
    Subject <|-- ConcreteSubject
    Observer <|--ConcreteObserver
    Observer <--Subject
    ConcreteObserver <--ConcreteSubject

    class Subject {
        +attatch(Observer)
        +detach(Observer)
        +notify()
    }
    
    class ConcreteSubject {
        - state
        +getState(Observer)
        +setState()
    }
    
    class Observer {
      +update()
    }
    
     class ConcreteObserver {
      +update()
    }
    
```