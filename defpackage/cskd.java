package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cskd {
    public final asrf a;
    private final fcsu b;

    public cskd(fcsu fcsuVar, asrf asrfVar) {
        fcsuVar.getClass();
        asrfVar.getClass();
        this.b = fcsuVar;
        this.a = asrfVar;
    }

    public final void a(elpg elpgVar) {
        ailn ailnVarA = ((aimb) this.b.b()).a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_MESSAGE;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ellhVar2.l = elpgVar;
        ellhVar2.b |= 4;
        ailnVarA.j(ellgVar, aioj.LOG_SPEC_SPAM_EVENTS);
    }

    public final void b(basd basdVar, enxu enxuVar) {
        basdVar.getClass();
        elof elofVar = (elof) elpg.b.createBuilder();
        elofVar.getClass();
        elhf.f(basdVar.f(), elofVar);
        enyw enywVarA = this.a.a();
        enywVarA.getClass();
        elhf.g(enywVarA, elofVar);
        elhf.i(14, elofVar);
        elhf.h(6, elofVar);
        if (enxuVar != null) {
            elhf.e(enxuVar, elofVar);
        }
        a(elhf.a(elofVar));
    }

    public final void c(basd basdVar) {
        basdVar.getClass();
        elof elofVar = (elof) elpg.b.createBuilder();
        elofVar.getClass();
        elhf.f(basdVar.f(), elofVar);
        enyw enywVarA = this.a.a();
        enywVarA.getClass();
        elhf.g(enywVarA, elofVar);
        elhf.i(14, elofVar);
        elhf.h(2, elofVar);
        a(elhf.a(elofVar));
    }
}
