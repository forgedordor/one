package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgyl extends fgzh {
    private static final long serialVersionUID = -1037209403185658593L;
    private byte[] a;

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer("0x");
        stringBuffer.append(fhau.a(this.a));
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgyl();
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
