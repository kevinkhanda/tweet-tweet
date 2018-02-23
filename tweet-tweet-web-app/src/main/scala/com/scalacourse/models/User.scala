package com.scalacourse.models

import scala.collection.mutable

case class User(id: Long, email: String, nickname: String, password: String, var tweets: List[Twit] = Nil) {

  override def hashCode: Int = id.hashCode()
}
