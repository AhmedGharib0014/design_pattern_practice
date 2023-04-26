# Command pattern
- we’re going to encapsulate method invocation
- The Command Pattern allows you to decouple the requester of an action from the object that actually performs the action.
- the command objects encapsulate how to do a home automation task along with the object that needs to do it.
- steps :- 
  - The client creates a command object. 
  - The client does a setCommand() to store the command object in the invoker. 
  - Later... the client asks the invoker to execute the command. 
    - Note:as you’ll see later in the chapter, once the command is loaded into the invoker, 
    - it may be used and discarded, or it may remain and be used many times.
- The Command Pattern encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.
-  MacroCommand is a command that holds and perform many commands
- actors :- 
  - client :- The Client is responsible for creating a ConcreteCommand and setting its Receiver
  - invoker :- The Invoker holds a command and at some point asks the command to carry out a request by calling its execute() method
  - command :- Command declares an interface for all commands.
  - concrete command :- The ConcreteCommand defines a binding between an action and a Receiver
  - Receiver :- The Receiver knows how to perform the work needed to carry out the request. Any class can act as a Receiver.
- usage :-
  - queuing requests :- 
    - Imagine a job queue: you add commands to the queue on one end. on the other end sit a group of threads.
    - Threads run the following script: 
      - they remove a command from the queue,
      - call its execute() method,
      - wait for the call to finish,
      - then discard the command object and retrieve a new one
  -  logging requests :- 
    - The semantics of some applications require that we log all actions and be able to recover after a crash by reinvoking those actions.
    - The Command Pattern can support these semantics with the addition of two methods: store() and load().



## class diagram

```mermaid
 classDiagram
    Receiver <-- Client
    ConcreteCommand <--Client
    Invoker <--Client
    Receiver <-- ConcreteCommand
    Invoker *-- Command
    Command <|-- ConcreteCommand
    
    class Command {
         <<Abstract>>
        +excute()
        +undo()
    }
    
    class ConcreteCommand {
        Reciever reciver
        +excute()
        +undo()
    } 
    
    class Receiver {
        +action()
    } 
    
```
