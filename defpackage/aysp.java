package defpackage;

import j$.time.Duration;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aysp extends fcyz implements fdat {
    final /* synthetic */ ayss a;
    final /* synthetic */ Duration b;
    final /* synthetic */ UUID c;
    final /* synthetic */ int d;
    final /* synthetic */ long e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;
    final /* synthetic */ int i;
    final /* synthetic */ azva j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aysp(ayss ayssVar, Duration duration, UUID uuid, int i, long j, int i2, int i3, int i4, int i5, azva azvaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ayssVar;
        this.b = duration;
        this.c = uuid;
        this.d = i;
        this.e = j;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = azvaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aysp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        int i;
        boolean z;
        ekrg ekrgVar;
        emnl emnlVarA;
        fctl.b(obj);
        ekrg ekrgVar2 = ayss.a;
        ekrw ekrwVarH = ekrgVar2.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleBackup");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.V(10, TimeUnit.SECONDS);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/backup/analytics/BackupEventLogger$logCompleteEvent$1", "invokeSuspend", 124, "BackupEventLogger.kt")).t("Logging backup complete event to clearcut: %s", "DATABASE_BACKUP");
        emni emniVar = (emni) emnj.a.createBuilder();
        emniVar.getClass();
        emnd.d(emniVar);
        emnm emnmVar = (emnm) emnn.a.createBuilder();
        emnmVar.getClass();
        Duration duration = this.b;
        evrj evrjVarA = evxd.a(duration);
        emnmVar.copyOnWrite();
        emnn emnnVar = (emnn) emnmVar.instance;
        emnnVar.c = evrjVarA;
        emnnVar.b |= 1;
        evsn evsnVarBuild = emnmVar.build();
        evsnVarBuild.getClass();
        emniVar.copyOnWrite();
        emnj emnjVar = (emnj) emniVar.instance;
        emnjVar.d = (emnn) evsnVarBuild;
        emnjVar.c = 6;
        UUID uuid = this.c;
        if (uuid != null) {
            emnd.c(cobs.a(uuid), emniVar);
        }
        int i2 = this.i;
        int i3 = this.h;
        int i4 = this.g;
        int i5 = this.f;
        if (duration.toMillis() == 0) {
            emnk emnkVar = (emnk) emnl.a.createBuilder();
            emnkVar.getClass();
            emne.c(i5 / 100, emnkVar);
            emne.b(i4 / 10, emnkVar);
            emne.d(i3 / 10, emnkVar);
            emne.e(i2 / 100, emnkVar);
            emnlVarA = emne.a(emnkVar);
            ekrgVar = ekrgVar2;
            i = 10;
            z = true;
        } else {
            i = 10;
            int i6 = this.d;
            z = true;
            emnk emnkVar2 = (emnk) emnl.a.createBuilder();
            emnkVar2.getClass();
            int iB = ayss.b(i6, duration);
            emnkVar2.copyOnWrite();
            ekrgVar = ekrgVar2;
            emnl emnlVar = (emnl) emnkVar2.instance;
            emnlVar.b |= 1;
            emnlVar.c = iB;
            int iB2 = ayss.b(0, duration);
            emnkVar2.copyOnWrite();
            emnl emnlVar2 = (emnl) emnkVar2.instance;
            emnlVar2.b |= 2;
            emnlVar2.d = iB2;
            emne.c(i5 / 100, emnkVar2);
            emne.b(i4 / 10, emnkVar2);
            emne.d(i3 / 10, emnkVar2);
            emne.e(i2 / 100, emnkVar2);
            emnlVarA = emne.a(emnkVar2);
        }
        long j = this.e;
        ayss ayssVar = this.a;
        emniVar.copyOnWrite();
        emnj emnjVar2 = (emnj) emniVar.instance;
        emnjVar2.g = emnlVarA;
        emnjVar2.b |= 8;
        emniVar.copyOnWrite();
        emnj emnjVar3 = (emnj) emniVar.instance;
        emnjVar3.b |= 16;
        emnjVar3.h = 150;
        emniVar.copyOnWrite();
        emnj emnjVar4 = (emnj) emniVar.instance;
        emnjVar4.b |= 32;
        emnjVar4.i = (int) j;
        if (ayssVar.c.a()) {
            emnd.b(this.j, emniVar);
        }
        emnj emnjVarA = emnd.a(emniVar);
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.BACKUP_WORKFLOW_EVENT, ellgVar);
        elgr.b(emnjVarA, ellgVar);
        evsf builder = elgr.a(ellgVar).toBuilder();
        builder.getClass();
        ayssVar.a((ellg) builder, z);
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrwVarH2.X(ekrzVar, "BugleBackup");
        ekrd ekrdVar2 = (ekrd) ekrwVarH2;
        ekrdVar2.V(i, TimeUnit.SECONDS);
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/backup/analytics/BackupEventLogger$logCompleteEvent$1", "invokeSuspend", 153, "BackupEventLogger.kt")).t("Logged backup complete event to clearcut: %s", "DATABASE_BACKUP");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aysp(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, fcxyVar);
    }
}
