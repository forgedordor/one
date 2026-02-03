package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czkm implements Runnable {
    final /* synthetic */ czkq a;

    public czkm(czkq czkqVar) {
        this.a = czkqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        czkq czkqVar = this.a;
        if (czkqVar.g == 8) {
            return;
        }
        czkqVar.g(false);
        czkqVar.i = czkqVar.k;
        czkqVar.j = czkqVar.l;
        czkqVar.g = 0;
        czkqVar.k(czkqVar.i, czkqVar.j);
        czkqVar.o = false;
    }
}
