package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxa implements Runnable {
    private final lvn a;
    private final lva b;
    private boolean c;

    public lxa(lvn lvnVar, lva lvaVar) {
        lvaVar.getClass();
        this.a = lvnVar;
        this.b = lvaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            return;
        }
        this.a.e(this.b);
        this.c = true;
    }
}
