package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwp implements AutoCloseable, lvh {
    public final lwn a;
    public boolean b;
    private final String c;

    public lwp(String str, lwn lwnVar) {
        this.c = str;
        this.a = lwnVar;
    }

    public final void b(pix pixVar, lvc lvcVar) {
        if (this.b) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.b = true;
        lvcVar.c(this);
        pixVar.b(this.c, this.a.a());
    }

    @Override // defpackage.lvh
    public final void gL(lvj lvjVar, lva lvaVar) {
        if (lvaVar == lva.ON_DESTROY) {
            this.b = false;
            lvjVar.P().d(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
