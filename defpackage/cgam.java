package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgam {
    public final fcsu a;
    public final fcsu b;
    private final cogw c;
    private final eosc d;

    public cgam(fcsu fcsuVar, cogw cogwVar, fcsu fcsuVar2, eosc eoscVar) {
        this.a = fcsuVar;
        this.c = cogwVar;
        this.b = fcsuVar2;
        this.d = eoscVar;
    }

    public final void a(final febx febxVar) {
        cogw cogwVar = this.c;
        final long epochMilli = cogwVar.f().toEpochMilli();
        final long jA = cogwVar.a();
        auvh.h(eijx.f(new Runnable() { // from class: cgal
            @Override // java.lang.Runnable
            public final void run() {
                febx febxVar2 = febxVar;
                febxVar2.copyOnWrite();
                fecc feccVar = (fecc) febxVar2.instance;
                fecc feccVar2 = fecc.a;
                feccVar.f = fhba.a(30);
                long j = epochMilli;
                evvp evvpVarC = evxc.c(j);
                febxVar2.copyOnWrite();
                fecc feccVar3 = (fecc) febxVar2.instance;
                evvpVarC.getClass();
                feccVar3.h = evvpVarC;
                feccVar3.b |= 4;
                aill aillVar = (aill) this.a.a.b();
                ellg ellgVar = (ellg) ellh.a.createBuilder();
                ellf ellfVar = ellf.XSL_REQUEST_EVENT;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                ellhVar.j = ellfVar.f11do;
                ellhVar.b |= 1;
                ellgVar.copyOnWrite();
                ellh ellhVar2 = (ellh) ellgVar.instance;
                fecc feccVar4 = (fecc) febxVar2.build();
                feccVar4.getClass();
                ellhVar2.aS = feccVar4;
                ellhVar2.e |= 16777216;
                aillVar.m(ellgVar, emxt.XSL_REQUEST_EVENT, new ainn(j, jA));
            }
        }, this.d));
    }

    public final void b(basd basdVar, febx febxVar) {
        double dDoubleValue = dfog.p().doubleValue();
        if (dDoubleValue < 1.0d) {
            String strF = basdVar.f();
            if (dDoubleValue <= 0.0d || strF.isEmpty() || Math.abs(strF.hashCode()) > ((int) (dDoubleValue * 2.147483647E9d))) {
                return;
            }
        }
        a(febxVar);
    }
}
