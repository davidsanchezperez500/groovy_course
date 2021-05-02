package com.secondtask

Range r = 1..10
println r
println r.class.name
println r.from
println r.to

assert !(0..10).contains(9)

Range letters = 'a'..'z'
println letters
