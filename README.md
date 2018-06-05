### **1.1 集成**
#### **1.1.1 Eclipse集成**
* 1、下载suyuan.jar包。
* 2、在Eclipse中右键工程根目录，选择Properties —> Java Build Path —> Libraries，然后点击Add External JARs... 选择指向jar的路径，点击OK，即导入成功。（ADT17及以上不需要手动导入）。

#### **1.1.2 Android Studio集成**
* 1、下载suyuan.jar包，拷入到Android Studio的项目工程libs目录中。
* 2、右键Android Studio的项目工程—>选择Open Module Settings —>在 Project Structure弹出框中 —>选择 Dependencies选项卡 —>点击左下“＋”—>选择组件包类型—>引入相应的组件包。


###  **1.2 函数说明**
#### **1.2.1 物品原生赋码**

###### 请求参数及方法
``` 
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
###### 返回的业务数据说明
```
block_code  : 原生赋码
tid         : 商户系统中物品唯一标识
```
* **注意：**
* **1、物品条码、商户系统中物品唯一标识、物品名称、规格、纬度、经度六个参数不能为空，否则请求将报错。**
* **2、SuYuanNetCallbackListener的回调处理于子线程，注意线程调度。**

#### **1.2.2 物品数据上报**
###### 请求参数及方法
``` 
UploadParams uploadParams = new UploadParams.Builder()
                .setBlockCode("赋码")
                .setUploader("上传人")
                .setUploaderID("上传人id")
                .setStatus("状态码")
                .setNote("状态描述")
                .setLatitude("纬度")
                .setLongitude("经度")
                .setExt("扩展字段")
                .build();

SuYuanSDK.upload(uploadParams, new SuYuanNetCallbackListener() {
            @Override
            public void onFinish(String response) {

            }

            @Override
            public void onError(Exception e) {

            }
        });
```
###### 返回的业务数据说明
```
返回操作结果，无相关业务数据返回
```
* **注意：**
* **1、赋码、上传人、上传人ID、纬度、经度五个参数不能为空，否则请求将报错。**
* **2、SuYuanNetCallbackListener的回调处理于子线程，注意线程调度。**

#### **1.2.3 赋码物品打包**
###### 请求参数及方法
``` 
ToPackageParams toPackageParams = new ToPackageParams.Builder()
                .setBlockCode("填写赋码：在此赋码追加打包 为空:生成新的打包赋码")
                .setSn("物品条码(生成新的赋码需要填写)")
                .setTid("商户系统中物品唯一标识(生成新的赋码需要填写)")
                .setTitle("物品名称(生成新的赋码需要填写)")
                .setSku("物品规格型号(生成新的赋码需要填)")
                .setSubCodes("需要打包的赋码组")
                .setUploader("上传人")
                .setUploaderID("上传人id")
                .setStatus("状态码")
                .setNote("状态描述")
                .setLatitude("纬度")
                .setLongitude("经度")
                .setExt("扩展字段")
                .build();
                
SuYuanSDK.topackage(toPackageParams, new SuYuanNetCallbackListener() {
            @Override
            public void onFinish(String response) {
                
            }

            @Override
            public void onError(Exception e) {

            }
        });
