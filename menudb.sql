-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Июл 11 2013 г., 21:46
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
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=76 ;

--
-- Дамп данных таблицы `items`
--

INSERT INTO `items` (`id`, `prodTitle`, `prodDesc`, `prodCost`, `prodCategory`) VALUES
(1, 'qqq', 'www', 111, 'Закуски'),
(2, 'борщ', 'вкусный', 444, 'Первые блюда');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
