create table if not exists cloub_pub_sub_pricing(
pub_sub_code Integer not null,
pricing_console_code Integer null,
scalable_character varchar(255) null,
cloud_scheduler varchar(255) null,
console_tools varchar(255) null,
no_of_topics varchar(255) null,
api_gateway_enabled char null,
total_lambdas varchar(255) null,
no_of_subscribers varchar(255) null,
memory varchar(255) null,
cpus varchar(255) null,
gpus varchar(255) null,
cron_job_option varchar(255) null,
global_infra_support varchar(255) null,
constraint cloub_pub_sub_pricing_pk primary key(pub_sub_code));