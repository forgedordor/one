package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class estp implements esrw {
    private static final eksp a = eksp.c("xRPC");
    private diep b;
    private fbrj c;
    private long d;
    private estk e;

    @Override // defpackage.esrw
    public final /* synthetic */ estb a(esrs esrsVar) {
        return estb.a;
    }

    @Override // defpackage.esrw
    public final estb b(esrs esrsVar) {
        this.c = esrsVar.c.a;
        fbnc fbncVar = esrsVar.b;
        estk estkVar = (estk) fbncVar.h(estk.b);
        estkVar.getClass();
        this.e = estkVar;
        diep diepVarE = ((esmk) fbncVar.h(esml.a)).e();
        this.b = diepVarE;
        this.d = diepVarE.a();
        return estb.a;
    }

    @Override // defpackage.esrw
    public final /* synthetic */ estb c() {
        return estb.a;
    }

    @Override // defpackage.esrw
    public final void d(esrr esrrVar) {
        try {
            if (esrrVar.a.f()) {
                long jA = this.b.a() - this.d;
                if (this.c.equals(fbrj.UNARY)) {
                    if (jA > 2147483647L) {
                        ((eksl) ((eksl) a.j()).h("com/google/frameworks/client/data/android/metrics/NetworkLatencyInterceptor", "startOnCompleteProcessing", 52, "NetworkLatencyInterceptor.java")).q("Recorded latency overflows Integer.MAX_VALUE, cannot be recorded");
                        return;
                    }
                    estk estkVar = this.e;
                    int i = (int) jA;
                    boolean z = true;
                    ejwl.b(i >= 0, "Cannot record negative latency.");
                    if (estkVar.f.getAndSet(i) != -1) {
                        z = false;
                    }
                    ejwl.m(z, "Already recorded latency.");
                }
            }
        } catch (Throwable th) {
            ((eksl) ((eksl) ((eksl) a.i()).g(th)).h("com/google/frameworks/client/data/android/metrics/NetworkLatencyInterceptor", "startOnCompleteProcessing", ';', "NetworkLatencyInterceptor.java")).q("Failed to record network latency");
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
