package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcbn implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ fcbw b;

    public fcbn(fcbw fcbwVar, int i) {
        this.a = i;
        this.b = fcbwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.e(this.a);
    }
}
