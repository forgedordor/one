package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvmh implements Runnable {
    final /* synthetic */ cvmj a;

    public cvmh(cvmj cvmjVar) {
        this.a = cvmjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.n.sendAccessibilityEvent(8);
        } catch (Exception unused) {
        }
    }
}
