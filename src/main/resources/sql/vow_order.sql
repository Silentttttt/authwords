/******************************************/
/*   数据库全名 = vow   */
/*   表名称 = vow_order   */
/******************************************/
CREATE TABLE `vow_order` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `order_no` varchar(32) NOT NULL COMMENT '订单编号',
  `order_time` datetime NOT NULL COMMENT '下单时间',
  `user_no` varchar(32) NOT NULL COMMENT '用户编号',
  `vow` varchar(32) COMMENT '誓言',
  `block_chain_type` varchar(32) COMMENT '区块链类型,BTC ETH',
  `status` varchar(32) COMMENT '订单状态',
  `del_flag` varchar(32) COMMENT '删除标记',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_order_no` (`order_no`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=`utf8` COMMENT='订单信息表';
