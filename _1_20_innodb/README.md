innodb存储引擎

- undo log：事务回滚用到

- redo log：数据库宕机的数据恢复

- bin log：主从复制，删除数据的恢复

流程为：

- 加载整页数据

- 写undo日志用于回滚

- 修改buffer pool里面的值

- 写redo log（写入缓冲区）

- redo日志写入磁盘

- 写binlog

- 在redolog写入commit标记
