package com.akkademy

import akka.actor.ActorSystem
import akka.util.Timeout
import scala.concurrent.duration._
import akka.pattern._
import com.akkademy.messages.{GetRequest, SetRequest}

class SClient(remoteAddress: String) {
  private implicit val timeout = Timeout(2 seconds)
  private implicit val system = ActorSystem("LocalSystem")
  private val remoteDb = system.actorSelection(s"akka.tcp://akkademy@$remoteAddress/user/akkademy-db")

  def set(key: String, value: Object) = {
    remoteDb ? SetRequest(key, value)
  }

  def get(key: String) = {
    remoteDb ? GetRequest(key)
  }
}
