/api/code/getCode
get

```json
request: {
  codeId:0 //long
}

response: {
  codeId:0 //long
  memory:0 //内存占用 int
  time:0   //时间消耗 int
  answerId:0 //对应题解id long
  authorId:0 //作者id long
  authorName:"pyystone", //作者名字
  code:""    //代码 String
}
```

/api/code/createCode
post
```json
request: {
  problemId:123, //题目id long
  time:0,         // 消耗时间 long
  memory:0,       // 占用内存 long
  title:"a+b",    // 标题 string
  isSpecial:0     // 是否是特殊代码 特殊解法  0 否 1是 int
  code:""         // 代码 string
}
```

/api/code/updateCode
post

```json
request: {
  codeId:123, //题目id long
  time:0,         // 消耗时间 long
  memory:0,       // 占用内存 long
  title:"a+b",    // 标题 string
  isSpecial:0     // 是否是特殊代码 特殊解法  0 否 1是 int
  code:""         // 代码 string
}

```



errorCode:
