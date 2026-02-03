package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgwt extends fgxh {
    private int a;
    private int b;
    private int c;
    private InetAddress d;

    public fgwt() {
        super(8);
    }

    @Override // defpackage.fgxh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.d.getHostAddress());
        stringBuffer.append("/");
        stringBuffer.append(this.b);
        stringBuffer.append(", scope netmask ");
        stringBuffer.append(this.c);
        return stringBuffer.toString();
    }

    @Override // defpackage.fgxh
    public final void b(fgxc fgxcVar) throws UnknownHostException, fhao {
        int iB = fgxcVar.b();
        this.a = iB;
        if (iB != 1 && iB != 2) {
            throw new fhao("unknown address family");
        }
        int iC = fgxcVar.c();
        this.b = iC;
        if (iC > fgwj.a(this.a) * 8) {
            throw new fhao("invalid source netmask");
        }
        int iC2 = fgxcVar.c();
        this.c = iC2;
        if (iC2 > fgwj.a(this.a) * 8) {
            throw new fhao("invalid scope netmask");
        }
        byte[] bArrH = fgxcVar.h();
        int length = bArrH.length;
        if (length != ((this.b + 7) >> 3)) {
            throw new fhao("invalid address");
        }
        byte[] bArr = new byte[fgwj.a(this.a)];
        System.arraycopy(bArrH, 0, bArr, 0, length);
        try {
            InetAddress byAddress = InetAddress.getByAddress(bArr);
            this.d = byAddress;
            if (!fgwj.d(byAddress, this.b).equals(this.d)) {
                throw new fhao("invalid padding");
            }
        } catch (UnknownHostException e) {
            throw new fhao(e);
        }
    }

    @Override // defpackage.fgxh
    public final void c(fgxe fgxeVar) {
        fgxeVar.d(this.a);
        fgxeVar.g(this.b);
        fgxeVar.g(this.c);
        fgxeVar.b(this.d.getAddress(), 0, (this.b + 7) >> 3);
    }
}
