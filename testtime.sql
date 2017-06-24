/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.42 : Database - testtime
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`testtime` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `testtime`;

/*Table structure for table `testtime` */

DROP TABLE IF EXISTS `testtime`;

CREATE TABLE `testtime` (
  `datetest` date DEFAULT NULL,
  `datetimetest` datetime DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `testtime` */

insert  into `testtime`(`datetest`,`datetimetest`,`id`) values ('2017-06-20','2017-06-23 16:24:42',1),('2017-06-24','2017-06-23 13:20:13',2),('2012-02-05','1995-03-19 00:02:05',3);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
