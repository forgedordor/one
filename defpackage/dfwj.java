package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfwj implements eora {
    final /* synthetic */ String a;
    final /* synthetic */ dfwk b;

    public dfwj(dfwk dfwkVar, String str) {
        this.a = str;
        this.b = dfwkVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((eksl) ((eksl) this.b.a.h()).h("com/google/android/ims/messaging/v2/CreateGroupOperationResultProcessor$1", "onSuccess", 110, "CreateGroupOperationResultProcessor.java")).t("[%s] Notification completed.", this.a);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((eksl) ((eksl) ((eksl) this.b.a.j()).g(th)).h("com/google/android/ims/messaging/v2/CreateGroupOperationResultProcessor$1", "onFailure", 115, "CreateGroupOperationResultProcessor.java")).D("[%s] Error while notifying operation completed: %s", this.a, th);
    }
}
