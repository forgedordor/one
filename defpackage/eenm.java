package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eenm implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ eenp b;

    public eenm(eenp eenpVar, int i) {
        this.a = i;
        this.b = eenpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.M(this.a);
    }
}
