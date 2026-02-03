package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fclg implements Runnable {
    private final fbnz a;
    private final Throwable b;

    public fclg(fbnz fbnzVar, Throwable th) {
        this.a = fbnzVar;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.j(this.b);
    }
}
