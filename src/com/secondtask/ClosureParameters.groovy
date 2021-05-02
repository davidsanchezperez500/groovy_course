package com.secondtask
def foo = {
    println it
}
foo('David')

def noparmas = { ->
    print "no params..."
}
noparmas()

def sayHello ={ String first, String last ->
    println("Hello, $first $last")
}

sayHello "David","Sánchez"

def greet = { String name, String greeeting = "Hwdy" ->
    println("$greeeting, $name")
}

greet("David","Hello")
greet("Joe")

def concat = { String... args ->
    args.join('')
}
println concat('abc','def')
println concat('abc','def','123','456')

def someMethod(Closure c){
    println "..."
    println c.maximumNumberOfParameters
    println c.parameterTypes
}

def someClosure = { int x, int y -> x +y}
someMethod(someClosure)

