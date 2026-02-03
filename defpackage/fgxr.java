package defpackage;

import java.net.InetAddress;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgxr extends fgzh {
    private static final long serialVersionUID = 3050449702765909687L;
    private int a;
    private int b;
    private int c;
    private Object d;
    private byte[] e;

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        stringBuffer.append(" ");
        stringBuffer.append(this.c);
        stringBuffer.append(" ");
        int i = this.b;
        if (i == 0) {
            stringBuffer.append(".");
        } else if (i == 1 || i == 2) {
            stringBuffer.append(((InetAddress) this.d).getHostAddress());
        } else if (i == 3) {
            stringBuffer.append(this.d);
        }
        if (this.e != null) {
            stringBuffer.append(" ");
            stringBuffer.append(fhaw.a(this.e));
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgxr();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) throws fhao {
        this.a = fgxcVar.c();
        this.b = fgxcVar.c();
        this.c = fgxcVar.c();
        int i = this.b;
        if (i == 0) {
            this.d = null;
        } else if (i == 1) {
            this.d = InetAddress.getByAddress(fgxcVar.i(4));
        } else if (i == 2) {
            this.d = InetAddress.getByAddress(fgxcVar.i(16));
        } else {
            if (i != 3) {
                throw new fhao("invalid gateway type");
            }
            this.d = new fgyu(fgxcVar);
        }
        if (fgxcVar.d() > 0) {
            this.e = fgxcVar.h();
        }
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.g(this.a);
        fgxeVar.g(this.b);
        fgxeVar.g(this.c);
        int i = this.b;
        if (i == 1 || i == 2) {
            fgxeVar.a(((InetAddress) this.d).getAddress());
        } else if (i == 3) {
            ((fgyu) this.d).h(fgxeVar, null, z);
        }
        byte[] bArr = this.e;
        if (bArr != null) {
            fgxeVar.a(bArr);
        }
    }
}
