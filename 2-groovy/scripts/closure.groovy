#!/usr/bin/env groovy

// Closures with parameters

def upper = { string -> string.toUpperCase() }
println upper('Hello, World!')

def combine = { first, second -> first+second }
println combine('Hello', 'World')

//Closure with implicit parameter --> parameter is 'it'
def greet = { "Hello, $it!" }
println greet('World')

//Closure without parameters
def theAnswer = { -> 42 }
println theAnswer()

//println theAnswer(43)