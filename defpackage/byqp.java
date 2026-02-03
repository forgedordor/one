package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byqp {
    public static final byqv a(Throwable th, int i) throws Throwable {
        th.getClass();
        if ((th instanceof axkg) || (th instanceof cpyy)) {
            return new byqu(th);
        }
        if (!(th instanceof cpza)) {
            if (th instanceof Exception) {
                return (Status.c(th).getCode() == Status.Code.INVALID_ARGUMENT && i == bzas.a(17)) ? new byqq(th) : new byqr(th);
            }
            throw th;
        }
        cpyz cpyzVar = ((cpza) th).b;
        if (cpyzVar != null) {
            int iOrdinal = cpyzVar.ordinal();
            if (iOrdinal == 0) {
                return new byqq(th);
            }
            if (iOrdinal == 1) {
                return new byqr(th);
            }
            if (iOrdinal == 2) {
                return new byqu(th);
            }
            if (iOrdinal == 3) {
                return new byqs();
            }
        }
        throw new fctg();
    }
}
