package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciaa implements chzz {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public ciaa(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
    }

    private static ellg i() {
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.RCS_PROVISIONING;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        return ellgVar;
    }

    @Override // defpackage.chzz
    public final void a(elwc elwcVar) {
        aill aillVar = (aill) this.a.b();
        ellg ellgVarI = i();
        ellgVarI.copyOnWrite();
        ellh ellhVar = (ellh) ellgVarI.instance;
        ellh ellhVar2 = ellh.a;
        ellhVar.aC = elwcVar;
        ellhVar.e |= 8;
        aillVar.j(ellgVarI);
    }

    @Override // defpackage.chzz
    public final void b(enxe enxeVar) {
        aill aillVar = (aill) this.a.b();
        ellg ellgVarI = i();
        ellgVarI.copyOnWrite();
        ellh ellhVar = (ellh) ellgVarI.instance;
        ellh ellhVar2 = ellh.a;
        ellhVar.aA = enxeVar.ab;
        ellhVar.e |= 1;
        aillVar.j(ellgVarI);
    }

    @Override // defpackage.chzz
    public final void c(enxe enxeVar, double d) {
        aill aillVar = (aill) this.a.b();
        ellg ellgVarI = i();
        ellgVarI.copyOnWrite();
        ellh ellhVar = (ellh) ellgVarI.instance;
        ellh ellhVar2 = ellh.a;
        ellhVar.aA = enxeVar.ab;
        ellhVar.e |= 1;
        aillVar.p(ellgVarI, d);
    }

    @Override // defpackage.chzz
    public final void d(enxs enxsVar) {
        aill aillVar = (aill) this.a.b();
        ellg ellgVarI = i();
        ellgVarI.copyOnWrite();
        ellh ellhVar = (ellh) ellgVarI.instance;
        ellh ellhVar2 = ellh.a;
        enxsVar.getClass();
        ellhVar.aB = enxsVar;
        ellhVar.e |= 4;
        aillVar.j(ellgVarI);
    }

    @Override // defpackage.chzz
    public final void e(enxy enxyVar) {
        aill aillVar = (aill) this.a.b();
        ellg ellgVarI = i();
        ellgVarI.copyOnWrite();
        ellh ellhVar = (ellh) ellgVarI.instance;
        ellh ellhVar2 = ellh.a;
        enxyVar.getClass();
        ellhVar.aJ = enxyVar;
        ellhVar.e |= 4096;
        aillVar.j(ellgVarI);
    }

    @Override // defpackage.chzz
    public final void f(enya enyaVar) {
        aill aillVar = (aill) this.a.b();
        ellg ellgVarI = i();
        ellgVarI.copyOnWrite();
        ellh ellhVar = (ellh) ellgVarI.instance;
        ellh ellhVar2 = ellh.a;
        enyaVar.getClass();
        ellhVar.bl = enyaVar;
        ellhVar.f |= 262144;
        aillVar.j(ellgVarI);
    }

    @Override // defpackage.chzz
    public final void g(enyc enycVar) {
        ailn ailnVarA = ((aimb) this.c.b()).a();
        ellg ellgVarI = i();
        ellgVarI.copyOnWrite();
        ellh ellhVar = (ellh) ellgVarI.instance;
        ellh ellhVar2 = ellh.a;
        enycVar.getClass();
        ellhVar.cy = enycVar;
        ellhVar.i |= 32;
        ailnVarA.j(ellgVarI, aioj.LOG_SPEC_TRIGGER_EVENT_WHEN_CARRIER_SETUP_PENDING);
    }

    @Override // defpackage.chzz
    public final void h(chzy chzyVar, int i, dggn dggnVar) {
        aill aillVar = (aill) this.a.b();
        enwx enwxVar = (enwx) enwy.a.createBuilder();
        enwxVar.copyOnWrite();
        enwy enwyVar = (enwy) enwxVar.instance;
        enwyVar.c = chzyVar.a.a.N;
        enwyVar.b |= 1;
        enwxVar.copyOnWrite();
        enwy enwyVar2 = (enwy) enwxVar.instance;
        enwyVar2.d = chzyVar.b.a.N;
        enwyVar2.b |= 2;
        enwxVar.copyOnWrite();
        enwy enwyVar3 = (enwy) enwxVar.instance;
        enwyVar3.e = i - 1;
        enwyVar3.b |= 4;
        enpl enplVarB = ((dexw) this.b.b()).b(dggnVar);
        enwxVar.copyOnWrite();
        enwy enwyVar4 = (enwy) enwxVar.instance;
        enplVarB.getClass();
        enwyVar4.f = enplVarB;
        enwyVar4.b |= 8;
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.AVAILABILITY_LOG;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        enwy enwyVar5 = (enwy) enwxVar.build();
        enwyVar5.getClass();
        ellhVar2.al = enwyVar5;
        ellhVar2.d |= 128;
        aillVar.j(ellgVar);
    }
}
