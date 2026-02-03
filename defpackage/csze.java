package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csze {
    private final fcsu a;

    public csze(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    public final void a() {
        b(3);
    }

    public final void b(int i) {
        ailn ailnVarA = ((aimb) this.a.b()).a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.MEET_CALLING_EVENT, ellgVar);
        enud enudVar = (enud) enuf.a.createBuilder();
        enudVar.getClass();
        enudVar.copyOnWrite();
        enuf enufVar = (enuf) enudVar.instance;
        enufVar.c = i - 1;
        enufVar.b |= 1;
        evsn evsnVarBuild = enudVar.build();
        evsnVarBuild.getClass();
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.bU = (enuf) evsnVarBuild;
        ellhVar.h |= 8;
        ailnVarA.j((ellg) elgr.a(ellgVar).toBuilder(), aioj.LOG_SPEC_MEET_CALLING_EVENTS);
    }
}
