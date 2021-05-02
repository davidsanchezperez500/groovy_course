package com.secondtask

List nums = [1,2,3,4,5,6,7,8,9]
println ("nums " + nums)

nums.push(99)
println ("nums.push(99) " + nums)

nums.putAt(0,77)
println ("nums.putAt(0,77) " + nums)

//nums.putAt(0,77) es equivalente a nums[0] = (77)
nums[0] = (78)
println ("nums[0] = (78) " + nums)

nums = nums + 7
println ("nums + 7 " + nums)

nums = nums << 66
println ("nums << 66 " + nums)

nums.pop()
println ("nums.pop() " +  nums)

nums.removeAt(0)
println ("nums.removeAt(0) " +  nums)

println ("nums.[4] " +  nums[4])

println("nums.getAt(0..3)" + nums[0..3])

def newList = nums - 4
println("newList = nums - 4" + newList)

for(x in nums){
    println(x)
}
// flatten
nums << [3, 4, 5]
nums << [1,2]

println("nums << [3, 4, 5]\n" + "nums << [1,2] \n" + nums)

println("nums.flatten() " + nums.flatten())

println("nums.unique() " + nums.unique())

def numbers = [1,2,3,7,3,3,8,3,8,9,2,6,10,165,4] as Set
println("numbers " + numbers)
println numbers.class.name

numbers = [1,2,3,7,3,3,8,3,8,9,2,6,10,165,4] as SortedSet
println("numbers " + numbers)
println numbers.class.name
