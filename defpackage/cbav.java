package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbav implements caxw {
    int a = 0;

    @Override // defpackage.caxw
    public final caxv a() {
        this.a += 3;
        return new caxv() { // from class: cbau
            @Override // defpackage.caxv, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                cbav cbavVar = this.a;
                cbavVar.a -= 3;
            }
        };
    }

    @Override // defpackage.caxw
    public final void b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = this.a; i > 0; i--) {
            sb.append(' ');
        }
        ekrw ekrwVarH = cbay.a.h();
        ekrwVarH.X(eksq.a, "pwq_state");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueDebugger$1", "emitLine", 238, "WorkQueueDebugger.java")).D("%s%s", sb, str);
    }

    @Override // defpackage.caxw
    public final void c() {
    }

    @Override // defpackage.caxw
    public final /* synthetic */ void d(String str) {
    }
}
