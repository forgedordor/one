package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqw implements fdjx, hqt {
    public static final fcyh a = new hmc();
    public final fcyh b;
    public final fcyh c;
    private final Object d = this;
    private volatile fcyh e;

    public hqw(fcyh fcyhVar, fcyh fcyhVar2) {
        this.b = fcyhVar;
        this.c = fcyhVar2;
    }

    public final void a() {
        synchronized (this.d) {
            fcyh fcyhVar = this.e;
            if (fcyhVar == null) {
                this.e = a;
            } else {
                fdlw.d(fcyhVar, new hoc());
            }
        }
    }

    @Override // defpackage.hqt
    public final void g() {
        a();
    }

    @Override // defpackage.hqt
    public final void h() {
        a();
    }

    @Override // defpackage.fdjx
    public final fcyh hE() {
        fcyh fcyhVarPlus = this.e;
        if (fcyhVarPlus == null || fcyhVarPlus == a) {
            fcyh fcyhVar = this.b;
            ibk ibkVar = (ibk) fcyhVar.get(ibk.a);
            fcyh hqvVar = ibkVar != null ? new hqv(CoroutineExceptionHandler.c, ibkVar, this) : fcyi.a;
            synchronized (this.d) {
                fcyh fcyhVar2 = this.e;
                if (fcyhVar2 == null) {
                    fcyhVarPlus = fcyhVar.plus(new fdlt((fdlr) fcyhVar.get(fdlr.c))).plus(this.c).plus(hqvVar);
                } else if (fcyhVar2 == a) {
                    fdlt fdltVar = new fdlt((fdlr) fcyhVar.get(fdlr.c));
                    fdltVar.t(new hoc());
                    fcyhVarPlus = fcyhVar.plus(fdltVar).plus(this.c).plus(hqvVar);
                } else {
                    fcyhVarPlus = fcyhVar2;
                }
                this.e = fcyhVarPlus;
            }
        }
        fcyhVarPlus.getClass();
        return fcyhVarPlus;
    }

    @Override // defpackage.hqt
    public final void i() {
    }
}
