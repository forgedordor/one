package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fcyv extends fcyt {
    public transient fcxy D;
    private final fcyh a;

    public fcyv(fcxy fcxyVar) {
        this(fcxyVar, fcxyVar != null ? fcxyVar.u() : null);
    }

    @Override // defpackage.fcyt
    protected void f() {
        fcxy fcxyVar = this.D;
        if (fcxyVar != null && fcxyVar != this) {
            fcyf fcyfVar = u().get(fcya.k);
            fcyfVar.getClass();
            ((fcya) fcyfVar).f(fcxyVar);
        }
        this.D = fcyu.a;
    }

    @Override // defpackage.fcxy
    public fcyh u() {
        fcyh fcyhVar = this.a;
        fcyhVar.getClass();
        return fcyhVar;
    }

    public fcyv(fcxy fcxyVar, fcyh fcyhVar) {
        super(fcxyVar);
        this.a = fcyhVar;
    }
}
