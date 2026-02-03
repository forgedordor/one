package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdp {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    private final float[] e;

    public mdp(int i, int i2, float[] fArr) {
        mee.b(i > 0, "Input channel count must be positive.");
        mee.b(i2 > 0, "Output channel count must be positive.");
        mee.b(fArr.length == i * i2, "Coefficient array length is invalid.");
        this.a = i;
        this.b = i2;
        for (int i3 = 0; i3 < fArr.length; i3++) {
            if (fArr[i3] < 0.0f) {
                throw new IllegalArgumentException(a.e(i3, "Coefficient at index ", " is negative."));
            }
        }
        this.e = fArr;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        int i4 = 0;
        while (i4 < i) {
            int i5 = 0;
            while (i5 < i2) {
                float fA = a(i4, i5);
                boolean z4 = i4 == i5;
                if (fA != 1.0f && z4) {
                    z3 = false;
                }
                if (fA != 0.0f) {
                    z = false;
                    if (!z4) {
                        z2 = false;
                    }
                }
                i5++;
            }
            i4++;
        }
        this.c = z;
        this.d = this.a == this.b && z2 && z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.mdp b(int r5, int r6) {
        /*
            mdp r0 = new mdp
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            if (r5 != r6) goto L15
            int r3 = r6 * r6
            float[] r3 = new float[r3]
        Lb:
            if (r2 >= r6) goto L34
            int r4 = r6 * r2
            int r4 = r4 + r2
            r3[r4] = r1
            int r2 = r2 + 1
            goto Lb
        L15:
            r3 = 2
            r4 = 1
            if (r5 != r4) goto L26
            if (r6 != r3) goto L25
            float[] r5 = new float[r3]
            r5[r2] = r1
            r5[r4] = r1
            r6 = r3
            r3 = r5
            r5 = r4
            goto L34
        L25:
            r5 = r4
        L26:
            r1 = r5
            if (r5 != r3) goto L38
            if (r6 != r4) goto L39
            float[] r3 = new float[r3]
            r5 = 1056964608(0x3f000000, float:0.5)
            r3[r2] = r5
            r3[r4] = r5
            r5 = r1
        L34:
            r0.<init>(r5, r6, r3)
            return r0
        L38:
            r3 = r5
        L39:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Default channel mixing coefficients for "
            java.lang.String r1 = "->"
            java.lang.String r2 = " are not yet implemented."
            java.lang.String r6 = defpackage.a.z(r6, r3, r0, r1, r2)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mdp.b(int, int):mdp");
    }

    public final float a(int i, int i2) {
        return this.e[(i * this.b) + i2];
    }
}
