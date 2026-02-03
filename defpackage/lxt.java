package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxt implements Runnable {
    final /* synthetic */ lvc a;
    final /* synthetic */ lxw b;

    public lxt(lvc lvcVar, lxw lxwVar) {
        this.a = lvcVar;
        this.b = lxwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b);
    }
}
