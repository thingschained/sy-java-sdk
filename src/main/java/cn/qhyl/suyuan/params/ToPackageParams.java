package cn.qhyl.suyuan.params;


/**
 * Description: 赋码物品打包
 * <p>
 * review by
 * <p>
 * author: Vincent_Ge
 * version: 1.0
 * created at: 2017/10/21
 */

public class ToPackageParams extends Params{

    /**填写赋码往赋码上追加打包，不填写生成新的赋码*/
    private String block_code;
    /**需要打包的赋码组*/
    private String sub_code;
    /**上传人*/
    private String uploader;
    /**上传人id*/
    private String uploader_id;
    /**状态码*/
    private String status;
    /**状态描述*/
    private String note;
    /**纬度*/
    private String latitude;
    /**经度*/
    private String longitude;
    /**扩展字段*/
    private String ext;
    /**物品条码 （生成新的赋码需要填写*/
    private String sn;
    /**商户系统中物品唯一标识（生成新的赋码需要填写）*/
    private String tid;
    /**物品名称（生成新的赋码需要填写）*/
    private String title;
    /**物品规格型号（生成新的赋码需要填写）*/
    private String sku;
    
    public ToPackageParams() {}
    public static class Builder {

        private ToPackageParams params = new ToPackageParams();

        /**
         * @param block_code 填写赋码往赋码上追加打包，不填写生成新的赋码
         * @return ToPackageParams.Builder
         */
        public Builder setBlockCode(String block_code) {
            params.block_code = block_code;
            return this;
        }
        
        /**
         * @param sub_code 需要打包的赋码组
         * @return ToPackageParams.Builder
         */
        public Builder setSubCodes(String sub_code) {
            params.sub_code = sub_code;
            return this;
        }
        
        /**
         * @param uploader 上传人
         * @return ToPackageParams.Builder
         */
        public Builder setUploader(String uploader) {
            params.uploader = uploader;
            return this;
        }

        /**
         * @param uploader_id 上传人id
         * @return ToPackageParams.Builder
         */
        public Builder setUploaderID(String uploader_id) {
            params.uploader_id = uploader_id;
            return this;
        }
        
        /**
         * @param status 状态码
         * @return ToPackageParams.Builder
         */
        public Builder setStatus(String status) {
            params.status = status;
            return this;
        }

        /**
         * @param note 状态描述
         * @return ToPackageParams.Builder
         */
        public Builder setNote(String note) {
            params.note = note;
            return this;
        }

        /**
         * @param longitude 经度
         * @return ToPackageParams.Builder
         */
        public Builder setLongitude(String longitude) {
            params.longitude = longitude;
            return this;
        }

        /**
         * @param latitude 纬度
         * @return ToPackageParams.Builder
         */
        public Builder setLatitude(String latitude) {
            params.latitude = latitude;
            return this;
        }

        /**
         * @param ext 扩展字段
         * @return ToPackageParams.Builder
         */
        public Builder setExt(String ext) {
            params.ext = ext;
            return this;
        }
        
        /**
         * @param sn 物品条码（生成新的赋码需要填写）
         * @return ToPackageParams.Builder
         */
        public Builder setSn(String sn) {
            params.sn = sn;
            return this;
        }
        
        /**
         * @param tid 商户系统中物品唯一标识（生成新的赋码需要填写）
         * @return ToPackageParams.Builder
         */
        public Builder setTid(String tid) {
            params.tid = tid;
            return this;
        }
        
        /**
         * @param title 物品名称（生成新的赋码需要填写）
         * @return ToPackageParams.Builder
         */
        public Builder setTitle(String title) {
            params.title = title;
            return this;
        }
        
        /**
         * @param sku 物品规格型号（生成新的赋码需要填写）
         * @return ToPackageParams.Builder
         */
        public Builder setSku(String sku) {
            params.sku = sku;
            return this;
        }

        public ToPackageParams build() {
            return params;
        }
    }
}
