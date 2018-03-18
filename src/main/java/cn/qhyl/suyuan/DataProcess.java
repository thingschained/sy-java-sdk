package cn.qhyl.suyuan;

import cn.qhyl.suyuan.http.SuYuanApi;
import cn.qhyl.suyuan.http.SuYuanNet;
import cn.qhyl.suyuan.http.SuYuanNetCallbackListener;
import cn.qhyl.suyuan.params.Params;

/**
 * Description: 业务接口封装
 * <p>
 * review by
 * <p>
 * author: Vincent_Ge
 * version: 1.0
 * created at: 2017/10/19
 */

public class DataProcess {

    private static DataProcess mDataProcess;

    private DataProcess() {
    }

    public static DataProcess getInstance() {
        if (mDataProcess == null) {
            synchronized (DataProcess.class) {
                if (mDataProcess == null) {
                    mDataProcess = new DataProcess();
                }
            }
        }
        return mDataProcess;
    }


    /**
     * 上报
     *
     * @param params 上报参数
     * @param SuYuanNetCallback 网络接口回调
     */
    public void upload(Params params, SuYuanNetCallbackListener SuYuanNetCallback) {
        SuYuanNet.doPut(SuYuanApi.report, SuYuanNetCallback, params.toMap());
    }

    /**
     * 赋码
     *
     * @param params 赋码参数
     * @param SuYuanNetCallback 网络接口回调
     */
    public void assigncode(Params params, SuYuanNetCallbackListener SuYuanNetCallback) {
        SuYuanNet.doPost(SuYuanApi.assigncode, SuYuanNetCallback, params.toMap());
    }

    /**
     * 打包
     *
     * @param params 打包参数
     * @param SuYuanNetCallback 网络接口回调
     */
    public void topackage(Params params, SuYuanNetCallbackListener SuYuanNetCallback) {
        SuYuanNet.doPost(SuYuanApi.topackage, SuYuanNetCallback, params.toMap());
    }

    /**
     * 分包
     *
     * @param params 分包参数
     * @param SuYuanNetCallback 网络接口回调
     */
    public void unpackage(Params params, SuYuanNetCallbackListener SuYuanNetCallback) {
        SuYuanNet.doPost(SuYuanApi.unpackage, SuYuanNetCallback, params.toMap());
    }

    /**
     * 流转
     *
     * @param params 流转参数
     * @param SuYuanNetCallback 网络接口回调
     */
    public void tracequery(Params params, SuYuanNetCallbackListener SuYuanNetCallback) {
        SuYuanNet.doGet(SuYuanApi.tracequery, SuYuanNetCallback, params.toMap());
    }

    /**
     * 查看商品详情
     *
     * @param params 查看商品详情参数
     * @param SuYuanNetCallback 网络接口回调
     */
    public void codequery(Params params, SuYuanNetCallbackListener SuYuanNetCallback) {
        SuYuanNet.doGet(SuYuanApi.codequery, SuYuanNetCallback, params.toMap());
    }

    /**
     * 检查赋码
     *
     * @param params 检查赋码参数
     * @param SuYuanNetCallback 网络接口回调
     */
    public void checkcode(Params params, SuYuanNetCallbackListener SuYuanNetCallback) {
        SuYuanNet.doGet(SuYuanApi.checkcode, SuYuanNetCallback, params.toMap());
    }
    
}
