
获得当前问题的详情    /api/problem/getProblem
get
```json

request: {
  id:1  //题目id long
}


respone: {
  id:1      //long   题目id
  OJName: "hdu"  //string 所属OJ名字
  OJId:1    //long   OJid
  OJNo:2001    //long   OJ里面的题号
  name:"啦啦啦啦"   //string  题目名字
  typeName:"入门题"   //string 题目类型(算法入门)
  typeId:1     //long    题目类型id
  difficulty:2 //难度 10 int
  timeLimit:1000  // 时间上限 int
  memory: 128    // 内存上限 int
  description: "a+b" // 描述 string
  input:"a+b"      // 输入 string
  output:"sum"     // 输出 string
  exampleInpit:"1 2"   // 样例输入 string
  exampleOutput:"3"  // 样例输出 string
  Note:"你猜"           // 提示,注解等 string
  link:"hdu/asdf/1232"  // 题目超链接

}

```

获得当前问题的最佳代码     /api/problem/getBestCode
get
```json
requset: {
  id:0    //long
  type:["time","memory","length","special"] // 类型 time, memory, length,special
}

response: {
  id,   //long
  data:{
    [
      {
        type:"time" // string time , memory, length
        value:0  // 参数值 int
        id:101     // codeId long
        title:""   // 标题
      },
      {
        type:"length" // string time , memory, length
        value:100  // 参数值 int
        id:101     // codeId long
        title:""   // 标题
      },
      {
        type:"special" // string time , memory, length
        value:100  // 参数值 int
        id:101     // codeId long
        title:""   // 标题
      }
    ]
  }
}
```

获得当前问题的题解       /api/problem/getAnswer
get

```json
request: {
  id:0  //题目id long
  limit:10  // 上限,不带也可以,默认10条
}

response: {
[
  {
      id:101,    //题解id long
      authorName:"pyystone"    //作者名字 string
      authorId:123,        //作者id long
      title:"best a+b",    // 标题  string
      codeId:102,         //对应代码id long
      memory:128,         //内存 int
      time:0,             // 时间 int
      lastUpdateTime:"1506859010" // 题解上次更新时间  时间戳 long

  }
]

}
```

获得当前题目的特殊数据     /api/problem/getSpecialData


errorCode:

