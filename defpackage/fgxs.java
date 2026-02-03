package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgxs extends fgzh {
    private static final long serialVersionUID = -8730801385178968798L;
    private byte[] a;
    private byte[] b;

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(h(this.a, true));
        if (this.b != null) {
            stringBuffer.append(" ");
            stringBuffer.append(h(this.b, true));
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgxs();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.a = fgxcVar.j();
        if (fgxcVar.d() > 0) {
            this.b = fgxcVar.j();
        }
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.c(this.a);
        byte[] bArr = this.b;
        if (bArr != null) {
            fgxeVar.c(bArr);
        }
    }
}
