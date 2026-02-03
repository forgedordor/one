package defpackage;

import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qwo extends qwn {
    private static final fffd f;
    private static final fffd g;
    private static final fffd h;
    private static final fffd i;
    private static final fffd j;
    private final fffb k;
    private final ffez l;
    private int m = 0;
    private long n;
    private int o;
    private String p;

    static {
        fffd fffdVar = fffd.a;
        f = fffc.b("'\\");
        g = fffc.b("\"\\");
        h = fffc.b("{}[]:, \n\t\r\f/\\;#=");
        i = fffc.b("\n\r");
        j = fffc.b("*/");
    }

    public qwo(fffb fffbVar) {
        this.k = fffbVar;
        this.l = ((fffv) fffbVar).b;
        l(6);
    }

    private final void A() throws EOFException {
        long j2 = this.k.j(h);
        ffez ffezVar = this.l;
        if (j2 == -1) {
            j2 = ffezVar.b;
        }
        ffezVar.D(j2);
    }

    private final boolean B(int i2) throws qwk {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (i2 != 47 && i2 != 61) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        x();
        return false;
    }

    private final char r() throws qwk, EOFException {
        int i2;
        fffb fffbVar = this.k;
        if (!fffbVar.F(1L)) {
            throw d("Unterminated escape sequence");
        }
        ffez ffezVar = this.l;
        byte bD = ffezVar.d();
        if (bD == 10 || bD == 34 || bD == 39 || bD == 47 || bD == 92) {
            return (char) bD;
        }
        if (bD == 98) {
            return '\b';
        }
        if (bD == 102) {
            return '\f';
        }
        if (bD == 110) {
            return '\n';
        }
        if (bD == 114) {
            return '\r';
        }
        if (bD == 116) {
            return '\t';
        }
        if (bD != 117) {
            throw d("Invalid escape sequence: \\" + ((char) bD));
        }
        if (!fffbVar.F(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(e()));
        }
        char c = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            byte bC = ffezVar.c(i3);
            char c2 = (char) (c << 4);
            if (bC >= 48 && bC <= 57) {
                i2 = bC - 48;
            } else if (bC >= 97 && bC <= 102) {
                i2 = bC - 87;
            } else {
                if (bC < 65 || bC > 70) {
                    throw d("\\u".concat(ffezVar.o(4L)));
                }
                i2 = bC - 55;
            }
            c = (char) (c2 + i2);
        }
        ffezVar.D(4L);
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x01be, code lost:
    
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01c4, code lost:
    
        if (B(r11) == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01c6, code lost:
    
        r11 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01ca, code lost:
    
        if (r4 != 2) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01cc, code lost:
    
        if (r10 == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01d2, code lost:
    
        if (r6 != Long.MIN_VALUE) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01d4, code lost:
    
        if (r9 == 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01d7, code lost:
    
        r4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01d9, code lost:
    
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01dc, code lost:
    
        if (r6 != r16) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01de, code lost:
    
        if (r3 != 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01e0, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01e1, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01e2, code lost:
    
        if (r3 == 0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01e5, code lost:
    
        r6 = -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01e6, code lost:
    
        r22.n = r6;
        r11 = r18;
        r11.D(r1);
        r22.m = 16;
        r3 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01f4, code lost:
    
        r11 = r18;
        r4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01f8, code lost:
    
        r11 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01fa, code lost:
    
        if (r4 == 2) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01fd, code lost:
    
        if (r4 == 4) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01ff, code lost:
    
        if (r4 != 7) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0201, code lost:
    
        r22.o = r5;
        r3 = 17;
        r22.m = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0230, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x024f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int s() throws defpackage.qwk, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwo.s():int");
    }

    private final int t(String str, qwl qwlVar) {
        String[] strArr = qwlVar.a;
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(strArr[i2])) {
                this.m = 0;
                this.d[this.b - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (r4 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        return 47;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ab A[EDGE_INSN: B:128:0x01ab->B:81:0x01ab BREAK  A[LOOP:2: B:28:0x0066->B:93:0x01cb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int u(boolean r32) throws defpackage.qwk, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwo.u(boolean):int");
    }

    private final String v(fffd fffdVar) throws qwk {
        StringBuilder sb = null;
        while (true) {
            long j2 = this.k.j(fffdVar);
            if (j2 == -1) {
                throw d("Unterminated string");
            }
            ffez ffezVar = this.l;
            if (ffezVar.c(j2) != 92) {
                if (sb == null) {
                    String strO = ffezVar.o(j2);
                    ffezVar.d();
                    return strO;
                }
                sb.append(ffezVar.o(j2));
                ffezVar.d();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(ffezVar.o(j2));
            ffezVar.d();
            sb.append(r());
        }
    }

    private final String w() {
        long j2 = this.k.j(h);
        return j2 != -1 ? this.l.o(j2) : this.l.n();
    }

    private final void x() throws qwk {
        throw d("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private final void y(fffd fffdVar) throws qwk, EOFException {
        while (true) {
            long j2 = this.k.j(fffdVar);
            if (j2 == -1) {
                throw d("Unterminated string");
            }
            long j3 = 1 + j2;
            ffez ffezVar = this.l;
            if (ffezVar.c(j2) != 92) {
                ffezVar.D(j3);
                return;
            } else {
                ffezVar.D(j3);
                r();
            }
        }
    }

    private final void z() throws EOFException {
        long j2 = this.k.j(i);
        ffez ffezVar = this.l;
        ffezVar.D(j2 != -1 ? j2 + 1 : ffezVar.b);
    }

    @Override // defpackage.qwn
    public final double a() throws qwk, NumberFormatException, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 16) {
            this.m = 0;
            int[] iArr = this.e;
            int i2 = this.b - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.n;
        }
        if (iS == 17) {
            this.p = this.l.o(this.o);
        } else if (iS == 9) {
            this.p = v(g);
        } else if (iS == 8) {
            this.p = v(f);
        } else if (iS == 10) {
            this.p = w();
        } else if (iS != 11) {
            throw new qwj(qwl.b(this, "Expected a double but was "));
        }
        this.m = 11;
        try {
            double d = Double.parseDouble(this.p);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new qwk("JSON forbids NaN and infinities: " + d + " at path " + e());
            }
            this.p = null;
            this.m = 0;
            int[] iArr2 = this.e;
            int i3 = this.b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new qwj("Expected a double but was " + this.p + " at path " + e());
        }
    }

    @Override // defpackage.qwn
    public final int b() throws qwk, NumberFormatException, EOFException {
        String strV;
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 16) {
            long j2 = this.n;
            int i2 = (int) j2;
            if (j2 == i2) {
                this.m = 0;
                int[] iArr = this.e;
                int i3 = this.b - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new qwj("Expected an int but was " + j2 + " at path " + e());
        }
        if (iS == 17) {
            this.p = this.l.o(this.o);
        } else {
            if (iS == 9) {
                strV = v(g);
            } else if (iS == 8) {
                strV = v(f);
            } else if (iS != 11) {
                throw new qwj(qwl.b(this, "Expected an int but was "));
            }
            this.p = strV;
            try {
                int i4 = Integer.parseInt(strV);
                this.m = 0;
                int[] iArr2 = this.e;
                int i5 = this.b - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        }
        this.m = 11;
        try {
            double d = Double.parseDouble(this.p);
            int i6 = (int) d;
            if (i6 == d) {
                this.p = null;
                this.m = 0;
                int[] iArr3 = this.e;
                int i7 = this.b - 1;
                iArr3[i7] = iArr3[i7] + 1;
                return i6;
            }
            throw new qwj("Expected an int but was " + this.p + " at path " + e());
        } catch (NumberFormatException unused2) {
            throw new qwj("Expected an int but was " + this.p + " at path " + e());
        }
    }

    @Override // defpackage.qwn
    public final int c(qwl qwlVar) throws qwk, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS < 12 || iS > 15) {
            return -1;
        }
        if (iS == 15) {
            return t(this.p, qwlVar);
        }
        int iG = this.k.g(qwlVar.b);
        if (iG != -1) {
            this.m = 0;
            this.d[this.b - 1] = qwlVar.a[iG];
            return iG;
        }
        String str = this.d[this.b - 1];
        String strF = f();
        int iT = t(strF, qwlVar);
        if (iT != -1) {
            return iT;
        }
        this.m = 15;
        this.p = strF;
        this.d[this.b - 1] = str;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.m = 0;
        this.c[0] = 8;
        this.b = 1;
        this.l.B();
        this.k.close();
    }

    @Override // defpackage.qwn
    public final String f() throws qwk, EOFException {
        String strV;
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 14) {
            strV = w();
        } else if (iS == 13) {
            strV = v(g);
        } else if (iS == 12) {
            strV = v(f);
        } else {
            if (iS != 15) {
                throw new qwj(qwl.b(this, "Expected a name but was "));
            }
            strV = this.p;
        }
        this.m = 0;
        this.d[this.b - 1] = strV;
        return strV;
    }

    @Override // defpackage.qwn
    public final String g() throws qwk, EOFException {
        String strO;
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 10) {
            strO = w();
        } else if (iS == 9) {
            strO = v(g);
        } else if (iS == 8) {
            strO = v(f);
        } else if (iS == 11) {
            strO = this.p;
            this.p = null;
        } else if (iS == 16) {
            strO = Long.toString(this.n);
        } else {
            if (iS != 17) {
                throw new qwj(qwl.b(this, "Expected a string but was "));
            }
            strO = this.l.o(this.o);
        }
        this.m = 0;
        int[] iArr = this.e;
        int i2 = this.b - 1;
        iArr[i2] = iArr[i2] + 1;
        return strO;
    }

    @Override // defpackage.qwn
    public final void h() throws qwk, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 3) {
            throw new qwj(qwl.b(this, "Expected BEGIN_ARRAY but was "));
        }
        l(1);
        this.e[this.b - 1] = 0;
        this.m = 0;
    }

    @Override // defpackage.qwn
    public final void i() throws qwk, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 1) {
            throw new qwj(qwl.b(this, "Expected BEGIN_OBJECT but was "));
        }
        l(3);
        this.m = 0;
    }

    @Override // defpackage.qwn
    public final void j() throws qwk, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 4) {
            throw new qwj(qwl.b(this, "Expected END_ARRAY but was "));
        }
        int i2 = this.b;
        this.b = i2 - 1;
        int[] iArr = this.e;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.m = 0;
    }

    @Override // defpackage.qwn
    public final void k() throws qwk, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 2) {
            throw new qwj(qwl.b(this, "Expected END_OBJECT but was "));
        }
        int i2 = this.b;
        int i3 = i2 - 1;
        this.b = i3;
        this.d[i3] = null;
        int[] iArr = this.e;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.m = 0;
    }

    @Override // defpackage.qwn
    public final void m() throws qwk, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 14) {
            A();
        } else if (iS == 13) {
            y(g);
        } else if (iS == 12) {
            y(f);
        } else if (iS != 15) {
            throw new qwj(qwl.b(this, "Expected a name but was "));
        }
        this.m = 0;
        this.d[this.b - 1] = "null";
    }

    @Override // defpackage.qwn
    public final void n() throws qwk, EOFException {
        int i2 = 0;
        do {
            int iS = this.m;
            if (iS == 0) {
                iS = s();
            }
            if (iS == 3) {
                l(1);
            } else if (iS == 1) {
                l(3);
            } else {
                if (iS == 4) {
                    i2--;
                    if (i2 < 0) {
                        throw new qwj(qwl.b(this, "Expected a value but was "));
                    }
                    this.b--;
                } else if (iS == 2) {
                    i2--;
                    if (i2 < 0) {
                        throw new qwj(qwl.b(this, "Expected a value but was "));
                    }
                    this.b--;
                } else if (iS == 14 || iS == 10) {
                    A();
                } else if (iS == 9 || iS == 13) {
                    y(g);
                } else if (iS == 8 || iS == 12) {
                    y(f);
                } else if (iS == 17) {
                    this.l.D(this.o);
                } else if (iS == 18) {
                    throw new qwj(qwl.b(this, "Expected a value but was "));
                }
                this.m = 0;
            }
            i2++;
            this.m = 0;
        } while (i2 != 0);
        int[] iArr = this.e;
        int i3 = this.b - 1;
        iArr[i3] = iArr[i3] + 1;
        this.d[i3] = "null";
    }

    @Override // defpackage.qwn
    public final boolean o() throws qwk, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        return (iS == 2 || iS == 4 || iS == 18) ? false : true;
    }

    @Override // defpackage.qwn
    public final boolean p() throws qwk, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 5) {
            this.m = 0;
            int[] iArr = this.e;
            int i2 = this.b - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iS != 6) {
            throw new qwj(qwl.b(this, "Expected a boolean but was "));
        }
        this.m = 0;
        int[] iArr2 = this.e;
        int i3 = this.b - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    @Override // defpackage.qwn
    public final int q() throws qwk, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        switch (iS) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            default:
                return 10;
        }
    }

    public final String toString() {
        return "JsonReader(" + this.k.toString() + ")";
    }
}
