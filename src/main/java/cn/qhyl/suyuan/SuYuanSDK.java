package cn.qhyl.suyuan;

import cn.qhyl.suyuan.http.SuYuanNetCallbackListener;
import cn.qhyl.suyuan.params.AssigncodeParams;
import cn.qhyl.suyuan.params.CheckCodeParams;
import cn.qhyl.suyuan.params.CodequeryParams;
import cn.qhyl.suyuan.params.ToPackageParams;
import cn.qhyl.suyuan.params.TracequeryParams;
import cn.qhyl.suyuan.params.UnPackageParams;
import cn.qhyl.suyuan.params.UploadParams;

/**
 * Description:溯源SDK
 * <p>
 * review by
 * <p>
 * author: Vincent_Ge
 * version: 1.0
 * created at: 2017/10/19
 */

public class SuYuanSDK {

    /**
     * 上报
     *
     * @param params 上报参数
     * @param SuYuanNetCallback 网络接口回调
     */
    public static void upload(UploadParams params, SuYuanNetCallbackListener SuYuanNetCallback) {
        DataProcess.getInstance().upload(params, SuYuanNetCallback);
    }

    /**
     * 赋码
     *
     * @param params 赋码参数
     * @param SuYuanNetCallback 网络接口回调
     */
    public static void assigncode(AssigncodeParams params, SuYuanNetCallbackListener SuYuanNetCallback) {
        DataProcess.getInstance().assigncode(params, SuYuanNetCallback);
    }

    /**
     * 打包
     *
     * @param params 打包参数
     * @param SuYuanNetCallback 网络接口回调
     */
    public static void topackage(ToPackageParams params, SuYuanNetCallbackListener SuYuanNetCallback) {
        DataProcess.getInstance().topackage(params, SuYuanNetCallback);

    }

    /**
     * 分包
     *
     * @param params 分包参数
     * @param SuYuanNetCallback 网络接口回调
     */
    public static void unpackage(UnPackageParams params, SuYuanNetCallbackListener SuYuanNetCallback) {
        DataProcess.getInstance().unpackage(params, SuYuanNetCallback);
    }

    /**
     * 流转
     *
     * @param params 流转参数
     * @param SuYuanNetCallback 网络接口回调
     */
    public static void tracequery(TracequeryParams params, SuYuanNetCallbackListener SuYuanNetCallback) {
        DataProcess.getInstance().tracequery(params, SuYuanNetCallback);
    }

    /**
     * 查看商品详情
     *
     * @param params 查看商品详情参数
     * @param SuYuanNetCallback 网络接口回调
     */
    public static void codequery(CodequeryParams params, SuYuanNetCallbackListener SuYuanNetCallback) {
        DataProcess.getInstance().codequery(params, SuYuanNetCallback);
    }

    /**
     * 检查赋码
     *
     * @param params 检查赋码参数
     * @param SuYuanNetCallback 网络接口回调
     */
    public static void checkcode(CheckCodeParams params, SuYuanNetCallbackListener SuYuanNetCallback) {
        DataProcess.getInstance().checkcode(params, SuYuanNetCallback);
    }

}
