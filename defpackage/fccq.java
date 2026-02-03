package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fccq implements Runnable {
    final /* synthetic */ fcmo a;
    final /* synthetic */ fccu b;

    public fccq(fccu fccuVar, fcmo fcmoVar) {
        this.a = fcmoVar;
        this.b = fccuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.d(this.a);
    }
}
