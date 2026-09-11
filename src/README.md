#Assignment-1 (Software Design Patterns)
##Product overview
This project implements the Builder pattern in JAVA
The system allows building different types of burgers ('Burger') using 'BurgerBuilder' or ordering via 'BurgerDirector'.

##Clean code principles:
1)Meaningful names:classes and variables have clear names from the domain('addCheese()','makeCheeseBurger()','hasTomato').
2)Small,Focused Methods (Single Responsibility in Methods)
Each method in 'BurgerBuilder' performs a single,specific task (setting one field) and returns `this` to enable method chaining (Fluent Interface).
3)Validated Construction (Fail-Fast Principle).
The build() method immediately throws an IllegalStateException if required components (bun or meat) are missing, preventing the instantiation of an invalid object.
4)Encapsulation and Immutability.
All fields in the Burger class are declared as private final. Once instantiated, the state of a Burger cannot be mutated. 
5)Single Responsibility Principle.
Every class has a clear,single responsibility within the architecture:
Burger-Product
BurgerBuilder-Builder
BurgerDirector-Director
Main-Client
6)DRY
Pre-configured burger recipes are abstracted into BurgerDirector,avoiding duplicated configuration logic across the codebase.
7)Safe Error Handling.
Invalid creation attempts are gracefully caught using try-catch blocks in the client (Main), ensuring application stability without crashing unexpectedly.
