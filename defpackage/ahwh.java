package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahwh extends fcyz implements fdat {
    final /* synthetic */ ahwi a;
    final /* synthetic */ enzp b;
    final /* synthetic */ UUID c;
    final /* synthetic */ aiba d;
    final /* synthetic */ enze e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahwh(ahwi ahwiVar, enzp enzpVar, UUID uuid, int i, aiba aibaVar, enze enzeVar, int i2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ahwiVar;
        this.b = enzpVar;
        this.c = uuid;
        this.f = i;
        this.d = aibaVar;
        this.e = enzeVar;
        this.g = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahwh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        try {
            ahwo ahwoVar = (ahwo) this.a.b.b();
            enzp enzpVar = this.b;
            UUID uuid = this.c;
            auvw.k(ahwoVar.b, null, null, new ahwm(ahwoVar, enzpVar, this.f, this.d, this.e, this.g, uuid, null), 3);
        } catch (Exception e) {
            ekrw ekrwVarJ = ahwi.a.j();
            ekrwVarJ.X(eksq.a, "BugleRestore");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/restore/analytics/BasicRestoreWorkflowStepsEventLoggers$logFailureEvent$1", "invokeSuspend", 160, "BasicRestoreWorkflowStepsEventLoggers.kt")).t("Failed to log failure event for: %s", this.b);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ahwh(this.a, this.b, this.c, this.f, this.d, this.e, this.g, fcxyVar);
    }
}
