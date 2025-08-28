⦁	A Spring Boot application to manage employees, projects, their assignments and reporting.  
     This system provides REST APIs and simple frontend integration (AJAX + Bootstrap) to handle employee and project data efficiently.

⦁	 Backend: Java 17+, Spring Boot, Spring Data JPA  
-   Database: MySQL  
-   Frontend: HTML, CSS, Bootstrap 5, AJAX  
-   Build Tool: Maven

⦁	Clone the repository

   git clone https://github.com/dipakdesai0420/Employee-Management-System-Api.git

⦁	employeeproject import in eclipse by following Step
   go to File and click on Import and click on Existing Maven Project then after select location for project and select and finish.
    
⦁	Configure Database

   Create a MySQL database (e.g., employeedb)

   Update application.properties with your DB credentials:

   spring.datasource.url=jdbc:mysql://localhost:3306/employeedb

   spring.datasource.username=dipak
   spring.datasource.password=@dipeshwari01
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true

   MySql Database uploaded in Employee&ProjectManagementSystemAPI.


⦁	Run the project
