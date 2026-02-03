package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfwg implements eora {
    final /* synthetic */ String a;
    final /* synthetic */ dfwh b;

    public dfwg(dfwh dfwhVar, String str) {
        this.a = str;
        this.b = dfwhVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((eksl) ((eksl) this.b.a.h()).h("com/google/android/ims/messaging/v2/AddUserToGroupOperationResultProcessor$1", "onSuccess", 107, "AddUserToGroupOperationResultProcessor.java")).t("[%s] Notification completed.", this.a);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((eksl) ((eksl) ((eksl) this.b.a.j()).g(th)).h("com/google/android/ims/messaging/v2/AddUserToGroupOperationResultProcessor$1", "onFailure", 112, "AddUserToGroupOperationResultProcessor.java")).D("[%s] Error while notifying operation completed: %s", this.a, th);
    }
}
