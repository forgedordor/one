package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgyn extends fgzh {
    private static final long serialVersionUID = -8689038598776316533L;
    private int a;
    private int b;
    private int c;
    private byte[] d;

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(' ');
        stringBuffer.append(this.b);
        stringBuffer.append(' ');
        stringBuffer.append(this.c);
        stringBuffer.append(' ');
        byte[] bArr = this.d;
        if (bArr == null) {
            stringBuffer.append('-');
        } else {
            stringBuffer.append(fhau.a(bArr));
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgyn();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) throws fhao {
        this.a = fgxcVar.c();
        this.b = fgxcVar.c();
        this.c = fgxcVar.b();
        int iC = fgxcVar.c();
        if (iC > 0) {
            this.d = fgxcVar.i(iC);
        } else {
            this.d = null;
        }
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.g(this.a);
        fgxeVar.g(this.b);
        fgxeVar.d(this.c);
        byte[] bArr = this.d;
        if (bArr == null) {
            fgxeVar.g(0);
        } else {
            fgxeVar.g(bArr.length);
            fgxeVar.a(this.d);
        }
    }
}
