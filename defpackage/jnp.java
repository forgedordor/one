package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jnp implements icv {
    private final hrg a = new hpf(1.0f);

    @Override // defpackage.icv
    public final float a() {
        return this.a.c();
    }

    public final void b(float f) {
        this.a.h(f);
    }

    @Override // defpackage.fcyh
    public final <R> R fold(R r, fdat<? super R, ? super fcyf, ? extends R> fdatVar) {
        return (R) fcye.a(this, r, fdatVar);
    }

    @Override // defpackage.fcyf, defpackage.fcyh
    public final <E extends fcyf> E get(fcyg<E> fcygVar) {
        return (E) fcye.b(this, fcygVar);
    }

    @Override // defpackage.fcyf
    public final /* synthetic */ fcyg getKey() {
        return icv.b;
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
