package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fccj implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ fccv b;

    public fccj(fccv fccvVar, int i) {
        this.a = i;
        this.b = fccvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.l(this.a);
    }
}
