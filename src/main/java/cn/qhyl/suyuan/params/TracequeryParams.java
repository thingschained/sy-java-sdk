package cn.qhyl.suyuan.params;

/**
 * Description: 物品流转信息查询
 * <p>
 * review by
 * <p>
 * author: Vincent_Ge
 * version: 1.0
 * created at: 2017/10/21
 */

public class TracequeryParams extends Params{

    /**赋码*/
    private String block_code;

    public TracequeryParams() {}

    public static class Builder {

        private TracequeryParams params = new TracequeryParams();

        /**
         * @param block_code 赋码
         * @return TracequeryParams.Builder
         */
        public Builder setBlockCode(String block_code) {
            params.block_code = block_code;
            return this;
        }
       
        public TracequeryParams build() {
            return params;
        }
    }
}
