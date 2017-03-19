-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: air_ticket_reservation
-- ------------------------------------------------------
-- Server version	5.7.11-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `customerId` char(5) NOT NULL,
  `passportId` char(9) DEFAULT NULL,
  `NIC` char(10) NOT NULL,
  `surname` varchar(20) NOT NULL,
  `fName` varchar(40) NOT NULL,
  `dob` varchar(10) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `nationality` varchar(20) NOT NULL,
  `occupation` varchar(25) DEFAULT NULL,
  `address` varchar(50) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  `phone` char(10) NOT NULL,
  PRIMARY KEY (`customerId`),
  UNIQUE KEY `NIC_UNIQUE` (`NIC`),
  UNIQUE KEY `passportId_UNIQUE` (`passportId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('C0001','N12345678','123456789V','Perera','Ashan','12-01-1993','Male','Sri Lankan','Student','123 Baseline Road, Colombo','ashan_perera@gmail.com','1234567890'),('C0002','N87654321','468978132V','Perera','Vidushani ','21-10-1995','Female','Sri Lankan','Student','324 Baseline Road, Colombo','vidushani_perera@gmail.com','1234567890'),('C0003','N56542312','897865421V','De Silva','Tehan','11-05-1974','Male','Sri Lankan','Software Engineer','113 Rajapihilla Mawatha, Kandy Colombo','tehands@yahoo.com','1523489521'),('C0004','N65489542','785112325V','Doe','John','04-12-1986','Male','American','CEO','107 Vauxhall St., Colombo','anonymous@outlook.com','7512364589'),('C0005','N58798213','456132789V','Doe','Jane','14-05-1988','Female','American','Housewife','85 Vauxhall St., Colombo','anonymousmiss@outlook.com','5821236548'),('C0006','N25869523','932514562V','Madushan','Sameera','03-07-1982','Male','Indian','Engineer','456,abc Ave\ncolombo','sameera@gmail.com','0718173441');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flight`
--

DROP TABLE IF EXISTS `flight`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `flight` (
  `flightId` char(4) NOT NULL,
  `airlineId` char(4) DEFAULT NULL,
  `airlineName` varchar(40) DEFAULT NULL,
  `depatureLocation` varchar(35) DEFAULT NULL,
  `destinationLocation` varchar(35) DEFAULT NULL,
  `depatureTime` datetime DEFAULT NULL,
  `landingTime` datetime DEFAULT NULL,
  `numberOfSeats` int(11) DEFAULT NULL,
  `type` varchar(15) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`flightId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight`
--

LOCK TABLES `flight` WRITE;
/*!40000 ALTER TABLE `flight` DISABLE KEYS */;
INSERT INTO `flight` VALUES ('F001','SRLK','Sri Lankan Airlines','Colombo','Chennai','2016-04-01 10:05:00','2016-04-02 12:30:00',138,'International',149),('F002','SRLK','Sri Lankan Airlines','Colombo','Hambantota','2016-04-03 09:45:00','2016-04-03 10:15:00',138,'Domestic',70.99),('F003','SRLK','Sri Lankan Airlines','Hambantota','Colombo','2016-04-03 11:15:00','2016-04-03 11:45:00',138,'Domestic',70.99),('F004','SQ','Singapore Airlines','Colombo','Doha','2016-05-10 09:45:00','2016-05-12 11:45:00',138,'International',170),('F005','QTAI','Qatar Airlines','Doha','Colombo','2016-04-05 05:00:00','2016-04-05 10:30:00',138,'International',249.99),('F006','AIIN','Air India','Delhi','Colombo','2016-04-10 09:45:00','2016-04-10 12:45:00',138,'International',189.99),('F095','AML','American airlines','Colombo','Paris','2016-06-15 11:45:00','2016-06-17 01:45:00',138,'International',220);
/*!40000 ALTER TABLE `flight` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flight_seat`
--

DROP TABLE IF EXISTS `flight_seat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `flight_seat` (
  `flightId` char(4) NOT NULL,
  `seatId` char(3) NOT NULL,
  `passengerId` char(15) DEFAULT NULL,
  `seatAvailability` varchar(10) DEFAULT NULL,
  `travelClass` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`flightId`,`seatId`),
  KEY `fk2_flight_seat` (`passengerId`),
  CONSTRAINT `fk1_flight_seat` FOREIGN KEY (`flightId`) REFERENCES `flight` (`flightId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk2_flight_seat` FOREIGN KEY (`passengerId`) REFERENCES `customer` (`passportId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight_seat`
--

LOCK TABLES `flight_seat` WRITE;
/*!40000 ALTER TABLE `flight_seat` DISABLE KEYS */;
INSERT INTO `flight_seat` VALUES ('F001','01A',NULL,'Free','1st Class'),('F001','01B',NULL,'Free','1st Class'),('F001','01C',NULL,'Free','1st Class'),('F001','01D',NULL,'Free','1st Class'),('F001','01E',NULL,'Free','1st Class'),('F001','01F',NULL,'Free','1st Class'),('F001','02A',NULL,'Free','1st Class'),('F001','02B',NULL,'Free','1st Class'),('F001','02C',NULL,'Free','1st Class'),('F001','02D',NULL,'Free','1st Class'),('F001','02E',NULL,'Free','1st Class'),('F001','02F',NULL,'Free','1st Class'),('F001','03A',NULL,'Free','1st Class'),('F001','03B',NULL,'Free','1st Class'),('F001','03C',NULL,'Free','1st Class'),('F001','03D',NULL,'Free','1st Class'),('F001','03E',NULL,'Free','1st Class'),('F001','03F',NULL,'Free','1st Class'),('F001','04A',NULL,'Free','1st Class'),('F001','04B',NULL,'Free','1st Class'),('F001','04C',NULL,'Free','1st Class'),('F001','04D',NULL,'Free','1st Class'),('F001','04E',NULL,'Free','1st Class'),('F001','04F',NULL,'Free','1st Class'),('F001','05A',NULL,'Free','Economy'),('F001','05B',NULL,'Free','Economy'),('F001','05C',NULL,'Free','Economy'),('F001','05D',NULL,'Free','Economy'),('F001','05E',NULL,'Free','Economy'),('F001','05F',NULL,'Free','Economy'),('F001','06A',NULL,'Free','Economy'),('F001','06B',NULL,'Free','Economy'),('F001','06C',NULL,'Free','Economy'),('F001','06D',NULL,'Free','Economy'),('F001','06E',NULL,'Free','Economy'),('F001','06F',NULL,'Free','Economy'),('F001','07A',NULL,'Free','Economy'),('F001','07B',NULL,'Free','Economy'),('F001','07C',NULL,'Free','Economy'),('F001','07D',NULL,'Free','Economy'),('F001','07E',NULL,'Free','Economy'),('F001','07F',NULL,'Free','Economy'),('F001','08A',NULL,'Free','Economy'),('F001','08B',NULL,'Free','Economy'),('F001','08C',NULL,'Free','Economy'),('F001','08D',NULL,'Free','Economy'),('F001','08E',NULL,'Free','Economy'),('F001','08F',NULL,'Free','Economy'),('F001','09A',NULL,'Free','Economy'),('F001','09B',NULL,'Free','Economy'),('F001','09C',NULL,'Free','Economy'),('F001','09D',NULL,'Free','Economy'),('F001','09E',NULL,'Free','Economy'),('F001','09F',NULL,'Free','Economy'),('F001','10A',NULL,'Free','Economy'),('F001','10B',NULL,'Free','Economy'),('F001','10C',NULL,'Free','Economy'),('F001','10D',NULL,'Free','Economy'),('F001','10E',NULL,'Free','Economy'),('F001','10F',NULL,'Free','Economy'),('F005','01A',NULL,'Free','1st Class'),('F005','01B',NULL,'Free','1st Class'),('F005','01C',NULL,'Free','1st Class'),('F005','01D',NULL,'Free','1st Class'),('F005','01E',NULL,'Free','1st Class'),('F005','01F',NULL,'Free','1st Class'),('F005','02A',NULL,'Free','1st Class'),('F005','02B',NULL,'Free','1st Class'),('F005','02C',NULL,'Free','1st Class'),('F005','02D',NULL,'Free','1st Class'),('F005','02E',NULL,'Free','1st Class'),('F005','02F',NULL,'Free','1st Class'),('F005','03A',NULL,'Free','1st Class'),('F005','03B',NULL,'Free','1st Class'),('F005','03C',NULL,'Free','1st Class'),('F005','03D',NULL,'Free','1st Class'),('F005','03E',NULL,'Free','1st Class'),('F005','03F',NULL,'Free','1st Class'),('F005','04A',NULL,'Free','1st Class'),('F005','04B',NULL,'Free','1st Class'),('F005','04C',NULL,'Free','1st Class'),('F005','04D',NULL,'Free','1st Class'),('F005','04E',NULL,'Free','1st Class'),('F005','04F',NULL,'Free','1st Class'),('F005','05A',NULL,'Free','Economy'),('F005','05B',NULL,'Free','Economy'),('F005','05C',NULL,'Free','Economy'),('F005','05D',NULL,'Free','Economy'),('F005','05E',NULL,'Free','Economy'),('F005','05F',NULL,'Free','Economy'),('F005','06A',NULL,'Free','Economy'),('F005','06B',NULL,'Free','Economy'),('F005','06C',NULL,'Free','Economy'),('F005','06D',NULL,'Free','Economy'),('F005','06E',NULL,'Free','Economy'),('F005','06F',NULL,'Free','Economy'),('F005','07A',NULL,'Free','Economy'),('F005','07B',NULL,'Free','Economy'),('F005','07C',NULL,'Free','Economy'),('F005','07D',NULL,'Free','Economy'),('F005','07E',NULL,'Free','Economy'),('F005','07F',NULL,'Free','Economy'),('F005','08A',NULL,'Free','Economy'),('F005','08B',NULL,'Free','Economy'),('F005','08C',NULL,'Free','Economy'),('F005','08D',NULL,'Free','Economy'),('F005','08E',NULL,'Free','Economy'),('F005','08F',NULL,'Free','Economy'),('F005','09A',NULL,'Free','Economy'),('F005','09B',NULL,'Free','Economy'),('F005','09C',NULL,'Free','Economy'),('F005','09D',NULL,'Free','Economy'),('F005','09E',NULL,'Free','Economy'),('F005','09F',NULL,'Free','Economy'),('F005','10A',NULL,'Free','Economy'),('F005','10B',NULL,'Free','Economy'),('F005','10C',NULL,'Free','Economy'),('F005','10D',NULL,'Free','Economy'),('F005','10E',NULL,'Free','Economy'),('F005','10F',NULL,'Free','Economy'),('F095','01A',NULL,'Free','1st Class'),('F095','02A',NULL,'Free','1st Class'),('F095','03A',NULL,'Free','1st Class'),('F095','04A',NULL,'Free','1st Class');
/*!40000 ALTER TABLE `flight_seat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `packages`
--

DROP TABLE IF EXISTS `packages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `packages` (
  `packageId` int(11) NOT NULL AUTO_INCREMENT,
  `packageName` varchar(45) DEFAULT NULL,
  `tourLength` int(11) DEFAULT NULL,
  `packagePrice` double DEFAULT NULL,
  `hotelName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`packageId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `packages`
--

LOCK TABLES `packages` WRITE;
/*!40000 ALTER TABLE `packages` DISABLE KEYS */;
INSERT INTO `packages` VALUES (1,'Marvelous Malaysia',3,250,'Sheraton'),(2,'Safari Africa',14,500,'W'),(3,'Down Under',7,270,'Mariott'),(4,'Artistic Paris',7,260,'Sheraton'),(5,'Shopping in Milan',4,170,'Famous Hotel');
/*!40000 ALTER TABLE `packages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reservation` (
  `ticketId` int(11) NOT NULL AUTO_INCREMENT,
  `passportId` char(9) NOT NULL,
  `price` double NOT NULL,
  `flightId` char(4) DEFAULT NULL,
  `seatId` char(3) DEFAULT NULL,
  `issuedDate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ticketId`),
  KEY `fk1_ticket` (`passportId`),
  KEY `fk2_ticket` (`flightId`,`seatId`),
  CONSTRAINT `fk1_ticket` FOREIGN KEY (`passportId`) REFERENCES `customer` (`passportId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk2_ticket` FOREIGN KEY (`flightId`, `seatId`) REFERENCES `flight_seat` (`flightId`, `seatId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservation`
--

LOCK TABLES `reservation` WRITE;
/*!40000 ALTER TABLE `reservation` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaction`
--

DROP TABLE IF EXISTS `transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transaction` (
  `transactionId` char(10) NOT NULL,
  `customerId` char(5) NOT NULL,
  `transactionType` varchar(20) DEFAULT NULL,
  `amount` double NOT NULL,
  `transactionDateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`transactionId`,`customerId`),
  KEY `fk_customerId` (`customerId`),
  CONSTRAINT `fk_customerId` FOREIGN KEY (`customerId`) REFERENCES `customer` (`customerId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction`
--

LOCK TABLES `transaction` WRITE;
/*!40000 ALTER TABLE `transaction` DISABLE KEYS */;
/*!40000 ALTER TABLE `transaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `userId` char(5) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL,
  `phoneNo` char(10) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `admin` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('A001','Sameera','3232','0711234567','Sameera Madushan','sameera@gmai.com',1),('A002','Akhila','3240','0763323213','Akhila Heshan','akhila@gmail.com',1),('U001','Sapumal','1100','0771472583','Sapumal Kaluota','sapumal@gmai.com',0),('U002','Dinuka','1234','0730812948','Ranith Dinuka','ranith@gmail.com',0);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-04-04 10:18:59
