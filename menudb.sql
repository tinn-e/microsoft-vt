-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Июл 06 2013 г., 21:50
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
-- Структура таблицы `items`
--

CREATE TABLE IF NOT EXISTS `items` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `prodTitle` varchar(70) DEFAULT NULL,
  `prodDesc` varchar(250) DEFAULT NULL,
  `prodCost` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=95 ;

--
-- Дамп данных таблицы `items`
--

INSERT INTO `items` (`id`, `prodTitle`, `prodDesc`, `prodCost`) VALUES
(89, 'Кукуруза', 'Вкусная', 200),
(90, 'Фасоль', 'огородная', 500),
(92, 'Шон швайне рулька(от макса оливера)', 'Только тот, кто занимался приготовлением рульки, может представить какой стоял аромат на кухне. Это же с ума сойти можно!', 44445),
(93, 'Фарита с курицей', 'Острое .. мексиканское блюдо)))Вы можете приготовить сами... Для любителей остренького)))', 777),
(94, 'Приветууу', 'ййккк', 12355);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
