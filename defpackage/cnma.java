package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnma {
    public static int a(int i) {
        return b(Optional.of(Integer.valueOf(i)));
    }

    static int b(Optional optional) {
        if (optional.isEmpty()) {
            return 1;
        }
        int iIntValue = ((Integer) optional.get()).intValue();
        if (iIntValue <= 0) {
            return 2;
        }
        if (iIntValue < 2) {
            return 3;
        }
        if (iIntValue < 3) {
            return 4;
        }
        if (iIntValue < 4) {
            return 5;
        }
        if (iIntValue < 5) {
            return 6;
        }
        if (iIntValue < 6) {
            return 7;
        }
        if (iIntValue < 7) {
            return 8;
        }
        if (iIntValue < 8) {
            return 9;
        }
        if (iIntValue < 9) {
            return 10;
        }
        if (iIntValue < 10) {
            return 11;
        }
        if (iIntValue < 11) {
            return 12;
        }
        if (iIntValue < 101) {
            return 13;
        }
        if (iIntValue < 1001) {
            return 103;
        }
        if (iIntValue < 5001) {
            return 105;
        }
        if (iIntValue < 10001) {
            return 106;
        }
        return iIntValue < 50001 ? 108 : 113;
    }
}
