package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffbp {
    public static final int a(int i) {
        int[] iArrB = ffbq.b();
        for (int i2 = 0; i2 < 14; i2++) {
            int i3 = iArrB[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 0;
    }
}
