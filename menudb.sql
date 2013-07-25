-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Июл 24 2013 г., 21:11
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
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- Очистить таблицу перед добавлением данных `categories`
--

TRUNCATE TABLE `categories`;
--
-- Дамп данных таблицы `categories`
--

INSERT INTO `categories` (`id`, `categoryName`) VALUES
(1, 'Закуски'),
(2, 'Первые блюда'),
(3, 'Вторые блюда'),
(4, 'Выпечка'),
(5, 'Напитки'),
(6, 'Десерты');

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
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=12 ;

--
-- Очистить таблицу перед добавлением данных `items`
--

TRUNCATE TABLE `items`;
--
-- Дамп данных таблицы `items`
--

INSERT INTO `items` (`id`, `prodTitle`, `prodDesc`, `prodCost`, `prodCategory`) VALUES
(1, 'Ложная икорка', 'По вкусу очень напоминает красную икру, всегда идет на ура! Попробуйте и убедитесь сами.', 200, 'Закуски'),
(2, 'Закусочный рулет "Тяп-ляп" ', 'Очень вкусный, красивый и необычный рулетик. Всегда привлекает внимание, исчезает в самом начале застолья. ', 250, 'Закуски'),
(3, 'Блиц-рецепт "Хачапури" ', 'Настоятельно рекомендую попробовать. Заходите, угощайтесь, пожалуйста. ', 150, 'Закуски'),
(4, 'Шуба в шубке', 'Попробуйте и убедитесь сами - это очень красиво, вкусно и несложно в приготовлении. ', 200, 'Закуски'),
(5, 'Щи с грибами в горшочках', 'Ароматные, наваристые щи, да в горшочке под румяной хлебной крышечкой - так уютно... ', 200, 'Первые блюда'),
(6, 'Щи из свежей капусты ', 'Тем более что готовятся они быстро и это лeгкий(в плане калорийности)суп, а в тeплое время года хочется именно таких блюд. ', 150, 'Первые блюда'),
(7, 'Украинский борщ с пампушками ', 'Насыщенный цвет и вкус. К этому борщику ещe чeрный хлебушек, чесночок и ложечку сметаны. М-м-м вкусно. ', 200, 'Первые блюда'),
(8, 'Самый красный борщ', ' Борщ цветом становился похож на щи, а я - от стыда за очередной провал, – на борщ (правильный, красный :)', 170, 'Первые блюда'),
(9, 'Окрошка на кефире ', 'Эта окрошка хорошо разнообразила наше меню холодных супов в прошлое знойное лето.', 130, 'Первые блюда');

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
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Очистить таблицу перед добавлением данных `users`
--

TRUNCATE TABLE `users`;
--
-- Дамп данных таблицы `users`
--

INSERT INTO `users` (`id`, `login`, `password`) VALUES
(1, 'user', '000000'),
(3, 'admin', '000000');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
