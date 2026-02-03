package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbuv implements fclz {
    public final fclz a;
    public boolean b = false;
    public int c = 0;
    private final Runnable d;

    public fbuv(fclz fclzVar, Runnable runnable) {
        this.a = fclzVar;
        this.d = runnable;
    }

    @Override // defpackage.fclz
    public final fcmd a(fcmc fcmcVar) {
        throw null;
    }

    public final Runnable b() {
        if (this.b && this.c == 0) {
            return this.d;
        }
        return null;
    }

    @Override // defpackage.fclz
    public final void c() {
        throw null;
    }
}
