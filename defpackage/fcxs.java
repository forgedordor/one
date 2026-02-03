package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fcxs implements fcyf {
    private final fcyg<?> key;

    public fcxs(fcyg<?> fcygVar) {
        fcygVar.getClass();
        this.key = fcygVar;
    }

    @Override // defpackage.fcyh
    public <R> R fold(R r, fdat<? super R, ? super fcyf, ? extends R> fdatVar) {
        return (R) fcye.a(this, r, fdatVar);
    }

    @Override // defpackage.fcyf, defpackage.fcyh
    public <E extends fcyf> E get(fcyg<E> fcygVar) {
        return (E) fcye.b(this, fcygVar);
    }

    @Override // defpackage.fcyf
    public fcyg<?> getKey() {
        return this.key;
    }

    @Override // defpackage.fcyh
    public fcyh minusKey(fcyg<?> fcygVar) {
        return fcye.c(this, fcygVar);
    }

    @Override // defpackage.fcyh
    public fcyh plus(fcyh fcyhVar) {
        return fcye.d(this, fcyhVar);
    }
}
