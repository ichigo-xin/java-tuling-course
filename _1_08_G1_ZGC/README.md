# G1

- 内部是分 region的，有E,S,O,H

- 有个优先列表，优先回收有价值的区域

- 每个region是动态变化的，E区经过回收可能变成O区

- 能设置停顿时间，每次回收会预估停顿时间可以回收多大的区域



# ZGC
