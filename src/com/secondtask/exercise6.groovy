package com.secondtask
// Range exercises -----------------------
enum Days {
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}
def dayRange = Days.SUNDAY..Days.SATURDAY

for ( day in dayRange ){
    println day
}

dayRange.each {day ->
    println day
}

println ("dayRange.size() " + dayRange.size())
println ("dayRange.contains(Days.WEDNESDAY) " + dayRange.contains(Days.WEDNESDAY))
println ("dayRange.from " + dayRange.from)

//List exercises -----------------------

def days = ["SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"]
println("days " + days)
println("days.size() " + days.size())
days.pop()
println("days.pop() " + days)
days << "SATURDAY"
println("days << \"SATURDAY\"" + days)
println("days[3] " + days[3])

//Maps exercises -----------------------

Map map = [1:"SUNDAY",2:"MONDAY",3:"TUESDAY",4:"WEDNESDAY",5:"THURSDAY",6:"FRIDAY",7:"SATURDAY"]

println("map " + map)
println("map.getClass().getName() " + map.getClass().getName())
println("map.size() " + map.size())
println("map.values() " + map.values())
println("map.keySet() " + map.keySet())
