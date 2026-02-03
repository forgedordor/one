package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcca implements Runnable {
    final /* synthetic */ fccd a;

    public fcca(fccd fccdVar) {
        this.a = fccdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ejwl.m(((fcga) this.a.f).a.B.get(), "Channel must have been shut down");
    }
}
