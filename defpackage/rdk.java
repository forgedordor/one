package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rdk implements Runnable {
    final /* synthetic */ rtd a;

    public rdk(rtd rtdVar) {
        this.a = rtdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.cancel(true);
    }
}
