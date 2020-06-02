![image](https://user-images.githubusercontent.com/65771955/83579657-28d5ae00-a53a-11ea-9400-91865126161e.png)
![image](https://user-images.githubusercontent.com/65771955/83579659-2bd09e80-a53a-11ea-8935-3ee889dd58a2.png)
![image](https://user-images.githubusercontent.com/65771955/83579667-2ffcbc00-a53a-11ea-92c3-36fd5a2b677c.png)
![image](https://user-images.githubusercontent.com/65771955/83579673-3428d980-a53a-11ea-8c3b-ac4bc274c36a.png)
![image](https://user-images.githubusercontent.com/65771955/83579680-37bc6080-a53a-11ea-8e7b-7425de06f145.png)
/*
Navicat MySQL Data Transfer

Source Server         : SOTFWARE
Source Server Version : 100316
Source Host           : localhost:3306
Source Database       : bd_almacen

Target Server Type    : MYSQL
Target Server Version : 100316
File Encoding         : 65001

Date: 2020-06-03 01:36:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for productos
-- ----------------------------
DROP TABLE IF EXISTS `productos`;
CREATE TABLE `productos` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(250) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of productos
-- ----------------------------
INSERT INTO `productos` VALUES ('2', 'moto', '500');
INSERT INTO `productos` VALUES ('3', 'bicicleta', '400');
INSERT INTO `productos` VALUES ('4', 'licuadora', '700');
SET FOREIGN_KEY_CHECKS=1;
