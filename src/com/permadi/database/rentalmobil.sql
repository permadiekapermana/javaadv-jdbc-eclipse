-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 29, 2021 at 08:49 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 5.6.39

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rentalmobil`
--

-- --------------------------------------------------------

--
-- Table structure for table `tabel_mobil`
--

CREATE TABLE `tabel_mobil` (
  `id_mobil` varchar(8) NOT NULL,
  `no_plat` varchar(8) NOT NULL,
  `jenis_mobil` varchar(50) NOT NULL,
  `merk` varchar(50) NOT NULL,
  `tahun_buat` varchar(4) NOT NULL,
  `warna` varchar(25) NOT NULL,
  `harga` varchar(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tabel_mobil`
--

INSERT INTO `tabel_mobil` (`id_mobil`, `no_plat`, `jenis_mobil`, `merk`, `tahun_buat`, `warna`, `harga`) VALUES
('MOB001', 'E 4444 J', 'Mobil Pribadi', 'Avanza', '2018', 'Putih', '100000');

-- --------------------------------------------------------

--
-- Table structure for table `tabel_pelanggan`
--

CREATE TABLE `tabel_pelanggan` (
  `id_pelanggan` varchar(8) NOT NULL,
  `nama_pelanggan` varchar(50) NOT NULL,
  `alamat_pelanggan` varchar(50) NOT NULL,
  `telp_pelanggan` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tabel_pelanggan`
--

INSERT INTO `tabel_pelanggan` (`id_pelanggan`, `nama_pelanggan`, `alamat_pelanggan`, `telp_pelanggan`) VALUES
('P001', 'Permadi EP', 'Cirebon', '089660771166');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tabel_mobil`
--
ALTER TABLE `tabel_mobil`
  ADD PRIMARY KEY (`id_mobil`);

--
-- Indexes for table `tabel_pelanggan`
--
ALTER TABLE `tabel_pelanggan`
  ADD PRIMARY KEY (`id_pelanggan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
