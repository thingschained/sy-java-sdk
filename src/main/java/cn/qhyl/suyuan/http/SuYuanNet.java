package cn.qhyl.suyuan.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import cn.qhyl.suyuan.utils.Contants;


/**
 *  HttpURLConnection 网络请求工具类
 */
public class SuYuanNet {

    static ExecutorService threadPool = Executors.newCachedThreadPool();
    
    /**
     * GET方法 返回数据会解析成字符串String
     * @param urlString 请求的路径
     * @param listener  回调监听
     * @param params 参数列表
     */
    public static void doGet(final String urlString, final SuYuanNetCallbackListener listener, final Map<String, String> params) {
        
        final StringBuffer out = processParams(params);
        // 因为网络请求是耗时操作，所以需要另外开启一个线程来执行该任务。
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                URL url;
                HttpURLConnection httpURLConnection = null;
                try {
                    // 根据URL地址创建URL对象
                    url = new URL(urlString+"?"+out);
                    // 获取HttpURLConnection对象
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                    // 设置请求方式，默认为GET
                    httpURLConnection.setRequestMethod(Contants.REQUEST_TYPE_GET);
                    // 设置连接超时
                    httpURLConnection.setConnectTimeout(Contants.CONNECTTIMEOUT);
                    // 设置读取超时
                    httpURLConnection.setReadTimeout(Contants.READTIMEOUT);
                    // 响应码为200表示成功，否则失败。
                    if ( httpURLConnection.getResponseCode() == Contants.RESPONSE200 ) {
                        // 获取网络的输入流
                        InputStream is = httpURLConnection.getInputStream();
                        BufferedReader bf = new BufferedReader(new InputStreamReader(is, Contants.ENCODE_TYPE));
                        //最好在将字节流转换为字符流的时候 进行转码
                        StringBuffer buffer = new StringBuffer();
                        String line = "";
                        while ( (line = bf.readLine()) != null ) {
                            buffer.append(line);
                        }
                        bf.close();
                        is.close();
                        if (listener!=null){
                            listener.onFinish(buffer.toString());
                        }
                    } else {
                        requestError(new Exception(Contants.RESPONSE_ERR_CODE+":" + httpURLConnection.getResponseCode()),listener);
                    }
                } catch ( MalformedURLException e ) {
                    if ( listener != null ) {
                        requestError(e,listener);
                    }
                } catch ( IOException e ) {
                    if ( listener != null ) {
                        requestError(e,listener);
                    }
                } finally {
                    if ( httpURLConnection != null ) {
                        // 最后记得关闭连接
                        httpURLConnection.disconnect();
                    }
                }
            }
        });
    }


    /**
     * POST方法 返回数据会解析成字符串 String
     * @param urlString 请求的路径
     * @param listener  回调监听
     * @param params 参数列表
     */
    public static void doPost(final String urlString, final SuYuanNetCallbackListener listener,
                              final Map<String, String> params) {
        final StringBuffer out = processParams(params);
        // 因为网络请求是耗时操作，所以需要另外开启一个线程来执行该任务。
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                URL url;
                HttpURLConnection httpURLConnection = null;
                try {
                    url = new URL(urlString);
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setRequestProperty("accept", "*/*");
                    httpURLConnection.setRequestProperty("connection", "Keep-Alive");
                    httpURLConnection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
                    httpURLConnection.setRequestMethod(Contants.REQUEST_TYPE_POST);

                    httpURLConnection.setConnectTimeout(Contants.CONNECTTIMEOUT);
                    httpURLConnection.setReadTimeout(Contants.READTIMEOUT);

                    // 设置运行输入
                    httpURLConnection.setDoInput(true);
                    // 设置运行输出
                    httpURLConnection.setDoOutput(true);
                    
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(out.toString().getBytes());
                    outputStream.flush();
                    outputStream.close();

                    if (httpURLConnection.getResponseCode() == Contants.RESPONSE200 ) {
                        // 获取网络的输入流
                        InputStream is = httpURLConnection.getInputStream();
                        BufferedReader bf = new BufferedReader(new InputStreamReader(is, Contants.ENCODE_TYPE));
                        //最好在将字节流转换为字符流的时候 进行转码
                        StringBuffer buffer = new StringBuffer();
                        String line = "";
                        while ( (line = bf.readLine()) != null ) {
                            buffer.append(line);
                        }
                        bf.close();
                        is.close();
                        if (listener!=null){
                            listener.onFinish(buffer.toString());
                        }
                    } else {
                        requestError(new Exception(Contants.RESPONSE_ERR_CODE+":" + httpURLConnection.getResponseCode()),listener);
                    }
                } catch ( MalformedURLException e ) {
                    requestError(e,listener);
                } catch ( IOException e ) {
                    requestError(e,listener);
                } catch (Exception e){
                    e.printStackTrace();
                }finally {
                    if ( httpURLConnection != null ) {
                        // 最后记得关闭连接
                        httpURLConnection.disconnect();
                    }
                }
            }
        });
    }

    /**
     * Put方法 返回数据会解析成字符串 String
     * @param urlString 请求的路径
     * @param listener  回调监听
     * @param params 参数列表
     */
    public static void doPut(final String urlString, final SuYuanNetCallbackListener listener,
                              final Map<String, String> params) {
        final StringBuffer out = processParams(params);
        // 因为网络请求是耗时操作，所以需要另外开启一个线程来执行该任务。
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                URL url;
                HttpURLConnection httpURLConnection = null;
                try {
                    url = new URL(urlString);
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setRequestProperty("accept", "*/*");
                    httpURLConnection.setRequestProperty("connection", "Keep-Alive");
                    httpURLConnection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
                    httpURLConnection.setRequestMethod(Contants.REQUEST_TYPE_PUT);

                    httpURLConnection.setConnectTimeout(Contants.CONNECTTIMEOUT);
                    httpURLConnection.setReadTimeout(Contants.READTIMEOUT);

                    // 设置运行输入
                    httpURLConnection.setDoInput(true);
                    // 设置运行输出
                    httpURLConnection.setDoOutput(true);

                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(out.toString().getBytes());
                    outputStream.flush();
                    outputStream.close();

                    if (httpURLConnection.getResponseCode() == Contants.RESPONSE200 ) {
                        // 获取网络的输入流
                        InputStream is = httpURLConnection.getInputStream();
                        BufferedReader bf = new BufferedReader(new InputStreamReader(is, Contants.ENCODE_TYPE));
                        //最好在将字节流转换为字符流的时候 进行转码
                        StringBuffer buffer = new StringBuffer();
                        String line = "";
                        while ( (line = bf.readLine()) != null ) {
                            buffer.append(line);
                        }
                        bf.close();
                        is.close();
                        if (listener!=null){
                            listener.onFinish(buffer.toString());
                        }
                    } else {
                        requestError(new Exception(Contants.RESPONSE_ERR_CODE+":" + httpURLConnection.getResponseCode()),listener);
                    }
                } catch ( MalformedURLException e ) {
                    requestError(e,listener);
                } catch ( IOException e ) {
                    requestError(e,listener);
                } catch (Exception e){
                    e.printStackTrace();
                }finally {
                    if ( httpURLConnection != null ) {
                        // 最后记得关闭连接
                        httpURLConnection.disconnect();
                    }
                }
            }
        });
    }

    /**
     * 参数处理
     * @param params 参数列表
     * @return StringBuffer 拼接完后的请求参数
     */
    private static StringBuffer processParams(Map<String, String> params) {
        final StringBuffer out = new StringBuffer();
        // 组织请求参数
        for (String key : params.keySet()) {
            if(out.length()!=0){
                out.append("&");
            }
            out.append(key).append("=").append(params.get(key));
        }
      
        return out;
    }

    /**
     * 请求错误
     * @param e 请求异常
     * @param listener  回调监听
     */
    private static void requestError(Exception e, SuYuanNetCallbackListener listener) {
        if ( listener != null ) {
            // 回调onError()方法
            listener.onError(e);
        }
    }
}
