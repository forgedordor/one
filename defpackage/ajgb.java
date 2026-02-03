package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajgb {
    private final fcsu a;
    private final fcsu b;

    public ajgb(fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    public final void a(emgo emgoVar) {
        fcsu fcsuVar = this.b;
        if (!((ajjp) fcsuVar.b()).b()) {
            ((ajjp) fcsuVar.b()).a();
            return;
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_REPORT_ISSUE_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        emgoVar.getClass();
        ellhVar2.ak = emgoVar;
        ellhVar2.d |= 64;
        ((aill) this.a.b()).j(ellgVar);
    }
}
