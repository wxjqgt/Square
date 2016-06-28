package com.weibo.square.bean.douban;

/**
 * Created by Administrator on 2016/6/21.
 */
public class DouBan {
    /**
     * "status": 200,
     "result": {},
     "request_id": "53c39696fafd04df01ec1659494571bc",
     "_AB": "ABTESTING_RECOMMEND_RECIPE:A"
     */
    private int status;
    private Result result;
    private String request_id;
    private String _AB;

    public DouBan() {}

    public DouBan(int status, Result result, String request_id, String _AB) {
        this.status = status;
        this.result = result;
        this.request_id = request_id;
        this._AB = _AB;
    }

    @Override
    public String toString() {
        return "DouBan{" +
                "status=" + status +
                ", result=" + result +
                ", request_id='" + request_id + '\'' +
                ", _AB='" + _AB + '\'' +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public String get_AB() {
        return _AB;
    }

    public void set_AB(String _AB) {
        this._AB = _AB;
    }
}
