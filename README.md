# spark_streaming

This spark streaming practice is happening on windows. For socket connection data transfer we need netcat.

## spark submit trigger

spark-submit --class SocketStreaming C:\Users\KRISHNA\IdeaProjects\spark_streaming\target\scala-2.12\spark_streaming_2.12-0.1.jar

## netcat setup for windows
netcat for windows is available from below link. version 1.12

https://eternallybored.org/misc/netcat/

https://eternallybored.org/misc/netcat/netcat-win32-1.12.zip

go to the extraction directory and give the following command.

nc64.exe -nlvp 4444

