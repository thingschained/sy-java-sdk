package cn.qhyl.suyuan.params;


/**
 * Description: 物品原生赋码
 * <p>
 * review by
 * <p>
 * author: Vincent_Ge
 * version: 1.0
 * created at: 2017/10/21
 */

public class AssigncodeParams extends Params {
	
	/**物品条码*/
    private String sn;
    /**商户系统中物品唯一标识*/
    private String tid;
    /**物品名称*/
    private String title;
    /**物品别名*/
    private String alias;
    /**物品邓白氏编码*/
    private String unspsc;
    /**品牌名称*/
    private String brand_name;
    /**物品规格型号*/
    private String sku;
    /**纬度*/
    private String latitude;
    /**经度*/
    private String longitude;
    /**扩展字段*/
    private String ext;


    public AssigncodeParams() {}

    public static class Builder {

        private AssigncodeParams params = new AssigncodeParams();
        
        /**
         * @param sn 物品条码
         * @return AssigncodeParams.Builder
         */
        public Builder setSn(String sn) {
            params.sn = sn;
            return this;
        }
        
        /**
         * @param tid 商户系统中物品唯一标识
         * @return AssigncodeParams.Builder
         */
        public Builder setTID(String tid) {
            params.tid = tid;
            return this;
        }

        /**
         * @param title 物品名称
         * @return AssigncodeParams.Builder
         */
        public Builder setTitle(String title) {
            params.title = title;
            return this;
        }
        
        /**
         * @param alias 物品别名名称
         * @return AssigncodeParams.Builder
         */
        public Builder setAlias(String alias) {
            params.alias = alias;
            return this;
        }
        
        /**
         * @param unspsc 物品邓白氏编码
         * @return AssigncodeParams.Builder
         */
        public Builder setUnspsc(String unspsc) {
            params.unspsc = unspsc;
            return this;
        }
        
        /**
         * @param brand_name 品牌名称
         * @return AssigncodeParams.Builder
         */
        public Builder setBrandName(String brand_name) {
            params.brand_name = brand_name;
            return this;
        }
        
        /**
         * @param sku 物品规格型号
         * @return AssigncodeParams.Builder
         */
        public Builder setSku(String sku) {
            params.sku = sku;
            return this;
        }
        
        /**
         * @param longitude 经度
         * @return AssigncodeParams.Builder
         */
        public Builder setLongitude(String longitude) {
            params.longitude = longitude;
            return this;
        }

        /**
         * @param latitude 纬度
         * @return AssigncodeParams.Builder
         */
        public Builder setLatitude(String latitude) {
            params.latitude = latitude;
            return this;
        }

        /**
         * @param ext 扩展字段
         * @return AssigncodeParams.Builder
         */
        public Builder setExt(String ext) {
            params.ext = ext;
            return this;
        }

        public AssigncodeParams build() {
            return params;
        }
    }
}
