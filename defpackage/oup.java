package defpackage;

/* compiled from: PG */
@fcsv
/* loaded from: classes.dex */
public abstract class oup extends vo {
    public final onv a;
    private final fdat d;

    protected oup(mc mcVar) {
        fdat fdatVar = new fdat() { // from class: ouo
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                this.a.F();
                return fctx.a;
            }
        };
        this.d = fdatVar;
        onv onvVar = new onv(new ml(this), mcVar);
        this.a = onvVar;
        onvVar.d.add(new onr(fdatVar));
    }

    @Override // defpackage.vo
    public final int a() {
        return this.a.a();
    }

    public final oun l() {
        return this.a.c();
    }

    public void F() {
    }
}
