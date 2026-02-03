package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffnt {
    public static final ffnt a = new ffnt("bike128", 12323);
    public static final ffnt b = new ffnt("bike192", 24659);
    public static final ffnt c = new ffnt("bike256", 40973);
    public final String d;
    private final int e;

    private ffnt(String str, int i) {
        int i2;
        this.d = str;
        this.e = i;
        HashMap map = new HashMap();
        if (((-65535) & i) != 1) {
            throw new IllegalArgumentException();
        }
        int i3 = i - 2;
        int iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i3);
        int i4 = -i;
        for (int i5 = 1; i5 < iNumberOfLeadingZeros; i5++) {
            int iB = ffmb.b(i4);
            int i6 = 1 << (i5 - 1);
            if (i6 >= 64) {
                Integer numValueOf = Integer.valueOf(i6);
                if (!map.containsKey(numValueOf)) {
                    map.put(numValueOf, Integer.valueOf(ffnw.a(i, iB, i6)));
                }
            }
            int i7 = 1 << i5;
            if ((i3 & i7) != 0 && (i2 = (i7 - 1) & i3) >= 64) {
                Integer numValueOf2 = Integer.valueOf(i2);
                if (!map.containsKey(numValueOf2)) {
                    map.put(numValueOf2, Integer.valueOf(ffnw.a(i, iB, i2)));
                }
            }
        }
    }

    public final int a() {
        return (this.e + 7) >> 3;
    }
}
