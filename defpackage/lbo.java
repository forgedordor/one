package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lbo {
    static final lbq a;
    static final lbo b;
    static final lbo c;
    public static final /* synthetic */ int d = 0;
    private static final String e;
    private static final String f;
    private final boolean g;
    private final int h;
    private final lbq i;

    static {
        lbq lbqVar = lbu.c;
        a = lbqVar;
        e = Character.toString((char) 8206);
        f = Character.toString((char) 8207);
        b = new lbo(false, 2, lbqVar);
        c = new lbo(true, 2, lbqVar);
    }

    public lbo(boolean z, int i, lbq lbqVar) {
        this.g = z;
        this.h = i;
        this.i = lbqVar;
    }

    public static lbo a() {
        return new lbm().a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r1 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r2 != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r0.c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        switch(r0.a()) {
            case 14: goto L62;
            case 15: goto L62;
            case 16: goto L61;
            case 17: goto L61;
            case 18: goto L60;
            default: goto L67;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        if (r1 != r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        if (r1 != r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007e, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int d(java.lang.CharSequence r9) {
        /*
            lbn r0 = new lbn
            r0.<init>(r9)
            r9 = 0
            r0.c = r9
            r1 = r9
            r2 = r1
            r3 = r2
        Lb:
            int r4 = r0.c
            int r5 = r0.b
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L65
            if (r1 != 0) goto L65
            java.lang.CharSequence r5 = r0.a
            char r4 = r5.charAt(r4)
            r0.d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.c
            int r8 = java.lang.Character.charCount(r4)
            int r5 = r5 + r8
            r0.c = r5
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L42
        L37:
            int r4 = r0.c
            int r4 = r4 + r7
            r0.c = r4
            char r4 = r0.d
            byte r4 = defpackage.lbn.b(r4)
        L42:
            if (r4 == 0) goto L60
            if (r4 == r7) goto L5d
            r5 = 2
            if (r4 == r5) goto L5d
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L59;
                case 15: goto L59;
                case 16: goto L55;
                case 17: goto L55;
                case 18: goto L51;
                default: goto L50;
            }
        L50:
            goto L63
        L51:
            int r3 = r3 + (-1)
            r2 = r9
            goto Lb
        L55:
            int r3 = r3 + 1
            r2 = r7
            goto Lb
        L59:
            int r3 = r3 + 1
            r2 = r6
            goto Lb
        L5d:
            if (r3 != 0) goto L63
            return r7
        L60:
            if (r3 != 0) goto L63
            return r6
        L63:
            r1 = r3
            goto Lb
        L65:
            if (r1 != 0) goto L68
            return r9
        L68:
            if (r2 != 0) goto L83
        L6a:
            int r2 = r0.c
            if (r2 <= 0) goto L82
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L7c;
                case 15: goto L7c;
                case 16: goto L79;
                case 17: goto L79;
                case 18: goto L76;
                default: goto L75;
            }
        L75:
            goto L6a
        L76:
            int r3 = r3 + 1
            goto L6a
        L79:
            if (r1 != r3) goto L7f
            return r7
        L7c:
            if (r1 != r3) goto L7f
            return r6
        L7f:
            int r3 = r3 + (-1)
            goto L6a
        L82:
            return r9
        L83:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbo.d(java.lang.CharSequence):int");
    }

    private static int e(CharSequence charSequence) {
        lbn lbnVar = new lbn(charSequence);
        lbnVar.c = lbnVar.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (lbnVar.c > 0) {
                byte bA = lbnVar.a();
                if (bA != 0) {
                    if (bA == 1 || bA == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 == 0) {
                            break;
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }

    public final String b(String str) {
        return c(str, this.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c(java.lang.String r8, defpackage.lbq r9) {
        /*
            r7 = this;
            if (r8 != 0) goto L4
            r8 = 0
            return r8
        L4:
            int r0 = r8.length()
            boolean r9 = r9.a(r8, r0)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            int r1 = r7.h
            r1 = r1 & 2
            r2 = 0
            r3 = -1
            java.lang.String r4 = ""
            r5 = 1
            if (r1 == 0) goto L4e
            if (r9 == 0) goto L21
            lbq r1 = defpackage.lbu.b
            goto L23
        L21:
            lbq r1 = defpackage.lbu.a
        L23:
            int r6 = r8.length()
            boolean r1 = r1.a(r8, r6)
            boolean r6 = r7.g
            if (r6 != 0) goto L3d
            if (r1 != 0) goto L3a
            int r1 = d(r8)
            if (r1 != r5) goto L38
            goto L3a
        L38:
            r1 = r2
            goto L3d
        L3a:
            java.lang.String r1 = defpackage.lbo.e
            goto L4b
        L3d:
            if (r6 == 0) goto L4a
            if (r1 == 0) goto L47
            int r1 = d(r8)
            if (r1 != r3) goto L4a
        L47:
            java.lang.String r1 = defpackage.lbo.f
            goto L4b
        L4a:
            r1 = r4
        L4b:
            r0.append(r1)
        L4e:
            boolean r1 = r7.g
            if (r9 == r1) goto L65
            if (r5 == r9) goto L57
            r6 = 8234(0x202a, float:1.1538E-41)
            goto L59
        L57:
            r6 = 8235(0x202b, float:1.154E-41)
        L59:
            r0.append(r6)
            r0.append(r8)
            r6 = 8236(0x202c, float:1.1541E-41)
            r0.append(r6)
            goto L68
        L65:
            r0.append(r8)
        L68:
            if (r9 == 0) goto L6d
            lbq r9 = defpackage.lbu.b
            goto L6f
        L6d:
            lbq r9 = defpackage.lbu.a
        L6f:
            int r6 = r8.length()
            boolean r9 = r9.a(r8, r6)
            if (r1 != 0) goto L84
            if (r9 != 0) goto L81
            int r9 = e(r8)
            if (r9 != r5) goto L85
        L81:
            java.lang.String r4 = defpackage.lbo.e
            goto L91
        L84:
            r2 = r9
        L85:
            if (r1 == 0) goto L91
            if (r2 == 0) goto L8f
            int r8 = e(r8)
            if (r8 != r3) goto L91
        L8f:
            java.lang.String r4 = defpackage.lbo.f
        L91:
            r0.append(r4)
            java.lang.String r8 = r0.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbo.c(java.lang.String, lbq):java.lang.String");
    }
}
