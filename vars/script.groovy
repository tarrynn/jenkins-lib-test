import com.tarrynn.jenkins.common.Greeter

def customMethod(String name = 'human') {
  echo "Hello, ${name}."
}