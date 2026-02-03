package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrd {
    /* JADX WARN: Multi-variable type inference failed */
    public static final List a(hre hreVar, int i, hre hreVar2, boolean z, boolean z2, boolean z3) {
        fcvo fcvoVar;
        boolean zU;
        int i2;
        int i3;
        int iJ = hreVar.j(i);
        int i4 = i + iJ;
        int iB = hreVar.b(i);
        int iB2 = hreVar.b(i4);
        int i5 = iB2 - iB;
        boolean z4 = i >= 0 && (hreVar.b[(hreVar.h(i) * 5) + 1] & 201326592) != 0;
        hreVar2.E(iJ);
        hreVar2.F(i5, hreVar2.q);
        if (hreVar.g < i4) {
            hreVar.G(i4);
        }
        if (hreVar.k < iB2) {
            hreVar.H(iB2, i4);
        }
        int[] iArr = hreVar2.b;
        int i6 = hreVar2.q;
        int i7 = i6 * 5;
        fcur.l(hreVar.b, iArr, i7, i * 5, i4 * 5);
        Object[] objArr = hreVar2.c;
        int i8 = hreVar2.i;
        System.arraycopy(hreVar.c, iB, objArr, i8, i5);
        int i9 = hreVar2.s;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + iJ;
        int iC = i8 - hreVar2.c(iArr, i6);
        int i12 = hreVar2.m;
        int i13 = hreVar2.l;
        int length = objArr.length;
        boolean z5 = z4;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            int i16 = i15 * 5;
            if (i15 != i6) {
                int i17 = i16 + 2;
                iArr[i17] = iArr[i17] + i10;
            }
            int[] iArr2 = iArr;
            int iC2 = hreVar2.c(iArr, i15) + iC;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = hreVar2.k;
            }
            iArr2[i16 + 4] = hre.W(iC2, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        hreVar2.m = i14;
        int iB3 = hrc.b(hreVar.d, i, hreVar.f());
        int iB4 = hrc.b(hreVar.d, i4, hreVar.f());
        if (iB3 < iB4) {
            ArrayList arrayList = hreVar.d;
            ArrayList arrayList2 = new ArrayList(iB4 - iB3);
            for (int i18 = iB3; i18 < iB4; i18++) {
                hlv hlvVar = (hlv) arrayList.get(i18);
                hlvVar.a += i10;
                arrayList2.add(hlvVar);
            }
            hreVar2.d.addAll(hrc.b(hreVar2.d, hreVar2.q, hreVar2.f()), arrayList2);
            arrayList.subList(iB3, iB4).clear();
            fcvoVar = arrayList2;
        } else {
            fcvoVar = fcvo.a;
        }
        if (!fcvoVar.isEmpty()) {
            HashMap map = hreVar.e;
            HashMap map2 = hreVar2.e;
            if (map != null && map2 != null) {
                int size = fcvoVar.size();
                for (int i19 = 0; i19 < size; i19++) {
                    hlv hlvVar2 = (hlv) fcvoVar.get(i19);
                    hof hofVar = (hof) map.get(hlvVar2);
                    if (hofVar != null) {
                        map.remove(hlvVar2);
                        map2.put(hlvVar2, hofVar);
                    }
                }
            }
        }
        int i20 = hreVar2.s;
        if (hreVar2.t(i9) != null) {
            int iA = i20 + 1;
            int i21 = hreVar2.q;
            while (iA < i21) {
                iA += hrc.a(hreVar2.b, iA);
            }
            throw null;
        }
        int iL = hreVar.l(i);
        if (z3) {
            if (z) {
                boolean z6 = iL >= 0;
                if (z6) {
                    hreVar.M();
                    hreVar.y(iL - hreVar.q);
                    hreVar.M();
                }
                hreVar.y(i - hreVar.q);
                zU = hreVar.U();
                if (z6) {
                    hreVar.K();
                    hreVar.X();
                    hreVar.K();
                    hreVar.X();
                }
            } else {
                boolean zV = hreVar.V(i, iJ);
                hreVar.J(iB, i5, i - 1);
                zU = zV;
            }
            if (zU) {
                hmz.j("Unexpectedly removed anchors");
            }
        }
        int i22 = hreVar2.o;
        int i23 = iArr3[i7 + 1];
        hreVar2.o = i22 + ((1073741824 & i23) != 0 ? 1 : i23 & 67108863);
        if (z2) {
            hreVar2.q = i11;
            hreVar2.i = i8 + i5;
        }
        if (z5) {
            hreVar2.Q(i9);
        }
        return fcvoVar;
    }
}
