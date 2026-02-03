package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes6.dex */
public class fdhc extends fdgz {
    public static final String A(String str, CharSequence charSequence) {
        if (!fdgn.T(str, charSequence)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static final String B(String str, CharSequence charSequence) {
        if (!fdgn.L(str, charSequence)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - charSequence.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static final String C(String str, char c, String str2) {
        int iN = fdgn.N(str, c, 0, 6);
        if (iN == -1) {
            return str2;
        }
        String strSubstring = str.substring(iN + 1, str.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static final String D(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int iO = fdgn.O(str, str2, 0, false, 6);
        if (iO == -1) {
            return str3;
        }
        String strSubstring = str.substring(iO + str2.length(), str.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static final String E(String str, char c, String str2) {
        str.getClass();
        str2.getClass();
        int iP = fdgn.P(str, c, 0, 6);
        if (iP == -1) {
            return str2;
        }
        String strSubstring = str.substring(iP + 1, str.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static final List F(CharSequence charSequence) {
        return fdey.g(new fdhb(charSequence));
    }

    public static final boolean G(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (fdgn.O(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (M(charSequence, charSequence2, 0, charSequence.length(), z) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean H(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!fdfv.a(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean I(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!fdfv.d(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean J(CharSequence charSequence, char c) {
        charSequence.getClass();
        return fdgn.N(charSequence, c, 0, 2) >= 0;
    }

    public static /* synthetic */ boolean L(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence instanceof String ? fdgn.n((String) charSequence, (String) charSequence2) : fdgn.I(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), false);
    }

    static /* synthetic */ int M(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        fddq fddqVar = new fddq(fddu.f(i, 0), fddu.g(i2, charSequence.length()));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i3 = fddqVar.a;
            int i4 = fddqVar.b;
            int i5 = fddqVar.c;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                return -1;
            }
            int i6 = i3;
            while (!fdgn.I(charSequence2, 0, charSequence, i6, charSequence2.length(), z)) {
                if (i6 == i4) {
                    return -1;
                }
                i6 += i5;
            }
            return i6;
        }
        int i7 = fddqVar.a;
        int i8 = fddqVar.b;
        int i9 = fddqVar.c;
        if ((i9 <= 0 || i7 > i8) && (i9 >= 0 || i8 > i7)) {
            return -1;
        }
        int i10 = i7;
        while (true) {
            String str = (String) charSequence2;
            if (fdgn.k(str, 0, (String) charSequence, i10, str.length(), z)) {
                return i10;
            }
            if (i10 == i8) {
                return -1;
            }
            i10 += i9;
        }
    }

    public static /* synthetic */ int N(CharSequence charSequence, char c, int i, int i2) {
        charSequence.getClass();
        boolean z = charSequence instanceof String;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if (z) {
            return ((String) charSequence).indexOf(c, i);
        }
        char[] cArr = {c};
        int iF = fddu.f(i, 0);
        int iU = fdgn.u(charSequence);
        if (iF > iU) {
            return -1;
        }
        while (!fdfv.d(cArr[0], charSequence.charAt(iF), false)) {
            if (iF == iU) {
                return -1;
            }
            iF++;
        }
        return iF;
    }

    public static /* synthetic */ int O(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return fdgn.v(charSequence, str, i, z & ((i2 & 4) == 0));
    }

    public static /* synthetic */ int P(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = fdgn.u(charSequence);
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    public static final String Q(String str, int i) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            if (length > 0) {
                int i2 = 1;
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static /* synthetic */ List R(CharSequence charSequence, char[] cArr) {
        charSequence.getClass();
        return W(charSequence, String.valueOf(cArr[0]), 0);
    }

    public static /* synthetic */ List S(CharSequence charSequence, String[] strArr, int i, int i2) {
        charSequence.getClass();
        String str = strArr[0];
        int length = str.length();
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if (length != 0) {
            return W(charSequence, str, i);
        }
        final List listC = fcur.c(strArr);
        fdfk<fddq> fdfkVar = new fdfk(new fdga(charSequence, i, new fdat() { // from class: fdha
            /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x0024 A[EDGE_INSN: B:51:0x0024->B:6:0x0024 BREAK  A[LOOP:0: B:16:0x0052->B:27:0x0084]] */
            @Override // defpackage.fdat
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(java.lang.Object r14, java.lang.Object r15) {
                /*
                    r13 = this;
                    r2 = r14
                    java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                    java.lang.Integer r15 = (java.lang.Integer) r15
                    int r14 = r15.intValue()
                    r2.getClass()
                    java.util.List r15 = r1
                    int r0 = r15.size()
                    r1 = 1
                    r3 = 0
                    r6 = 0
                    if (r0 != r1) goto L32
                    java.lang.Object r15 = defpackage.fcva.W(r15)
                    java.lang.String r15 = (java.lang.String) r15
                    r0 = 4
                    int r14 = defpackage.fdgn.O(r2, r15, r14, r3, r0)
                    if (r14 >= 0) goto L27
                L24:
                    r0 = r6
                    goto Lc6
                L27:
                    java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                    fcti r0 = new fcti
                    r0.<init>(r14, r15)
                    goto Lc6
                L32:
                    int r14 = defpackage.fddu.f(r14, r3)
                    fddq r0 = new fddq
                    int r1 = r2.length()
                    r0.<init>(r14, r1)
                    boolean r14 = r2 instanceof java.lang.String
                    if (r14 == 0) goto L86
                    int r14 = r0.a
                    int r1 = r0.b
                    int r0 = r0.c
                    if (r0 <= 0) goto L4d
                    if (r14 <= r1) goto L51
                L4d:
                    if (r0 >= 0) goto L24
                    if (r1 > r14) goto L24
                L51:
                    r10 = r14
                L52:
                    java.util.Iterator r14 = r15.iterator()
                L56:
                    boolean r3 = r14.hasNext()
                    if (r3 == 0) goto L73
                    java.lang.Object r3 = r14.next()
                    r7 = r3
                    java.lang.String r7 = (java.lang.String) r7
                    r9 = r2
                    java.lang.String r9 = (java.lang.String) r9
                    int r11 = r7.length()
                    r12 = 0
                    r8 = 0
                    boolean r4 = defpackage.fdgn.k(r7, r8, r9, r10, r11, r12)
                    if (r4 == 0) goto L56
                    goto L74
                L73:
                    r3 = r6
                L74:
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 == 0) goto L82
                    java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
                    fcti r0 = new fcti
                    r0.<init>(r14, r3)
                    goto Lc6
                L82:
                    if (r10 == r1) goto L24
                    int r10 = r10 + r0
                    goto L52
                L86:
                    int r14 = r0.a
                    int r7 = r0.b
                    int r8 = r0.c
                    if (r8 <= 0) goto L90
                    if (r14 <= r7) goto L94
                L90:
                    if (r8 >= 0) goto L24
                    if (r7 > r14) goto L24
                L94:
                    r3 = r14
                L95:
                    java.util.Iterator r14 = r15.iterator()
                L99:
                    boolean r0 = r14.hasNext()
                    if (r0 == 0) goto Lb3
                    java.lang.Object r9 = r14.next()
                    r0 = r9
                    java.lang.String r0 = (java.lang.String) r0
                    int r4 = r0.length()
                    r5 = 0
                    r1 = 0
                    boolean r0 = defpackage.fdgn.I(r0, r1, r2, r3, r4, r5)
                    if (r0 == 0) goto L99
                    goto Lb4
                Lb3:
                    r9 = r6
                Lb4:
                    java.lang.String r9 = (java.lang.String) r9
                    if (r9 == 0) goto Lc2
                    java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
                    fcti r0 = new fcti
                    r0.<init>(r14, r9)
                    goto Lc6
                Lc2:
                    if (r3 == r7) goto L24
                    int r3 = r3 + r8
                    goto L95
                Lc6:
                    if (r0 == 0) goto Ldc
                    java.lang.Object r14 = r0.b
                    java.lang.String r14 = (java.lang.String) r14
                    int r14 = r14.length()
                    java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                    java.lang.Object r15 = r0.a
                    fcti r0 = new fcti
                    r0.<init>(r15, r14)
                    return r0
                Ldc:
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.fdha.a(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }));
        ArrayList arrayList = new ArrayList(fcva.p(fdfkVar, 10));
        for (fddq fddqVar : fdfkVar) {
            fddqVar.getClass();
            arrayList.add(charSequence.subSequence(fddqVar.f().intValue(), fddqVar.e().intValue() + 1).toString());
        }
        return arrayList;
    }

    public static /* synthetic */ boolean T(CharSequence charSequence, CharSequence charSequence2) {
        if (!(charSequence2 instanceof String)) {
            return fdgn.I(charSequence, 0, charSequence2, 0, charSequence2.length(), false);
        }
        return fdgn.t((String) charSequence, (String) charSequence2);
    }

    public static /* synthetic */ String U(String str) {
        int iV = fdgn.V(str, "(");
        if (iV == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iV);
        strSubstring.getClass();
        return strSubstring;
    }

    public static /* synthetic */ int V(CharSequence charSequence, String str) {
        int iU = fdgn.u(charSequence);
        charSequence.getClass();
        return ((String) charSequence).lastIndexOf(str, iU);
    }

    private static final List W(CharSequence charSequence, String str, int i) {
        int iV = fdgn.v(charSequence, str, 0, false);
        if (iV != -1) {
            if (i != 1) {
                boolean z = i > 0;
                ArrayList arrayList = new ArrayList(z ? fddu.g(i, 10) : 10);
                int length = 0;
                do {
                    arrayList.add(charSequence.subSequence(length, iV).toString());
                    length = str.length() + iV;
                    if (z && arrayList.size() == i - 1) {
                        break;
                    }
                    iV = fdgn.v(charSequence, str, length, false);
                } while (iV != -1);
                arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
                return arrayList;
            }
        }
        return fcva.b(charSequence.toString());
    }

    public static final int u(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static final int v(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? M(charSequence, str, i, charSequence.length(), z) : ((String) charSequence).indexOf(str, i);
    }

    public static final CharSequence w(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < i) {
            throw new IndexOutOfBoundsException(a.z(i, i2, "End index (", ") is less than start index (", ")."));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static final CharSequence x(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zA = fdfv.a(charSequence.charAt(true != z ? i : length));
            if (z) {
                if (!zA) {
                    break;
                }
                length--;
            } else if (zA) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final CharSequence y(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!fdfv.a(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    public static final CharSequence z(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!fdfv.a(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }
}
