package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhap extends fgzh {
    private static final long serialVersionUID = 4267576252335579764L;
    private byte[] a;

    @Override // defpackage.fgzh
    public final String a() {
        return h(this.a, true);
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fhap();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.a = fgxcVar.j();
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.c(this.a);
    }
}
