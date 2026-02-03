package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqd {
    public static final int a(eou eouVar) {
        long jG = eouVar.g(0);
        return eouVar.m() ? kjb.b(jG) : kjb.a(jG);
    }

    public static final List b(ere ereVar, List list, cth cthVar, int i, int i2, int i3, fdap fdapVar) {
        cth cthVarB;
        Object obj;
        int i4;
        int iA;
        if (ereVar == null || list.isEmpty() || cthVar.b == 0) {
            return fcvo.a;
        }
        int iA2 = ((eou) fcva.N(list)).a();
        int i5 = -1;
        int i6 = 0;
        if (((eou) fcva.S(list)).a() - iA2 < 0 || (i4 = cthVar.b) == 0) {
            cthVarB = cti.a;
        } else {
            fddq fddqVarR = fddu.r(0, i4);
            int i7 = fddqVarR.a;
            int i8 = fddqVarR.b;
            if (i7 <= i8) {
                iA = -1;
                while (cthVar.a(i7) <= iA2) {
                    iA = cthVar.a(i7);
                    if (i7 == i8) {
                        break;
                    }
                    i7++;
                }
            } else {
                iA = -1;
            }
            cthVarB = iA == -1 ? cti.a : cti.b(iA);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            Object obj2 = list.get(i9);
            int iA3 = ((eou) obj2).a();
            int[] iArr = cthVar.a;
            int i10 = cthVar.b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    break;
                }
                if (iArr[i11] == iA3) {
                    arrayList2.add(obj2);
                    break;
                }
                i11++;
            }
        }
        int[] iArr2 = cthVarB.a;
        int i12 = cthVarB.b;
        int i13 = 0;
        while (i13 < i12) {
            int i14 = iArr2[i13];
            Iterator it = list.iterator();
            int i15 = i6;
            while (true) {
                if (!it.hasNext()) {
                    i15 = i5;
                    break;
                }
                if (((eou) it.next()).a() == i14) {
                    break;
                }
                i15++;
            }
            eou eouVar = i15 == i5 ? (eou) fdapVar.invoke(Integer.valueOf(i14)) : (eou) list.remove(i15);
            int iC = eouVar.c();
            int iA4 = i15 == i5 ? Integer.MIN_VALUE : a(eouVar);
            int iMin = -i;
            int size2 = arrayList2.size();
            while (true) {
                if (i6 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList2.get(i6);
                if (((eou) obj).a() != i14) {
                    break;
                }
                i6++;
            }
            eou eouVar2 = (eou) obj;
            int iA5 = eouVar2 != null ? a(eouVar2) : Integer.MIN_VALUE;
            if (iA4 != Integer.MIN_VALUE) {
                iMin = Math.max(iMin, iA4);
            }
            if (iA5 != Integer.MIN_VALUE) {
                iMin = Math.min(iMin, iA5 - iC);
            }
            eouVar.n();
            eouVar.l(iMin, 0, i2, i3);
            arrayList.add(eouVar);
            i13++;
            i6 = 0;
            i5 = -1;
        }
        return arrayList;
    }
}
