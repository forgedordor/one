package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcbs implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ fcbv b;

    public fcbs(fcbv fcbvVar, Object obj) {
        this.a = obj;
        this.b = fcbvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.c(this.a);
    }
}
