package com.secondtask

List favNums = [2,2,1,44,34,8,4]

for(num in favNums) {
    println num
}
favNums.each {println it}

for( int i=0; i<favNums.size(); i++){
    println "$i:${favNums[i]}"
}

favNums.eachWithIndex{ int entry, int i ->
    println "$i:$entry"
}
List days = ["Sunday","Monday","Tuesday"]
List weekend = days.findAll { it.startsWith("S")}

println days
println weekend

//collect
List nums = [1,2,27,2,8,2,4,6]

List numsTimesTen = []
nums.each {num ->
    numsTimesTen << num * 10
}

List newTimesTen = numsTimesTen.collect { num -> num * 10}

println nums
println numsTimesTen
print newTimesTen