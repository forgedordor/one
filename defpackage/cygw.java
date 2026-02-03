package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cygw extends fcyz implements fdat {
    final /* synthetic */ cyha a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cygw(fcxy fcxyVar, cyha cyhaVar) {
        super(2, fcxyVar);
        this.a = cyhaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cygw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final bxaj bxajVar = this.a.d;
        if (((Boolean) bxajVar.d.get()).booleanValue()) {
            throw new RuntimeException("Cannot do maintenance while holding a transaction");
        }
        ekrw ekrwVarJ = bxaj.a.j();
        ekrwVarJ.X(eksq.a, "BugleDatabase");
        ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "runAnalyze", 144, "DatabaseMaintenancePlugin.kt")).q("Blocking new DB operations for maintenance");
        bxajVar.g(new fdae() { // from class: bxab
            @Override // defpackage.fdae
            public final Object invoke() {
                ekrg ekrgVar = bxaj.a;
                ekrw ekrwVarH = ekrgVar.h();
                ekrz ekrzVar = eksq.a;
                ekrwVarH.X(ekrzVar, "BugleDatabase");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "analyze", 164, "DatabaseMaintenancePlugin.kt")).q("Analyzing the database");
                final bxaj bxajVar2 = bxajVar;
                long jF = bxajVar2.f(new fdae() { // from class: bxaf
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ((dqsy) bxajVar2.b.b()).v("ANALYZE");
                        return fctx.a;
                    }
                });
                ekrw ekrwVarH2 = ekrgVar.h();
                ekrwVarH2.X(ekrzVar, "BugleDatabase");
                ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "analyze", 166, "DatabaseMaintenancePlugin.kt")).s("sqlite_stat1 updated in %dms.", jF);
                fcsu fcsuVar = bxajVar2.b;
                ((dqsy) fcsuVar.b()).v("DROP TABLE IF EXISTS foo_for_testing");
                ((dqsy) fcsuVar.b()).v("CREATE TABLE foo_for_testing (foo, bar)");
                ((dqsy) fcsuVar.b()).v("ANALYZE foo_for_testing");
                ((dqsy) fcsuVar.b()).v("DROP TABLE IF EXISTS foo_for_testing");
                return fctx.a;
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cygw cygwVar = new cygw(fcxyVar, this.a);
        cygwVar.b = obj;
        return cygwVar;
    }
}
