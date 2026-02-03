package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cljo extends fcyz implements fdat {
    int a;
    final /* synthetic */ cljp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cljo(cljp cljpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cljpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cljo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        try {
            if (i == 0) {
                fctl.b(obj);
                cljp cljpVar = this.b;
                if (((cqba) cljpVar.d.b()).a) {
                    ekrw ekrwVarH = cljp.a.h();
                    ekrwVarH.X(eksq.a, "BugleSatellite");
                    ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PeriodPullWorker$startWork$1", "invokeSuspend", 37, "PeriodPullWorker.kt")).q("Skip period pull work because Bugle is in foreground.");
                    return new qao();
                }
                clji cljiVar = (clji) cljpVar.c.b();
                this.a = 1;
                obj = cljiVar.a(this);
                if (obj != fcylVar) {
                }
                return fcylVar;
            }
            if (i != 1) {
                fctl.b(obj);
                return new qao();
            }
            fctl.b(obj);
        } catch (Exception e) {
            ekrw ekrwVarJ = cljp.a.j();
            ekrwVarJ.X(eksq.a, "BugleSatellite");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PeriodPullWorker$startWork$1", "invokeSuspend", 45, "PeriodPullWorker.kt")).q("Failed to pull messages for all available SIMs.");
        }
        if (!((Boolean) obj).booleanValue()) {
            ekrw ekrwVarH2 = cljp.a.h();
            ekrwVarH2.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PeriodPullWorker$startWork$1", "invokeSuspend", 48, "PeriodPullWorker.kt")).q("Skip period pull work because carrier is not enabled.");
            ekrw ekrwVarH3 = cljp.a.h();
            ekrwVarH3.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PeriodPullWorker$startWork$1", "invokeSuspend", 50, "PeriodPullWorker.kt")).q("Complete period pull work.");
            return new qao();
        }
        ekrw ekrwVarH4 = cljp.a.h();
        ekrwVarH4.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarH4.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PeriodPullWorker$startWork$1", "invokeSuspend", 41, "PeriodPullWorker.kt")).q("Start period pull work.");
        cljr cljrVar = (cljr) this.b.b.b();
        this.a = 2;
        if (cljrVar.a() == fcylVar) {
            return fcylVar;
        }
        return new qao();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cljo(this.b, fcxyVar);
    }
}
