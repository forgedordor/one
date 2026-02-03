package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fccs implements Runnable {
    final /* synthetic */ fbrg a;
    final /* synthetic */ fccu b;

    public fccs(fccu fccuVar, fbrg fbrgVar) {
        this.a = fbrgVar;
        this.b = fccuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.c(this.a);
    }
}
