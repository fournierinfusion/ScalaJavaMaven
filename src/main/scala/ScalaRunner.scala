
package main.scala


import org.apache.spark.sql.SparkSession

object ScalaRunner  {

  def main(args: Array[String]) {

     val Spark = SparkSession.builder()
       .master("local")
       .appName("test")
       .getOrCreate()




  }

}
