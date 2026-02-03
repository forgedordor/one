package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class eila implements dyub {
    public final /* synthetic */ eilb a;
    public final /* synthetic */ String b;
    public final /* synthetic */ dyub c;

    public /* synthetic */ eila(eilb eilbVar, String str, dyub dyubVar) {
        this.a = eilbVar;
        this.b = str;
        this.c = dyubVar;
    }

    @Override // defpackage.dyub
    public final void a(ejwi ejwiVar) {
        eigp eigpVar = this.a.a;
        String str = this.b;
        dyub dyubVar = this.c;
        eieh eiehVarC = eigpVar.c(str, "com/google/apps/tiktok/tracing/contrib/onegoogle/ExpressSignInTraceCreation", "onContinueWithAccount", 23);
        try {
            dyubVar.a(ejwiVar);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
