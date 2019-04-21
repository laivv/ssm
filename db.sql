
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8 NOT NULL,
  `content` text CHARACTER SET utf8 NOT NULL,
  `category_id` tinyint(3) NOT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime DEFAULT NULL,
  `delete_date` datetime DEFAULT NULL,
  `create_user` smallint(5) unsigned NOT NULL,
  `visit_count` mediumint(8) unsigned NOT NULL DEFAULT '0',
  `comment_state` tinyint(1) unsigned NOT NULL DEFAULT '1',
  `state` tinyint(1) unsigned NOT NULL DEFAULT '1',
  `permission` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `reminder` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `reminder_key` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` tinyint(3) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) CHARACTER SET utf8 NOT NULL,
  `email` varchar(40) CHARACTER SET utf8 DEFAULT NULL,
  `content` varchar(1000) CHARACTER SET utf8 NOT NULL,
  `create_date` datetime NOT NULL,
  `ipv4` varchar(15) CHARACTER SET utf8 NOT NULL DEFAULT '000.000.000.000',
  `article_id` smallint(5) unsigned NOT NULL,
  `parent_id` smallint(5) unsigned DEFAULT NULL,
  `user_type` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `state` tinyint(1) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) CHARACTER SET utf8 NOT NULL,
  `content` varchar(1000) CHARACTER SET utf8 NOT NULL,
  `ipv4` varchar(15) CHARACTER SET utf8 NOT NULL DEFAULT '000.000.000.000',
  `email` varchar(40) CHARACTER SET utf8 DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `user_type` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `state` tinyint(1) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for search
-- ----------------------------
DROP TABLE IF EXISTS `search`;
CREATE TABLE `search` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 NOT NULL,
  `count` smallint(5) unsigned NOT NULL,
  `create_date` datetime NOT NULL,
  `last_search_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `account` varchar(20) CHARACTER SET utf8 NOT NULL,
  `password` varchar(40) CHARACTER SET utf8 NOT NULL,
  `alias` varchar(20) CHARACTER SET utf8 NOT NULL,
  `email` varchar(40) CHARACTER SET utf8 DEFAULT NULL,
  `type` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `state` tinyint(1) unsigned NOT NULL DEFAULT '1',
  `create_date` datetime NOT NULL,
  `last_login_date` datetime DEFAULT NULL,
  `curr_login_date` datetime DEFAULT NULL,
  `login_count` int(10) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
