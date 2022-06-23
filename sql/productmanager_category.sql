
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `status` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
