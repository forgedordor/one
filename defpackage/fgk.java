package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgk {
    public static final int a(boolean z, int i, int i2) {
        if (z || !c(i)) {
            return fddu.f(i2, 1);
        }
        return 1;
    }

    public static final long b(long j, boolean z, int i, float f) {
        int iB = Alert.DURATION_SHOW_INDEFINITELY;
        if ((z || c(i)) && kil.i(j)) {
            iB = kil.b(j);
        }
        if (kil.d(j) != iB) {
            iB = fddu.i(fbg.a(f), kil.d(j), iB);
        }
        return kik.b(0, iB, 0, kil.a(j));
    }

    public static final boolean c(int i) {
        return khx.a(i, 2) || khx.a(i, 4) || khx.a(i, 5);
    }
}
