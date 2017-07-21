create database dibai charset utf8;
use dibai;
create table t_user(
	f_id bigint unsigned not null primary key,
	f_name varchar(20) not null default '' comment '姓名', 
	f_identify_code char(4) not null default '' comment '最新有效验证码',
	f_id_number char(18) not null default '' unique comment '身份证',
	f_mobile char(11) not null default '' unique comment '最新手机号',
	f_invitation_code char(6) not null default '' comment '注册时输入的邀请码',
	f_register_time datetime not null default current_timestamp comment '手机验证时间',
	f_auth_time datetime not null default '0000-00-00 00:00:00' comment '身份证验证时间',
	f_auth_status tinyint unsigned not null default 0 comment '认证状态0手机认证,1身份证验证,2缴纳押金,3完成认证',
	f_use_status tinyint unsigned not null default 0 comment '使用状态0未使用1正在使用',
	f_use_count int unsigned not null default 0 comment '骑行次数',
	f_balance int not null default 0 comment '余额，单位分',
	f_discount_coupon int unsigned not null default 0 comment '有效折扣券数量',
	f_credit int unsigned not null default 100 comment '信誉积分',
	f_gender tinyint unsigned not null dafault 0 comment '性别 0男 1女',
	f_deposit int unsigned not null default 0 comment '押金，单位分',
	f_pay_channel tinyint unsigned not null default 0 comment '支付渠道0支付宝1微信2银联',
	index idx_register_time(f_register_time),
	index idx_auth_time(f_auth_time),
	index idx_balance(f_balance)
);

create table t_sms_identify(
	f_id bigint unsigned not null primary key,
	f_to char(11) not null default '' comment '发送者手机号',
	f_app_id char(32) not null default '' comment '短信运营商appId',
	f_identify_code char(4) not null default '' comment '验证码',
	f_template_id varchar(10) not null default '' comment '短信模板ID',
	f_datas varchar(70) not null default '' comment '模板占位符数据',
	f_create_time datetime not null default current_timestamp comment '记录构建时间',
	f_date_created datetime not null default '0000-00-00 00:00:00' comment '短信运营商返回的短信创建时间',
	f_sms_message_sid char(32) not null default '' unique comment '短信唯一标示，运营商返回',
	f_status_code char(6) not null default '' comment '状态码,运营商返回',
	f_status tinyint not null default 0 comment '短信状态0调用发送接口,1返回状态码非000000,2已成功发送，不代表到达,3返回内容与预期不符,4返回dateCreated格式错误,5已送达,6丢失',
	f_query_status_code char(6) not null default '' comment '状态报告请求的状态码，000000成功，112356短信已发出但未收到回执请稍后查询，112351短信状态不存在',
	f_receiver char(11) not null default '' comment '接收短信的手机号码',
	f_send_status char(1) not null default '' comment '通道发送状态，0成功1失败',
	f_send_time char(19) not null default '' comment '发送时间',
	f_deliver_status char(0) not null default '' comment '到达状态，即运营商网关返回的手机接收报告。送达结果：0成功1失败',
	f_receive_time char(19) not null default '' comment '状态报告时间，即运营商网关返回的手机接收报告时间',
	index idx_to_identify_code(f_to,f_identify_code),
	index idx_create_time(f_create_time),
	index idx_date_created(f_date_created)
);

create table t_sms_template(
	f_id bigint unsigned not null primary key,
	f_product_type char(1) not null default '',
	f_addr varchar(255) not null default '',
	f_title varchar(50) not null default '',
	f_signature varchar(50) not null default '',
	f_template_content varchar(70) not null default '',
	f_status_code char(6) not null default '',
	f_template_id varchar(10) not null default '',
	f_create_time datetime not null default current_timestamp,
	f_response_time datetime not null default '0000-00-00 00:00:00',
	f_status tinyint not null default 0,
	index idx_title(f_title),
	index idx_create_time(f_create_time),
	index idx_response_time(f_response_time)
);

create table f_deposit_record(
	f_id bigint unsigned not null primary key,
	f_user_id bigint unsigned not null default 0 comment '用户ID',
	f_trade_type tinyint unsigned not null default 0 comment '交易类型0充值 1退款',
	f_pay_channel tinyint unsigned not null default 0 comment '押金渠道0支付宝1微信2银联',
	f_amount int unsigned not null default 0 comment '押金或退款，单位分',
	f_trade_type tinyint unsigned not null default 0 comment '交易状态0创建1进行中2成功3失败',
	f_account_id varchar(50) not null default '' comment '客户交易账号',
	f_trade_instruction char(28) not null default '' unique comment '交易流水号',
	f_create_time datetime not null default current_timestamp comment '交易开始时间',
	f_end_time datetime not null default '0000-00-00 00:00:00' comment '交易关闭时间',
	index idx_user_id(f_user_id),
	index idx_end_time(f_end_time),
);














