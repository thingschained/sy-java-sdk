package cn.qhyl.suyuan.params;

/**
 * Description: 检查赋码
 * <p>
 * review by
 * <p>
 * author: Vincent_Ge
 * version: 1.0
 * created at: 2017/10/21
 */

public class CheckCodeParams extends Params {

	/**赋码*/
    private String block_code;

    public CheckCodeParams() {}
    public static class Builder {

        private CheckCodeParams params = new CheckCodeParams();

        /**
         * @param block_code 赋码
         * @return CheckCodeParams.Builder
         */
        public Builder setBlockCode(String block_code) {
            params.block_code = block_code;
            return this;
        }
        
        public CheckCodeParams build() {
            return params;
        }
    }
}
