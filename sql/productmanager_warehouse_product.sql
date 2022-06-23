
DROP TABLE IF EXISTS `warehouse_product`;
CREATE TABLE `warehouse_product` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `expired_date` datetime(6) DEFAULT NULL,
  `inventory` bigint DEFAULT NULL,
  `start_date` datetime(6) DEFAULT NULL,
  `total_export` bigint DEFAULT NULL,
  `total_import` bigint DEFAULT NULL,
  `product_entity_id` bigint DEFAULT NULL,
  `product_id` bigint DEFAULT NULL,
  `warehouse_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK8hh903x81vcetwuilralg8s9e` (`product_entity_id`),
  KEY `FK1hxh0sjd8id2bstss4tmyufd6` (`product_id`),
  KEY `FK2m5r3qy83vqcqlkgr6n815mcn` (`warehouse_id`),
  CONSTRAINT `FK1hxh0sjd8id2bstss4tmyufd6` FOREIGN KEY (`product_id`) REFERENCES `province` (`id`),
  CONSTRAINT `FK2m5r3qy83vqcqlkgr6n815mcn` FOREIGN KEY (`warehouse_id`) REFERENCES `warehouse` (`id`),
  CONSTRAINT `FK8hh903x81vcetwuilralg8s9e` FOREIGN KEY (`product_entity_id`) REFERENCES `product` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;