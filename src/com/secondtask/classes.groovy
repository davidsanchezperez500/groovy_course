package com.secondtask

class Person2 {
    String firstName, lastName
    def dob
    // private | protected | public
    protected String f1, f2, f3
    private Date createOn = new Date()

    static welcomeMsg = 'HELLO'
    public static final String WELCOME_MSG = 'HELLO'

    //local variables
    static def foo() {
        String msg = "Hello"
        String firstname = 'David'
        println "$msg, $firstname"

    }

}

def person = new Person2()
println person.foo()
