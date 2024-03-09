# 

- jmap查看堆内存的情况

- jvisualvm直接用工具查看

- jstack查看线程情况

- jstat可以查看gc使用情况

- jinfo输出信息



根据gc信息推算出jvm内存模型，以及对象产生的情况，之后再根据对象进入老年代的机制来判断，从而进行调优



- 大对象直接进入老年代

- gc年龄到了进入老年代

- 动态年龄判断机制

- 老年代空间分配担保机制
  
      

young gc 和 full gc都会有stw，但是young gc的stw时间比较短。
