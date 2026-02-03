package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgfh implements Runnable {
    final /* synthetic */ fgfw a;

    public fgfh(fgfw fgfwVar) {
        this.a = fgfwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fgfw fgfwVar = this.a;
        fgfwVar.m = fgfwVar.p;
        fgfwVar.p = null;
        fgfwVar.h();
    }
}
