package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fdob extends fdic implements fdoa {
    public final fdoa b;

    public fdob(fcyh fcyhVar, fdoa fdoaVar) {
        super(fcyhVar, true);
        this.b = fdoaVar;
    }

    @Override // defpackage.fdou
    public final feam B() {
        return this.b.B();
    }

    @Override // defpackage.fdme
    public final void K(Throwable th) throws Throwable {
        fdoa fdoaVar = this.b;
        CancellationException cancellationExceptionV = fdme.V(this, th);
        fdoaVar.t(cancellationExceptionV);
        O(cancellationExceptionV);
    }

    @Override // defpackage.fdow
    public final Object a(Object obj, fcxy fcxyVar) {
        return this.b.a(obj, fcxyVar);
    }

    @Override // defpackage.fdow
    public final Object b(Object obj) {
        return this.b.b(obj);
    }

    @Override // defpackage.fdow
    public final void d(fdap fdapVar) {
        throw null;
    }

    @Override // defpackage.fdow
    public final boolean e(Throwable th) {
        return this.b.e(th);
    }

    @Override // defpackage.fdow
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.fdou
    public final Object i(fcxy fcxyVar) {
        throw null;
    }

    @Override // defpackage.fdou
    public final Object j(fcxy fcxyVar) {
        throw null;
    }

    @Override // defpackage.fdou
    public final Object m() {
        return this.b.m();
    }

    @Override // defpackage.fdou
    public final fdoc r() {
        return this.b.r();
    }

    @Override // defpackage.fdme, defpackage.fdlr
    public final void t(CancellationException cancellationException) throws Throwable {
        if (x()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new fdls(g(), null, this);
        }
        K(cancellationException);
    }
}
