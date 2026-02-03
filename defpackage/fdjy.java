package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdjy {
    public static final Object a(fdat fdatVar, fcxy fcxyVar) {
        fdze fdzeVar = new fdze(fcxyVar.u(), fcxyVar);
        Object objA = fdzv.a(fdzeVar, fdzeVar, fdatVar);
        if (objA == fcyl.a) {
            fcxyVar.getClass();
        }
        return objA;
    }

    public static final fdjx b(fcyh fcyhVar) {
        if (fcyhVar.get(fdlr.c) == null) {
            fcyhVar = fcyhVar.plus(new fdlt(null));
        }
        return new fdxz(fcyhVar);
    }

    public static final fdjx c() {
        fdmt fdmtVar = new fdmt(null);
        fdjq fdjqVar = fdkq.a;
        return new fdxz(fcye.d(fdmtVar, fdzb.a));
    }

    public static final fdjx d(fdjx fdjxVar, fcyh fcyhVar) {
        return new fdxz(fdjxVar.hE().plus(fcyhVar));
    }

    public static final void e(fdjx fdjxVar, CancellationException cancellationException) {
        fdlr fdlrVar = (fdlr) fdjxVar.hE().get(fdlr.c);
        if (fdlrVar != null) {
            fdlrVar.t(cancellationException);
        } else {
            Objects.toString(fdjxVar);
            throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(String.valueOf(fdjxVar)));
        }
    }

    public static final void f(fdjx fdjxVar) {
        fdlw.f(fdjxVar.hE());
    }

    public static final boolean g(fdjx fdjxVar) {
        fdlr fdlrVar = (fdlr) fdjxVar.hE().get(fdlr.c);
        if (fdlrVar != null) {
            return fdlrVar.v();
        }
        return true;
    }
}
