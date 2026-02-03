package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deew implements Runnable {
    final /* synthetic */ deex a;

    public deew(deex deexVar) {
        this.a = deexVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        deex deexVar = this.a;
        synchronized (deexVar.a) {
            deexVar.b.a();
        }
    }
}
