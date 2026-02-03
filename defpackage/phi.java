package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class phi implements pjl {
    public final pjo f;
    public final String g;
    public boolean h;

    public phi(pjo pjoVar, String str) {
        this.f = pjoVar;
        this.g = str;
    }

    protected final void k() {
        if (this.h) {
            pjk.b(21, "statement is closed");
            throw new fcta();
        }
    }

    @Override // defpackage.pjl
    public final /* synthetic */ boolean l() {
        return b(0) != 0;
    }

    protected final void m() {
        this.h = true;
    }
}
