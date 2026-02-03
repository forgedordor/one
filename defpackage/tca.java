package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tca extends fcyz implements fdat {
    final /* synthetic */ tcd a;
    final /* synthetic */ enoq b;
    final /* synthetic */ UUID c;
    final /* synthetic */ dbxl d;
    final /* synthetic */ boolean e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tca(tcd tcdVar, int i, enoq enoqVar, UUID uuid, dbxl dbxlVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = tcdVar;
        this.f = i;
        this.b = enoqVar;
        this.c = uuid;
        this.d = dbxlVar;
        this.e = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tca) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((ekrd) tcd.a.h().h("com/google/android/apps/messaging/backup/analytics/D2DEventLogger$logFailureEvent$1", "invokeSuspend", 178, "D2DEventLogger.kt")).q("Logging D2D failure event to clearcut.");
        enoj enojVar = (enoj) enol.a.createBuilder();
        enojVar.getClass();
        enog.d(this.f, enojVar);
        enog.b(tcd.c(0, 0, 0), enojVar);
        enoo enooVar = (enoo) enor.a.createBuilder();
        enooVar.getClass();
        enooVar.copyOnWrite();
        enor enorVar = (enor) enooVar.instance;
        enorVar.c = this.b.z;
        enorVar.b |= 1;
        evsn evsnVarBuild = enooVar.build();
        evsnVarBuild.getClass();
        enojVar.copyOnWrite();
        enol enolVar = (enol) enojVar.instance;
        enolVar.d = (enor) evsnVarBuild;
        enolVar.c = 6;
        evsf builder = enog.a(enojVar).toBuilder();
        builder.getClass();
        UUID uuid = this.c;
        if (uuid != null) {
            enoj enojVar2 = (enoj) builder;
            evqs evqsVarA = cobs.a(uuid);
            enojVar2.copyOnWrite();
            enol enolVar2 = (enol) enojVar2.instance;
            enolVar2.b |= 2;
            enolVar2.f = evqsVarA;
        }
        dbxl dbxlVar = this.d;
        if (dbxlVar != null) {
            enoj enojVar3 = (enoj) builder;
            enojVar3.copyOnWrite();
            enol enolVar3 = (enol) enojVar3.instance;
            enolVar3.h = dbxlVar.a();
            enolVar3.b |= 8;
        }
        tcd tcdVar = this.a;
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.D2D_BACKUP_AND_RESTORE_EVENT, ellgVar);
        evsn evsnVarBuild2 = ((enoj) builder).build();
        evsnVarBuild2.getClass();
        elgr.f((enol) evsnVarBuild2, ellgVar);
        evsf builder2 = elgr.a(ellgVar).toBuilder();
        builder2.getClass();
        ailn ailnVarA = ((aimb) tcdVar.a(this.e).b()).a();
        ailnVarA.d(emxt.D2D_BACKUP_AND_RESTORE_EVENT);
        ailnVarA.j((ellg) builder2, aioj.LOG_SPEC_D2D_BACKUP_AND_RESTORE_EVENTS);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tca(this.a, this.f, this.b, this.c, this.d, this.e, fcxyVar);
    }
}
