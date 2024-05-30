-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 30, 2024 at 01:50 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `liga`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbpenliga`
--

CREATE TABLE `tbpenliga` (
  `id_klub` int(3) NOT NULL,
  `nama_klub` varchar(25) NOT NULL,
  `kota` varchar(25) NOT NULL,
  `pelatih` varchar(25) NOT NULL,
  `liga` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbpenliga`
--

INSERT INTO `tbpenliga` (`id_klub`, `nama_klub`, `kota`, `pelatih`, `liga`) VALUES
(2, 'Persija', 'Jakarta', 'Alpi', 'Liga 1'),
(5, 'Skl fc', 'Samarinda', 'Idham Halid', 'Liga 1'),
(6, 'Wahau fc', 'Samarinda', 'Adi Hidayah', 'Liga 3'),
(7, 'solo fc', 'Solo', 'Adli Nur rahman', 'Liga 2');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbpenliga`
--
ALTER TABLE `tbpenliga`
  ADD PRIMARY KEY (`id_klub`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbpenliga`
--
ALTER TABLE `tbpenliga`
  MODIFY `id_klub` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
