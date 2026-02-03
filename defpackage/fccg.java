package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fccg implements Runnable {
    final /* synthetic */ fbnr a;
    final /* synthetic */ fccv b;

    public fccg(fccv fccvVar, fbnr fbnrVar) {
        this.a = fbnrVar;
        this.b = fccvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.h(this.a);
    }
}
