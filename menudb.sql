-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Июл 24 2013 г., 07:55
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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=11 ;

--
-- Очистить таблицу перед добавлением данных `categories`
--

TRUNCATE TABLE `categories`;
--
-- Дамп данных таблицы `categories`
--

INSERT INTO `categories` (`id`, `categoryName`) VALUES
(1, 'Закуски'),
(2, 'Десерты'),
(3, 'Первые блюда'),
(4, 'qqqq'),
(5, 'ddd'),
(6, 'ссс'),
(7, 'ммм'),
(8, 'Кофе'),
(9, 'qqq'),
(10, 'смав');

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
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=23 ;

--
-- Очистить таблицу перед добавлением данных `items`
--

TRUNCATE TABLE `items`;
--
-- Дамп данных таблицы `items`
--

INSERT INTO `items` (`id`, `prodTitle`, `prodDesc`, `prodCost`, `prodCategory`) VALUES
(1, 'Суп', 'Вкусный', 90, 'Закуски'),
(2, 'Суп2', 'Вкусный2', 80, 'Закуски'),
(3, 'Шаурма', 'Офигенная', 200, 'Десерты'),
(11, 'cdfc', 'fr', 22, 'Закуски'),
(12, 'cdcd', 'cdfcd', 555, 'Десерты'),
(13, 'ввв', 'амаа', 555, 'Первые блюда'),
(14, 'aaa', 'aaa', 111, 'Закуски'),
(15, 'Шаурма2', 'Офигенная2', 202, 'Закуски'),
(16, 'ааа', 'ааа', 555, 'Закуски'),
(17, 'sww', 'cdd', 111, 'Закуски'),
(18, 'aaa', 'sss', 111, 'Закуски'),
(19, 'Кофе11', 'кофе22', 444, 'Кофе'),
(20, 'sss', 'ddd', 444, 'qqq'),
(21, 'сс', 'ввв', 333, 'Закуски'),
(22, 'qwww', 'sss', 22, 'Закуски');

-- --------------------------------------------------------

--
-- Структура таблицы `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(200) NOT NULL AUTO_INCREMENT,
  `login` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Очистить таблицу перед добавлением данных `users`
--

TRUNCATE TABLE `users`;
--
-- Дамп данных таблицы `users`
--

INSERT INTO `users` (`id`, `login`, `password`) VALUES
(1, 'user', '000000'),
(2, 'admin', '000000');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
