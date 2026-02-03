package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffgh {
    public static final int a(fffy fffyVar, int i) {
        int i2;
        int length = fffyVar.e.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 <= length) {
                int i4 = i + 1;
                i2 = (i3 + length) >>> 1;
                int i5 = fffyVar.f[i2];
                if (i5 >= i4) {
                    if (i5 <= i4) {
                        break;
                    }
                    length = i2 - 1;
                } else {
                    i3 = i2 + 1;
                }
            } else {
                i2 = (-i3) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }
}
