package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcch implements Runnable {
    final /* synthetic */ fboo a;
    final /* synthetic */ fccv b;

    public fcch(fccv fccvVar, fboo fbooVar) {
        this.a = fbooVar;
        this.b = fccvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.j(this.a);
    }
}
