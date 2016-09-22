#!/usr/bin/env groovy

// Closure to print value and class
def show = { println "${it} (${it.class})" }


println '''
--> dynamically typed
'''


//Dynamic type definition
def dynamicType

//Assign values
dynamicType = 1
show dynamicType

dynamicType = new java.util.Date()
show dynamicType

dynamicType = -3.1499392
show dynamicType

dynamicType = false
show dynamicType

dynamicType = "Hi"
show dynamicType

println '''
--> statically typed
'''

//Static type definition
String staticType

//Assign values
staticType = 1
show staticType

staticType = new java.util.Date()
show staticType

staticType = -3.1499392
show staticType

staticType = false
show staticType

staticType = "Hi"
show staticType




