package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcck implements Runnable {
    final /* synthetic */ fbol a;
    final /* synthetic */ fccv b;

    public fcck(fccv fccvVar, fbol fbolVar) {
        this.a = fbolVar;
        this.b = fccvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.i(this.a);
    }
}
