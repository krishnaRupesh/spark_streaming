import org.apache.spark._
import org.apache.spark.streaming._
import org.apache.spark.streaming.StreamingContext._


object Controller extends App{


  val conf = new SparkConf().setMaster("local[2]").setAppName("NetworkWordCount").set("logs","error")
  val ssc = new StreamingContext(conf, Seconds(10))


  val lines = ssc.socketTextStream("localhost", 4444)

  val words = lines.flatMap(_.split(" "))

  val pairs = words.map(word => (word, 1))
  val wordCounts = pairs.reduceByKey(_ + _)

  // Print the first ten elements of each RDD generated in this DStream to the console
  wordCounts.print()

  ssc.start()             // Start the computation
  ssc.awaitTermination()  // Wait for the computation to terminate

}
