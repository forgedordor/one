package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vak implements vwm {
    public final fcsu a;
    public final fcsu b;
    public final ekrg c;
    private final fcsu d;
    private final fdjx e;

    public vak(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fdjx fdjxVar) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        this.a = fcsuVar;
        this.d = fcsuVar2;
        this.b = fcsuVar3;
        this.e = fdjxVar;
        this.c = ekrg.c("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/analytics/MagicComposeSendClickedLogger");
    }

    @Override // defpackage.vwm
    public final void a(vvw vvwVar) {
        fcsu fcsuVar = this.d;
        if (((val) fcsuVar.b()).o()) {
            evsn evsnVarBuild = ((val) fcsuVar.b()).a().build();
            evsnVarBuild.getClass();
            enta entaVar = (enta) evsnVarBuild;
            ((val) fcsuVar.b()).i();
            if ((!((Boolean) crbf.bp.e()).booleanValue() || entaVar.c > 0 || entaVar.d > 0) && ((Boolean) crbf.aO.e()).booleanValue()) {
                if (((Number) crbf.bi.e()).longValue() > 0) {
                    auvw.k(this.e, null, null, new vaj(this, entaVar, null), 3);
                } else {
                    ((ekrd) this.c.f().h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/analytics/MagicComposeSendClickedLogger", "onSendClickedBeforeQueued", 86, "MagicComposeSendClickedLogger.kt")).q("Not delaying logging");
                    ((uzw) this.a.b()).m(entaVar);
                }
            }
        }
    }
}