``` 
###### 返回的业务数据说明
```
block_code  : 打包赋码
```
* **注意：**
* **1、参数BlockCode填写赋码即为在此赋码上追加打包，此时Sn物品条码、Tid商户物品标识、Title物品名称、Sku物品规格型号可不填写。**
* **2、参数BlockCode为空即为生成新的打包赋码，此时Sn物品条码、Tid商户物品标识、Title物品名称、Sku物品规格型号不能为空，否则请求报错**
* **3、需要打包的赋码组、上传人、上传人ID、纬度、经度五个参数不能为空，否则请求将报错。**
* **4、需要打包的赋码组传的是集合或数组的json字符串。**
* **5、SuYuanNetCallbackListener的回调处理于子线程，注意线程调度。**

#### **1.2.4 赋码物品分包**
###### 请求参数及方法
``` 
//分包结果的赋码信息
UnPackageParams.SubInfos subInfo = new UnPackageParams.SubInfos.Builder()
            	.setTitle("分包赋码标题")
        	.setSku("分包赋码规格")
        	.setlongitude("分包赋码经度)
        	.setLatitude("分包赋码纬度")
        	.setTid("分包赋码商户系统中物品唯一标识")
        	.setSn("分包赋码物品条码")
        	.build();

UnPackageParams unPackageParams = new UnPackageParams.Builder()
                .setBlockCode("需要分包的赋码")
                .setSubInfos("subInfo集合的json字符串")
                .setUploader("上传人")
                .setUploaderID("上传人id")
                .setStatus("状态码")
                .setNote("状态描述")
                .setLatitude("纬度")
                .setlongitude("经度")
                .setExt("扩展字段")
                .build();
                
SuYuanSDK.unpackage(unPackageParams, new SuYuanNetCallbackListener() {
            @Override
            public void onFinish(String response) {
                
            }

            @Override
            public void onError(Exception e) {

            }
        });
``` 
###### 返回的业务数据说明
```
block_code : 被拆包赋码
sub_code  :  拆包后的赋码
```
* **注意：**
* **1、subInfo的Title分包赋码标题、Sku分包赋码规格、Tid分包赋码商户系统中物品唯一标识、Sn分包赋码物品条码、经度、纬度不能为空。**
* **2、UnPackageParams的BlockCode分包的赋码、分包结果的赋码组、上传人、上传人ID、纬度、经度六个参数不能为空，否则请求将报错。**
* **3、分包结果的赋码组传的是subInfo的集合或数组json字符串。**
* **4、SuYuanNetCallbackListener的回调处理于子线程，注意线程调度。**

#### **1.2.5 物品流转信息查询**
###### 请求参数及方法
``` 
TracequeryParams tracequeryParams = new TracequeryParams.Builder()
                .setBlockCode("赋码")
                .build();
                
SuYuanSDK.tracequery(tracequeryParams, new SuYuanNetCallbackListener() {
            @Override
            public void onFinish(String response) {

            }

            @Override
            public void onError(Exception e) {

            }
        });
``` 
###### 返回的业务数据说明
```
block_code  : 物品赋码
uploader    : 数据上报人信息
uploader_id : 物数据上报人在商户系统中的ID
status      : 物品在商户系统的状态标识
note        : 物品当前状态的描述信息
latitude    : 纬度
longitude   : 经度
ext_info    : 扩展字段
type        : 类型： 1 打包  2 拆分 3 转化 4 孳息 5 位置流转
created_at  : 创建时间
```
* **注意：**
* **1、赋码不能为空，否则请求将报错。**
* **2、SuYuanNetCallbackListener的回调处理于子线程，注意线程调度。**

#### **1.2.6 物品信息查询**
###### 请求参数及方法
``` 
CodequeryParams codequeryParams = new CodequeryParams.Builder()
                .setBlockCode("赋码")
                .build();
                
SuYuanSDK.codequery(codequeryParams, new SuYuanNetCallbackListener() {
            @Override
            public void onFinish(final String response) {
               
            }

            @Override
            public void onError(Exception e) {

            }
        });
``` 
###### 返回的业务数据说明
```
sn         : 物品条码
block_code : 赋码
tid        : 商户系统中物品唯一标识
title      : 物品名称
alias      : 物品别名
sku        : 物品规格
block_hash : 区块哈希
wtx_hash   : 交易hash
latitude   : 纬度
longitude  : 经度
ext_info   : 扩展信息
type       : 赋码类型
```
* **注意：**
* **1、赋码不能为空，否则请求将报错。**
* **2、SuYuanNetCallbackListener的回调处理于子线程，注意线程调度。**

#### **1.2.7 赋码检查**
###### 请求参数及方法
``` 
CheckCodeParams checkCodeParams = new CheckCodeParams.Builder()
                .setBlockCode("赋码")
                .build();
                
SuYuanSDK.checkcode(checkCodeParams, new SuYuanNetCallbackListener() {
            @Override
            public void onFinish(String response) {
                
            }

            @Override
            public void onError(Exception e) {

            }
        });
``` 
###### 返回的业务数据说明
```
返回操作结果，无相关业务数据返回
```
* **注意：**
* **1、赋码不能为空，否则请求将报错。**
* **2、SuYuanNetCallbackListener的回调处理于子线程，注意线程调度。**

### **1.3 全局返回码说明**
``` 
如：{"ret"0,"msg":"success","data"{"blockid":"01","rfid":"01","name":"益链科技"}}
ret：状态 
     0: 请求成功
     30001:必选参数不能为空
     30002:数据格式错误
     30003:用户请求过于频繁
     30004:赋码不存在
     30005:商品不存在
     30006:区块对象不存在
     30007:拆分数量错误
     30008:赋码不是聚合码
     30009:聚合子赋码格式错误
     300010:聚合子赋码错误
     50001:系统繁忙,请稍后再试
     50002:系统维护中
     50003:系统错误
msg：附加消息
data：数据内容
``` 
### **1.4 应用于Android平台相关**
#### **1.4.1 添加相关权限**
``` 
<!-- 必须的权限 -->
<uses-permission android:name="android.permission.INTERNET" />
``` 
#### **1.4.2 代码混淆**
``` 
代码已开源，未进行混淆，如需要， 请添加
-keep class cn.qhyl.suyuan.**
``` 




