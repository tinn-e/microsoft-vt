-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Июл 15 2013 г., 15:37
-- Версия сервера: 5.5.32
-- Версия PHP: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- База данных: `menudb`
--
CREATE DATABASE IF NOT EXISTS `menudb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `menudb`;

-- --------------------------------------------------------

--
-- Структура таблицы `categories`
--

DROP TABLE IF EXISTS `categories`;
CREATE TABLE IF NOT EXISTS `categories` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `categoryName` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=23 ;

--
-- Очистить таблицу перед добавлением данных `categories`
--

TRUNCATE TABLE `categories`;
--
-- Дамп данных таблицы `categories`
--

INSERT INTO `categories` (`id`, `categoryName`) VALUES
(18, 'Закуски'),
(19, 'Первые блюда'),
(20, 'Вторые блюда'),
(21, 'Десерты'),
(22, 'Выпечка');

-- --------------------------------------------------------

--
-- Структура таблицы `items`
--

DROP TABLE IF EXISTS `items`;
CREATE TABLE IF NOT EXISTS `items` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `prodTitle` varchar(70) DEFAULT NULL,
  `prodDesc` varchar(250) DEFAULT NULL,
  `prodCost` int(11) DEFAULT NULL,
  `prodCategory` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=88 ;

--
-- Очистить таблицу перед добавлением данных `items`
--

TRUNCATE TABLE `items`;
--
-- Дамп данных таблицы `items`
--

INSERT INTO `items` (`id`, `prodTitle`, `prodDesc`, `prodCost`, `prodCategory`) VALUES
(86, 'Суп гороховый', 'Вкусный', 100, 'Первые блюда'),
(87, 'ййй', 'ццц', 3333, 'Закуски');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
