package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfxj implements eora {
    final /* synthetic */ cjlc a;
    final /* synthetic */ dfxk b;

    public dfxj(dfxk dfxkVar, cjlc cjlcVar) {
        this.a = cjlcVar;
        this.b = dfxkVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        eksl ekslVar = (eksl) ((eksl) this.b.a.h()).h("com/google/android/ims/messaging/v2/SendMessageOperationResultProcessor$1", "onSuccess", 131, "SendMessageOperationResultProcessor.java");
        cjjw cjjwVar = this.a.f;
        if (cjjwVar == null) {
            cjjwVar = cjjw.a;
        }
        ekslVar.t("[%s] Notification completed.", cjjwVar.c);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        eksl ekslVar = (eksl) ((eksl) ((eksl) this.b.a.j()).g(th)).h("com/google/android/ims/messaging/v2/SendMessageOperationResultProcessor$1", "onFailure", 136, "SendMessageOperationResultProcessor.java");
        cjjw cjjwVar = this.a.f;
        if (cjjwVar == null) {
            cjjwVar = cjjw.a;
        }
        ekslVar.D("[%s] Error while notifying operation completed: %s", cjjwVar.c, th);
    }
}
