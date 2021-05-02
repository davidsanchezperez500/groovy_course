package com.secondtask

def map = [:]
println("map " + map)
println("map.getClass().getName() " + map.getClass().getName())
println("map.foo " + map.foo)

def person = [first:"David",last:"Sánchez",email:"david@ex.com"]
println("person " + person)
println("person.first " + person.first)

person.twitter = "@davidsanchez"
println("person " + person )

def emailKey = "EmailAddress"
def twitter = [username:"@davidsanchez",(emailKey):"david@ex.com"]
println("person " + person)

println("person.size() " + person.size())
println("person.sort() " + person.sort())

// looping through person
for( entry in person ) {
    println entry
}

for ( key in person.keySet() ) {
    println "$key:${person[key]}"
}
