package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kik {
    public static final long a(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = Alert.DURATION_SHOW_INDEFINITELY;
        int iMin3 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin3 == Integer.MAX_VALUE ? iMin : iMin3;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    kim.i(i6);
                    throw new fcta();
                }
                i5 = 8190;
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            iMin2 = Math.min(i5, i2);
        }
        return kim.d(Math.min(i5, i), iMin2, iMin, iMin3);
    }

    public static final long b(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = Alert.DURATION_SHOW_INDEFINITELY;
        int iMin3 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin3 == Integer.MAX_VALUE ? iMin : iMin3;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    kim.i(i6);
                    throw new fcta();
                }
                i5 = 8190;
            }
        }
        if (i4 != Integer.MAX_VALUE) {
            iMin2 = Math.min(i5, i4);
        }
        return kim.d(iMin, iMin3, Math.min(i5, i3), iMin2);
    }

    public static final long c(int i, int i2) {
        if (!((i2 >= 0) & (i >= 0))) {
            kiz.a("width and height must be >= 0");
        }
        return kim.g(i, i, i2, i2);
    }

    public static final long d(int i) {
        if (i < 0) {
            kiz.a("width must be >= 0");
        }
        return kim.g(i, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
    }
}
