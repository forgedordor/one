package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epik {
    public static int a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -2132800435: goto L34;
                case 573789423: goto L2a;
                case 1073609822: goto L20;
                case 1420093966: goto L16;
                case 1430474003: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L3e
        Lc:
            java.lang.String r0 = "MODEL_PENPAL_DOGFOOD"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3e
            r5 = r3
            goto L3f
        L16:
            java.lang.String r0 = "MODEL_PENPAL_DEV"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3e
            r5 = r4
            goto L3f
        L20:
            java.lang.String r0 = "MODEL_PENPAL_PROD"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3e
            r5 = r2
            goto L3f
        L2a:
            java.lang.String r0 = "UNRECOGNIZED"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3e
            r5 = r1
            goto L3f
        L34:
            java.lang.String r0 = "PENPAL_ALS_MODEL_UNSPECIFIED"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3e
            r5 = 0
            goto L3f
        L3e:
            r5 = -1
        L3f:
            if (r5 == 0) goto L54
            if (r5 == r4) goto L53
            if (r5 == r3) goto L52
            if (r5 == r2) goto L50
            if (r5 != r1) goto L4a
            return r4
        L4a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        L50:
            r5 = 5
            return r5
        L52:
            return r1
        L53:
            return r2
        L54:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.epik.b(java.lang.String):int");
    }
}
