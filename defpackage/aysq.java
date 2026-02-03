package defpackage;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aysq extends fcyz implements fdat {
    final /* synthetic */ ayss a;
    final /* synthetic */ UUID b;
    final /* synthetic */ emng c;
    final /* synthetic */ azva d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aysq(ayss ayssVar, int i, UUID uuid, emng emngVar, azva azvaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ayssVar;
        this.e = i;
        this.b = uuid;
        this.c = emngVar;
        this.d = azvaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aysq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/backup/analytics/BackupEventLogger$logFailedEvent$1", "invokeSuspend", 242, "BackupEventLogger.kt")).t("Logging backup failed event to clearcut: %s", "DATABASE_BACKUP");
        emni emniVar = (emni) emnj.a.createBuilder();
        emniVar.getClass();
        emnd.d(emniVar);
        emno emnoVar = (emno) emnq.a.createBuilder();
        emnoVar.getClass();
        emnoVar.copyOnWrite();
        emnq emnqVar = (emnq) emnoVar.instance;
        emnqVar.c = this.e - 1;
        emnqVar.b |= 1;
        emng emngVar = this.c;
        if (emngVar != null) {
            emnoVar.copyOnWrite();
            emnq emnqVar2 = (emnq) emnoVar.instance;
            emnqVar2.d = emngVar.p;
            emnqVar2.b |= 2;
        }
        UUID uuid = this.b;
        evsn evsnVarBuild = emnoVar.build();
        evsnVarBuild.getClass();
        emniVar.copyOnWrite();
        emnj emnjVar = (emnj) emniVar.instance;
        emnjVar.d = (emnq) evsnVarBuild;
        emnjVar.c = 7;
        if (uuid != null) {
            emnd.c(cobs.a(uuid), emniVar);
        }
        ayss ayssVar = this.a;
        if (ayssVar.c.a()) {
            emnd.b(this.d, emniVar);
        }
        emnj emnjVarA = emnd.a(emniVar);
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.BACKUP_WORKFLOW_EVENT, ellgVar);
        elgr.b(emnjVarA, ellgVar);
        evsf builder = elgr.a(ellgVar).toBuilder();
        builder.getClass();
        ayssVar.a((ellg) builder, false);
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrwVarH2.X(ekrzVar, "BugleBackup");
        ekrd ekrdVar2 = (ekrd) ekrwVarH2;
        ekrdVar2.V(10, TimeUnit.SECONDS);
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/backup/analytics/BackupEventLogger$logFailedEvent$1", "invokeSuspend", 258, "BackupEventLogger.kt")).t("Logged backup failed event to clearcut: %s", "DATABASE_BACKUP");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aysq(this.a, this.e, this.b, this.c, this.d, fcxyVar);
    }
}
