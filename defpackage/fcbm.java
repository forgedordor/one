package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcbm implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ fcbw b;

    public fcbm(fcbw fcbwVar, Object obj) {
        this.a = obj;
        this.b = fcbwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.f(this.a);
    }
}
