package defpackage;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aysr extends fcyz implements fdat {
    final /* synthetic */ ayss a;
    final /* synthetic */ UUID b;
    final /* synthetic */ azva c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aysr(ayss ayssVar, UUID uuid, azva azvaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ayssVar;
        this.b = uuid;
        this.c = azvaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aysr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrg ekrgVar = ayss.a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleBackup");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.V(10, TimeUnit.SECONDS);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/backup/analytics/BackupEventLogger$logStartEvent$1", "invokeSuspend", 64, "BackupEventLogger.kt")).t("Logging backup start event to clearcut: %s", "DATABASE_BACKUP");
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.BACKUP_WORKFLOW_EVENT, ellgVar);
        emni emniVar = (emni) emnj.a.createBuilder();
        emniVar.getClass();
        emnd.d(emniVar);
        UUID uuid = this.b;
        if (uuid != null) {
            emnd.c(cobs.a(uuid), emniVar);
        }
        ayss ayssVar = this.a;
        emnr emnrVar = (emnr) emns.a.createBuilder();
        emnrVar.getClass();
        evsn evsnVarBuild = emnrVar.build();
        evsnVarBuild.getClass();
        emniVar.copyOnWrite();
        emnj emnjVar = (emnj) emniVar.instance;
        emnjVar.d = (emns) evsnVarBuild;
        emnjVar.c = 5;
        if (ayssVar.c.a()) {
            emnd.b(this.c, emniVar);
        }
        elgr.b(emnd.a(emniVar), ellgVar);
        evsf builder = elgr.a(ellgVar).toBuilder();
        builder.getClass();
        ayssVar.a((ellg) builder, false);
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrwVarH2.X(ekrzVar, "BugleBackup");
        ekrd ekrdVar2 = (ekrd) ekrwVarH2;
        ekrdVar2.V(10, TimeUnit.SECONDS);
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/backup/analytics/BackupEventLogger$logStartEvent$1", "invokeSuspend", 77, "BackupEventLogger.kt")).t("Logged backup start event to clearcut: %s", "DATABASE_BACKUP");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aysr(this.a, this.b, this.c, fcxyVar);
    }
}
