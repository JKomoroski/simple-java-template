///usr/bin/env java -cp deps/* --enable-preview --source 25 "$0" "$@" ; exit $?

import com.fasterxml.jackson.jr.ob.JSON;

void main(String[] args) throws Exception {
    IO.println("Hello World!");
    for (var arg : args) {
        IO.println("Arg: %s".formatted(arg));
    }

    // Jackson Jr example
    var person = new Person("Alice", 30);
    
    // Serialize to JSON
    String json = JSON.std.asString(person);
    IO.println("JSON: " + json);
    
    // Deserialize from JSON
    Person parsed = JSON.std.beanFrom(Person.class, json);
    IO.println("Parsed: " + parsed.name() + ", age " + parsed.age());
}

record Person(String name, int age) {}
