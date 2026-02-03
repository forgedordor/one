package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pbm implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ pbn b;

    public pbm(pbn pbnVar, int i) {
        this.b = pbnVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.r(this.a, "Selection-Changed");
    }
}
