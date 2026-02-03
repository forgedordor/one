package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdnc extends fdze {
    private final ThreadLocal b;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public fdnc(fcyh fcyhVar, fcxy fcxyVar) {
        fdnd fdndVar = fdnd.a;
        super(fcyhVar.get(fdndVar) == null ? fcyhVar.plus(fdndVar) : fcyhVar, fcxyVar);
        this.b = new ThreadLocal();
        if (fcxyVar.u().get(fcya.k) instanceof fdjq) {
            return;
        }
        Object objB = fdzp.b(fcyhVar, null);
        fdzp.c(fcyhVar, objB);
        f(fcyhVar, objB);
    }

    private final void X() {
        if (this.threadLocalIsSet) {
            ThreadLocal threadLocal = this.b;
            fcti fctiVar = (fcti) threadLocal.get();
            if (fctiVar != null) {
                fdzp.c((fcyh) fctiVar.a, fctiVar.b);
            }
            threadLocal.remove();
        }
    }

    public final boolean W() {
        boolean z = this.threadLocalIsSet && this.b.get() == null;
        this.b.remove();
        return !z;
    }

    @Override // defpackage.fdze
    public final void d() {
        X();
    }

    public final void f(fcyh fcyhVar, Object obj) {
        this.threadLocalIsSet = true;
        this.b.set(new fcti(fcyhVar, obj));
    }

    @Override // defpackage.fdze, defpackage.fdic
    protected final void hG(Object obj) {
        X();
        fcxy fcxyVar = this.e;
        Object objA = fdji.a(obj, fcxyVar);
        fcyh fcyhVarU = fcxyVar.u();
        Object objB = fdzp.b(fcyhVarU, null);
        fdnc fdncVarC = objB != fdzp.a ? fdjn.c(fcxyVar, fcyhVarU, objB) : null;
        try {
            fcxyVar.w(objA);
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
}
