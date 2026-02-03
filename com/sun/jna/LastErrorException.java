package com.sun.jna;

import defpackage.a;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LastErrorException extends RuntimeException {
    private static final long serialVersionUID = 1;
    private int errorCode;

    public LastErrorException(int i) {
        this(i, formatMessage(i));
    }

    private static String formatMessage(int i) {
        return Platform.isWindows() ? a.g(i, "GetLastError() returned ") : a.g(i, "errno was ");
    }

    private static String parseMessage(String str) {
        try {
            return formatMessage(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return str;
        }
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    protected LastErrorException(int i, String str) {
        super(str);
        this.errorCode = i;
    }

    public LastErrorException(String str) {
        super(parseMessage(str.trim()));
        try {
            this.errorCode = Integer.parseInt(str.startsWith("[") ? str.substring(1, str.indexOf("]")) : str);
        } catch (NumberFormatException unused) {
            this.errorCode = -1;
        }
    }
}
