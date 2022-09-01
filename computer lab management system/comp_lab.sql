/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50508
Source Host           : localhost:3306
Source Database       : comp_lab

Target Server Type    : MYSQL
Target Server Version : 50508
File Encoding         : 65001

Date: 2021-10-22 15:20:33
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `tbl_activity`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_activity`;
CREATE TABLE `tbl_activity` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `lno` varchar(20) NOT NULL,
  `ccode` varchar(20) NOT NULL,
  `sem` int(11) DEFAULT NULL,
  `dtls` varchar(50) NOT NULL,
  `dte` date NOT NULL,
  `laid` int(11) DEFAULT NULL,
  `tym` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_activity
-- ----------------------------
INSERT INTO `tbl_activity` VALUES ('1', 'L50', 'BCA', '6', 'Java programming', '2021-04-13', '1', null);
INSERT INTO `tbl_activity` VALUES ('2', 'L50', 'BCA', '1', 'ert', '2021-10-21', '1', null);
INSERT INTO `tbl_activity` VALUES ('3', 'L50', 'BCA', '1', 'asdf', '2021-10-21', '1', '12:50:06 AM');
INSERT INTO `tbl_activity` VALUES ('4', 'L50', 'BCA', '1', 'dsfsdf', '2021-10-22', '1', '03:16:19 PM');

-- ----------------------------
-- Table structure for `tbl_activityc`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_activityc`;
CREATE TABLE `tbl_activityc` (
  `acid` int(11) NOT NULL AUTO_INCREMENT,
  `aid` int(11) NOT NULL,
  `stid` int(11) NOT NULL,
  `sno` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`acid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_activityc
-- ----------------------------
INSERT INTO `tbl_activityc` VALUES ('1', '1', '1', 'L501');
INSERT INTO `tbl_activityc` VALUES ('2', '1', '2', 'L502');
INSERT INTO `tbl_activityc` VALUES ('3', '1', '4', 'L503');
INSERT INTO `tbl_activityc` VALUES ('4', '4', '8976543', 'L501');
INSERT INTO `tbl_activityc` VALUES ('5', '4', '8976544', 'L501');
INSERT INTO `tbl_activityc` VALUES ('6', '4', '8976545', 'L501');

-- ----------------------------
-- Table structure for `tbl_course`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_course`;
CREATE TABLE `tbl_course` (
  `ccode` varchar(20) NOT NULL,
  `cname` varchar(100) NOT NULL,
  `nos` int(11) NOT NULL,
  `dname` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ccode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_course
-- ----------------------------
INSERT INTO `tbl_course` VALUES ('BCA', 'Bachelor of Computer Application', '6', 'Computer Science');

-- ----------------------------
-- Table structure for `tbl_lab`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_lab`;
CREATE TABLE `tbl_lab` (
  `lno` varchar(20) NOT NULL,
  `nos` int(11) NOT NULL,
  `fno` int(11) NOT NULL,
  `dtls` varchar(500) NOT NULL,
  `status` varchar(20) NOT NULL,
  PRIMARY KEY (`lno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_lab
-- ----------------------------
INSERT INTO `tbl_lab` VALUES ('L50', '25', '2', 'System Lab', 'working');
INSERT INTO `tbl_lab` VALUES ('L55', '30', '3', 'Anmimation Lab', 'working');

-- ----------------------------
-- Table structure for `tbl_labassistant`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_labassistant`;
CREATE TABLE `tbl_labassistant` (
  `laid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `adr` varchar(100) NOT NULL,
  `phn` varchar(20) NOT NULL,
  `em` varchar(50) NOT NULL,
  `gen` varchar(20) NOT NULL,
  PRIMARY KEY (`laid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_labassistant
-- ----------------------------
INSERT INTO `tbl_labassistant` VALUES ('1', 'Asha', 'KOchi', '9876543212', 'asha@gmail.com', 'F');
INSERT INTO `tbl_labassistant` VALUES ('2', 'Arun', 'KOchi', '8765987654', 'arun@gmail.com', 'M');

-- ----------------------------
-- Table structure for `tbl_login`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_login`;
CREATE TABLE `tbl_login` (
  `uid` int(11) NOT NULL,
  `uname` varchar(20) NOT NULL,
  `upass` varchar(20) NOT NULL,
  `utype` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_login
-- ----------------------------
INSERT INTO `tbl_login` VALUES ('0', 'admin', 'admin', 'admin');
INSERT INTO `tbl_login` VALUES ('1', 'asha@gmail.com', 'asha', 'labassistant');
INSERT INTO `tbl_login` VALUES ('2', 'arun@gmail.com', 'arun', 'labassistant');

-- ----------------------------
-- Table structure for `tbl_student`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_student`;
CREATE TABLE `tbl_student` (
  `uregno` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `ccode` varchar(20) NOT NULL,
  `sem` varchar(20) NOT NULL,
  `gen` varchar(20) NOT NULL,
  PRIMARY KEY (`uregno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_student
-- ----------------------------
INSERT INTO `tbl_student` VALUES ('8976543', 'Anna', 'BCA', '6', 'F');
INSERT INTO `tbl_student` VALUES ('8976544', 'Vishnu', 'BCA', '6', 'M');
INSERT INTO `tbl_student` VALUES ('8976545', 'Sarath', 'BCA', '6', 'M');
INSERT INTO `tbl_student` VALUES ('8976546', 'Anjana', 'BCA', '6', 'F');

-- ----------------------------
-- Table structure for `tbl_system`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_system`;
CREATE TABLE `tbl_system` (
  `lno` varchar(20) NOT NULL,
  `sno` varchar(20) NOT NULL,
  `inst` varchar(6000) NOT NULL,
  `dtls` varchar(6000) NOT NULL,
  `status` varchar(20) NOT NULL,
  PRIMARY KEY (`sno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_system
-- ----------------------------
INSERT INTO `tbl_system` VALUES ('L50', 'L501', 'Turbo C++, jdk,python,netbeans,word,', 'Ssytem programming lab', 'working');
INSERT INTO `tbl_system` VALUES ('L50', 'L502', 'Turbo C++, jdk,python,netbeans,word,', 'nIL', 'working');
INSERT INTO `tbl_system` VALUES ('L50', 'L503', 'Turbo C++, jdk,python,netbeans,word,', 'nIL', 'working');
