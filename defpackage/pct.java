package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pct implements Runnable {
    final /* synthetic */ pcu a;

    public pct(pcu pcuVar) {
        this.a = pcuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.performHapticFeedback(0);
    }
}
