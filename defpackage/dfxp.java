package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfxp implements eora {
    final /* synthetic */ String a;
    final /* synthetic */ dfxq b;

    public dfxp(dfxq dfxqVar, String str) {
        this.a = str;
        this.b = dfxqVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((eksl) ((eksl) this.b.a.h()).h("com/google/android/ims/messaging/v2/UpdateGroupOperationResultProcessor$1", "onSuccess", 103, "UpdateGroupOperationResultProcessor.java")).t("[%s] Notification completed.", this.a);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((eksl) ((eksl) ((eksl) this.b.a.j()).g(th)).h("com/google/android/ims/messaging/v2/UpdateGroupOperationResultProcessor$1", "onFailure", 108, "UpdateGroupOperationResultProcessor.java")).D("[%s] Error while notifying operation completed: %s", this.a, th);
    }
}
