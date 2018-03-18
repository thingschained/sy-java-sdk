package cn.qhyl.example;

import cn.qhyl.suyuan.SuYuanSDK;
import cn.qhyl.suyuan.http.SuYuanNetCallbackListener;
import cn.qhyl.suyuan.params.AssigncodeParams;
import cn.qhyl.suyuan.params.CheckCodeParams;
import cn.qhyl.suyuan.params.CodequeryParams;
import cn.qhyl.suyuan.params.ToPackageParams;
import cn.qhyl.suyuan.params.TracequeryParams;
import cn.qhyl.suyuan.params.UnPackageParams;
import cn.qhyl.suyuan.params.UploadParams;

public class SuyuanSample {

    public static void main(String[] args) {

    	/** ----------------------------赋码----------------------------- **/
        AssigncodeParams assigncodeParams = new AssigncodeParams
                .Builder()
                .setSn("001")
                .setTID("001")
                .setTitle("益链")
                .setAlias("qhyl")
                .setUnspsc("10001")
                .setBrandName("星辰益链")
                .setSku("盒")
                .setLatitude("31.223082")
                .setLongitude("121.632616")
                .setExt("30")
                .build();

        SuYuanSDK.assigncode(assigncodeParams, new SuYuanNetCallbackListener() {
            @Override
            public void onFinish(String response) {
                System.out.println(response);
            }

            @Override
            public void onError(Exception e) {
                System.out.println(e.getMessage());
            }
        });

        /** ----------------------------上报----------------------------- **/
        UploadParams uploadParams = new UploadParams
                .Builder()
                .setBlockCode("10001")
                .setUploader("益链")
                .setUploaderID("qhyl")
                .setStatus("1")
                .setNote("上海")
                .setLatitude("31.223082")
                .setLongitude("121.632616")
                .setExt("20")
                .build();

        SuYuanSDK.upload(uploadParams, new SuYuanNetCallbackListener() {
            @Override
            public void onFinish(String response) {
                System.out.println(response);
            }

            @Override
            public void onError(Exception e) {
                System.out.println(e.getMessage());
            }
        });

        /** ----------------------------查看商品详情----------------------------- **/
        CodequeryParams codequeryParams = new CodequeryParams
                .Builder()
                .setBlockCode("002")
                .build();

        SuYuanSDK.codequery(codequeryParams, new SuYuanNetCallbackListener() {

            @Override
            public void onFinish(String response) {
                System.out.println(response);
            }

            @Override
            public void onError(Exception e) {
                System.out.println(e.getMessage());
            }
        });

        /** ----------------------------流转----------------------------- **/
        TracequeryParams tracequeryParams = new TracequeryParams
                .Builder()
                .setBlockCode("002")
                .build();

        SuYuanSDK.tracequery(tracequeryParams, new SuYuanNetCallbackListener() {
            @Override
            public void onFinish(String response) {
                System.out.println(response);
            }

            @Override
            public void onError(Exception e) {
                System.out.println(e.getMessage());
            }
        });

        /** ----------------------------检查赋码----------------------------- **/
        CheckCodeParams checkCodeParams = new CheckCodeParams
                .Builder()
                .setBlockCode("002")
                .build();

        SuYuanSDK.checkcode(checkCodeParams, new SuYuanNetCallbackListener() {
            @Override
            public void onFinish(String response) {
                System.out.println(response);
            }

            @Override
            public void onError(Exception e) {
                System.out.println(e.getMessage());
            }
        });

        /** ----------------------------打包----------------------------- **/
        ToPackageParams toPackageParams = new ToPackageParams
                .Builder()
                .setBlockCode("002")
                .setSubCodes("[\"10001\",\"10002\"]")
                .setUploader("益链")
                .setUploaderID("qhyl")
                .setStatus("1")
                .setNote("上海")
                .setLatitude("31.223082")
                .setLongitude("121.632616")
                .setExt("30")
                .setSn("003")
                .setTid("004")
                .setTitle("益链")
                .setSku("盒")
                .build();

        SuYuanSDK.topackage(toPackageParams, new SuYuanNetCallbackListener() {
            @Override
            public void onFinish(String response) {
                System.out.println(response);
            }

            @Override
            public void onError(Exception e) {
                System.out.println(e.getMessage());
            }
        });

        /** ----------------------------分包----------------------------- **/
        UnPackageParams unPackageParams = new UnPackageParams
                .Builder()
                .setBlockCode("002")
                .setSubInfo("[\"10001\",\"10002\"]")
                .setUploader("益链")
                .setUploaderID("qhyl")
                .setStatus("1")
                .setNote("上海")
                .setLatitude("31.223082")
                .setlongitude("121.632616")
                .setExt("30")
                .build();

        SuYuanSDK.unpackage(unPackageParams, new SuYuanNetCallbackListener() {
            @Override
            public void onFinish(String response) {
                System.out.println(response);
            }

            @Override
            public void onError(Exception e) {
                System.out.println(e.getMessage());
            }
        });
    }
}
