package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgwi extends fgzh {
    private static final long serialVersionUID = -2172609200849142323L;
    private int a;

    private static final byte[] f(int i) {
        return new byte[]{(byte) (i >> 24), (byte) ((i >>> 16) & 255), (byte) ((i >>> 8) & 255), (byte) (i & 255)};
    }

    @Override // defpackage.fgzh
    public final String a() {
        return fgwj.c(f(this.a));
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgwi();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) throws fhao {
        byte[] bArrI = fgxcVar.i(4);
        this.a = (bArrI[3] & 255) | ((bArrI[0] & 255) << 24) | ((bArrI[1] & 255) << 16) | ((bArrI[2] & 255) << 8);
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        fgxeVar.f(this.a & 4294967295L);
    }

    public final InetAddress e() {
        try {
            fgyu fgyuVar = this.f;
            return fgyuVar == null ? InetAddress.getByAddress(f(this.a)) : InetAddress.getByAddress(fgyuVar.toString(), f(this.a));
        } catch (UnknownHostException unused) {
            return null;
        }
    }
}
