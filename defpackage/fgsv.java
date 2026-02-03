package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgsv {
    public static final String[] a = {"*|", "|", "_", "-"};
    private static final String[] d = {"-", "_"};
    public final String b;
    public int c = 0;

    public fgsv(String str) {
        fgqz.g(str);
        this.b = str;
    }

    public static String f(String str) {
        StringBuilder sbE = fgre.e();
        char c = 0;
        for (char c2 : str.toCharArray()) {
            if (c2 == '\\') {
                if (c == '\\') {
                    sbE.append('\\');
                    c = 0;
                }
            } else {
                sbE.append(c2);
            }
            c = c2;
        }
        return fgre.c(sbE);
    }

    private final int p() {
        return this.b.length() - this.c;
    }

    public final char a() {
        int i = this.c;
        this.c = i + 1;
        return this.b.charAt(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053 A[LOOP:0: B:3:0x0009->B:37:0x0053, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0055 A[EDGE_INSN: B:45:0x0055->B:38:0x0055 BREAK  A[LOOP:0: B:3:0x0009->B:37:0x0053], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(char r13, char r14) {
        /*
            r12 = this;
            r0 = 0
            r1 = -1
            r2 = r0
            r3 = r2
            r4 = r3
            r7 = r4
            r8 = r7
            r5 = r1
            r6 = r5
        L9:
            boolean r9 = r12.i()
            if (r9 != 0) goto L55
            char r9 = r12.a()
            r10 = 92
            if (r2 == r10) goto L3e
            r10 = 39
            if (r9 != r10) goto L20
            if (r3 != 0) goto L21
            r4 = r4 ^ 1
            goto L29
        L20:
            r10 = r9
        L21:
            r11 = 34
            if (r10 != r11) goto L29
            if (r4 != 0) goto L29
            r3 = r3 ^ 1
        L29:
            if (r4 != 0) goto L50
            if (r3 != 0) goto L50
            if (r8 == 0) goto L30
            goto L50
        L30:
            if (r10 != r13) goto L39
            int r7 = r7 + 1
            if (r5 != r1) goto L49
            int r5 = r12.c
            goto L49
        L39:
            if (r10 != r14) goto L49
            int r7 = r7 + (-1)
            goto L49
        L3e:
            r10 = 81
            if (r9 != r10) goto L44
            r8 = 1
            goto L49
        L44:
            r10 = 69
            if (r9 != r10) goto L49
            r8 = r0
        L49:
            if (r7 <= 0) goto L50
            if (r2 == 0) goto L50
            int r2 = r12.c
            r6 = r2
        L50:
            if (r7 > 0) goto L53
            goto L55
        L53:
            r2 = r9
            goto L9
        L55:
            if (r6 < 0) goto L5e
            java.lang.String r13 = r12.b
            java.lang.String r13 = r13.substring(r5, r6)
            goto L60
        L5e:
            java.lang.String r13 = ""
        L60:
            if (r7 <= 0) goto L6d
            java.lang.String r14 = "Did not find balanced marker at '"
            java.lang.String r0 = "'"
            java.lang.String r14 = defpackage.a.a(r13, r14, r0)
            defpackage.fgqz.a(r14)
        L6d:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgsv.b(char, char):java.lang.String");
    }

    public final String c() {
        return d(d);
    }

    public final String d(String... strArr) {
        int i = this.c;
        boolean z = false;
        while (!i()) {
            if (this.b.charAt(this.c) == '\\' && p() > 1) {
                this.c += 2;
                z = true;
            } else {
                if (!n() && !m(strArr)) {
                    break;
                }
                this.c++;
            }
        }
        String strSubstring = this.b.substring(i, this.c);
        return z ? f(strSubstring) : strSubstring;
    }

    public final String e() {
        String str = this.b;
        String strSubstring = str.substring(this.c);
        this.c = str.length();
        return strSubstring;
    }

    public final void g(String str) {
        if (!k(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        if (length > p()) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.c += length;
    }

    public final boolean h() {
        boolean z = false;
        while (!i() && fgre.i(this.b.charAt(this.c))) {
            this.c++;
            z = true;
        }
        return z;
    }

    public final boolean i() {
        return p() == 0;
    }

    public final boolean j(String str) {
        if (!k(str)) {
            return false;
        }
        this.c += str.length();
        return true;
    }

    public final boolean k(String str) {
        return this.b.regionMatches(true, this.c, str, 0, str.length());
    }

    public final boolean l(char... cArr) {
        if (!i()) {
            for (int i = 0; i < 5; i++) {
                if (this.b.charAt(this.c) == cArr[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean m(String... strArr) {
        for (String str : strArr) {
            if (k(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        return !i() && Character.isLetterOrDigit(this.b.charAt(this.c));
    }

    public final String o() {
        String strE;
        String str = this.b;
        int iIndexOf = str.indexOf(")", this.c);
        if (iIndexOf != -1) {
            strE = str.substring(this.c, iIndexOf);
            this.c += strE.length();
        } else {
            strE = e();
        }
        j(")");
        return strE;
    }

    public final String toString() {
        return this.b.substring(this.c);
    }
}
