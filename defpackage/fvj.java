package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvj implements ixm {
    public final float a;
    public final egc b;

    public fvj(float f, egc egcVar) {
        this.a = f;
        this.b = egcVar;
    }

    private final int f(ivu ivuVar, List list, int i, fdat fdatVar) {
        Object obj;
        Object obj2;
        int i2;
        int iIntValue;
        int iA;
        Object obj3;
        int iIntValue2;
        Object obj4;
        int size = list.size();
        int i3 = 0;
        while (true) {
            obj = null;
            if (i3 >= size) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (fdbq.f(fuy.c((ivt) obj2), "Leading")) {
                break;
            }
            i3++;
        }
        ivt ivtVar = (ivt) obj2;
        if (ivtVar != null) {
            i2 = i;
            iA = fwj.a(i2, ivtVar.b(Alert.DURATION_SHOW_INDEFINITELY));
            iIntValue = ((Number) fdatVar.a(ivtVar, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            iIntValue = 0;
            iA = i2;
        }
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i4);
            if (fdbq.f(fuy.c((ivt) obj3), "Trailing")) {
                break;
            }
            i4++;
        }
        ivt ivtVar2 = (ivt) obj3;
        if (ivtVar2 != null) {
            iA = fwj.a(iA, ivtVar2.b(Alert.DURATION_SHOW_INDEFINITELY));
            iIntValue2 = ((Number) fdatVar.a(ivtVar2, Integer.valueOf(i2))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i5);
            if (fdbq.f(fuy.c((ivt) obj4), "Label")) {
                break;
            }
            i5++;
        }
        Object obj5 = (ivt) obj4;
        int iIntValue3 = obj5 != null ? ((Number) fdatVar.a(obj5, Integer.valueOf(iA))).intValue() : 0;
        int size4 = list.size();
        for (int i6 = 0; i6 < size4; i6++) {
            Object obj6 = list.get(i6);
            if (fdbq.f(fuy.c((ivt) obj6), "TextField")) {
                int iIntValue4 = ((Number) fdatVar.a(obj6, Integer.valueOf(iA))).intValue();
                int size5 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size5) {
                        break;
                    }
                    Object obj7 = list.get(i7);
                    if (fdbq.f(fuy.c((ivt) obj7), "Hint")) {
                        obj = obj7;
                        break;
                    }
                    i7++;
                }
                Object obj8 = (ivt) obj;
                return fvd.a(iIntValue4, iIntValue3 > 0, iIntValue3, iIntValue, iIntValue2, obj8 != null ? ((Number) fdatVar.a(obj8, Integer.valueOf(iA))).intValue() : 0, kim.k(0, 0, 0, 15), ivuVar.ed(), this.b);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private static final int g(List list, int i, fdat fdatVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj5 = list.get(i2);
            if (fdbq.f(fuy.c((ivt) obj5), "TextField")) {
                int iIntValue = ((Number) fdatVar.a(obj5, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (fdbq.f(fuy.c((ivt) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                ivt ivtVar = (ivt) obj2;
                int iIntValue2 = ivtVar != null ? ((Number) fdatVar.a(ivtVar, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (fdbq.f(fuy.c((ivt) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                ivt ivtVar2 = (ivt) obj3;
                int iIntValue3 = ivtVar2 != null ? ((Number) fdatVar.a(ivtVar2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (fdbq.f(fuy.c((ivt) obj4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                ivt ivtVar3 = (ivt) obj4;
                int iIntValue4 = ivtVar3 != null ? ((Number) fdatVar.a(ivtVar3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        break;
                    }
                    Object obj6 = list.get(i6);
                    if (fdbq.f(fuy.c((ivt) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i6++;
                }
                ivt ivtVar4 = (ivt) obj;
                return fvd.b(iIntValue4, iIntValue3, iIntValue, iIntValue2, ivtVar4 != null ? ((Number) fdatVar.a(ivtVar4, Integer.valueOf(i))).intValue() : 0, kim.k(0, 0, 0, 15));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.ixm
    public final int a(ivu ivuVar, List list, int i) {
        return f(ivuVar, list, i, new fdat() { // from class: fvh
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return Integer.valueOf(((ivt) obj).a(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // defpackage.ixm
    public final int b(ivu ivuVar, List list, int i) {
        return g(list, i, new fdat() { // from class: fve
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return Integer.valueOf(((ivt) obj).b(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // defpackage.ixm
    public final int c(ivu ivuVar, List list, int i) {
        return f(ivuVar, list, i, new fdat() { // from class: fvg
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return Integer.valueOf(((ivt) obj).c(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // defpackage.ixm
    public final int d(ivu ivuVar, List list, int i) {
        return g(list, i, new fdat() { // from class: fvi
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return Integer.valueOf(((ivt) obj).d(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // defpackage.ixm
    public final ixn e(final ixp ixpVar, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        int iEi;
        Object obj4;
        List list2 = list;
        final fvj fvjVar = this;
        egc egcVar = fvjVar.b;
        egd egdVar = (egd) egcVar;
        int iEp = ixpVar.ep(egdVar.a);
        int iEp2 = ixpVar.ep(egdVar.b);
        final int iEp3 = ixpVar.ep(2.0f);
        long jM = kil.m(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i);
            if (fdbq.f(iwa.b((ixk) obj), "Leading")) {
                break;
            }
            i++;
        }
        ixk ixkVar = (ixk) obj;
        iyl iylVarE = ixkVar != null ? ixkVar.e(jM) : null;
        int iB = fuy.b(iylVarE);
        int size2 = list2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i2);
            if (fdbq.f(iwa.b((ixk) obj2), "Trailing")) {
                break;
            }
            i2++;
        }
        ixk ixkVar2 = (ixk) obj2;
        iyl iylVarE2 = ixkVar2 != null ? ixkVar2.e(kim.l(jM, -iB, 0, 2)) : null;
        int i3 = -iEp2;
        int i4 = -(iB + fuy.b(iylVarE2));
        long jH = kim.h(jM, i4, i3);
        int size3 = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i5);
            if (fdbq.f(iwa.b((ixk) obj3), "Label")) {
                break;
            }
            i5++;
        }
        ixk ixkVar3 = (ixk) obj3;
        iyl iylVarE3 = ixkVar3 != null ? ixkVar3.e(jH) : null;
        if (iylVarE3 != null) {
            iEi = iylVarE3.ei(iuc.b);
            if (iEi == Integer.MIN_VALUE) {
                iEi = iylVarE3.b;
            }
        } else {
            iEi = 0;
        }
        int iMax = Math.max(iEi, iEp);
        boolean z = iylVarE3 == null;
        int i6 = iylVarE3 != null ? (i3 - iEp3) - iMax : (-iEp) - iEp2;
        boolean z2 = z;
        boolean z3 = true;
        long jH2 = kim.h(kil.m(j, 0, 0, 0, 0, 11), i4, i6);
        int size4 = list2.size();
        int i7 = 0;
        while (i7 < size4) {
            ixk ixkVar4 = (ixk) list2.get(i7);
            boolean z4 = z3;
            if (fdbq.f(iwa.b(ixkVar4), "TextField")) {
                final iyl iylVarE4 = ixkVar4.e(jH2);
                long jM2 = kil.m(jH2, 0, 0, 0, 0, 14);
                int size5 = list2.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list2.get(i8);
                    if (fdbq.f(iwa.b((ixk) obj4), "Hint")) {
                        break;
                    }
                    i8++;
                    list2 = list;
                }
                ixk ixkVar5 = (ixk) obj4;
                iyl iylVarE5 = ixkVar5 != null ? ixkVar5.e(jM2) : null;
                final int iB2 = fvd.b(fuy.b(iylVarE), fuy.b(iylVarE2), iylVarE4.a, fuy.b(iylVarE3), fuy.b(iylVarE5), j);
                final iyl iylVar = iylVarE3;
                final int i9 = iEi;
                final int i10 = iMax;
                final int iA = fvd.a(iylVarE4.b, !z2, i10, fuy.a(iylVarE), fuy.a(iylVarE2), fuy.a(iylVarE5), j, ixpVar.ed(), egcVar);
                final int i11 = iEp;
                final iyl iylVar2 = iylVarE;
                final iyl iylVar3 = iylVarE5;
                final iyl iylVar4 = iylVarE2;
                return ixpVar.ej(iB2, iA, fcvp.a, new fdap() { // from class: fvf
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj5) {
                        iyk iykVar = (iyk) obj5;
                        iyl iylVar5 = iylVar2;
                        ixp ixpVar2 = ixpVar;
                        fvj fvjVar2 = fvjVar;
                        iyl iylVar6 = iylVar4;
                        iyl iylVar7 = iylVar3;
                        iyl iylVar8 = iylVarE4;
                        int i12 = iA;
                        int i13 = iB2;
                        iyl iylVar9 = iylVar;
                        if (iylVar9 != null) {
                            int i14 = iEp3;
                            int i15 = i10;
                            int iF = fddu.f(i11 - i9, 0);
                            float f = fvjVar2.a;
                            float fEd = ixpVar2.ed();
                            if (iylVar5 != null) {
                                iyk.A(iykVar, iylVar5, 0, ibw.n.a(iylVar5.b, i12));
                            } else {
                                iylVar5 = null;
                            }
                            if (iylVar6 != null) {
                                iyk.A(iykVar, iylVar6, i13 - iylVar6.a, ibw.n.a(iylVar6.b, i12));
                            }
                            int i16 = i15 + i14;
                            iyk.A(iykVar, iylVar9, fuy.b(iylVar5), fdcu.b(fEd * 16.0f) - fdcu.b((r0 - iF) * f));
                            iyk.A(iykVar, iylVar8, fuy.b(iylVar5), i16);
                            if (iylVar7 != null) {
                                iyk.A(iykVar, iylVar7, fuy.b(iylVar5), i16);
                            }
                        } else {
                            int iB3 = fdcu.b(((egd) fvjVar2.b).a * ixpVar2.ed());
                            if (iylVar5 != null) {
                                iyk.A(iykVar, iylVar5, 0, ibw.n.a(iylVar5.b, i12));
                            } else {
                                iylVar5 = null;
                            }
                            if (iylVar6 != null) {
                                iyk.A(iykVar, iylVar6, i13 - iylVar6.a, ibw.n.a(iylVar6.b, i12));
                            }
                            iyk.A(iykVar, iylVar8, fuy.b(iylVar5), iB3);
                            if (iylVar7 != null) {
                                iyk.A(iykVar, iylVar7, fuy.b(iylVar5), iB3);
                            }
                        }
                        return fctx.a;
                    }
                });
            }
            i7++;
            iEi = iEi;
            iylVarE3 = iylVarE3;
            jH2 = jH2;
            fvjVar = this;
            iMax = iMax;
            z3 = z4;
            iEp = iEp;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
