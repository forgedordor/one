package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class lbs implements lbq {
    private final lbr a;

    public lbs(lbr lbrVar) {
        this.a = lbrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    @Override // defpackage.lbq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.CharSequence r6, int r7) {
        /*
            r5 = this;
            if (r6 == 0) goto L3d
            if (r7 < 0) goto L3d
            int r0 = r6.length()
            int r0 = r0 - r7
            if (r0 < 0) goto L3d
            lbr r0 = r5.a
            if (r0 != 0) goto L10
            goto L36
        L10:
            r0 = 0
            r1 = 2
            r2 = r0
            r3 = r1
        L14:
            r4 = 1
            if (r2 >= r7) goto L32
            if (r3 != r1) goto L32
            char r3 = r6.charAt(r2)
            byte r3 = java.lang.Character.getDirectionality(r3)
            if (r3 == 0) goto L2e
            if (r3 == r4) goto L2c
            if (r3 == r1) goto L2c
            switch(r3) {
                case 14: goto L2e;
                case 15: goto L2e;
                case 16: goto L2c;
                case 17: goto L2c;
                default: goto L2a;
            }
        L2a:
            r3 = r1
            goto L2f
        L2c:
            r3 = r0
            goto L2f
        L2e:
            r3 = r4
        L2f:
            int r2 = r2 + 1
            goto L14
        L32:
            if (r3 == 0) goto L3c
            if (r3 == r4) goto L3b
        L36:
            boolean r6 = r5.b()
            return r6
        L3b:
            return r0
        L3c:
            return r4
        L3d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbs.a(java.lang.CharSequence, int):boolean");
    }

    protected abstract boolean b();
}
