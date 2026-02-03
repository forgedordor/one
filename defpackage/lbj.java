package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lbj implements Runnable {
    final /* synthetic */ lbz a;
    final /* synthetic */ Object b;

    public lbj(lbz lbzVar, Object obj) {
        this.a = lbzVar;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.accept(this.b);
    }
}
