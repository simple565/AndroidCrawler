package com.maureen.androidcrawler.bean;

import java.util.List;

/**
 * Description: 浪姐最终冲浪榜实体类
 *
 * @author Maureen
 * Create 2020-08-29 2:44
 */
public class SurfRankBean {
    public static final int SUCCESS_CODE = 200;

    /**
     * msg : success
     * errno : 0
     * code : 200
     * data : [{"num":111411,"id":"rank4"},{"num":96730,"id":"rank11"},{"num":77015,"id":"rank8"},{"num":66590,"id":"rank1"},{"num":66574,"id":"rank5"},{"num":55547,"id":"rank14"},{"num":54071,"id":"rank13"},{"num":53149,"id":"rank10"},{"num":29784,"id":"rank9"},{"num":25885,"id":"rank6"},{"num":25057,"id":"rank2"},{"num":23153,"id":"rank3"},{"num":22523,"id":"rank7"},{"num":6490,"id":"rank12"}]
     * seqid : 5d586cbf622f4c878a744b8cb7e0c25e
     * current_time : 1598640237
     * status : 200
     */

    private String msg;
    private int errno;
    private int code;
    private String seqid;
    private long current_time;
    private int status;
    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getSeqid() {
        return seqid;
    }

    public void setSeqid(String seqid) {
        this.seqid = seqid;
    }

    public long getCurrent_time() {
        return current_time;
    }

    public void setCurrent_time(long current_time) {
        this.current_time = current_time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * num : 111411
         * id : rank4
         */

        private int num;
        private String id;

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
