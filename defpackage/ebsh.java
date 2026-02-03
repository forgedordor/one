package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebsh {
    private int a;

    private static boolean b(char c) {
        return "\\[]?*(|)^$.{}+".indexOf(c) >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x008e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean a(char[] r8, java.lang.StringBuilder r9, boolean r10) {
        /*
            r7 = this;
            int r0 = r8.length
        L1:
            int r1 = r7.a
            r2 = 0
            r3 = 1
            if (r1 >= r0) goto Lc6
            int r4 = r1 + 1
            r7.a = r4
            char r5 = r8[r1]
            r6 = 42
            if (r5 == r6) goto Lbf
            r6 = 44
            if (r5 == r6) goto Lb6
            r6 = 63
            if (r5 == r6) goto Laf
            r6 = 123(0x7b, float:1.72E-43)
            if (r5 == r6) goto La3
            r6 = 125(0x7d, float:1.75E-43)
            if (r5 == r6) goto L94
            r3 = 91
            if (r5 == r3) goto L4c
            r3 = 92
            if (r5 == r3) goto L36
            boolean r1 = b(r5)
            if (r1 == 0) goto L32
            r9.append(r3)
        L32:
            r9.append(r5)
            goto L1
        L36:
            if (r4 != r0) goto L39
            return r2
        L39:
            int r1 = r1 + 2
            r7.a = r1
            char r1 = r8[r4]
            boolean r2 = b(r1)
            if (r2 == 0) goto L48
            r9.append(r3)
        L48:
            r9.append(r1)
            goto L1
        L4c:
            r9.append(r5)
            int r1 = r7.a
            if (r1 != r0) goto L54
            goto L8e
        L54:
            int r3 = r1 + 1
            r7.a = r3
            char r1 = r8[r1]
            r3 = 33
            if (r1 != r3) goto L6d
            r1 = 94
            r9.append(r1)
            int r1 = r7.a
            if (r1 == r0) goto L8e
            int r3 = r1 + 1
            r7.a = r3
            char r1 = r8[r1]
        L6d:
            r3 = 93
            if (r1 != r3) goto L7e
            r9.append(r3)
            int r1 = r7.a
            if (r1 == r0) goto L1
            int r4 = r1 + 1
            r7.a = r4
            char r1 = r8[r1]
        L7e:
            if (r1 == r3) goto L8f
            r9.append(r1)
            int r1 = r7.a
            if (r1 == r0) goto L8e
            int r4 = r1 + 1
            r7.a = r4
            char r1 = r8[r1]
            goto L7e
        L8e:
            return r2
        L8f:
            r9.append(r3)
            goto L1
        L94:
            if (r10 == 0) goto L9c
            r8 = 41
            r9.append(r8)
            return r3
        L9c:
            java.lang.String r1 = "\\}"
            r9.append(r1)
            goto L1
        La3:
            r1 = 40
            r9.append(r1)
            boolean r1 = r7.a(r8, r9, r3)
            if (r1 != 0) goto L1
            return r2
        Laf:
            r1 = 46
            r9.append(r1)
            goto L1
        Lb6:
            if (r3 != r10) goto Lba
            r5 = 124(0x7c, float:1.74E-43)
        Lba:
            r9.append(r5)
            goto L1
        Lbf:
            java.lang.String r1 = ".*"
            r9.append(r1)
            goto L1
        Lc6:
            if (r1 != r0) goto Lc9
            return r3
        Lc9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebsh.a(char[], java.lang.StringBuilder, boolean):boolean");
    }
}
