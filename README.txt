Exercise 1 – Create a basic user REST API server with Dropwizard

1. Exercise description:
Create a User class with id, firstName, lastName.
Create a UserResources class that contains the actual API + a collection (array/list/whatever) of Users in the system (emulates a DB).
API methods: create, deleteById, findAll, update, findById.
Any additional classes which might be required.


2. How to run the project:
In the _Additional_Information directory (basic_rest_with_dropwizard\_Additional_Information) you will find two possible
ways for executing this project.
- The first is to run the project in IntelliJ - and for that you need to use the UserApplication.xml file.
  In order to use it, it needs to be copied to .idea/runConfigurations (.idea is directly under the project).
  If you don't have this path, you can crate it manually or by saving some other run/debug configuration, and checking
  the 'Share' checkbox of that configuration.
- The second way, is to run the bat file that's supplied in the zip file in _Additional_Information directory, by double clicking it.
  To stop running the project when it's executed with the bat file - just close the window that opened when you ran the file.


3. Address to use in Postman:  http://localhost:8080/users



* Addiyional notes and explanations can be found in the _Additional_Information folder - in the Things-Learned.docx document.


