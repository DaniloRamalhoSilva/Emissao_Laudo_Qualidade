-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 15-Out-2020 às 16:30
-- Versão do servidor: 10.1.34-MariaDB
-- PHP Version: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bdlaudo`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `id_cli` int(11) NOT NULL,
  `nome_cli` varchar(45) NOT NULL,
  `cnpj_cli` varchar(45) DEFAULT NULL,
  `email_cli` varchar(45) DEFAULT NULL,
  `tel_cli` varchar(15) DEFAULT NULL,
  `cel_cli` varchar(15) DEFAULT NULL,
  `contato_cli` varchar(45) DEFAULT NULL,
  `obs_cli` varchar(45) DEFAULT NULL,
  `us_cli` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `moldes`
--

CREATE TABLE `moldes` (
  `id_mol` int(11) NOT NULL,
  `cod_mol` varchar(45) NOT NULL,
  `des_mol` varchar(45) NOT NULL,
  `pes_mol` decimal(4,0) NOT NULL,
  `tol_mol` varchar(10) NOT NULL,
  `adim` varchar(10) NOT NULL,
  `atol` varchar(10) NOT NULL,
  `bdim` varchar(10) NOT NULL,
  `btol` varchar(10) NOT NULL,
  `cdim` varchar(10) NOT NULL,
  `ctol` varchar(10) NOT NULL,
  `ddim` varchar(10) NOT NULL,
  `dtol` varchar(10) NOT NULL,
  `edim` varchar(10) NOT NULL,
  `etol` varchar(10) NOT NULL,
  `fdim` varchar(10) NOT NULL,
  `ftol` varchar(10) NOT NULL,
  `gdim` varchar(10) NOT NULL,
  `gtol` varchar(10) NOT NULL,
  `hdim` varchar(10) NOT NULL,
  `htol` varchar(10) NOT NULL,
  `idim` varchar(10) NOT NULL,
  `itol` varchar(10) NOT NULL,
  `jdim` varchar(10) NOT NULL,
  `jtol` varchar(10) NOT NULL,
  `kdim` varchar(10) NOT NULL,
  `ktol` varchar(10) NOT NULL,
  `capacidade_mol` varchar(10) DEFAULT NULL,
  `tolcapl_mol` varchar(10) DEFAULT NULL,
  `cami_mol` varchar(100) DEFAULT NULL,
  `ima_mol` blob,
  `obs_mol` varchar(45) DEFAULT NULL,
  `us_mol` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `id_us` int(11) NOT NULL,
  `nome_log` varchar(45) NOT NULL,
  `usuario_log` varchar(45) NOT NULL,
  `senha_log` varchar(45) NOT NULL,
  `permicao_log` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id_us`, `nome_log`, `usuario_log`, `senha_log`, `permicao_log`) VALUES
(17, 'Danilo', 'Dan', '1234', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cli`,`nome_cli`);

--
-- Indexes for table `moldes`
--
ALTER TABLE `moldes`
  ADD PRIMARY KEY (`id_mol`,`des_mol`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_us`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cli` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `moldes`
--
ALTER TABLE `moldes`
  MODIFY `id_mol` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_us` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
