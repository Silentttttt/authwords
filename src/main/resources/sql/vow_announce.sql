/******************************************/
/*   数据库全名 = vow   */
/*   表名称 = vow_transaction   */
/******************************************/
CREATE TABLE `vow_transaction` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `transaction_hash` varchar(32) COMMENT 'transaction hash',
  `transaction_status` varchar(32) COMMENT '上链状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=`utf8` COMMENT='区块链信息表';
