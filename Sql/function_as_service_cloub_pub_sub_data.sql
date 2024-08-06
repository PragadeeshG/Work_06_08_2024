create table if not exists function_as_service_cloub_pub_sub_data(
pub_sub_code varchar(255) not null,
pub_sub_name varchar(255) null,
local_function varchar(255) null,
trade_function varchar(255) null,
short_description varchar(255) null,
multi_cloub_pub_sub_option varchar(255) null,
pub_sub_conditions varchar(255) null,
upload_version Integer null,
launch_function varchar(255) null,
manager_function varchar(255) null,
status varchar(255) null,
constraint function_as_service_cloub_pub_sub_data_pk primary key(pub_sub_code));