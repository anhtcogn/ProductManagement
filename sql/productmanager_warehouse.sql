
DROP TABLE IF EXISTS `warehouse`;
CREATE TABLE `warehouse` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `status` int DEFAULT NULL,
  `district_id` bigint DEFAULT NULL,
  `province_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKn9j18l8syelgwi3ikkrcx5ptx` (`district_id`),
  KEY `FKnmlr470o06hws9ayhkjl5yo2t` (`province_id`),
  CONSTRAINT `FKn9j18l8syelgwi3ikkrcx5ptx` FOREIGN KEY (`district_id`) REFERENCES `district` (`id`),
  CONSTRAINT `FKnmlr470o06hws9ayhkjl5yo2t` FOREIGN KEY (`province_id`) REFERENCES `province` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;