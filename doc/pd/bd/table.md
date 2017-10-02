### 问题表
TABLE_PROBLEM

|字段|类型|描述|
|:---|:---|:---|
|id|int|id|
|ojid|int|OJID|
|no|int|题号|
|title|varchar|题目标题|
|types|int|题目所属算法ID|
|difficulty|int|难度(0-10)|
|timeLimit|int|时间上限|
|memory|int|内存上限|
|description|varchar|题目描述|
|input|varchar|输入描述|
|output|varchar|输出描述|
|exampleinput|varchar|输入样例|
|exampleoutput|varchar|输出样例|
|Note|varchar|题目注解|


### 代码表
TABLE_CODE

|字段|类型|描述|
|:---|:---|:---|
|id|int|id|
|time|int|消耗时间|
|memory|int|占用内存|
|answerid|int|对应题解id|
|authorid|int|作者id|
|ishot|int|是否是热门优秀代码|
|lastmodifytime|int|最近修改时间|
|code|varchar|代码|


### 题解表
TABLE_ANSWER

|字段|类型|描述| 
|:---|:---|:---| 
|id|int|id|
|codeid|int|对应题解id|
|title|varchar|标题|
|lastmodifytime|int|最近修改时间|
|description|varchar|题解内容|

### OJ列表
TABLE_OJ

|字段|类型|描述| 
|:---|:---|:---|
|id|int|id|
|name|varchar|oj名字|
|orderno|int|排序|


// 属于什么算法
TABLE_PROBLEMTYPE

|字段|类型|描述|
|:---|:---|:---|
|id|int|id|
|name|varchar|算法名字|
|orderno|int|排序|

