/api/answer/getAnswer
get


/api/answer/createAnswer
post
```json
request: {
  codeId:123, //题目id long
  title:"a+b",    // 标题 string
  description:""         // 题解内容
}

response: {
  code:0,
  error:""
}
```

/api/answer/updateAnswer
post

```json
request: {
  answerId:123, //题解id long
  title:"a+b",    // 标题 string
  description:""         // 题解内容
}

response: {
  code:0,
  error:""
}

```



errorCode:
