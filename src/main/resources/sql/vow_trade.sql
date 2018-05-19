/******************************************/
/*   数据库全名 = vow   */
/*   表名称 = vow_trade   */
/******************************************/
CREATE TABLE `vow_trade` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `order_no` varchar(32) NOT NULL COMMENT '订单编号',
  `trade_channel` varchar(32) COMMENT '交易渠道，ALIPAY WETCHAT',
  `trade_no` varchar(32) COMMENT '交易编号',
  `trade_status` varchar(32) COMMENT '交易状态',
  `trade_create_time` datetime COMMENT '交易创建时间',
  `trade_pay_time` varchar(32) COMMENT '交易支付时间',
  `trade_close_time` varchar(32) COMMENT '交易关闭时间',
  `trade_expire_time` varchar(32) COMMENT '交易过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=`utf8` COMMENT='交易信息表';
