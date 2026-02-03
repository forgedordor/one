package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahxb extends fcyz implements fdat {
    final /* synthetic */ UUID a;
    final /* synthetic */ ahxy b;
    final /* synthetic */ aiaf c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahxb(fcxy fcxyVar, UUID uuid, ahxy ahxyVar, aiaf aiafVar) {
        super(2, fcxyVar);
        this.a = uuid;
        this.b = ahxyVar;
        this.c = aiafVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahxb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrw ekrwVarH = ahxy.a.h();
        ekrwVarH.X(eksq.a, "BugleRestore");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/restore/impl/BasicRestoreWorkflowSteps$completeRestore$lambda$9$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 218, "BasicRestoreWorkflowSteps.kt");
        UUID uuid = this.a;
        ekrdVar.t("Requested restore completed [%s]", uuid);
        fcsu fcsuVar = this.b.c;
        ((aibb) fcsuVar.b()).b(uuid, 1);
        ((aibb) fcsuVar.b()).e(uuid);
        ((aibb) fcsuVar.b()).d(uuid, this.c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahxb ahxbVar = new ahxb(fcxyVar, this.a, this.b, this.c);
        ahxbVar.d = obj;
        return ahxbVar;
    }
}
