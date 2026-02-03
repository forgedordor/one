package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eei {
    public static final eeh a(boolean z, int i, long j, ctg ctgVar, int i2, int i3, int i4, boolean z2, boolean z3, int i5, eev eevVar, long j2, int i6, int i7) {
        boolean z4 = true;
        if (ctgVar != null) {
            int i8 = eevVar.c;
            if (i2 < Integer.MAX_VALUE) {
                int iB = ctg.b(j);
                long j3 = ctgVar.a;
                if (iB - ctg.b(j3) >= 0) {
                    if (i == 0 || (i < i5 && ctg.a(j) - ctg.a(j3) >= 0)) {
                        Math.max(i4, ctg.b(j3));
                        z4 = false;
                    } else if (!z2) {
                        int iB2 = kil.b(j2);
                        int iB3 = (ctg.b(j) - i7) - i4;
                        ctg ctgVar2 = new ctg(ctg.c(ctg.a(j3) - i6, ctg.b(j3)));
                        return new eeh(true, a(z, 0, ctg.c(iB2, iB3), ctgVar2, i2 + 1, i3 + i4, 0, true, false, i5, eevVar, j2, i6, i7).b);
                    }
                }
            }
        }
        return new eeh(z4, z4);
    }

    public static final eeg b(eeh eehVar, eev eevVar) {
        if (!eehVar.b) {
            return null;
        }
        int i = eevVar.c;
        return null;
    }
}
