package cn.qhyl.suyuan.params;

/**
 * Description: 物品数据上报
 * <p>
 * review by
 * <p>
 * author: Vincent_Ge
 * version: 1.0
 * created at: 2017/10/20
 */

public class UploadParams extends Params {

    /**赋码*/
    private String block_code;
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
    
    public UploadParams() {}

    public static class Builder {

        private UploadParams params = new UploadParams();

        /**
         * @param block_code 赋码
         * @return UploadParams.Builder
         */
        public Builder setBlockCode(String block_code) {
            params.block_code = block_code;
            return this;
        }

        /**
         * @param uploader 上传人
         * @return UploadParams.Builder
         */
        public Builder setUploader(String uploader) {
            params.uploader = uploader;
            return this;
        }

        /**
         * @param uploader_id 上传人id
         * @return UploadParams.Builder
         */
        public Builder setUploaderID(String uploader_id) {
            params.uploader_id = uploader_id;
            return this;
        }
        
        /**
         * @param status 状态码
         * @return UploadParams.Builder
         */
        public Builder setStatus(String status) {
            params.status = status;
            return this;
        }

        /**
         * @param note 状态描述
         * @return UploadParams.Builder
         */
        public Builder setNote(String note) {
            params.note = note;
            return this;
        }

        /**
         * @param longitude 经度
         * @return UploadParams.Builder
         */
        public Builder setLongitude(String longitude) {
            params.longitude = longitude;
            return this;
        }

        /**
         * @param latitude 纬度
         * @return UploadParams.Builder
         */
        public Builder setLatitude(String latitude) {
            params.latitude = latitude;
            return this;
        }

        /**
         * @param ext 扩展字段
         * @return UploadParams.Builder
         */
        public Builder setExt(String ext) {
            params.ext = ext;
            return this;
        }

        public UploadParams build() {
            return params;
        }
    }
}
