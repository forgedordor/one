package defpackage;

import io.grpc.Status;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbqc {
    public static final fbqc a = new fbqc(null, Status.b, false);
    public final fbqf b;
    public final Status c;
    public final boolean d;
    private final fbnl e = null;

    private fbqc(fbqf fbqfVar, Status status, boolean z) {
        this.b = fbqfVar;
        status.getClass();
        this.c = status;
        this.d = z;
    }

    public static fbqc a(Status status) {
        ejwl.b(!status.f(), "drop status shouldn't be OK");
        return new fbqc(null, status, true);
    }

    public static fbqc b(Status status) {
        ejwl.b(!status.f(), "error status shouldn't be OK");
        return new fbqc(null, status, false);
    }

    public static fbqc c(fbqf fbqfVar) {
        return new fbqc(fbqfVar, Status.b, false);
    }

    public final boolean d() {
        return (this.b == null && this.c.f()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fbqc)) {
            return false;
        }
        fbqc fbqcVar = (fbqc) obj;
        if (ejwh.a(this.b, fbqcVar.b) && ejwh.a(this.c, fbqcVar.c)) {
            fbnl fbnlVar = fbqcVar.e;
            if (ejwh.a(null, null) && this.d == fbqcVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, null, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("subchannel", this.b);
        ejwfVarB.b("streamTracerFactory", null);
        ejwfVarB.b("status", this.c);
        ejwfVarB.h("drop", this.d);
        ejwfVarB.b("authority-override", null);
        return ejwfVarB.toString();
    }
}
