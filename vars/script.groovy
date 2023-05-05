import com.tarrynn.jenkins.common.Greeter

def call(String name = 'human') {
  echo "Hello, ${name}."
}