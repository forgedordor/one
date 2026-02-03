package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fdkn extends feac {
    public int e;

    public fdkn(int i) {
        super(0L, false);
        this.e = i;
    }

    public final void K(Throwable th) {
        fdjs.b(t().u(), new fdka(a.h(this, "Fatal exception in coroutines machinery for ", ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"), th));
    }

    public abstract Object p();

    /* JADX WARN: Type inference failed for: r1v2, types: [fcxy, fcyw] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = fdkb.a;
        try {
            fdye fdyeVar = (fdye) t();
            ?? r1 = fdyeVar.b;
            Object obj = fdyeVar.d;
            fcyh fcyhVarU = r1.u();
            Object objB = fdzp.b(fcyhVarU, obj);
            fdlr fdlrVar = null;
            fdnc fdncVarC = objB != fdzp.a ? fdjn.c(r1, fcyhVarU, objB) : null;
            try {
                fcyh fcyhVarU2 = r1.u();
                Object objP = p();
                Throwable thS = s(objP);
                if (thS == null && fdko.b(this.e)) {
                    fdlrVar = (fdlr) fcyhVarU2.get(fdlr.c);
                }
                if (fdlrVar != null && !fdlrVar.v()) {
                    Throwable thP = fdlrVar.p();
                    H(thP);
                    if (fdkb.b) {
                        thP = fdzh.a(thP, r1);
                    }
                    r1.w(fctl.a(thP));
                } else if (thS != null) {
                    r1.w(fctl.a(thS));
                } else {
                    r1.w(o(objP));
                }
                if (fdncVarC != null && !fdncVarC.W()) {
                    return;
                }
                fdzp.c(fcyhVarU, objB);
            } catch (Throwable th) {
                if (fdncVarC == null || fdncVarC.W()) {
                    fdzp.c(fcyhVarU, objB);
                }
                throw th;
            }
        } catch (fdkl e) {
            fdjs.b(t().u(), e.a);
        } catch (Throwable th2) {
            K(th2);
        }
    }

    public Throwable s(Object obj) {
        fdjg fdjgVar = obj instanceof fdjg ? (fdjg) obj : null;
        if (fdjgVar != null) {
            return fdjgVar.b;
        }
        return null;
    }

    public abstract fcxy t();

    public void H(Throwable th) {
    }

    public Object o(Object obj) {
        return obj;
    }
}
