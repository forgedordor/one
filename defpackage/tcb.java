package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcb extends fcyz implements fdat {
    final /* synthetic */ tcd a;
    final /* synthetic */ UUID b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcb(tcd tcdVar, UUID uuid, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = tcdVar;
        this.b = uuid;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tcb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((ekrd) tcd.a.h().h("com/google/android/apps/messaging/backup/analytics/D2DEventLogger$logStartEvent$1", "invokeSuspend", 52, "D2DEventLogger.kt")).q("Logging D2D start event to clearcut.");
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.D2D_BACKUP_AND_RESTORE_EVENT, ellgVar);
        enoj enojVar = (enoj) enol.a.createBuilder();
        enojVar.getClass();
        enog.d(2, enojVar);
        enog.c(tcd.b(this.b), enojVar);
        enog.b(tcd.c(0, 0, 0), enojVar);
        enos enosVar = (enos) enot.a.createBuilder();
        enosVar.getClass();
        evsn evsnVarBuild = enosVar.build();
        evsnVarBuild.getClass();
        enojVar.copyOnWrite();
        enol enolVar = (enol) enojVar.instance;
        enolVar.d = (enot) evsnVarBuild;
        enolVar.c = 4;
        elgr.f(enog.a(enojVar), ellgVar);
        evsf builder = elgr.a(ellgVar).toBuilder();
        builder.getClass();
        ailn ailnVarA = ((aimb) this.a.a(true).b()).a();
        ailnVarA.d(emxt.D2D_BACKUP_AND_RESTORE_EVENT);
        ailnVarA.j((ellg) builder, aioj.LOG_SPEC_D2D_BACKUP_AND_RESTORE_EVENTS);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tcb(this.a, this.b, fcxyVar);
    }
}
