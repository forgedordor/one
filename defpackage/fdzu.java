package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdzu {
    public static final void a(fcxy fcxyVar, fcxy fcxyVar2) throws Throwable {
        try {
            fdyf.a(fcym.c(fcxyVar), fctx.a);
        } catch (Throwable th) {
            c(fcxyVar2, th);
        }
    }

    public static final void b(fdat fdatVar, Object obj, fcxy fcxyVar) throws Throwable {
        try {
            fdyf.a(fcym.c(fcym.b(fdatVar, obj, fcxyVar)), fctx.a);
        } catch (Throwable th) {
            c(fcxyVar, th);
        }
    }

    private static final void c(fcxy fcxyVar, Throwable th) throws Throwable {
        if (th instanceof fdkl) {
            th = ((fdkl) th).a;
        }
        fcxyVar.w(fctl.a(th));
        throw th;
    }
}
