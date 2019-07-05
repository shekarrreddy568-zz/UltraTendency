package com.test.ultraTendency

import java.util.Properties

import org.apache.kafka.clients.producer.{KafkaProducer, Producer, ProducerRecord}
import java.util
import java.util.Collections
import java.util.Random
import java.util.UUID
import kafka.utils.Json
import org.apache.kafka
import play.api.libs.json.Json
import org.apache.kafka.connect.json.JsonSerializer

import scala.collection.JavaConversions._

case class IotData(deviceId: String, temperature: Int, latitude: Long, longitude: Long, time: Int)

object KafkaIoTDataProducer {

  def main(args: Array[String]): Unit = {

    val props = new Properties()
    props.put("bootstrap.servers", "hadoop-fra-5.intern.beon.net:9092")
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    props.put("value.serializer", "JsonSerializer")
    props.put("serializer.class", "org.apache.kafka.common.serialization.StringSerializer")

    val producer = new KafkaProducer[String, String](props)

    val topic = "test568"

  //  generateIoTEvent(producer, topic)

//  }

  //def generateIoTEvent(producer: Producer[String, IoTData], topic: String): Unit = {
    // val routeList = util.Arrays.asList(Array[String]("Route-37", "Route-43", "Route-82"))
    // val vehicleTypeList = util.Arrays.asList(Array[String]("Large Truck", "Small Truck", "Private Car", "Bus", "Taxi"))
    val rand = new Random
    // generate event in loop
    while (true) {
      val eventList = new util.ArrayList[IotData]
      var i = 1
      while (i < 4) { // create 100 vehicles
        val deviceId = UUID.randomUUID.toString
        val temperature = rand.nextInt(2)
        val latitude = rand.nextLong()
        val longitude = rand.nextLong()
        val time = rand.nextInt(10) // random speed between 20 to 100
        val event: IotData = new IotData(deviceId, temperature, latitude, longitude, time)

        eventList.add(event)

        {
          i += 1;
          i - 1
        }
      }

      Collections.shuffle(eventList) // shuffle for random events
      println(eventList)

      for (event <- eventList) {
        val record = new ProducerRecord(topic, "key", Json.formatted(event.toString))
        producer.send(record)
        Thread.sleep(1000) //random delay of 1 seconds

      }
    }
  }

}

//  //Method to generate random latitude and longitude for routes
//  private def getCoordinates(routeId: String) = {
//    val rand = new Random
//    var latPrefix = 0
//    var longPrefix = -0
//    if (routeId == "Route-37") {
//      latPrefix = 33
//      longPrefix = -96
//    }
//    else if (routeId == "Route-82") {
//      latPrefix = 34
//      longPrefix = -97
//    }
//    else if (routeId == "Route-43") {
//      latPrefix = 35
//      longPrefix = -98
//    }
//    val lati = latPrefix + rand.nextFloat
//    val longi = longPrefix + rand.nextFloat
//    lati + "," + longi
//  }
//}
