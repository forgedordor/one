package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgxp extends fgzh {
    private static final long serialVersionUID = -4732870630947452112L;
    private byte[] a;
    private byte[] b;

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(h(this.a, true));
        stringBuffer.append(" ");
        stringBuffer.append(h(this.b, true));
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgxp();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.a = fgxcVar.j();
        this.b = fgxcVar.j();
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.c(this.a);
        fgxeVar.c(this.b);
    }
}
