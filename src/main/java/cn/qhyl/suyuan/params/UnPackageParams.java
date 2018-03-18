package cn.qhyl.suyuan.params;

/**
 * Description: 赋码物品分包
 * <p>
 * review by
 * <p>
 * author: Vincent_Ge
 * version: 1.0
 * created at: 2017/10/21
 */

public class UnPackageParams extends Params{

	 /**分包结果的赋码*/
    private String block_code;
    /**分包结果的赋码信息*/
    private String sub_info;
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
    
    public UnPackageParams() {}
    public static class Builder {

        private UnPackageParams params = new UnPackageParams();

        /**
         * @param block_code 分包结果的赋码
         * @return ToPackageParams.Builder
         */
        public Builder setBlockCode(String block_code) {
            params.block_code = block_code;
            return this;
        }
        
        /**
         * @param sub_info 需要分包的赋码组
         * @return UnPackageParams.Builder
         */
        public Builder setSubInfo(String sub_info) {
            params.sub_info = sub_info;
            return this;
        }
        
        /**
         * @param uploader 上传人
         * @return UnPackageParams.Builder
         */
        public Builder setUploader(String uploader) {
            params.uploader = uploader;
            return this;
        }

        /**
         * @param uploader_id 上传人id
         * @return UnPackageParams.Builder
         */
        public Builder setUploaderID(String uploader_id) {
            params.uploader_id = uploader_id;
            return this;
        }
        
        /**
         * @param status 状态码
         * @return UnPackageParams.Builder
         */
        public Builder setStatus(String status) {
            params.status = status;
            return this;
        }

        /**
         * @param note 状态描述
         * @return UnPackageParams.Builder
         */
        public Builder setNote(String note) {
            params.note = note;
            return this;
        }

        /**
         * @param longitude 经度
         * @return UnPackageParams.Builder
         */
        public Builder setlongitude(String longitude) {
            params.longitude = longitude;
            return this;
        }

        /**
         * @param latitude 纬度
         * @return UnPackageParams.Builder
         */
        public Builder setLatitude(String latitude) {
            params.latitude = latitude;
            return this;
        }

        /**
         * @param ext 扩展字段
         * @return UnPackageParams.Builder
         */
        public Builder setExt(String ext) {
            params.ext = ext;
            return this;
        }

        public UnPackageParams build() {
            return params;
        }
    }
}
