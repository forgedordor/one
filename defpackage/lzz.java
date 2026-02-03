package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzz {
    public static final lzz a = new lzz(new lzy[0]);
    private static final lzy e;
    private final lzy[] f;
    public final long c = 0;
    public final int b = 0;
    public final int d = 0;

    static {
        lzy lzyVar = new lzy(-1, new int[0], new mbo[0], new long[0], new String[0]);
        int[] iArr = lzyVar.e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = lzyVar.f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        e = new lzy(0, iArrCopyOf, (mbo[]) Arrays.copyOf(lzyVar.d, 0), jArrCopyOf, (String[]) Arrays.copyOf(lzyVar.g, 0));
        mgb.O(1);
        mgb.O(2);
        mgb.O(3);
        mgb.O(4);
    }

    private lzz(lzy[] lzyVarArr) {
        this.f = lzyVarArr;
    }

    public final lzy a(int i) {
        return i < 0 ? e : this.f[i];
    }

    public final void b() {
        a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lzz lzzVar = (lzz) obj;
            if (Objects.equals(null, null) && Arrays.equals(this.f, lzzVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.f);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[])";
    }
}
