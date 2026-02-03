package defpackage;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fezo {
    public static final String a(String str) {
        int i;
        str.getClass();
        int i2 = -1;
        int i3 = 0;
        if (!fdgn.G(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                ascii.getClass();
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = ascii.toLowerCase(locale);
                lowerCase.getClass();
                if (lowerCase.length() != 0) {
                    int length = lowerCase.length();
                    for (0; i < length; i + 1) {
                        char cCharAt = lowerCase.charAt(i);
                        i = (fdbq.a(cCharAt, 31) > 0 && fdbq.a(cCharAt, 127) < 0 && fdgn.N(" #%/:?@[\\]", cCharAt, 0, 6) == -1) ? i + 1 : 0;
                        return null;
                    }
                    return lowerCase;
                }
            } catch (IllegalArgumentException unused) {
            }
            return null;
        }
        InetAddress inetAddressB = (fdgn.t(str, "[") && fdgn.n(str, "]")) ? b(str, 1, str.length() - 1) : b(str, 0, str.length());
        if (inetAddressB == null) {
            return null;
        }
        byte[] address = inetAddressB.getAddress();
        int length2 = address.length;
        if (length2 != 16) {
            if (length2 == 4) {
                return inetAddressB.getHostAddress();
            }
            throw new AssertionError(a.a(str, "Invalid IPv6 address: '", "'"));
        }
        address.getClass();
        int i4 = 0;
        int i5 = 0;
        while (i4 < address.length) {
            int i6 = i4;
            while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i2 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        ffez ffezVar = new ffez();
        while (i3 < address.length) {
            if (i3 == i2) {
                ffezVar.P(58);
                i3 += i5;
                if (i3 == 16) {
                    ffezVar.P(58);
                }
            } else {
                if (i3 > 0) {
                    ffezVar.P(58);
                }
                ffezVar.Y((fezr.A(address[i3]) << 8) | fezr.A(address[i3 + 1]));
                i3 += 2;
            }
        }
        return ffezVar.n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ba, code lost:
    
        if (r4 == 16) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bc, code lost:
    
        if (r5 == (-1)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00be, code lost:
    
        r13 = r4 - r5;
        java.lang.System.arraycopy(r1, r5, r1, 16 - r13, r13);
        java.util.Arrays.fill(r1, r5, (16 - r4) + r5, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d1, code lost:
    
        return java.net.InetAddress.getByAddress(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.net.InetAddress b(java.lang.String r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fezo.b(java.lang.String, int, int):java.net.InetAddress");
    }
}
