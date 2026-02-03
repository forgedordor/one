package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hmc implements fcyf {
    public static final hmb a = new hmb();

    @Override // defpackage.fcyh
    public final <R> R fold(R r, fdat<? super R, ? super fcyf, ? extends R> fdatVar) {
        return (R) fcye.a(this, r, fdatVar);
    }

    @Override // defpackage.fcyf, defpackage.fcyh
    public final <E extends fcyf> E get(fcyg<E> fcygVar) {
        return (E) fcye.b(this, fcygVar);
    }

    @Override // defpackage.fcyf
    public final fcyg<?> getKey() {
        return a;
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
