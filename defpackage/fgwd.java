package defpackage;

import java.net.InetAddress;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgwd extends fgzh {
    private static final long serialVersionUID = -8815026887337346789L;
    private int a;
    private InetAddress b;
    private fgyu c;

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        if (this.b != null) {
            stringBuffer.append(" ");
            stringBuffer.append(this.b.getHostAddress());
        }
        if (this.c != null) {
            stringBuffer.append(" ");
            stringBuffer.append(this.c);
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgwd();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) throws fhao {
        int iC = fgxcVar.c();
        this.a = iC;
        if (iC < 128) {
            byte[] bArr = new byte[16];
            int i = (135 - iC) / 8;
            fgxcVar.f(bArr, 16 - i, i);
            this.b = InetAddress.getByAddress(bArr);
        }
        if (this.a > 0) {
            this.c = new fgyu(fgxcVar);
        }
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.g(this.a);
        InetAddress inetAddress = this.b;
        if (inetAddress != null) {
            int i = (135 - this.a) / 8;
            fgxeVar.b(inetAddress.getAddress(), 16 - i, i);
        }
        fgyu fgyuVar = this.c;
        if (fgyuVar != null) {
            fgyuVar.h(fgxeVar, null, z);
        }
    }
}
