package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctb {
    public long[] a = cvp.a;
    public float[] b = ctc.a;
    public int c;
    public int d;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c8, code lost:
    
        if (((((~r12) << 6) & r12) & r21) != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00db, code lost:
    
        return r20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctb.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        float[] fArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int iFloatToIntBits = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        iFloatToIntBits += Float.floatToIntBits(fArr[(i2 << 3) + i4]);
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return iFloatToIntBits;
                }
            }
            if (i2 == length) {
                return iFloatToIntBits;
            }
            i2++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        float[] fArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i == length) {
                        break;
                    }
                    i++;
                } else {
                    int i3 = i - length;
                    int i4 = 0;
                    while (true) {
                        int i5 = 8 - ((~i3) >>> 31);
                        if (i4 >= i5) {
                            if (i5 == 8) {
                                break;
                                break;
                            }
                            break;
                        }
                        if ((255 & j) < 128) {
                            float f = fArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(f);
                            i2++;
                        }
                        j >>= 8;
                        i4++;
                    }
                }
            }
            sb.append((CharSequence) "]");
        } else {
            sb.append((CharSequence) "]");
        }
        return sb.toString();
    }
}
