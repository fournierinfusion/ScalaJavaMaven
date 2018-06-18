
package main.scala

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object ScalaRunner  {

  def main(args: Array[String]) {


    val conf = new SparkConf().
      setAppName("TEST").
      setMaster("local[2]")
    val sc = new SparkContext(conf)




  }

}
