package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class eiln implements lvz {
    public final /* synthetic */ eilo a;
    public final /* synthetic */ lvz b;
    public final /* synthetic */ String c;

    public /* synthetic */ eiln(eilo eiloVar, lvz lvzVar, String str) {
        this.a = eiloVar;
        this.b = lvzVar;
        this.c = str;
    }

    @Override // defpackage.lvz
    public final void a(Object obj) {
        lvz lvzVar = this.b;
        if (eidc.v()) {
            lvzVar.a(obj);
            return;
        }
        eieh eiehVarC = this.a.a.c(this.c, "com/google/apps/tiktok/tracing/contrib/support/arch/lifecycle/LiveDataTraceCreation", "observer", 32);
        try {
            lvzVar.a(obj);
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
