package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tcc extends fcyz implements fdat {
    final /* synthetic */ tcd a;
    final /* synthetic */ Duration b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ UUID f;
    final /* synthetic */ dbxl g;
    final /* synthetic */ boolean h;
    final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcc(tcd tcdVar, int i, Duration duration, int i2, int i3, int i4, UUID uuid, dbxl dbxlVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = tcdVar;
        this.i = i;
        this.b = duration;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = uuid;
        this.g = dbxlVar;
        this.h = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tcc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((ekrd) tcd.a.h().h("com/google/android/apps/messaging/backup/analytics/D2DEventLogger$logSuccessEvent$1", "invokeSuspend", 107, "D2DEventLogger.kt")).q("Logging D2D success event to clearcut.");
        evrj evrjVarA = evxd.a(this.b);
        enoj enojVar = (enoj) enol.a.createBuilder();
        enojVar.getClass();
        enog.d(this.i, enojVar);
        UUID uuid = this.f;
        if (uuid != null) {
            enog.c(tcd.b(uuid), enojVar);
        }
        enog.b(tcd.c(this.c, this.d, this.e), enojVar);
        enom enomVar = (enom) enon.a.createBuilder();
        enomVar.getClass();
        enomVar.copyOnWrite();
        enon enonVar = (enon) enomVar.instance;
        enonVar.c = evrjVarA;
        enonVar.b |= 1;
        evsn evsnVarBuild = enomVar.build();
        evsnVarBuild.getClass();
        enojVar.copyOnWrite();
        enol enolVar = (enol) enojVar.instance;
        enolVar.d = (enon) evsnVarBuild;
        enolVar.c = 5;
        evsf builder = enog.a(enojVar).toBuilder();
        builder.getClass();
        dbxl dbxlVar = this.g;
        enoj enojVar2 = (enoj) builder;
        if (dbxlVar != null) {
            enojVar2.copyOnWrite();
            enol enolVar2 = (enol) enojVar2.instance;
            enolVar2.h = dbxlVar.a();
            enolVar2.b |= 8;
        }
        tcd tcdVar = this.a;
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.D2D_BACKUP_AND_RESTORE_EVENT, ellgVar);
        evsn evsnVarBuild2 = enojVar2.build();
        evsnVarBuild2.getClass();
        elgr.f((enol) evsnVarBuild2, ellgVar);
        evsf builder2 = elgr.a(ellgVar).toBuilder();
        builder2.getClass();
        ailn ailnVarA = ((aimb) tcdVar.a(this.h).b()).a();
        ailnVarA.d(emxt.D2D_BACKUP_AND_RESTORE_EVENT);
        ailnVarA.j((ellg) builder2, aioj.LOG_SPEC_D2D_BACKUP_AND_RESTORE_EVENTS);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tcc(this.a, this.i, this.b, this.c, this.d, this.e, this.f, this.g, this.h, fcxyVar);
    }
}
