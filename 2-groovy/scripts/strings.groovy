#!/usr/bin/env groovy

def value = 'World'

//Single quoted - no interpolation
println 'Hello, ${value}!\n'

//Double quoted - interpolated
println "Hello, ${value}!\n"

//Triple single quoted - no interpolation, multiline
println '''Hello, ${value}!
'''

//Triple double quoted - interpolated, multiline
println """Hello, ${value}!
"""

