package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fzv implements ixu {
    final /* synthetic */ gsp a;
    final /* synthetic */ fdae b;

    public fzv(gsp gspVar, fdae fdaeVar) {
        this.a = gspVar;
        this.b = fdaeVar;
    }

    @Override // defpackage.ixu
    public final /* synthetic */ int a(ivu ivuVar, List list, int i) {
        return ixt.a(this, ivuVar, list, i);
    }

    @Override // defpackage.ixu
    public final /* synthetic */ int b(ivu ivuVar, List list, int i) {
        return ixt.b(this, ivuVar, list, i);
    }

    @Override // defpackage.ixu
    public final /* synthetic */ int c(ivu ivuVar, List list, int i) {
        return ixt.c(this, ivuVar, list, i);
    }

    @Override // defpackage.ixu
    public final /* synthetic */ int d(ivu ivuVar, List list, int i) {
        return ixt.d(this, ivuVar, list, i);
    }

    @Override // defpackage.ixu
    public final ixn e(ixp ixpVar, List list, long j) {
        Integer numValueOf;
        List list2 = (List) list.get(0);
        int i = 1;
        List list3 = (List) list.get(1);
        List list4 = (List) list.get(2);
        List list5 = (List) list.get(3);
        long jM = kil.m(j, 0, 0, 0, 0, 10);
        final ArrayList arrayList = new ArrayList(list4.size());
        int size = list4.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((ixk) list4.get(i2)).e(jM));
        }
        final ArrayList arrayList2 = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList2.add(((ixk) list2.get(i3)).e(jM));
        }
        if (arrayList2.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((iyl) arrayList2.get(0)).b);
            int iE = fcva.e(arrayList2);
            if (iE > 0) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((iyl) arrayList2.get(i)).b);
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i == iE) {
                        break;
                    }
                    i++;
                }
            }
        }
        final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        final int iA = kil.a(j);
        long jM2 = kil.m(jM, 0, 0, 0, iA - iIntValue, 7);
        final ArrayList arrayList3 = new ArrayList(list3.size());
        int size3 = list3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            arrayList3.add(((ixk) list3.get(i4)).e(jM2));
        }
        final ArrayList arrayList4 = new ArrayList(list5.size());
        int size4 = list5.size();
        for (int i5 = 0; i5 < size4; i5++) {
            arrayList4.add(((ixk) list5.get(i5)).e(jM));
        }
        final int iB = kil.b(j);
        final gsp gspVar = this.a;
        final fdae fdaeVar = this.b;
        return ixpVar.ej(iB, iA, fcvp.a, new fdap() { // from class: fzu
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Integer numValueOf3;
                Integer numValueOf4;
                int iB2;
                List list6 = arrayList;
                iyk iykVar = (iyk) obj;
                Integer numValueOf5 = null;
                if (list6.isEmpty()) {
                    numValueOf3 = null;
                } else {
                    numValueOf3 = Integer.valueOf(((iyl) list6.get(0)).a);
                    int iE2 = fcva.e(list6);
                    if (iE2 > 0) {
                        int i6 = 1;
                        while (true) {
                            Integer numValueOf6 = Integer.valueOf(((iyl) list6.get(i6)).a);
                            if (numValueOf6.compareTo(numValueOf3) > 0) {
                                numValueOf3 = numValueOf6;
                            }
                            if (i6 == iE2) {
                                break;
                            }
                            i6++;
                        }
                    }
                }
                int iIntValue2 = numValueOf3 != null ? numValueOf3.intValue() : 0;
                List list7 = arrayList4;
                int i7 = iB;
                int iMax = Math.max(0, (i7 - iIntValue2) / 2);
                if (list7.isEmpty()) {
                    numValueOf4 = null;
                } else {
                    numValueOf4 = Integer.valueOf(((iyl) list7.get(0)).a);
                    int iE3 = fcva.e(list7);
                    if (iE3 > 0) {
                        int i8 = 1;
                        while (true) {
                            Integer numValueOf7 = Integer.valueOf(((iyl) list7.get(i8)).a);
                            if (numValueOf7.compareTo(numValueOf4) > 0) {
                                numValueOf4 = numValueOf7;
                            }
                            if (i8 == iE3) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
                int iIntValue3 = numValueOf4 != null ? numValueOf4.intValue() : 0;
                if (!list7.isEmpty()) {
                    numValueOf5 = Integer.valueOf(((iyl) list7.get(0)).b);
                    int iE4 = fcva.e(list7);
                    if (iE4 > 0) {
                        int i9 = 1;
                        while (true) {
                            Integer numValueOf8 = Integer.valueOf(((iyl) list7.get(i9)).b);
                            if (numValueOf8.compareTo(numValueOf5) > 0) {
                                numValueOf5 = numValueOf8;
                            }
                            if (i9 == iE4) {
                                break;
                            }
                            i9++;
                        }
                    }
                }
                int iIntValue4 = numValueOf5 != null ? numValueOf5.intValue() : 0;
                int i10 = (i7 - iIntValue3) / 2;
                int iOrdinal = gspVar.c().ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    iB2 = iA;
                } else {
                    if (iOrdinal != 2) {
                        throw new fctg();
                    }
                    iB2 = fdcu.b(((Number) fdaeVar.invoke()).floatValue());
                }
                int i11 = iB2 - iIntValue4;
                List list8 = arrayList3;
                int size5 = list8.size();
                for (int i12 = 0; i12 < size5; i12++) {
                    iyk.A(iykVar, (iyl) list8.get(i12), 0, iIntValue);
                }
                List list9 = arrayList2;
                int size6 = list9.size();
                for (int i13 = 0; i13 < size6; i13++) {
                    iyk.A(iykVar, (iyl) list9.get(i13), 0, 0);
                }
                int size7 = list6.size();
                for (int i14 = 0; i14 < size7; i14++) {
                    iyk.A(iykVar, (iyl) list6.get(i14), iMax, 0);
                }
                int size8 = list7.size();
                for (int i15 = 0; i15 < size8; i15++) {
                    iyk.A(iykVar, (iyl) list7.get(i15), i10, i11);
                }
                return fctx.a;
            }
        });
    }
}
