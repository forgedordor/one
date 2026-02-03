package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhui {
    public static final int a(dhun dhunVar) {
        int iOrdinal = dhunVar.ordinal();
        if (iOrdinal == 0) {
            return 3;
        }
        if (iOrdinal == 1) {
            return 4;
        }
        if (iOrdinal == 2) {
            return 5;
        }
        if (iOrdinal == 3) {
            return 1;
        }
        if (iOrdinal == 4) {
            return 2;
        }
        if (iOrdinal == 5) {
            return 6;
        }
        throw new fctg();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int b(java.lang.String r11) {
        /*
            int r0 = r11.hashCode()
            java.lang.String r1 = "SUSPICIOUS"
            java.lang.String r2 = "PHISHING"
            java.lang.String r3 = "GIFT_CARD"
            r4 = 3
            r5 = 7
            r6 = 4
            r7 = 2
            r8 = 6
            r9 = 5
            switch(r0) {
                case -908719937: goto L3d;
                case -664540516: goto L36;
                case 2402104: goto L2d;
                case 140722205: goto L24;
                case 618719069: goto L1d;
                case 854821378: goto L14;
                default: goto L13;
            }
        L13:
            goto L45
        L14:
            java.lang.String r0 = "NOT_SUPPORTED"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L45
            return r4
        L1d:
            boolean r0 = r11.equals(r1)
            if (r0 == 0) goto L45
            return r5
        L24:
            java.lang.String r0 = "NOT_AVAILABLE"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L45
            return r6
        L2d:
            java.lang.String r0 = "NONE"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L45
            return r7
        L36:
            boolean r0 = r11.equals(r2)
            if (r0 == 0) goto L45
            return r8
        L3d:
            boolean r0 = r11.equals(r3)
            if (r0 != 0) goto L44
            goto L45
        L44:
            return r9
        L45:
            r0 = 1
            int r10 = r11.hashCode()     // Catch: java.lang.IllegalArgumentException -> Lad
            switch(r10) {
                case -1668928287: goto L8e;
                case -1188400723: goto L84;
                case -908719937: goto L7c;
                case -664540516: goto L74;
                case -99211486: goto L6a;
                case 343993882: goto L60;
                case 618719069: goto L58;
                case 1080303862: goto L4e;
                default: goto L4d;
            }
        L4d:
            goto L98
        L4e:
            java.lang.String r1 = "NO_POLICY_VIOLATION"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L98
            r11 = r0
            goto L99
        L58:
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L98
            r11 = r8
            goto L99
        L60:
            java.lang.String r1 = "NOT_AVAILABLE_POLICY_VIOLATION"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L98
            r11 = r4
            goto L99
        L6a:
            java.lang.String r1 = "UNSUPPORTED_POLICY_VIOLATION"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L98
            r11 = r7
            goto L99
        L74:
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L98
            r11 = r9
            goto L99
        L7c:
            boolean r11 = r11.equals(r3)
            if (r11 == 0) goto L98
            r11 = r6
            goto L99
        L84:
            java.lang.String r1 = "UNKNOWN_POLICY_VIOLATION"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L98
            r11 = 0
            goto L99
        L8e:
            java.lang.String r1 = "SENSITIVE_POLICY_VIOLATION"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L98
            r11 = r5
            goto L99
        L98:
            r11 = -1
        L99:
            switch(r11) {
                case 0: goto La8;
                case 1: goto La7;
                case 2: goto La6;
                case 3: goto La5;
                case 4: goto La4;
                case 5: goto La3;
                case 6: goto La2;
                case 7: goto L9f;
                default: goto L9c;
            }
        L9c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> Lad
            goto La9
        L9f:
            r11 = 8
            return r11
        La2:
            return r5
        La3:
            return r8
        La4:
            return r9
        La5:
            return r6
        La6:
            return r4
        La7:
            return r7
        La8:
            return r0
        La9:
            r11.<init>()     // Catch: java.lang.IllegalArgumentException -> Lad
            throw r11     // Catch: java.lang.IllegalArgumentException -> Lad
        Lad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhui.b(java.lang.String):int");
    }
}
