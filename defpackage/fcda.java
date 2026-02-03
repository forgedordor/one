package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcda implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ fcdb b;

    public fcda(fcdb fcdbVar, boolean z) {
        this.a = z;
        this.b = fcdbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            fcde fcdeVar = this.b.b;
            fcdeVar.o = true;
            if (fcdeVar.k > 0) {
                ejxm ejxmVar = fcdeVar.n;
                ejxmVar.e();
                ejxmVar.f();
            }
        }
        this.b.b.p = false;
    }
}
