package io.grpc;

import defpackage.a;
import defpackage.ejwf;
import defpackage.ejwg;
import defpackage.ejwh;
import defpackage.ejxy;
import defpackage.fbrb;
import defpackage.fbre;
import defpackage.fbrf;
import defpackage.fbrg;
import defpackage.fbtc;
import defpackage.fbtd;
import defpackage.fbtf;
import j$.util.DesugarCollections;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class Status {
    public static final List a;
    public static final Status b;
    public static final Status c;
    public static final Status d;
    public static final Status e;
    public static final Status f;
    public static final Status g;
    public static final Status h;
    public static final Status i;
    public static final Status j;
    public static final Status k;
    public static final Status l;
    public static final Status m;
    public static final Status n;
    public static final Status o;
    public static final Status p;
    public static final Status q;
    public static final fbrb r;
    public static final fbrb s;
    private static final fbrf u;
    public final Throwable t;
    private final Code v;
    private final String w;

    /* compiled from: PG */
    public enum Code {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);

        public final byte[] r;
        private final int t;

        Code(int i) {
            this.t = i;
            this.r = Integer.toString(i).getBytes(StandardCharsets.US_ASCII);
        }

        public final Status a() {
            return (Status) Status.a.get(this.t);
        }

        public int value() {
            return this.t;
        }
    }

    static {
        TreeMap treeMap = new TreeMap();
        for (Code code : Code.values()) {
            Status status = (Status) treeMap.put(Integer.valueOf(code.value()), new Status(code, null, null));
            if (status != null) {
                throw new IllegalStateException("Code value duplication between " + status.getCode().name() + " & " + code.name());
            }
        }
        a = DesugarCollections.unmodifiableList(new ArrayList(treeMap.values()));
        b = Code.OK.a();
        c = Code.CANCELLED.a();
        d = Code.UNKNOWN.a();
        e = Code.INVALID_ARGUMENT.a();
        f = Code.DEADLINE_EXCEEDED.a();
        g = Code.NOT_FOUND.a();
        h = Code.ALREADY_EXISTS.a();
        i = Code.PERMISSION_DENIED.a();
        j = Code.UNAUTHENTICATED.a();
        k = Code.RESOURCE_EXHAUSTED.a();
        l = Code.FAILED_PRECONDITION.a();
        m = Code.ABORTED.a();
        Code.OUT_OF_RANGE.a();
        n = Code.UNIMPLEMENTED.a();
        o = Code.INTERNAL.a();
        p = Code.UNAVAILABLE.a();
        q = Code.DATA_LOSS.a();
        fbtc fbtcVar = new fbtc();
        int i2 = fbrb.d;
        r = new fbre("grpc-status", false, fbtcVar);
        fbtd fbtdVar = new fbtd();
        u = fbtdVar;
        s = new fbre("grpc-message", false, fbtdVar);
    }

    private Status(Code code, String str, Throwable th) {
        code.getClass();
        this.v = code;
        this.w = str;
        this.t = th;
    }

    public static fbrg a(Throwable th) {
        th.getClass();
        while (th != null) {
            if (th instanceof StatusException) {
                return ((StatusException) th).b;
            }
            if (th instanceof fbtf) {
                return ((fbtf) th).b;
            }
            th = th.getCause();
        }
        return null;
    }

    public static Status c(Throwable th) {
        th.getClass();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof StatusException) {
                return ((StatusException) cause).a;
            }
            if (cause instanceof fbtf) {
                return ((fbtf) cause).a;
            }
        }
        return d.d(th);
    }

    public static String e(Status status) {
        String str = status.w;
        if (str == null) {
            return status.v.toString();
        }
        return status.v.toString() + ": " + str;
    }

    public static Status fromCodeValue(int i2) {
        if (i2 >= 0) {
            List list = a;
            if (i2 < list.size()) {
                return (Status) list.get(i2);
            }
        }
        return d.withDescription(a.g(i2, "Unknown code "));
    }

    public StatusException asException() {
        return new StatusException(this);
    }

    public final Status b(String str) {
        if (str == null) {
            return this;
        }
        String str2 = this.w;
        return str2 == null ? new Status(this.v, str, this.t) : new Status(this.v, a.q(str, str2, "\n"), this.t);
    }

    public final Status d(Throwable th) {
        return ejwh.a(this.t, th) ? this : new Status(this.v, this.w, th);
    }

    public final boolean f() {
        return Code.OK == this.v;
    }

    public Code getCode() {
        return this.v;
    }

    public String getDescription() {
        return this.w;
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("code", this.v.name());
        ejwfVarB.b("description", this.w);
        Throwable th = this.t;
        Object objA = th;
        if (th != null) {
            objA = ejxy.a(th);
        }
        ejwfVarB.b("cause", objA);
        return ejwfVarB.toString();
    }

    public Status withDescription(String str) {
        return ejwh.a(this.w, str) ? this : new Status(this.v, str, this.t);
    }
}
