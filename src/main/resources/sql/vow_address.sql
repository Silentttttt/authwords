/******************************************/
/*   数据库全名 = vow   */
/*   表名称 = vow_address   */
/******************************************/
CREATE TABLE `vow_address` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `user_no` varchar(32) COMMENT '用户编号',
  `country_code` varchar(32) COMMENT 'country_code',
  `province_code` varchar(32) COMMENT 'province_code',
  `city_code` varchar(32) COMMENT 'city_code',
  `district_code` varchar(32) COMMENT 'district_code',
  `address` varchar(32) COMMENT 'address',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=`utf8` COMMENT='地址信息表';
