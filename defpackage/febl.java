package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class febl implements fdkf {
    private final /* synthetic */ fdjc a;

    public febl(fdjc fdjcVar) {
        this.a = fdjcVar;
    }

    @Override // defpackage.fdkf
    public final Object c(fcxy fcxyVar) {
        return ((fdme) this.a).hJ(fcxyVar);
    }

    @Override // defpackage.fdkf
    public final Object d() {
        return ((fdme) this.a).D();
    }

    @Override // defpackage.fdkf
    public final feam f() {
        throw null;
    }

    @Override // defpackage.fcyh
    public final <R> R fold(R r, fdat<? super R, ? super fcyf, ? extends R> fdatVar) {
        return (R) fcye.a(this.a, r, fdatVar);
    }

    @Override // defpackage.fcyf, defpackage.fcyh
    public final <E extends fcyf> E get(fcyg<E> fcygVar) {
        return (E) fcye.b(this.a, fcygVar);
    }

    @Override // defpackage.fcyf
    public final fcyg<?> getKey() {
        return fdlr.c;
    }

    @Override // defpackage.fdlr
    public final fdks hK(fdap fdapVar) {
        return this.a.hK(fdapVar);
    }

    @Override // defpackage.fcyh
    public final fcyh minusKey(fcyg<?> fcygVar) {
        return fcye.c(this.a, fcygVar);
    }

    @Override // defpackage.fdlr
    public final Object o(fcxy fcxyVar) {
        return this.a.o(fcxyVar);
    }

    @Override // defpackage.fdlr
    public final CancellationException p() {
        return this.a.p();
    }

    @Override // defpackage.fcyh
    public final fcyh plus(fcyh fcyhVar) {
        return fcye.d(this.a, fcyhVar);
    }

    @Override // defpackage.fdlr
    public final fdiz q(fdjb fdjbVar) {
        return this.a.q(fdjbVar);
    }

    @Override // defpackage.fdlr
    public final fdks s(boolean z, boolean z2, fdap fdapVar) {
        return this.a.s(z, z2, fdapVar);
    }

    @Override // defpackage.fdlr
    public final void t(CancellationException cancellationException) {
        this.a.t(cancellationException);
    }

    @Override // defpackage.fdlr
    public final boolean v() {
        return this.a.v();
    }

    @Override // defpackage.fdlr
    public final boolean x() {
        return this.a.x();
    }

    @Override // defpackage.fdlr
    public final boolean y() {
        return this.a.y();
    }

    @Override // defpackage.fdlr
    public final boolean z() {
        return this.a.z();
    }
}
