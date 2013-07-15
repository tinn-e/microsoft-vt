-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Июл 14 2013 г., 21:05
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

CREATE TABLE IF NOT EXISTS `categories` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `categoryName` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

--
-- Дамп данных таблицы `categories`
--

INSERT INTO `categories` (`id`, `categoryName`) VALUES
(1, 'Закуски'),
(2, 'Салаты'),
(3, 'Первые блюда'),
(4, 'Вторые блюда'),
(5, 'Выпечка');

-- --------------------------------------------------------

--
-- Структура таблицы `items`
--

CREATE TABLE IF NOT EXISTS `items` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `prodTitle` varchar(70) DEFAULT NULL,
  `prodDesc` varchar(250) DEFAULT NULL,
  `prodCost` int(11) DEFAULT NULL,
  `prodCategory` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=116 ;

--
-- Дамп данных таблицы `items`
--

INSERT INTO `items` (`id`, `prodTitle`, `prodDesc`, `prodCost`, `prodCategory`) VALUES
(82, 'Цезарь', 'Салатный', 120, 'Салаты'),
(83, 'Селедочка', 'под водочку', 120, 'Закуски'),
(84, 'Пицца', 'иатешевская', 25, 'Выпечка'),
(86, 'Сухарики', 'Солененькие', 40, 'Закуски'),
(87, 'qqq', 'www', 222, 'Вторые блюда'),
(88, 'qwe', 'refre', 111, 'Закуски'),
(89, 'qwe', 'ewew', 22, 'Закуски'),
(90, 'qqq', 'ww', 111, 'Закуски'),
(91, 'qqqqq', 'wwww', 1233, 'Закуски'),
(92, 'a', 'ss', 33, 'Закуски'),
(93, 'qvcv', 'vvv', 655, 'Закуски'),
(94, 'ddd', 'fff', 555, 'Выпечка'),
(95, 'qq', 'ww', 33, 'Закуски'),
(96, 'q', 'w', 2, 'Закуски'),
(97, 'q', 'w', 2, 'Закуски'),
(98, 'q', 'w', 2, 'Закуски'),
(99, 'qq', 'w', 3, 'Закуски'),
(100, 'w', 'e', 3, 'Закуски'),
(101, 'q', 'w', 11, 'Закуски'),
(102, 'qww', 'qwq', 3333, 'Закуски'),
(103, 'ww', 'ee', 3, 'Закуски'),
(104, 'ww', 'ee', 3, 'Закуски'),
(105, 'ww', 'ee', 3, 'Закуски'),
(106, 'ww', 'ee', 3, 'Закуски'),
(107, 'ww', 'ee', 3, 'Закуски'),
(108, 'ww', 'ee', 3, 'Закуски'),
(109, 'ww', 'ee', 3, 'Закуски'),
(110, 'ww', 'ee', 3, 'Закуски'),
(111, 'ww', 'ee', 3, 'Закуски'),
(112, 'ww', 'ee', 3, 'Закуски'),
(113, 'ww', 'ee', 3, 'Закуски'),
(114, 'ww', 'ee', 3, 'Закуски'),
(115, 'ww', 'ee', 3, 'Закуски');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

