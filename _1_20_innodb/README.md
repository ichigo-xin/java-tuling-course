innodb存储引擎



- undo log

- redo log

- bin log

流程为：

- 加载整页数据

- 写undo日志用于回滚

- 修改buffer pool里面的值

- 写redo log（写入缓冲区）

- redo日志写入磁盘

- 写binlog

- 在redolog写入commit标记
