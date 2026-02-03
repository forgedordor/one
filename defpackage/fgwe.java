package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgwe extends fgzh {
    private static final long serialVersionUID = -4588601512069748050L;
    private byte[] a;

    @Override // defpackage.fgzh
    public final String a() throws UnknownHostException {
        try {
            InetAddress byAddress = InetAddress.getByAddress(null, this.a);
            if (byAddress.getAddress().length != 4) {
                return byAddress.getHostAddress();
            }
            StringBuffer stringBuffer = new StringBuffer("0:0:0:0:0:ffff:");
            byte[] bArr = this.a;
            int i = bArr[12] & 255;
            int i2 = bArr[13] & 255;
            int i3 = bArr[14] & 255;
            int i4 = bArr[15] & 255;
            stringBuffer.append(Integer.toHexString((i << 8) + i2));
            stringBuffer.append(':');
            stringBuffer.append(Integer.toHexString((i3 << 8) + i4));
            return stringBuffer.toString();
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgwe();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.a = fgxcVar.i(16);
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.a(this.a);
    }

    public final InetAddress e() {
        try {
            fgyu fgyuVar = this.f;
            return fgyuVar == null ? InetAddress.getByAddress(this.a) : InetAddress.getByAddress(fgyuVar.toString(), this.a);
        } catch (UnknownHostException unused) {
            return null;
        }
    }
}
