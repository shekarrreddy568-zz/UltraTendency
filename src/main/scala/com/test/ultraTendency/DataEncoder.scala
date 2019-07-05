package com.test.ultraTendency

import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.ObjectMapper
import org.apache.kafka.common.serialization.StringSerializer
import kafka.utils.VerifiableProperties



class DataEncoder  {

  private val objectMapper = new ObjectMapper

  def toBytes(iotEvent: IotData): Array[Byte] = {
    try {
      val msg = objectMapper.writeValueAsString(iotEvent)

      return msg.getBytes
    } catch {
      case e: JsonProcessingException =>
        println("Error in Serialization", e)
    }
    null
  }

}
