package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hom implements CoroutineExceptionHandler, hqt {
    private final fcyh a;
    private final fdat b;
    private final fdjx d;
    private fdlr e;

    public hom(fcyh fcyhVar, fdat fdatVar) {
        this.a = fcyhVar;
        this.b = fdatVar;
        this.d = fdjy.b(fcyhVar.plus(fcyhVar.get(ibk.a) != null ? this : fcyi.a));
    }

    @Override // defpackage.fcyh
    public final <R> R fold(R r, fdat<? super R, ? super fcyf, ? extends R> fdatVar) {
        return (R) fcye.a(this, r, fdatVar);
    }

    @Override // defpackage.hqt
    public final void g() {
        fdlr fdlrVar = this.e;
        if (fdlrVar != null) {
            fdlrVar.t(new hoo());
        }
        this.e = null;
    }

    @Override // defpackage.fcyf, defpackage.fcyh
    public final <E extends fcyf> E get(fcyg<E> fcygVar) {
        return (E) fcye.b(this, fcygVar);
    }

    @Override // defpackage.fcyf
    public final fcyg<?> getKey() {
        return CoroutineExceptionHandler.c;
    }

    @Override // defpackage.hqt
    public final void h() {
        fdlr fdlrVar = this.e;
        if (fdlrVar != null) {
            fdlrVar.t(new hoo());
        }
        this.e = null;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(fcyh fcyhVar, Throwable th) throws Throwable {
        ibk ibkVar = (ibk) fcyhVar.get(ibk.a);
        if (ibkVar != null) {
            ibkVar.b(th, this);
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.a.get(CoroutineExceptionHandler.c);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(fcyhVar, th);
    }

    @Override // defpackage.hqt
    public final void i() {
        fdlr fdlrVar = this.e;
        if (fdlrVar != null) {
            fdlw.e(fdlrVar, "Old job was still running!", null);
        }
        this.e = fdil.d(this.d, null, null, this.b, 3);
    }

    @Override // defpackage.fcyh
    public final fcyh minusKey(fcyg<?> fcygVar) {
        return fcye.c(this, fcygVar);
    }

    @Override // defpackage.fcyh
    public final fcyh plus(fcyh fcyhVar) {
        return fcye.d(this, fcyhVar);
    }
}
