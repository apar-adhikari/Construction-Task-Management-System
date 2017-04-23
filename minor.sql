-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 23, 2017 at 04:23 AM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `minor`
--

-- --------------------------------------------------------

--
-- Table structure for table `manpower`
--

CREATE TABLE IF NOT EXISTS `manpower` (
`m_id` int(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `a_name` varchar(255) NOT NULL,
  `contact` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `date` varchar(100) NOT NULL,
  `m_type` varchar(255) NOT NULL,
  `m_no` varchar(255) NOT NULL,
  `p_amount` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `manpower`
--

INSERT INTO `manpower` (`m_id`, `username`, `a_name`, `contact`, `address`, `date`, `m_type`, `m_no`, `p_amount`) VALUES
(1, 'bkas', 'apar', '9876543217', 'koteshwor', '2016-6-30', 'skilled', '2', '1000000'),
(2, 'bibek49', '', '', '', '2016-6-30', '', '', ''),
(3, 'bkas', 'yubraj', '999999999', 'koteshwor', '2016-8-8', 'skilled', '1', '10000'),
(4, 'bkas', 'kamal', '666666666', 'narefat', '2016-8-8', 'semi skilled', '2', '50000'),
(5, 'samu', 'bibek', '9856745123', 'birghung', '2016-8-25', 'semi skilled', '3', '30000');

-- --------------------------------------------------------

--
-- Table structure for table `material`
--

CREATE TABLE IF NOT EXISTS `material` (
`s_id` int(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `s_name` varchar(255) NOT NULL,
  `contact` varchar(500) NOT NULL,
  `address` varchar(255) NOT NULL,
  `date` varchar(100) NOT NULL,
  `m_purchase` varchar(255) NOT NULL,
  `qty_unit` varchar(255) NOT NULL,
  `rate` varchar(255) NOT NULL,
  `cost` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `material`
--

INSERT INTO `material` (`s_id`, `username`, `s_name`, `contact`, `address`, `date`, `m_purchase`, `qty_unit`, `rate`, `cost`) VALUES
(1, 'bkas', 'sflkhalhskh', '9999999999', 'fhajshfhjh', '2016-6-29', 'kdshkafkhf', '8998', '98-98', '9890'),
(2, 'bkas', 'sflkhalhskh', '9999999999', 'fhajshfhjh', '2016-6-29', 'kdshkafkhf', '8998', '98-98', '9890'),
(3, 'suv', 'sflkhalhskh', '9999999999', 'fhajshfhjh', '2016-6-29', 'kdshkafkhf', '8998', '98-98', '9890'),
(4, 'bkas', 'sflkhalhskh', '9999999999', 'fhajshfhjh', '2016-6-29', 'kdshkafkhf', '8998', '98-98', '9890'),
(5, 'bkas', 'sflkhalhskh', '9999999999', 'fhajshfhjh', '2016-6-29', 'kdshkafkhf', '8998', '98-98', '9890'),
(6, 'bkas', 'sflkhalhskh', '9999999999', 'fhajshfhjh', '2016-6-29', 'kdshkafkhf', '8998', '98-98', '9890'),
(7, 'bkas', 'sflkhalhskh', '9999999999', 'fhajshfhjh', '2016-6-29', 'kdshkafkhf', '8998', '98-98', '9890'),
(8, 'bkas', 'sflkhalhskh', '9999999999', 'fhajshfhjh', '2016-6-29', 'kdshkafkhf', '8998', '98-98', '9890'),
(9, 'suv', 'sflkhalhskh', '9999999999', 'fhajshfhjh', '2016-6-29', 'kdshkafkhf', '8998', '98-98', '9890'),
(10, 'suv', 'sflkhalhskh', '9999999999', 'fhajshfhjh', '2016-6-29', 'kdshkafkhf', '8998', '98-98', '9890'),
(13, 'bkas', 'sflkhalhskh', '9999999999', 'fhajshfhjh', '2016-6-30', 'kdshkafkhf', '8998', '98-98', '9890'),
(14, 'bkas', 'sflkhalhskh', '9999999999', 'fhajshfhjh', '2016-6-30', 'kdshkafkhf', '8998', '98-98', '9890'),
(15, 'bkas', 'sflkhalhskh', '9999999999', 'fhajshfhjh', '2016-6-30', 'kdshkafkhf', '8998', '98-98', '9890'),
(16, 'bkas', 'sflkhalhskh', '9999999999', 'fhajshfhjh', '2016-6-30', 'kdshkafkhf', '8998', '98-98', '9890'),
(17, 'bibek49', 'sflkhalhskh', '9999999999', 'fhajshfhjh', '2016-6-30', 'kdshkafkhf', '8998', '98-98', '9890'),
(18, 'bkas', 'sflkhalhskh', '9999999999', 'fhajshfhjh', '2016-8-5', 'kdshkafkhf', '8998', '98-98', '9890'),
(19, 'bkas', 'sflkhalhskh', '9999999999', 'fhajshfhjh', '2016-8-5', 'kdshkafkhf', '8998', '98-98', '9890'),
(20, 'bkas', 'sflkhalhskh', '9999999999', 'fhajshfhjh', '2016-8-8', 'kdshkafkhf', '8998', '98-98', '9890'),
(21, 'bkas', 'sflkhalhskh', '9999999999', 'fhajshfhjh', '2016-8-8', 'kdshkafkhf', '8998', '98-98', '9890'),
(22, 'bkas', 'sflkhalhskh', '9999999999', 'fhajshfhjh', '2016-8-8', 'kdshkafkhf', '8998', '98-98', '9890'),
(23, 'g10', 'bikash', '9999999999', 'fhajshfhjh', '2016-8-9', 'kdshkafkhf', '8998', '98-98', '9890'),
(30, 'g10', 'jyoti', '9999999999', 'fhajshfhjh', '2016-8-9', 'kdshkafkhf', '8998', '98-98', '9890'),
(31, 'bkas', 'sflkhalhskh', '9999999999', 'fhajshfhjh', '2016-8-9', 'kdshkafkhf', '8998', '98-98', '9890'),
(32, 'bkas', 'sflkhalhskh', '9999999999', 'fhajshfhjh', '2016-8-9', 'kdshkafkhf', '8998', '98-98', '9890'),
(36, 'bkas', 'suveksha regmi', '980432267', 'itahari', '2016-8-9', 'paints', '6 bucket', '1000', '6000'),
(38, 'samu', 'jiten', '98765543', 'shankhamul', '2016-8-24', 'cement', '5 bags', '10000', '2500'),
(39, 'samu', 'vikash', '9856734521', 'itahari', '2016-8-25', 'cement', '5 bags', '1000', '30000'),
(40, 'samu', 'biru', '987654', 'janakpur', '2016-8-25', 'Asian Paints', '2 bucket', '1500', '3000'),
(43, 'samu', 'ram kumar hari sharma', '8888888', 'hfkjashjhfkjahsdkhf', '2016-8-25', 'JHSDFJKHASKHDFKH', '5 BUCKET', '10000', '50000'),
(44, 'SAMU', 'mahes karki', '987654332', 'pakali', '2016-8-25', 'Asian paints', '2 bucket ', '1000', '2000');

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE IF NOT EXISTS `register` (
`rid` int(255) NOT NULL,
  `firstname` varchar(256) NOT NULL,
  `lastname` varchar(256) NOT NULL,
  `username` varchar(256) NOT NULL,
  `password` varchar(256) NOT NULL,
  `Gender` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`rid`, `firstname`, `lastname`, `username`, `password`, `Gender`) VALUES
(10, 'bikash', 'ghimirey', 'bkas', 'sasuke81', 'male'),
(11, 'suveksha', 'regmi', 'suv', 'kabuto81', 'female'),
(12, 'apar', 'adhikari', 'apar123', 'hcoe12', 'male'),
(14, 'bibu', 'subedi', 'nephop', 'hello12', 'male'),
(15, 'mahesh', 'karki', 'mahes12', 'karki', 'male'),
(18, 'bbbbb', 'aaaaaa', 'new', 'kajs;fj', 'female'),
(19, 'afk;jak;j', 'ja;ljf;lj', 'brandnew', 'a;lsjf', 'male'),
(20, 'gggg', 'gghgh', 'bikash 123', 'kkkk', 'male'),
(21, 'biru', 'maka', 'maka123', 'manu', 'male'),
(22, 'biiiiiiiiikkkkkkkkkaaa', 'ghhhhhhhhhiiiiiimmmmmmmm', 'hkshipfhihaiofh', 'hshfiphiapf', 'male'),
(23, 'abiral', 'baral', 'abi123', 'goforit', 'male'),
(24, 'anil', 'shrestha', 'anil123', 'bct123', 'male'),
(25, 'bibek', 'subedi', 'bibek49', 'nephop', 'male'),
(26, 'bikash', 'ghimirey', 'bikash12', 'hello12', 'male'),
(27, '', '', '', '', 'male'),
(28, 'manoj', 'khadka', 'manoj55', 'hello', 'male'),
(29, 'jiten', 'basnet', 'g10', 'hello', 'male'),
(30, 'apil', 'lama', 'a10', 'hello', 'male'),
(31, 'Yubraj', 'Ghimirey', 'y10', 'HELLO', 'male'),
(32, 'Apar', 'Adhikari', 'apar1', 'hello', 'male'),
(33, 'bikash', 'ghimirey', 'newpob', 'hello', 'male'),
(34, 'kishan', 'kumar', 'kishan12', 'bkas12', 'male'),
(35, 'jitesh', 'khulal', 'jitu', 'samel', 'male'),
(36, 'samel', 'pandey', 'samu', '4deb099a4b27fe891e7350714f072ce6', 'male'),
(37, 'poja', 'rai', 'p00za', '83095472701439b64ddbe145bf4d34ed', 'female'),
(38, 'Apar', 'Adhikari', 'apar12', 'ff61446c855fd4a46a78e2a4036ef5cb', 'male'),
(39, 'rojan', 'baral', 'roj12', '2b8d239958ac9ed647baec3f288f59ca', 'male'),
(40, 'bikash', 'ghimirey', 'nimu12', '45f1a4b4a2f6bdfa31838a823064389f', 'male');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `manpower`
--
ALTER TABLE `manpower`
 ADD PRIMARY KEY (`m_id`);

--
-- Indexes for table `material`
--
ALTER TABLE `material`
 ADD PRIMARY KEY (`s_id`);

--
-- Indexes for table `register`
--
ALTER TABLE `register`
 ADD PRIMARY KEY (`rid`), ADD UNIQUE KEY `username` (`username`), ADD KEY `username_2` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `manpower`
--
ALTER TABLE `manpower`
MODIFY `m_id` int(255) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `material`
--
ALTER TABLE `material`
MODIFY `s_id` int(255) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=45;
--
-- AUTO_INCREMENT for table `register`
--
ALTER TABLE `register`
MODIFY `rid` int(255) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=41;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
