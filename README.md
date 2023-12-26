# Student CRUD Application

This is a simple Spring Boot application that demonstrates CRUD (Create, Read, Update, Delete) operations for a `Student` entity.

## Technologies Used

- **Spring Boot:** A powerful framework for building Java-based enterprise applications.
- **Java:** The programming language used for building the application logic.
- **Lombok:** A library to reduce boilerplate code in Java.
- **HashMap:** A Java data structure used for in-memory storage of student data.
- **Spring Web:** A part of the larger Spring Framework for building web applications.
- **Spring Boot DevTools:** Tools for local development with automatic application restarts, among other features.

## APIs and Usage

### Insert Student

**Endpoint:** `http://localhost:8080/student`  
**Method:** `POST`  
**Request Body:** JSON representing the student  
```json
{
  "rollNumber": 1,
  "name": "John Doe",
  "age": 20,
  "gender": "Male",
  "branch": "Computer Science",
  "year": 2,
  "semester": 4
}
```
**Usage:** To insert a new student, send a POST request to the `http://localhost:8080/student` endpoint with the JSON payload representing the student.
## Get Student by Roll Number

**Endpoint:** `http://localhost:8080/student/{rollNumber}`  
**Method:** `GET`  
**Usage:** To retrieve a student by roll number, send a GET request to the `http://localhost:8080/student/{rollNumber}` endpoint, replacing `{rollNumber}` with the actual roll number.

## Get All Students

**Endpoint:** `http://localhost:8080/student`  
**Method:** `GET`  
**Usage:** To retrieve a list of all students, send a GET request to the `http://localhost:8080/student` endpoint.

## Update Student

**Endpoint:** `http://localhost:8080/student/{studentId}`  
**Method:** `PUT`  
**Request Body:** JSON representing the updated student  
```json
{
  "rollNumber": 1,
  "name": "John Doe",
  "age": 21,
  "gender": "Male",
  "branch": "Computer Science",
  "year": 2,
  "semester": 5
}
```
**Usage:** To update a student, send a PUT request to the `http://localhost:8080/student/{studentId}` endpoint with the JSON payload representing the updated student, replacing `{studentId}` with the actual student ID.

## Delete Student

**Endpoint:** `http://localhost:8080/student/{studentId}`  
**Method:** `DELETE`  
**Usage:** To delete a student, send a DELETE request to the `http://localhost:8080/student/{studentId}` endpoint, replacing `{studentId}` with the actual student ID.

## Get Students by Branch

**Endpoint:** `http://localhost:8080/student/branch/{branch}`  
**Method:** `GET`  
**Usage:** To retrieve a list of students by branch, send a GET request to the `http://localhost:8080/student/branch/{branch}` endpoint, replacing `{branch}` with the actual branch.
