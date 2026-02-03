package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgzj extends Thread {
    private final fgyi a;
    private final Object b;
    private final fgzk c;
    private final fgxj d;

    public fgzj(fgzk fgzkVar, fgyi fgyiVar, Object obj, fgxj fgxjVar) {
        this.c = fgzkVar;
        this.a = fgyiVar;
        this.b = obj;
        this.d = fgxjVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.d.c(this.c.a(this.a));
        } catch (Exception e) {
            this.d.a(this.b, e);
        }
    }
}
