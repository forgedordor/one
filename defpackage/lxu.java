package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lxu implements Runnable {
    final /* synthetic */ lvc a;
    final /* synthetic */ lxw b;

    public lxu(lvc lvcVar, lxw lxwVar) {
        this.a = lvcVar;
        this.b = lxwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b);
    }
}
