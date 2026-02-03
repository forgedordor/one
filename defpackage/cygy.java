package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cygy extends fcyz implements fdat {
    final /* synthetic */ cyha a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cygy(fcxy fcxyVar, cyha cyhaVar) {
        super(2, fcxyVar);
        this.a = cyhaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cygy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "runWalCheckpoint", 128, "DatabaseMaintenancePlugin.kt")).q("Blocking new DB operations for maintenance");
        bxajVar.g(new fdae() { // from class: bxac
            @Override // defpackage.fdae
            public final Object invoke() {
                final bxaj bxajVar2 = bxajVar;
                long jF = bxajVar2.f(new fdae() { // from class: bxaa
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ekrg ekrgVar = bxaj.a;
                        ekrw ekrwVarH = ekrgVar.h();
                        ekrz ekrzVar = eksq.a;
                        ekrwVarH.X(ekrzVar, "BugleDatabase");
                        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "checkpointWal$lambda$5", 150, "DatabaseMaintenancePlugin.kt")).q("Checkpointing the Write Ahead Log");
                        Cursor cursorE = ((dqsy) bxajVar2.b.b()).e("pragma wal_checkpoint(FULL)", null);
                        cursorE.moveToFirst();
                        if (cursorE.getInt(0) == 1) {
                            ekrw ekrwVarI = ekrgVar.i();
                            ekrwVarI.X(ekrzVar, "BugleDatabase");
                            ((ekrd) ekrwVarI.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "checkpointWal$lambda$5", 157, "DatabaseMaintenancePlugin.kt")).q("DB was busy during checkpoint.");
                        }
                        return fctx.a;
                    }
                });
                ekrw ekrwVarH = bxaj.a.h();
                ekrwVarH.X(eksq.a, "BugleDatabase");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "checkpointWal", 160, "DatabaseMaintenancePlugin.kt")).s("Checkpoint completed in %dms.", jF);
                return fctx.a;
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cygy cygyVar = new cygy(fcxyVar, this.a);
        cygyVar.b = obj;
        return cygyVar;
    }
}
