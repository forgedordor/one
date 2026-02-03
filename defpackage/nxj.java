package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nxj {
    public static final Pattern a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern b = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final mfr c = new mfr();
    public final StringBuilder d = new StringBuilder();

    public static String a(mfr mfrVar, StringBuilder sb) {
        boolean z;
        char c;
        sb.setLength(0);
        int i = mfrVar.b;
        int i2 = mfrVar.c;
        loop0: while (true) {
            for (false; i < i2 && !z; true) {
                c = (char) mfrVar.a[i];
                z = (c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_');
            }
            sb.append(c);
            i++;
        }
        mfrVar.L(i - mfrVar.b);
        return sb.toString();
    }

    static String b(mfr mfrVar, StringBuilder sb) {
        c(mfrVar);
        if (mfrVar.a() == 0) {
            return null;
        }
        String strA = a(mfrVar, sb);
        if (!"".equals(strA)) {
            return strA;
        }
        char cJ = (char) mfrVar.j();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cJ);
        return sb2.toString();
    }

    static void c(mfr mfrVar) {
        while (true) {
            for (boolean z = true; mfrVar.a() > 0 && z; z = false) {
                int i = mfrVar.b;
                byte[] bArr = mfrVar.a;
                byte b2 = bArr[i];
                char c = (char) b2;
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    mfrVar.L(1);
                } else {
                    int i2 = mfrVar.c;
                    if (i + 2 <= i2) {
                        int i3 = i + 1;
                        if (b2 == 47) {
                            int i4 = i + 2;
                            if (bArr[i3] == 42) {
                                while (true) {
                                    int i5 = i4 + 1;
                                    if (i5 >= i2) {
                                        break;
                                    }
                                    if (((char) bArr[i4]) == '*' && ((char) bArr[i5]) == '/') {
                                        i2 = i4 + 2;
                                        i4 = i2;
                                    } else {
                                        i4 = i5;
                                    }
                                }
                                mfrVar.L(i2 - mfrVar.b);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }
}
