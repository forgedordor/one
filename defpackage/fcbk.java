package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcbk implements Runnable {
    final /* synthetic */ fbng a;
    final /* synthetic */ fbrg b;
    final /* synthetic */ fcbw c;

    public fcbk(fcbw fcbwVar, fbng fbngVar, fbrg fbrgVar) {
        this.a = fbngVar;
        this.b = fbrgVar;
        this.c = fcbwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b.a(this.a, this.b);
    }
}
