#!/usr/bin/env groovy
import ch.puzzle.groovy.SimpleValue

def first = new SimpleValue(value: '');

//Call function without arguments
first.print()

// Call with single argument
first.add 'A'
first.add('B')
first.print()

// Call with varags argument
first.add 'C', 'D'
first.add('E', 'F')
first.print()

// Call with Closure argument
first.apply( { it += 'g' } )

first.apply() {
    it += 'h'
}

first.apply {
    it += 'i'
}

first.print()

// Call function with defaults
second = first.create()
second.print()

// Call function with default override
third = first.create 42
third.print()

// Call function with value and Closure
fourth = first.create('abcdef') {
	value -> value.toUpperCase() 
}
fourth.print()