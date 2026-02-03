package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvpt implements tdg {
    public final fcyh a;
    public final fdjx b;
    private final fctc c;

    public cvpt(fcyh fcyhVar, fdjx fdjxVar) {
        fcyhVar.getClass();
        fdjxVar.getClass();
        this.a = fcyhVar;
        this.b = fdjxVar;
        this.c = fctd.a(new fdae() { // from class: cvpq
            @Override // defpackage.fdae
            public final Object invoke() {
                fduf fdufVarA = fdvf.a(null);
                cvpt cvptVar = this.a;
                return egwx.a(fdufVarA, cvptVar.b, new cvpr(cvptVar));
            }
        });
    }

    @Override // defpackage.tdg
    public final fdvc a() {
        return (fdvc) this.c.a();
    }

    @Override // defpackage.tdg
    public final boolean b() {
        return true;
    }
}
