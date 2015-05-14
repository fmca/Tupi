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
**You can learn more in our [Wiki](https://github.com/fmca/Tupi/wiki)**

###Interpreter

The interpreter is written in Java, so it will run in most platforms, even web pages.<br>Besides its main functionality, you can also enable the generation of ```dot``` files to illustrate any EFSM.

###Input and Output
User input and console output are natively implemented as EFSMs. (I bet you started noticing that everything will be described using state-machines... everything!)


###Code Example

Every event is described by a ```{EVENT}``` tag followed by one or more *transition pattern matches* ```[states_origin] -> newState```, a transition ```guard``` and an ```action``` to be executed.
```
use tupi.list as List

machine Stack

    memory
        List list

    states
        empty, notempty

    guards
        init = true,
        hasMore1Element = list.size > 1,
        pushAllowed = true,
       hasNoMore1Element = !hasMore1Element
    actions
        initialize
            trigger {START} on list

        addElement [int x]
            trigger {add} on list with [x]
            peek = list.last

        deleteElement
            trigger {delete} on list
            peek = list.last

	events
	        {START}
	            [*] -> empty                          | init
	                initialize [limit]

	        {PUSH} [int x]
	            [*empty] -> notempty           | pushAllowed
	                addElement [x]

	        {POP}
	            [notempty] -> empty            | hasNoMore1Element
	                deleteElement

	            [notempty] -> notempty       | hasMore1Element
	                deleteElement


```

You can also extend an existent machine:

```
machine SizeLimitedStack extends Stack
    memory
        int limit

    states
        full

    guards
        pushAllowed = list.size < limit,
        newpush = !pushAllowed
    actions
        initialize [int x]
            super.initialize
            limit = x

    events
        {PUSH} [int x]
            [*] -> full                  | newpush
                addElement [x]

        {POP}
            [full] -> empty          | hasNoMore1Element
                deleteElement
            [full] -> notempty     | hasMore1Element
                deleteElement
```
