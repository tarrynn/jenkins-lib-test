import com.tarrynn.jenkins.common.Greeter

def call() {
    def greeter = new Greeter()
    println greeter.sayHello()
}