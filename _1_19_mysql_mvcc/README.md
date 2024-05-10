# mysql的mvcc

- mvcc的机制就是通过read-view机制与undo版本链对比机制，使得不同的事务根本版本链对比规则，读取同一版本链上的不同版本数据
