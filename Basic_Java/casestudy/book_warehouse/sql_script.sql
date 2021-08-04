/* 
SQLyog v4.0
Host - localhost : Database - inventorydb
**************************************************************
Server version 5.0.19-nt
*/

create database if not exists `inventorydb`;

use `inventorydb`;

/*
Table structure for book
*/

drop table if exists `book`;
CREATE TABLE `book` (
  `bookId` int(11) NOT NULL,
  `title` text,
  `authors` text,
  `price` double default NULL,
  `stock` bigint(11) default NULL,
  PRIMARY KEY  (`bookId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*
Table data for inventorydb.book
*/

INSERT INTO `book` VALUES 
(1,'let us C','sam',140,23),
(4,'C++','stroustrup',876,247),
(23,'DotNet','[abc, xyz]',456,235),
(45,'hibernate','[a, c]',546,234),
(78,'spring','[jj, dd]',345,22);

/*
Table structure for dispatch
*/

drop table if exists `dispatch`;
CREATE TABLE `dispatch` (
  `dispatch_ref` int(11) NOT NULL auto_increment,
  `details` text,
  `date_of_dispatch` date default NULL,
  `bookId` int(11) default NULL,
  `qty` int(11) default NULL,
  PRIMARY KEY  (`dispatch_ref`),
  KEY `bookId` (`bookId`),
  CONSTRAINT `dispatch_ibfk_1` FOREIGN KEY (`bookId`) REFERENCES `book` (`bookId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*
Table data for inventorydb.dispatch
*/

