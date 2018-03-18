package cn.qhyl.suyuan.http;

/**
 * HttpURLConnection网络请求返回监听器
 */
public interface SuYuanNetCallbackListener {
	
	/**
     * 网络请求完成回调方法
     * @param response 响应的数据
     */
    void onFinish(String response);

    /**
     * 网络请求异常回调方法
     * @param e 请求异常
     */
    void onError(Exception e);
}
