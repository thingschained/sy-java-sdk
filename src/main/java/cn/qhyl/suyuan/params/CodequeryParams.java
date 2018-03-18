package cn.qhyl.suyuan.params;


/**
 * Description:物品信息查询
 * <p>
 * review by
 * <p>
 * author: Vincent_Ge
 * version: 1.0
 * created at: 2017/10/21
 */

public class CodequeryParams extends Params {

	/**赋码*/
    private String block_code;

    public CodequeryParams() {}

    public static class Builder {

        private CodequeryParams params = new CodequeryParams();

        /**
         * @param block_code 赋码
         * @return CodequeryParams.Builder
         */
        public Builder setBlockCode(String block_code) {
            params.block_code = block_code;
            return this;
        }
     
        public CodequeryParams build() {
            return params;
        }
    }
}
