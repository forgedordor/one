package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcbr implements Runnable {
    final /* synthetic */ fbrg a;
    final /* synthetic */ fcbv b;

    public fcbr(fcbv fcbvVar, fbrg fbrgVar) {
        this.a = fbrgVar;
        this.b = fcbvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.b(this.a);
    }
}
