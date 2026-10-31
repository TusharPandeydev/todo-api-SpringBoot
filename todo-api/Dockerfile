# Base image jisme Java 21 JRE pehle se installed hai
FROM eclipse-temurin:21-jre

# IntelliJ ne jo jar file banai hai usko container ke andar copy karo
COPY target/todo-api-0.0.1-SNAPSHOT.jar app.jar

# Container start hote hi yeh command chalegi
ENTRYPOINT ["java", "-jar", "app.jar"]

# note -->original mein difference -->like joh user code likhtha hain uska raw compiled verison hota hain sirf .Ismein
# sirf developer ki banayi hui classes hii hoti hain (i.e TODO,ToDocController,etc). Ismein spring boot ki library and
# dependencies nahi hoti hain unlike (.jar) file jismein sb kuch hota hain and wohi main hoti hain .Agr (.original) file
# ko run krne jayega toh pkka error aa jayega kyuki dependeices and library toh hogi hii nahi


## Docker File is for dockerizing the application