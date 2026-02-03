package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esti implements esrw {
    private static final eksp a = eksp.c("xRPC");
    private estk b;
    private estj c;

    @Override // defpackage.esrw
    public final /* synthetic */ estb a(esrs esrsVar) {
        return estb.a;
    }

    @Override // defpackage.esrw
    public final estb b(esrs esrsVar) {
        fbnc fbncVar = esrsVar.b;
        this.c = new estj(((esmk) fbncVar.h(esml.a)).h());
        fbnb fbnbVar = estk.b;
        ejwl.f(fbncVar.h(fbnbVar) == null, "Unexpected option %s already set.", fbnbVar);
        fbnb fbnbVar2 = esth.a;
        ejwl.f(fbncVar.h(fbnbVar2) == null, "Unexpected option %s already set.", fbnbVar2);
        estk estkVar = new estk((esoa) fbncVar.h(esoa.a));
        this.b = estkVar;
        return new estb(1, null, null, fbncVar.f(fbnbVar, estkVar).f(fbnbVar2, this.b));
    }

    @Override // defpackage.esrw
    public final /* synthetic */ estb c() {
        return estb.a;
    }

    @Override // defpackage.esrw
    public final void d(esrr esrrVar) {
        try {
            estj estjVar = this.c;
            estk estkVar = this.b;
            if (((Boolean) ((ejxw) estjVar.a).a).booleanValue() && estkVar.e.get()) {
                dzfj dzfjVarA = dzfj.a();
                dzrm dzrmVarA = dzrm.a(null, estkVar.c.a());
                boolean z = estkVar.d.get();
                ejwl.a(true);
                ejwl.a(true);
                dzrmVarA.q = 1;
                dzrmVarA.r = z ? 1 : 0;
                dzfjVarA.g(dzrmVarA);
            }
        } catch (Throwable th) {
            ((eksl) ((eksl) ((eksl) a.i()).g(th)).h("com/google/frameworks/client/data/android/metrics/MetricsRecordingInterceptor", "startOnCompleteProcessing", '6', "MetricsRecordingInterceptor.java")).q("Failed to record RPC metrics");
        }
    }

    @Override // defpackage.esrw
    public final /* synthetic */ estb e() {
        return estb.a;
    }

    @Override // defpackage.esrw
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.esrw
    public final /* synthetic */ void g() {
    }
}
