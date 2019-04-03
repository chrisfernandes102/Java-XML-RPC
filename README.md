# Java-XML-RPC
Repo for XML-RPC

This application includes the implementation of a Java XML-RPC server to grab verses from the bible. The application 
supports verses from the whole bible.

# How to run:
* navigate to the directory of the jars/json file in your terminal
* Once in the folder run the command `java -jar <filename>` to run the jar file (BibleVerseClient.jar and BibleVerseServer.jar)
* To run both you will need two terminal windows, each one running one of the files

# Format of Verses:
* The format of the verses is `<name of book with first letter capital> <Chapter>:<verse>`
* Examples include `John 3:16`, `2 John 1:1`, `Genesis 1:5`
* If the verse is not supported/available or the format of the prompt is incorrect the application returns the value of null
