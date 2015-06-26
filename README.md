# Tupi
Language and interpreter support to describe, expand and execute extended finite-state machines (EFSM).

###Language
The main goal is to mimic every EFSM property in **code**:
- Memory
- States
- Transitions
- Events
- Guards
- Actions

Plus additional concepts and features such as **polymorphism** and **pattern matching**. <br>

**You can see more code examples in our [Wiki](https://github.com/fmca/Tupi/wiki)**

###Interpreter

The interpreter is written in Java, so it will run in most platforms, even web pages.<br>Besides its main functionality, you can also enable the generation of ```dot``` files to illustrate any EFSM.

###Code Example

Every event is described by a ```{EVENT}``` tag followed by one or more *transition pattern matches* ```[states_origin] -> newState```, a transition ```guard``` and an ```action``` to be executed.
```
namespace plp

machine Printer
	memory
		String message
	states
		printReady
	guards
		canPrint = true
	actions
		initialize { message = "Hello World" ; println ( "first" ) }
		print { println ( message ) }
	events
		{ START }
			when [ * ] -> printReady if canPrint do initialize
		{ PRINT }
			when [ print* ] -> printReady if canPrint do print
				=> trigger PRINT on itself
			
```

You can also extend an existent machine:

```
namespace plp

machine PrinterLimited extends PrinterCIn
	memory
		int limit
	guards
		canPrint = limit < 10
	actions
		print { println ( "Hello Limited: " + limit ) ; limit = limit + 1 }
```

### How to install
Tupi is released under an eclipse plugin. You can install it using www.cin.ufpe.br/~fmca/Tupi/ as update site.  
To learn how to install a plugin you can follow this [tutorial](http://agile.csc.ncsu.edu/SEMaterials/tutorials/install_plugin/index_v35.html#section1_0).
