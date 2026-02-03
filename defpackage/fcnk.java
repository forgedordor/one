package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcnk implements fdmv<fbog> {
    public static final fcnj a = new fcnj();
    private final fbog b;

    public fcnk(fbog fbogVar) {
        this.b = fbogVar;
    }

    @Override // defpackage.fdmv
    public final /* bridge */ /* synthetic */ Object a(fcyh fcyhVar) {
        fcyhVar.getClass();
        fbog fbogVarA = this.b.a();
        fbogVarA.getClass();
        return fbogVarA;
    }

    @Override // defpackage.fdmv
    public final /* bridge */ /* synthetic */ void b(fcyh fcyhVar, Object obj) {
        fbog fbogVar = (fbog) obj;
        fcyhVar.getClass();
        fbogVar.getClass();
        this.b.f(fbogVar);
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
    public final fcyg<fcnk> getKey() {
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
