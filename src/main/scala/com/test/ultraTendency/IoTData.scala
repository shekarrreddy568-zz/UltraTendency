package com.test.ultraTendency

import java.io.Serializable

class IoTData extends Serializable {
  var deviceId: String = ""
  var temperature: Int = 0
  var latitude: Long = 0
  var longitude: Long = 0
  var time: Int = 0

  def IoTData(deviceId: String, temperature: Int, latitude: Long, longitude: Long, time: Int) {
    this.deviceId = deviceId
    this.temperature = temperature
    this.latitude = latitude
    this.longitude = longitude
    this.time = time
  }
}