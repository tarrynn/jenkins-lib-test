package com.tarrynn.jenkins.common

import com.tarrynn.jenkins.common.Greeter

println "Hello world"

println "docker ps -a".execute().text

def test = new Greeter()
println test.sayHello()