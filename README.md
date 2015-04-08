# Tupi
A language and interpreter support to describe, expand and execute extended finite-state machines (EFSM).

###Language
The main goal is to mimic every EFSM property in **code**:
- Memory
- States
- Transitions
- Events
- Guards
- Actions

Plus additional concepts and features such as **polymorphism** and **pattern matching**. <br>
**You can learn more in our [Wiki](https://github.com/fmca/Tupi/wiki)**

###Interpreter

The interpreter is written in Java, so it will run in most platforms, even web pages.<br>Besides its main functionality, you can also enable the generation of ```dot``` files to illustrate any EFSM.

###Input and Output
User input and console output are natively implemented as EFSMs. (I bet you started noticing that everything will be described using state-machines... everything!)


###Code Example

Every event is described by a ```{EVENT}``` tag followed by one or more *transition pattern matches* ```[states_origin] -> newState```, a transition ```guard``` and an ```action``` to be executed. 
```
machine Stack

	memory
		list, peek

	states
		empty, notempty
	
	events
		{START}
		    [*] -> empty
			    initialize
	
		{PUSH} [x]
			[*empty] -> notempty	| pushAllowed
				addElement x
			
		{POP}
			[notempty] -> empty		| !hasMore1Element
				deleteElement
			[notempty] -> notempty	| hasMore1Element
				deleteElement
	guards
		hasMore1Element = list.size > 1
		pushAllowed = true
		
	actions
		initialize
			list = start List
			
		addElement [x]
			list {add} x
			peek = list.last
			
		deleteElement
			list {delete} list.size-1
			peek = list.last
	
	
```

You can also extend an existent machine:

```
machine SizeLimitedStack extends Stack
	
	memory
		limit
		
	states
		full
			
	events
		{PUSH} [x]
			[*empty] -> full | !pushAllowed
				addElement x
				
		{POP}
			[full] -> empty | !hasMore1Element
				deleteElement
			[full] -> notempty
				deleteElement
	
	guards
		pushAllowed = list.size < limit
		
	actions
		initialize [x]
			Stack.initialize
			limit = x
```
