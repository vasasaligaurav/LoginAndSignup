# LoginAndSignup
# Spring boot project (Back End)

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


--->Only after running this run the angular project. Both the projects should simultaniously.

-----------------------------------------------------------------------------------------------------------------------------------------------------------
# Angular Project (Front End)

--> To Run angular project you need to install following programs:

1.nodejs https://nodejs.org/en/download/ and install.

2.Angular 6.0.

--> For installing Angular 6.0:

1.To check node js is available or not:

Open command prompt and type

$ npm -version

$ node -version

And then type below command to install Angular

2.$npm install -g @angular/cli@6.0

-->After installing

1.Open cmd and create new Angular project by typing

$ng new projectname

2.After creating the new project replace the src in the project with my src provided in this repository.

After that open project directory in cmd
for example (C:\Users\vasas\Desktop\Files\projectname)

4.Now run command

$npm install bootstrap

5.Then type ng serve -o to run the project.


