package j$.time.format;

import j$.time.temporal.ChronoField;

/* loaded from: classes9.dex */
public final class h implements InterfaceC0031e {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ h(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static void a(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    public static int b(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if (cCharAt < '0' || cCharAt > '9') {
            return -1;
        }
        return cCharAt - '0';
    }

    @Override // j$.time.format.InterfaceC0031e
    public final boolean f(x xVar, StringBuilder sb) {
        switch (this.a) {
            case 0:
                Long lA = xVar.a(ChronoField.OFFSET_SECONDS);
                if (lA != null) {
                    sb.append("GMT");
                    int iK = j$.desugar.sun.nio.fs.g.K(lA.longValue());
                    if (iK != 0) {
                        int iAbs = Math.abs((iK / 3600) % 100);
                        int iAbs2 = Math.abs((iK / 60) % 60);
                        int iAbs3 = Math.abs(iK % 60);
                        sb.append(iK < 0 ? "-" : "+");
                        if (((TextStyle) this.b) != TextStyle.FULL) {
                            if (iAbs >= 10) {
                                sb.append((char) ((iAbs / 10) + 48));
                            }
                            sb.append((char) ((iAbs % 10) + 48));
                            if (iAbs2 != 0 || iAbs3 != 0) {
                                sb.append(':');
                                a(sb, iAbs2);
                                if (iAbs3 != 0) {
                                    sb.append(':');
                                    a(sb, iAbs3);
                                    break;
                                }
                            }
                        } else {
                            a(sb, iAbs);
                            sb.append(':');
                            a(sb, iAbs2);
                            if (iAbs3 != 0) {
                                sb.append(':');
                                a(sb, iAbs3);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                sb.append((String) this.b);
                break;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0124 A[PHI: r6 r14
      0x0124: PHI (r6v3 int) = (r6v2 int), (r6v4 int), (r6v4 int), (r6v4 int), (r6v4 int), (r6v4 int), (r6v4 int) binds: [B:50:0x00ce, B:55:0x00de, B:57:0x00e4, B:58:0x00e6, B:60:0x00ec, B:62:0x00f8, B:63:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r14v5 int) = (r14v4 int), (r14v7 int), (r14v7 int), (r14v7 int), (r14v7 int), (r14v7 int), (r14v7 int) binds: [B:50:0x00ce, B:55:0x00de, B:57:0x00e4, B:58:0x00e6, B:60:0x00ec, B:62:0x00f8, B:63:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // j$.time.format.InterfaceC0031e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j(j$.time.format.v r12, java.lang.CharSequence r13, int r14) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.h.j(j$.time.format.v, java.lang.CharSequence, int):int");
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "LocalizedOffset(" + String.valueOf((TextStyle) this.b) + ")";
            default:
                return "'" + ((String) this.b).replace("'", "''") + "'";
        }
    }
}
