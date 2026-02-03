package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ammk implements eora {
    final /* synthetic */ amml a;

    public ammk(amml ammlVar) {
        this.a = ammlVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.e((ekgb) obj);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        eksl ekslVar = (eksl) amml.a.j();
        ekslVar.X(cqnc.t, this.a.i);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/DefaultBugleComposeConstraintsSupplier$2", "onFailure", 947, "DefaultBugleComposeConstraintsSupplier.java")).q("Failed to get updated recipients.");
    }
}
