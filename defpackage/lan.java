package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lan implements Runnable {
    final /* synthetic */ lbe a;
    final /* synthetic */ int b;

    public lan(lbe lbeVar, int i) {
        this.a = lbeVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
