package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgzr extends fgzh {
    private static final long serialVersionUID = -8104701402654687025L;
    private int a;
    private int b;
    private byte[] c;

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        stringBuffer.append(" ");
        stringBuffer.append(fhau.a(this.c));
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgzr();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.a = fgxcVar.c();
        this.b = fgxcVar.c();
        this.c = fgxcVar.h();
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.g(this.a);
        fgxeVar.g(this.b);
        fgxeVar.a(this.c);
    }
}
