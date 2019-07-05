name := "UltraTendency"

version := "0.1"

scalaVersion := "2.11.8"

// https://mvnrepository.com/artifact/org.apache.kafka/kafka
libraryDependencies += "org.apache.kafka" %% "kafka" % "2.1.0"

// https://mvnrepository.com/artifact/org.apache.kafka/kafka-clients
libraryDependencies += "org.apache.kafka" % "kafka-clients" % "2.1.0"

// https://mvnrepository.com/artifact/org.slf4j/slf4j-log4j12
libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.7.26" % Test

// https://mvnrepository.com/artifact/org.slf4j/slf4j-simple
libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.26" % Test

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.3" % Runtime

// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming-kafka-0-10
libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.3.2"
// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.3.2"

// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.3.2"

// https://mvnrepository.com/artifact/org.apache.kafka/connect-json
libraryDependencies += "org.apache.kafka" % "connect-json" % "2.1.0"

// https://mvnrepository.com/artifact/com.typesafe.play/play-json
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.7.3"
