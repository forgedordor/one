package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class fdlw {
    public static final Object a(fdlr fdlrVar, fcxy fcxyVar) {
        fdlrVar.t(null);
        Object objO = fdlrVar.o(fcxyVar);
        return objO == fcyl.a ? objO : fctx.a;
    }

    public static final fdks b(fdlr fdlrVar, boolean z, fdlx fdlxVar) {
        return fdlrVar instanceof fdme ? ((fdme) fdlrVar).J(z, fdlxVar) : fdlrVar.s(fdlxVar.b(), z, new fdlv(fdlxVar));
    }

    public static final fdlr c(fcyh fcyhVar) {
        fdlr fdlrVar = (fdlr) fcyhVar.get(fdlr.c);
        if (fdlrVar != null) {
            return fdlrVar;
        }
        Objects.toString(fcyhVar);
        throw new IllegalStateException("Current context doesn't contain Job in it: ".concat(String.valueOf(fcyhVar)));
    }

    public static final void d(fcyh fcyhVar, CancellationException cancellationException) {
        fdlr fdlrVar = (fdlr) fcyhVar.get(fdlr.c);
        if (fdlrVar != null) {
            fdlrVar.t(cancellationException);
        }
    }

    public static final void e(fdlr fdlrVar, String str, Throwable th) {
        fdlrVar.t(fdle.a(str, th));
    }

    public static final void f(fcyh fcyhVar) {
        fdlr fdlrVar = (fdlr) fcyhVar.get(fdlr.c);
        if (fdlrVar != null) {
            g(fdlrVar);
        }
    }

    public static final void g(fdlr fdlrVar) {
        if (!fdlrVar.v()) {
            throw fdlrVar.p();
        }
    }

    public static final boolean h(fcyh fcyhVar) {
        fdlr fdlrVar = (fdlr) fcyhVar.get(fdlr.c);
        if (fdlrVar != null) {
            return fdlrVar.v();
        }
        return true;
    }
}
