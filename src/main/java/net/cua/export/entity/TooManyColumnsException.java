package net.cua.export.entity;

import net.cua.export.manager.Const;

/**
 * Created by guanquan.wang on 2017/10/19.
 */
public class TooManyColumnsException extends ExportException {

    public TooManyColumnsException() {
        super();
    }

    public TooManyColumnsException(int n) {
        super(n + " out of Total number of columns on a worksheet " + Const.Limit.MAX_COLUMNS_ON_SHEET);
    }

    public TooManyColumnsException(String s) {
        super(s);
    }
}
