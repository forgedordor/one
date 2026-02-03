package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcci implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ fccv b;

    public fcci(fccv fccvVar, int i) {
        this.a = i;
        this.b = fccvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.k(this.a);
    }
}
