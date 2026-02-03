package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahxq extends fcyz implements fdap {
    int a;
    final /* synthetic */ UUID b;
    final /* synthetic */ ahxy c;
    final /* synthetic */ aiba d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahxq(UUID uuid, ahxy ahxyVar, aiba aibaVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = uuid;
        this.c = ahxyVar;
        this.d = aibaVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekrw ekrwVarH = ahxy.a.h();
            ekrwVarH.X(eksq.a, "BugleRestore");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/restore/impl/BasicRestoreWorkflowSteps$initializeRestore$2", "invokeSuspend", 92, "BasicRestoreWorkflowSteps.kt");
            UUID uuid = this.b;
            ekrdVar.t("Starting new Restore Execution [%s]", uuid);
            ahxy ahxyVar = this.c;
            ahxy.l(ahxyVar, enzp.INITIALIZE_RESTORE_WORKFLOW, uuid);
            ahwd ahwdVar = (ahwd) ahxyVar.b.b();
            aiba aibaVar = this.d;
            this.a = 1;
            if (ahwdVar.r(uuid, aibaVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ahxq(this.b, this.c, this.d, (fcxy) obj).b(fctx.a);
    }
}
