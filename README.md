# 溯源API Java Library

## 概述

这是 溯API接口封装好的JAVA SDK，助力业务方快速实现与区块链的标准接口的最终对接，具体实现了赋码、打包、拆分、数据上传、数据查询等功能：

* 赋码：将物品数据对象化、结构化后存储到区块链中，生成全球唯一的对象码，使用该码可在区块链浏览器中查询对象信息（业务数据需要业务方授权才能开放），以实现数据真实无篡改。

* 打包：将多个对象码（子码）组装生成新的物品在区块链中生成新的对象码，这样就构成了一个新的追溯对象（父码），子码会继承父码的流转状态

* 拆分：在对象完成流转后，如需分流，可将对象进行拆分，拆分后的对象将不在继承原有对象的流转状态。

* 数据上传：对象在每一次流转（权益流转、位置空间流转等）中的数据都能沉淀到区块链上，用以溯源查询使用。


### 导入本项目

* 可以采用 git clone http://git.ngochain.cn/thingschained/sy-java-sdk 命令下载源码
* 采用eclipse导入下载的源码工程，推荐采用maven的方式，方便依赖包的管理
* 采用IntelliJ IDE导入时，example无法作为主程序入口时，选中example文件→右击→Mark Directory as→Sources Root,然后再通过edit configuration设置启动入口。

### 构建本项目

可以用 Eclipse 类 IDE 导出 jar 包。建议直接使用 maven，执行命令：

maven package

## 使用样例

> 详细请参考[溯源 javaSDK文档](http://git.ngochain.cn/thingschained/sy-java-sdk/wikis/home)

```
//物品原生赋码
AssigncodeParams assigncodeParams = new AssigncodeParams.Builder()
            .setSn("物品条码")
            .setTID("商户系统中物品唯一标识")
            .setTitle("物品名称")
            .setAlias("物品别名")
            .setUnspsc("物品邓白氏编码")
            .setBrandName("品牌名称")
            .setSku("物品规格型号")
            .setLatitude("纬度")
            .setLongitude("经度")
            .setExt("扩展字段")
            .build();

SuYuanSDK.assigncode(assigncodeParams, new SuYuanNetCallbackListener() {
        @Override
        public void onFinish(String response) {

        }

        @Override
        public void onError(Exception e) {

        }
    });
```

