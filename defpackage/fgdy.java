package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgdy implements Runnable {
    final /* synthetic */ fggq a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ int d;

    public fgdy(fggq fggqVar, int i, long j, int i2) {
        this.a = fggqVar;
        this.b = i;
        this.c = j;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onThroughputObservation(this.b, this.c, this.d);
    }
}
