/******************************************/
/*   数据库全名 = vow   */
/*   表名称 = vow_user   */
/******************************************/
CREATE TABLE `vow_user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `login_name` varchar(32) NOT NULL COMMENT '登陆名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `user_no` varchar(32) NOT NULL COMMENT '用户编号',
  `nick_name` varchar(32) COMMENT '昵称',
  `phone` varchar(32) COMMENT '电话',
  `email` varchar(32) COMMENT 'email',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_user_no` (`user_no`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=`utf8` COMMENT='用户信息表';
