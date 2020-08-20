# LoginAndSignup

This is a spring boot project

-->To Run this project we need sts ide link given below.
  https://spring.io/tools#suite-three

-->Open ide and import the LoginAndSignup project from this git.

a) Steps to import:

1.Go to file -> Select import.

2.Go to General-> Select Projects from Folder or archive.

3.Then browse and select my project and press finish.
(Now it will import all the dependencies.)

b) Change application.properties file

1.In ide open drop down of the project.

2.Open src/main/resources.

3.Open application.properties.

(preview of application.properties file :

server.port=8083

spring.jpa.hibernate.ddl-auto=update

spring.datasource.url=jdbc:mysql://localhost:3306/mydb --> please write your schema name in place of "mydb"

spring.datasource.username=root --> Change the username if it is different

spring.datasource.password=System@123 --> Change Password too.

spring.jpa.show-sql=true
)

4.After doing these changes it is ready to run.

c) To Run:

1.Right click on the imported project -> Select Run as.

2.Then Select SpringBoot.

3.It will run.
