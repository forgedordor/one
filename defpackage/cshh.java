package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cshh {
    private static final cczi a = cdag.h(cdag.b, "disable_logging_hades_sdk_event_logger", false);
    private final fcsu b;

    public cshh(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.b = fcsuVar;
    }

    public final void a(int i) {
        if (((Boolean) a.e()).booleanValue()) {
            return;
        }
        ailn ailnVarA = ((aimb) this.b.b()).a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.HADES_SDK_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        eodt eodtVar = (eodt) eodu.a.createBuilder();
        eodtVar.getClass();
        eodq eodqVar = (eodq) eods.a.createBuilder();
        eodqVar.getClass();
        eodqVar.copyOnWrite();
        eods eodsVar = (eods) eodqVar.instance;
        eodsVar.c = 1;
        eodsVar.b |= 1;
        eodqVar.copyOnWrite();
        eods eodsVar2 = (eods) eodqVar.instance;
        eodsVar2.b |= 2;
        eodsVar2.d = i;
        evsn evsnVarBuild = eodqVar.build();
        evsnVarBuild.getClass();
        eodtVar.copyOnWrite();
        eodu eoduVar = (eodu) eodtVar.instance;
        eoduVar.c = (eods) evsnVarBuild;
        eoduVar.b = 1;
        evsn evsnVarBuild2 = eodtVar.build();
        evsnVarBuild2.getClass();
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ellhVar2.as = (eodu) evsnVarBuild2;
        ellhVar2.d |= 65536;
        ailnVarA.j(ellgVar, aioj.LOG_SPEC_SPAM_EVENTS);
    }
}
