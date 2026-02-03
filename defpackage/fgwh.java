package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgwh extends fgzh {
    private static final long serialVersionUID = -1348173791712935864L;
    private List a;

    public static boolean e(int i, int i2) {
        if (i == 1) {
            if (i2 > 32) {
                return false;
            }
        } else if (i == 2 && i2 > 128) {
            return false;
        }
        return true;
    }

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            stringBuffer.append((fgwg) it.next());
            if (it.hasNext()) {
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgwh();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) throws UnknownHostException, fhao {
        fgwg fgwgVar;
        this.a = new ArrayList(1);
        while (fgxcVar.d() != 0) {
            int iB = fgxcVar.b();
            int iC = fgxcVar.c();
            int iC2 = fgxcVar.c();
            boolean z = (iC2 & 128) != 0;
            byte[] bArrI = fgxcVar.i(iC2 & (-129));
            if (!e(iB, iC)) {
                throw new fhao("invalid prefix length");
            }
            if (iB == 1 || iB == 2) {
                int length = bArrI.length;
                int iA = fgwj.a(iB);
                if (length > iA) {
                    throw new fhao("invalid address length");
                }
                if (length != iA) {
                    byte[] bArr = new byte[iA];
                    System.arraycopy(bArrI, 0, bArr, 0, length);
                    bArrI = bArr;
                }
                InetAddress byAddress = InetAddress.getByAddress(bArrI);
                fgwgVar = new fgwg(fgwj.b(byAddress), z, byAddress, iC);
            } else {
                fgwgVar = new fgwg(iB, z, bArrI, iC);
            }
            this.a.add(fgwgVar);
        }
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        byte[] address;
        int length;
        for (fgwg fgwgVar : this.a) {
            int i = fgwgVar.a;
            if (i == 1 || i == 2) {
                address = ((InetAddress) fgwgVar.d).getAddress();
                int length2 = address.length;
                while (true) {
                    length2--;
                    if (length2 >= 0) {
                        if (address[length2] != 0) {
                            length = length2 + 1;
                            break;
                        }
                    } else {
                        length = 0;
                        break;
                    }
                }
            } else {
                address = (byte[]) fgwgVar.d;
                length = address.length;
            }
            int i2 = fgwgVar.b ? length | 128 : length;
            fgxeVar.d(i);
            fgxeVar.g(fgwgVar.c);
            fgxeVar.g(i2);
            fgxeVar.b(address, 0, length);
        }
    }
}
