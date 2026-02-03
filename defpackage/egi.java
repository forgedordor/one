package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egi {
    public static final ixn a(egh eghVar, int i, int i2, int i3, int i4, int i5, ixp ixpVar, List list, iyl[] iylVarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int i10;
        float f;
        ixk ixkVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = i3;
        int i18 = i4;
        List list2 = list;
        int i19 = i7 - i6;
        int[] iArr2 = new int[i19];
        int i20 = i6;
        int i21 = 0;
        int i22 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        int iMax = 0;
        while (true) {
            int i23 = Alert.DURATION_SHOW_INDEFINITELY;
            if (i20 >= i7) {
                break;
            }
            ixk ixkVar2 = (ixk) list2.get(i20);
            float fA = egg.a(egg.b(ixkVar2));
            if (fA > 0.0f) {
                f2 += fA;
                i21++;
                i12 = i20;
            } else {
                int i24 = i17 - i22;
                int i25 = i18 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i18;
                iyl iylVarE = iylVarArr[i20];
                if (iylVarE == null) {
                    if (i17 == Integer.MAX_VALUE) {
                        i12 = i20;
                        i14 = i22;
                        i15 = i24;
                    } else {
                        i12 = i20;
                        i14 = i22;
                        if (i24 < 0) {
                            i15 = i24;
                            i16 = i25;
                            i23 = 0;
                            i13 = i21;
                            iylVarE = ixkVar2.e(eghVar.i(0, i23, i16, false));
                        } else {
                            i23 = i24;
                            i15 = i23;
                        }
                    }
                    i16 = i25;
                    i13 = i21;
                    iylVarE = ixkVar2.e(eghVar.i(0, i23, i16, false));
                } else {
                    i12 = i20;
                    i13 = i21;
                    i14 = i22;
                    i15 = i24;
                }
                iyl iylVar = iylVarE;
                int iG = eghVar.g(iylVar);
                int iF = eghVar.f(iylVar);
                iArr2[i12 - i6] = iG;
                int i26 = i15 - iG;
                if (i26 < 0) {
                    i26 = 0;
                }
                iMin = Math.min(i5, i26);
                i22 = i14 + iG + iMin;
                iMax = Math.max(iMax, iF);
                iylVarArr[i12] = iylVar;
                i21 = i13;
            }
            i20 = i12 + 1;
        }
        int i27 = i22;
        if (i21 == 0) {
            i10 = i27 - iMin;
            i9 = 0;
        } else {
            i9 = i17 - i27;
            long j = i5;
            if (i17 == Integer.MAX_VALUE) {
                i17 = i;
            }
            long j2 = j * (r19 - 1);
            long j3 = (i17 - i27) - j2;
            if (j3 < 0) {
                j3 = 0;
            }
            float f3 = j3 / f2;
            int i28 = i6;
            int i29 = i7;
            while (i28 < i29) {
                long jRound = j3 - Math.round(egg.a(egg.b((ixk) list2.get(i28))) * f3);
                i28++;
                j3 = jRound;
            }
            int i30 = i6;
            int i31 = 0;
            while (i30 < i29) {
                if (iylVarArr[i30] == null) {
                    ixk ixkVar3 = (ixk) list2.get(i30);
                    f = f3;
                    egj egjVarB = egg.b(ixkVar3);
                    float fA2 = egg.a(egjVarB);
                    if (i18 == Integer.MAX_VALUE) {
                        ixkVar = ixkVar3;
                        i11 = Alert.DURATION_SHOW_INDEFINITELY;
                    } else {
                        ixkVar = ixkVar3;
                        i11 = i18;
                    }
                    if (fA2 <= 0.0f) {
                        eic.b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(j3);
                    j3 -= iSignum;
                    int iMax2 = Math.max(0, Math.round(fA2 * f) + iSignum);
                    iyl iylVarE2 = ixkVar.e(eghVar.i(((egjVarB == null || egjVarB.b) && iMax2 != Integer.MAX_VALUE) ? iMax2 : 0, iMax2, i11, true));
                    int iG2 = eghVar.g(iylVarE2);
                    int iF2 = eghVar.f(iylVarE2);
                    iArr2[i30 - i6] = iG2;
                    i31 += iG2;
                    iMax = Math.max(iMax, iF2);
                    iylVarArr[i30] = iylVarE2;
                } else {
                    f = f3;
                }
                i30++;
                i18 = i4;
                f3 = f;
                list2 = list;
                i29 = i7;
            }
            int i32 = (int) (i31 + j2);
            if (i32 < 0) {
                i32 = 0;
            }
            if (i32 <= i9) {
                i9 = i32;
            }
            i10 = i27;
        }
        int i33 = i9 + i10;
        if (i33 < 0) {
            i33 = 0;
        }
        int iMax3 = Math.max(i33, i);
        int iMax4 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr3 = new int[i19];
        eghVar.h(iMax3, iArr2, iArr3, ixpVar);
        return eghVar.j(iylVarArr, ixpVar, iArr3, iMax3, iMax4, iArr, i8, i6, i7);
    }
}
