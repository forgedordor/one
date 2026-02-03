package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckid {
    public final fcsu a;

    public ckid(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public final void a(int i) {
        ailn ailnVarA = ((aimb) this.a.b()).a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.REVOKE_CONSENT_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        enzy enzyVar = (enzy) enzz.a.createBuilder();
        eoaa eoaaVar = (eoaa) eoab.a.createBuilder();
        eoaaVar.copyOnWrite();
        eoab eoabVar = (eoab) eoaaVar.instance;
        eoabVar.c = i - 1;
        eoabVar.b |= 1;
        enzyVar.copyOnWrite();
        enzz enzzVar = (enzz) enzyVar.instance;
        eoab eoabVar2 = (eoab) eoaaVar.build();
        eoabVar2.getClass();
        enzzVar.c = eoabVar2;
        enzzVar.b = 2;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        enzz enzzVar2 = (enzz) enzyVar.build();
        enzzVar2.getClass();
        ellhVar2.ca = enzzVar2;
        ellhVar2.h |= 512;
        ailnVarA.h(ellgVar, aioj.LOG_SPEC_REVOKE_CONSENT_EVENTS);
    }
}
