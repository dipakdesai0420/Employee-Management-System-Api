-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: employeedb
-- ------------------------------------------------------
-- Server version	8.0.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `adminmodel`
--

DROP TABLE IF EXISTS `adminmodel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `adminmodel` (
  `admid` int NOT NULL AUTO_INCREMENT,
  `contact` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`admid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adminmodel`
--

LOCK TABLES `adminmodel` WRITE;
/*!40000 ALTER TABLE `adminmodel` DISABLE KEYS */;
INSERT INTO `adminmodel` VALUES (1,'9737256537','dipak123@gmail.com','Dipak Desai','123456');
/*!40000 ALTER TABLE `adminmodel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `assignmentlistmodel`
--

DROP TABLE IF EXISTS `assignmentlistmodel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `assignmentlistmodel` (
  `assid` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `projectname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`assid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assignmentlistmodel`
--

LOCK TABLES `assignmentlistmodel` WRITE;
/*!40000 ALTER TABLE `assignmentlistmodel` DISABLE KEYS */;
/*!40000 ALTER TABLE `assignmentlistmodel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `assignmentmodel`
--

DROP TABLE IF EXISTS `assignmentmodel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `assignmentmodel` (
  `assid` int NOT NULL AUTO_INCREMENT,
  `emid` int NOT NULL,
  `prid` int NOT NULL,
  PRIMARY KEY (`assid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assignmentmodel`
--

LOCK TABLES `assignmentmodel` WRITE;
/*!40000 ALTER TABLE `assignmentmodel` DISABLE KEYS */;
INSERT INTO `assignmentmodel` VALUES (9,8,1),(10,9,2),(11,11,3);
/*!40000 ALTER TABLE `assignmentmodel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employeemodel`
--

DROP TABLE IF EXISTS `employeemodel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employeemodel` (
  `emid` int NOT NULL AUTO_INCREMENT,
  `date_ofjoin` date DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `salary` double NOT NULL,
  `dateofjoin` date DEFAULT NULL,
  PRIMARY KEY (`emid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employeemodel`
--

LOCK TABLES `employeemodel` WRITE;
/*!40000 ALTER TABLE `employeemodel` DISABLE KEYS */;
INSERT INTO `employeemodel` VALUES (8,NULL,'Ui/UX','vishal68@gmail.com','Vishal Patel',20000,'2025-08-19'),(9,NULL,'java','dipak123@gmail.com','Dipak Desai',30000,'2025-08-12'),(10,NULL,'java','khumit123@gmail.com','Khumit Desai',20000,'2025-08-07'),(11,NULL,'Ui/UX','rohit123@gmail.com','Rohit Desai',10000,'2025-08-21');
/*!40000 ALTER TABLE `employeemodel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `projectmodel`
--

DROP TABLE IF EXISTS `projectmodel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `projectmodel` (
  `prid` int NOT NULL AUTO_INCREMENT,
  `budget` double NOT NULL,
  `clientname` varchar(255) DEFAULT NULL,
  `enddate` date DEFAULT NULL,
  `projectname` varchar(255) DEFAULT NULL,
  `startdate` date DEFAULT NULL,
  PRIMARY KEY (`prid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `projectmodel`
--

LOCK TABLES `projectmodel` WRITE;
/*!40000 ALTER TABLE `projectmodel` DISABLE KEYS */;
INSERT INTO `projectmodel` VALUES (1,10000,'Khumit desai','2025-08-13','Fashion hevan','2025-08-13'),(3,10000,'Rohit Desai','2025-08-08','rare rebit','2025-08-15');
/*!40000 ALTER TABLE `projectmodel` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-09-03 14:46:41
