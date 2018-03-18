package cn.qhyl.suyuan.http;

/**
 * Description: 溯源API
 * <p>
 * review by
 * <p>
 * author: Vincent_Ge
 * version: 1.0
 * created at: 2017/10/20
 */

public class SuYuanApi {

	/**baseURL*/
    private static String baseURL = "test.i.thingschained.com/";
    /**上报*/
    public static String report = baseURL+"service/upload";
    /**赋码*/
    public static String assigncode = baseURL+"service/assigncode";
    /**打包*/
    public static String topackage = baseURL+"service/package";
    /**分包*/
    public static String unpackage = baseURL+"service/unpackage";
    /**流转*/
    public static String tracequery = baseURL+"service/tracequery";
    /**查看商品详情*/
    public static String codequery = baseURL+"service/codequery";
    /**检查赋码*/
    public static String checkcode = baseURL+"service/checkcode";

}
