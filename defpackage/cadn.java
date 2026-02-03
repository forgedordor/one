package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cadn implements cadz {
    public final axky a;
    public final aurx b;
    public final dqsn c;
    public final egbf d;
    public final eosc e;
    public final eosc f;
    public final fhfu g;
    public final fcsu h;
    public final byeq i;

    public cadn(axky axkyVar, aurx aurxVar, fhfu fhfuVar, egbf egbfVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, byeq byeqVar, dqsn dqsnVar) {
        this.a = axkyVar;
        this.b = aurxVar;
        this.g = fhfuVar;
        this.d = egbfVar;
        this.e = eoscVar;
        this.f = eoscVar2;
        this.i = byeqVar;
        this.c = dqsnVar;
        this.h = fcsuVar;
    }

    @Override // defpackage.cadz
    public final eiju a(int i, caei caeiVar) {
        throw null;
    }

    public final void b() {
        aurx aurxVar = this.b;
        aurxVar.Q(auml.DISABLED);
        aurxVar.S(aumj.ENCRYPTION_STATUS_UNSPECIFIED);
        aurxVar.ah("");
    }

    public final void c() {
        this.c.g(new dqsm() { // from class: cadg
            @Override // defpackage.dqsm
            public final eieu a() {
                return eiiy.k("CCOOBS::notifyStateChange::runAfterCommit");
            }
        }, "CmsCompleteOptOutBnrStep#doWork", new Runnable() { // from class: cadh
            @Override // java.lang.Runnable
            public final void run() {
                cadn cadnVar = this.a;
                fhfu fhfuVar = cadnVar.g;
                ((aurx) fhfuVar.a.b()).getClass();
                axky axkyVar = (axky) fhfuVar.b.b();
                axkyVar.getClass();
                egbf egbfVar = (egbf) fhfuVar.c.b();
                egbfVar.getClass();
                egzh egzhVar = (egzh) fhfuVar.d.b();
                egzhVar.getClass();
                fdjx fdjxVar = (fdjx) fhfuVar.e.b();
                fdjxVar.getClass();
                new fhft(axkyVar, egbfVar, egzhVar, fdjxVar, (Optional) ((eyig) fhfuVar.f).a, fhfuVar.g, null).c.a(eijx.e(null), cpxy.a);
                if (cpyl.a() || ((Boolean) ((cczi) cpyl.Y.get()).e()).booleanValue()) {
                    cadnVar.b.L();
                }
            }
        });
    }
}
