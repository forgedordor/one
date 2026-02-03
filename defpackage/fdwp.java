package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdwp implements fcyh {
    public final Throwable a;
    private final /* synthetic */ fcyh b;

    public fdwp(Throwable th, fcyh fcyhVar) {
        this.b = fcyhVar;
        this.a = th;
    }

    @Override // defpackage.fcyh
    public final <R> R fold(R r, fdat<? super R, ? super fcyf, ? extends R> fdatVar) {
        return (R) this.b.fold(r, fdatVar);
    }

    @Override // defpackage.fcyh
    public final <E extends fcyf> E get(fcyg<E> fcygVar) {
        return (E) this.b.get(fcygVar);
    }

    @Override // defpackage.fcyh
    public final fcyh minusKey(fcyg<?> fcygVar) {
        return this.b.minusKey(fcygVar);
    }

    @Override // defpackage.fcyh
    public final fcyh plus(fcyh fcyhVar) {
        return this.b.plus(fcyhVar);
    }
}
