package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfxd implements eora {
    final /* synthetic */ String a;
    final /* synthetic */ dfxe b;

    public dfxd(dfxe dfxeVar, String str) {
        this.a = str;
        this.b = dfxeVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((eksl) ((eksl) this.b.a.h()).h("com/google/android/ims/messaging/v2/RemoveUserFromGroupOperationResultProcessor$1", "onSuccess", 103, "RemoveUserFromGroupOperationResultProcessor.java")).t("[%s] Notification completed.", this.a);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((eksl) ((eksl) ((eksl) this.b.a.j()).g(th)).h("com/google/android/ims/messaging/v2/RemoveUserFromGroupOperationResultProcessor$1", "onFailure", 108, "RemoveUserFromGroupOperationResultProcessor.java")).D("[%s] Error while notifying operation completed: %s", this.a, th);
    }
}
