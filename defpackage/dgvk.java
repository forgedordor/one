package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgvk implements Runnable {
    final /* synthetic */ dgvm a;

    public dgvk(dgvm dgvmVar) {
        this.a = dgvmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            dgvm dgvmVar = this.a;
            dgvmVar.f(dgvmVar.a());
        } catch (Exception e) {
            dhja.i(e, "Error while referring: %s", e.getMessage());
            this.a.c(new dgvn("Error while rejecting refer: ".concat(String.valueOf(e.getMessage())), e));
        }
    }
}
