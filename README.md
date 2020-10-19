Hello
=========

Hello world in scala (SBT).

### Requirements
```
JDK 14.0.2
Scala 2.13.3
SBT 1.3.13
SBT Assembly 0.15.0
```

### Run

```sh
sbt run
```

### Assembly & Run

```sh
sbt assembly
java -cp ./target/scala-2.11/hello-assembly-1.0.jar example.Hello
```

### License

MIT © [Ananta Pandu](anpandumail@gmail.com)