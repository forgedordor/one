package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdko {
    public static final void a(fdkn fdknVar, fcxy fcxyVar, boolean z) {
        Object objP = fdknVar.p();
        Throwable thS = fdknVar.s(objP);
        Object objA = thS != null ? fctl.a(thS) : fdknVar.o(objP);
        if (!z) {
            fcxyVar.w(objA);
            return;
        }
        fdye fdyeVar = (fdye) fcxyVar;
        fcxy fcxyVar2 = fdyeVar.b;
        Object obj = fdyeVar.d;
        fcyh fcyhVarU = fcxyVar2.u();
        Object objB = fdzp.b(fcyhVarU, obj);
        fdnc fdncVarC = objB != fdzp.a ? fdjn.c(fcxyVar2, fcyhVarU, objB) : null;
        try {
            fcxyVar2.w(objA);
            if (fdncVarC == null || fdncVarC.W()) {
                fdzp.c(fcyhVarU, objB);
            }
        } catch (Throwable th) {
            if (fdncVarC == null || fdncVarC.W()) {
                fdzp.c(fcyhVarU, objB);
            }
            throw th;
        }
    }

    public static final boolean b(int i) {
        return i == 1 || i == 2;
    }
}
