-- --------------------------------------------------------------------------------
--
-- Execute this script before before run the app
-- Execute this script after executing script.sql 
-- Database: MySQL
-- 
-- Author: Loiane Groner
-- http://loianegroner.com (English)
-- http://loiane.com (Portuguese)
--
-- --------------------------------------------------------------------------------
USE `blog_ibatis`;
DROP procedure IF EXISTS `getTotalCity`;
DELIMITER $$
USE `blog_ibatis`$$
CREATE PROCEDURE `blog_ibatis`.`getTotalCity` (OUT total INTEGER)
BEGIN
    SELECT count(*) into total 
    FROM city;
END
$$
DELIMITER ;

-- --------------------------------------------------------------------------------

USE `blog_ibatis`;
DROP procedure IF EXISTS `getTotalCityStateId`;
DELIMITER $$
USE `blog_ibatis`$$
CREATE PROCEDURE `blog_ibatis`.`getTotalCityStateId` (IN stateId SMALLINT, OUT total INTEGER)
BEGIN
    SELECT count(*) into total 
    FROM city
    WHERE state_id = stateId;
END
$$
DELIMITER ;

-- --------------------------------------------------------------------------------

USE `blog_ibatis`;
DROP procedure IF EXISTS `getStates`;
DELIMITER $$
USE `blog_ibatis`$$
CREATE PROCEDURE `blog_ibatis`.`getStates` ()
BEGIN
    SELECT state_id, state_code, state_name
    FROM state;
END
$$
DELIMITER ;

