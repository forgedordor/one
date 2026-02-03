package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rsj implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ rsk b;

    public rsj(rsk rskVar, boolean z) {
        this.a = z;
        this.b = rskVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rvk.j();
        rsl rslVar = this.b.a;
        boolean z = rslVar.a;
        boolean z2 = this.a;
        rslVar.a = z2;
        if (z != z2) {
            rslVar.b.a(z2);
        }
    }
}
