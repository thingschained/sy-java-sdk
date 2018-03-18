package cn.qhyl.suyuan.params;

import java.lang.reflect.Field;
import java.util.HashMap;

/**
 * Description: 参数base类
 * <p>
 * review by
 * <p>
 * author: Vincent_Ge
 * version: 1.0
 * created at: 2017/10/21
 */

public abstract class Params {

    protected String[] MUST_PARAM_KEYS;
    protected String[] NORMAL_PARAM_KEYS;

    public HashMap<String, String> toMap(){

        HashMap<String, String> map = new HashMap<String, String>();

        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                map.put(field.getName(), (String) field.get(this));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return map;
    }
}
