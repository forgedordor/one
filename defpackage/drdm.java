package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class drdm {
    public abstract drdl a();

    public abstract ekgb b();

    public abstract ekgp c();

    public abstract ekhx d();

    public abstract ekhx e();

    public final drdm f(drdm drdmVar) {
        drdl drdlVarA = a();
        drdlVarA.e(drdmVar.d());
        drdlVarA.f(drdmVar.e());
        drdlVarA.b().j(drdmVar.b());
        ekgp ekgpVarC = drdmVar.c();
        draf drafVar = (draf) drdlVarA;
        if (drafVar.a == null) {
            if (drafVar.b == null) {
                drafVar.a = new ekgi();
            } else {
                drafVar.a = new ekgi();
                drafVar.a.g(drafVar.b);
                drafVar.b = null;
            }
        }
        drafVar.a.g(ekgpVarC);
        return drdlVarA.a();
    }
}
