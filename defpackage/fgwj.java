package defpackage;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgwj {
    public static int a(int i) {
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 16;
        }
        throw new IllegalArgumentException("unknown address family");
    }

    public static int b(InetAddress inetAddress) {
        if (inetAddress instanceof Inet4Address) {
            return 1;
        }
        if (inetAddress instanceof Inet6Address) {
            return 2;
        }
        throw new IllegalArgumentException("unknown address family");
    }

    public static String c(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(bArr[0] & 255);
        stringBuffer.append(".");
        stringBuffer.append(bArr[1] & 255);
        stringBuffer.append(".");
        stringBuffer.append(bArr[2] & 255);
        stringBuffer.append(".");
        stringBuffer.append(bArr[3] & 255);
        return stringBuffer.toString();
    }

    public static InetAddress d(InetAddress inetAddress, int i) {
        int i2;
        int iA = a(b(inetAddress)) * 8;
        if (i > iA) {
            throw new IllegalArgumentException("invalid mask length");
        }
        if (i == iA) {
            return inetAddress;
        }
        byte[] address = inetAddress.getAddress();
        int i3 = i >> 3;
        int i4 = i3 + 1;
        while (true) {
            if (i4 >= address.length) {
                break;
            }
            address[i4] = 0;
            i4++;
        }
        int i5 = 0;
        for (i2 = 0; i2 < (i & 7); i2++) {
            i5 |= 1 << (7 - i2);
        }
        address[i3] = (byte) (address[i3] & i5);
        try {
            return InetAddress.getByAddress(address);
        } catch (UnknownHostException unused) {
            throw new IllegalArgumentException("invalid address");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
    
        if (r13[r8].length() == 0) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] e(java.lang.String r13, int r14) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgwj.e(java.lang.String, int):byte[]");
    }

    public static InetAddress[] f(String str) throws NumberFormatException, UnknownHostException {
        InetAddress byAddress;
        try {
            try {
                byte[] bArrE = e(str, 1);
                if (bArrE != null) {
                    byAddress = InetAddress.getByAddress(str, bArrE);
                } else {
                    byte[] bArrE2 = e(str, 2);
                    if (bArrE2 == null) {
                        StringBuffer stringBuffer = new StringBuffer("Invalid address: ");
                        stringBuffer.append(str);
                        throw new UnknownHostException(stringBuffer.toString());
                    }
                    byAddress = InetAddress.getByAddress(str, bArrE2);
                }
                return new InetAddress[]{byAddress};
            } catch (UnknownHostException unused) {
                fgya fgyaVar = new fgya(str, 1);
                fgzh[] fgzhVarArrE = fgyaVar.e();
                if (fgzhVarArrE != null) {
                    fgzh[] fgzhVarArrE2 = new fgya(str, 28).e();
                    if (fgzhVarArrE2 != null) {
                        int length = fgzhVarArrE.length;
                        int length2 = fgzhVarArrE2.length;
                        fgzh[] fgzhVarArr = new fgzh[length + length2];
                        System.arraycopy(fgzhVarArrE, 0, fgzhVarArr, 0, length);
                        System.arraycopy(fgzhVarArrE2, 0, fgzhVarArr, length, length2);
                        fgzhVarArrE = fgzhVarArr;
                    }
                } else if (fgyaVar.a() != 4 || (fgzhVarArrE = new fgya(str, 28).e()) == null) {
                    throw new UnknownHostException("unknown host");
                }
                InetAddress[] inetAddressArr = new InetAddress[fgzhVarArrE.length];
                for (int i = 0; i < fgzhVarArrE.length; i++) {
                    fgzh fgzhVar = fgzhVarArrE[i];
                    inetAddressArr[i] = InetAddress.getByAddress(str, (fgzhVar instanceof fgwi ? ((fgwi) fgzhVar).e() : ((fgwe) fgzhVar).e()).getAddress());
                }
                return inetAddressArr;
            }
        } catch (fhae unused2) {
            throw new UnknownHostException("invalid name");
        }
    }
}
