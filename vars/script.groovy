import com.tarrynn.jenkins.common.Greeter

def call(String name = 'human') {
  def greeter = new Greeter()
  echo greeter.sayHello()
  echo "Hello, ${name}."
}