package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfxm implements eora {
    final /* synthetic */ String a;
    final /* synthetic */ dfxn b;

    public dfxm(dfxn dfxnVar, String str) {
        this.a = str;
        this.b = dfxnVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((eksl) ((eksl) this.b.a.h()).h("com/google/android/ims/messaging/v2/TriggerGroupNotificationOperationResultProcessor$1", "onSuccess", 103, "TriggerGroupNotificationOperationResultProcessor.java")).t("[%s] Notification completed.", this.a);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((eksl) ((eksl) ((eksl) this.b.a.j()).g(th)).h("com/google/android/ims/messaging/v2/TriggerGroupNotificationOperationResultProcessor$1", "onFailure", 108, "TriggerGroupNotificationOperationResultProcessor.java")).D("[%s] Error while notifying operation completed: %s", this.a, th);
    }
}
