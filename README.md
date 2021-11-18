# spark_streaming

## spark socket Streaming
This spark streaming practice is happening on windows. For socket connection data transfer we need netcat.

### spark submit trigger

spark-submit --class SocketStreaming C:\Users\KRISHNA\IdeaProjects\spark_streaming\target\scala-2.12\spark_streaming_2.12-0.1.jar

### netcat setup for windows
netcat for windows is available from below link. version 1.12

https://eternallybored.org/misc/netcat/

https://eternallybored.org/misc/netcat/netcat-win32-1.12.zip

go to the extraction directory and give the following command.

nc64.exe -nlvp 4444


## spark twitter streaming

Spark twitter streaming will stream the twitter data and filter with the provided keywords and hashtags. we have to use assembly jar or have to pass the dependency jars too.

mainly there are two dependency jars.

twitter4j-stream -  to set streaming object configuration.

spark-streaming-twitter - to incorporate twitter streaming data to spark. latest version is available at org.apache.bahir [https://github.com/apache/bahir/tree/master/streaming-twitter]

code source : https://github.com/dgadiraju/code/blob/a01c909e382ae7da5077486536d58b677c24469f/simple-spark-project/src/main/java/TwitterPopularTags.scala

### spark submit command

spark-submit --class TwitterPopularTags C:\Users\KRISHNA\IdeaProjects\spark_streaming\target\scala-2.12\spark_streaming-assembly-0.1.jar <consumerKey> <consumerSecret> <accessToken> <accessTokenSecret> <filterkeyword>
  
 
###  twitter api setup. 

https://youtu.be/1GixYso8Az4
  
  
##  In future we have to use delta file formets to enable CRUD operations on data 

