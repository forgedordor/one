package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhal extends fgzh {
    private static final long serialVersionUID = -4193583311594626915L;
    private byte[] a;

    @Override // defpackage.fgzh
    public final String a() {
        return i(this.a);
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fhal();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.a = fgxcVar.h();
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.a(this.a);
    }
}
