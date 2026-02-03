package defpackage;

import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmz {
    public static final Object a = new hpd("provider");
    public static final Object b = new hpd("provider");
    public static final Object c = new hpd("compositionLocalMap");
    public static final Object d = new hpd("providers");
    public static final Object e = new hpd("reference");
    public static final Comparator f = new Comparator() { // from class: hmx
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return fdbq.a(((hoh) obj).b, ((hoh) obj2).b);
        }
    };

    public static final int a(boolean z) {
        return z ? 1 : 0;
    }

    public static final int b(hqz hqzVar, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = hqzVar.e(i);
            i3++;
        }
        return i3;
    }

    public static final int c(List list, int i) {
        int iD = d(list, i);
        return iD < 0 ? -(iD + 1) : iD;
    }

    public static final int d(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iA = fdbq.a(((hoh) list.get(i3)).b, i);
            if (iA < 0) {
                i2 = i3 + 1;
            } else {
                if (iA <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final hoh e(List list, int i, int i2) {
        int iC = c(list, i);
        if (iC >= list.size()) {
            return null;
        }
        hoh hohVar = (hoh) list.get(iC);
        if (hohVar.b < i2) {
            return hohVar;
        }
        return null;
    }

    public static final hoh f(List list, int i) {
        int iD = d(list, i);
        if (iD >= 0) {
            return (hoh) list.remove(iD);
        }
        return null;
    }

    public static final hov g(hnq hnqVar, how howVar, hre hreVar, hlw hlwVar) {
        hra hraVar = new hra();
        if (hreVar.e != null) {
            hraVar.f();
        }
        if (hreVar.f != null) {
            hraVar.e();
        }
        int i = hreVar.q;
        if (hlwVar != null && hreVar.k(i) > 0) {
            int iL = hreVar.s;
            while (iL > 0 && !hreVar.T(iL)) {
                iL = hreVar.l(iL);
            }
            if (iL >= 0 && hreVar.T(iL)) {
                Object objW = hreVar.w(iL);
                int i2 = iL + 1;
                int iJ = iL + hreVar.j(iL);
                int iK = 0;
                while (i2 < iJ) {
                    int iJ2 = hreVar.j(i2) + i2;
                    if (iJ2 > i) {
                        break;
                    }
                    iK += hreVar.T(i2) ? 1 : hreVar.k(i2);
                    i2 = iJ2;
                }
                int iK2 = hreVar.T(i) ? 1 : hreVar.k(i);
                hlwVar.d(objW);
                hlwVar.l(iK, iK2);
                hlwVar.h();
            }
        }
        hre hreVarD = hraVar.d();
        try {
            hreVarD.z();
            hreVarD.N(126665345, howVar.a);
            hre.Y(hreVarD);
            hreVarD.aa(howVar.b);
            hlv hlvVar = howVar.e;
            if (hreVarD.n <= 0) {
                j("Check failed");
            }
            if (hreVar.n != 0) {
                j("Check failed");
            }
            if (!hlvVar.a()) {
                j("Check failed");
            }
            int iA = hreVar.a(hlvVar) + 1;
            int i3 = hreVar.q;
            if (i3 > iA || iA >= hreVar.r) {
                j("Check failed");
            }
            int iL2 = hreVar.l(iA);
            int iJ3 = hreVar.j(iA);
            int iK3 = hreVar.T(iA) ? 1 : hreVar.k(iA);
            List listA = hrd.a(hreVar, iA, hreVarD, false, false, true);
            hreVar.Q(iL2);
            boolean z = iK3 > 0;
            while (iL2 >= i3) {
                int iH = hreVar.h(iL2);
                int[] iArr = hreVar.b;
                hrc.h(iArr, iH, hrc.a(iArr, iH) - iJ3);
                if (z) {
                    int[] iArr2 = hreVar.b;
                    int i4 = iArr2[(iH * 5) + 1];
                    if ((1073741824 & i4) != 0) {
                        z = false;
                    } else {
                        hrc.i(iArr2, iH, (i4 & 67108863) - iK3);
                        z = true;
                    }
                } else {
                    z = false;
                }
                iL2 = hreVar.l(iL2);
            }
            if (z) {
                if (hreVar.o < iK3) {
                    j("Check failed");
                }
                hreVar.o -= iK3;
            }
            hreVarD.m();
            hreVarD.X();
            hreVarD.B();
            hreVarD.A(true);
            hov hovVar = new hov(hraVar);
            if (!listA.isEmpty()) {
                int size = listA.size();
                for (int i5 = 0; i5 < size; i5++) {
                    hlv hlvVar2 = (hlv) listA.get(i5);
                    if (hraVar.h(hlvVar2)) {
                        int iA2 = hraVar.a(hlvVar2);
                        int iE = hrc.e(hraVar.a, iA2);
                        int i6 = iA2 + 1;
                        if (((i6 < hraVar.b ? hraVar.a[(i6 * 5) + 4] : hraVar.c.length) - iE > 0 ? hraVar.c[iE] : hmk.a) instanceof hpx) {
                            hmy hmyVar = new hmy(hnqVar, howVar);
                            hreVarD = hraVar.d();
                            try {
                                hpw.a(hreVarD, listA, hmyVar);
                                hreVarD.A(true);
                                return hovVar;
                            } finally {
                            }
                        }
                    }
                }
            }
            return hovVar;
        } finally {
        }
    }

    public static final Void h(String str) {
        throw new hmi(a.a(str, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void i(hqz hqzVar, List list, int i) {
        if (hqzVar.B(i)) {
            list.add(hqzVar.o(i));
            return;
        }
        int iC = i + 1;
        int iC2 = i + hqzVar.c(i);
        while (iC < iC2) {
            i(hqzVar, list, iC);
            iC += hqzVar.c(iC);
        }
    }

    public static final void j(String str) {
        throw new hmi(a.a(str, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void k(hre hreVar, hqs hqsVar) {
        int iG;
        int[] iArr = hreVar.b;
        int i = hreVar.q;
        int iC = hreVar.c(iArr, hreVar.h(i + hreVar.j(i)));
        for (int iC2 = hreVar.c(hreVar.b, hreVar.h(hreVar.q)); iC2 < iC; iC2++) {
            Object obj = hreVar.c[hreVar.d(iC2)];
            int iA = -1;
            if (obj instanceof hmh) {
                ((hxl) hqsVar).f((hmh) obj, hreVar.g() - iC2, -1, -1);
            } else if (obj instanceof hqu) {
                hqu hquVar = (hqu) obj;
                if (!(hquVar.a instanceof hms)) {
                    o(hreVar, iC2, obj);
                    int iG2 = hreVar.g() - iC2;
                    hlv hlvVar = hquVar.b;
                    if (hlvVar == null || !hlvVar.a()) {
                        iG = -1;
                    } else {
                        iA = hreVar.a(hlvVar);
                        iG = hreVar.g() - hreVar.p(iA);
                    }
                    hqsVar.a(hquVar, iG2, iA, iG);
                }
            } else if (obj instanceof hpx) {
                o(hreVar, iC2, obj);
                ((hpx) obj).b();
            }
        }
    }

    public static final void l(hre hreVar, hqs hqsVar) {
        int iG;
        int[] iArr = hreVar.b;
        int i = hreVar.q;
        int iC = hreVar.c(iArr, hreVar.h(i + hreVar.j(i)));
        for (int iC2 = hreVar.c(hreVar.b, hreVar.h(hreVar.q)); iC2 < iC; iC2++) {
            Object obj = hreVar.c[hreVar.d(iC2)];
            int iA = -1;
            if (obj instanceof hmh) {
                int iG2 = hreVar.g() - iC2;
                hmh hmhVar = (hmh) obj;
                hxl hxlVar = (hxl) hqsVar;
                cva cvaVar = hxlVar.d;
                if (cvaVar == null) {
                    int i2 = cvs.a;
                    cvaVar = new cva((byte[]) null);
                    hxlVar.d = cvaVar;
                }
                cvaVar.e(hmhVar);
                hxlVar.f(hmhVar, iG2, -1, -1);
            }
            if (obj instanceof hqu) {
                int iG3 = hreVar.g() - iC2;
                hqu hquVar = (hqu) obj;
                hlv hlvVar = hquVar.b;
                if (hlvVar == null || !hlvVar.a()) {
                    iG = -1;
                } else {
                    iA = hreVar.a(hlvVar);
                    iG = hreVar.g() - hreVar.p(iA);
                }
                hqsVar.a(hquVar, iG3, iA, iG);
            }
            if (obj instanceof hpx) {
                ((hpx) obj).b();
            }
        }
        hreVar.U();
    }

    public static final void m(List list, int i, int i2) {
        int iC = c(list, i);
        while (iC < list.size() && ((hoh) list.get(iC)).b < i2) {
        }
    }

    public static final boolean n(int i) {
        return i != 0;
    }

    private static final void o(hre hreVar, int i, Object obj) {
        int iD = hreVar.d(i);
        Object[] objArr = hreVar.c;
        Object obj2 = objArr[iD];
        objArr[iD] = hmk.a;
        if (obj == obj2) {
            return;
        }
        j("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
