package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fbtf extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;
    public final Status a;
    public final fbrg b;

    public fbtf(Status status) {
        this(status, null);
    }

    public fbtf(Status status, fbrg fbrgVar) {
        super(Status.e(status), status.t);
        this.a = status;
        this.b = fbrgVar;
    }
}
