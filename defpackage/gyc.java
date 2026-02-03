package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gyc implements ixm {
    public final boolean a;
    public final gxw b;
    public final egc c;
    public final float d;
    private final hil e;

    public gyc(boolean z, gxw gxwVar, hil hilVar, egc egcVar, float f) {
        this.a = z;
        this.b = gxwVar;
        this.e = hilVar;
        this.c = egcVar;
        this.d = f;
    }

    public static final int f(gyc gycVar, int i, int i2, iyl iylVar) {
        return gycVar.a ? ibw.n.a(iylVar.b, i) : i2;
    }

    private final int g(ivu ivuVar, List list, int i, fdat fdatVar) {
        Object obj;
        int i2;
        int iIntValue;
        int iC;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i3;
        Object obj5;
        int i4;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            if (fdbq.f(hjf.d((ivt) obj), "Leading")) {
                break;
            }
            i5++;
        }
        ivt ivtVar = (ivt) obj;
        if (ivtVar != null) {
            i2 = i;
            iC = hjf.c(i2, ivtVar.b(Alert.DURATION_SHOW_INDEFINITELY));
            iIntValue = ((Number) fdatVar.a(ivtVar, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            iIntValue = 0;
            iC = i2;
        }
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i6);
            if (fdbq.f(hjf.d((ivt) obj2), "Trailing")) {
                break;
            }
            i6++;
        }
        ivt ivtVar2 = (ivt) obj2;
        if (ivtVar2 != null) {
            iC = hjf.c(iC, ivtVar2.b(Alert.DURATION_SHOW_INDEFINITELY));
            iIntValue2 = ((Number) fdatVar.a(ivtVar2, Integer.valueOf(i2))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i7);
            if (fdbq.f(hjf.d((ivt) obj3), "Label")) {
                break;
            }
            i7++;
        }
        Object obj8 = (ivt) obj3;
        int iIntValue3 = obj8 != null ? ((Number) fdatVar.a(obj8, Integer.valueOf(iC))).intValue() : 0;
        int size4 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i8);
            if (fdbq.f(hjf.d((ivt) obj4), "Prefix")) {
                break;
            }
            i8++;
        }
        ivt ivtVar3 = (ivt) obj4;
        if (ivtVar3 != null) {
            int iIntValue4 = ((Number) fdatVar.a(ivtVar3, Integer.valueOf(iC))).intValue();
            iC = hjf.c(iC, ivtVar3.b(Alert.DURATION_SHOW_INDEFINITELY));
            i3 = iIntValue4;
        } else {
            i3 = 0;
        }
        int size5 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i9);
            if (fdbq.f(hjf.d((ivt) obj5), "Suffix")) {
                break;
            }
            i9++;
        }
        ivt ivtVar4 = (ivt) obj5;
        if (ivtVar4 != null) {
            int iIntValue5 = ((Number) fdatVar.a(ivtVar4, Integer.valueOf(iC))).intValue();
            iC = hjf.c(iC, ivtVar4.b(Alert.DURATION_SHOW_INDEFINITELY));
            i4 = iIntValue5;
        } else {
            i4 = 0;
        }
        int size6 = list.size();
        for (int i10 = 0; i10 < size6; i10++) {
            Object obj9 = list.get(i10);
            if (fdbq.f(hjf.d((ivt) obj9), "TextField")) {
                int iIntValue6 = ((Number) fdatVar.a(obj9, Integer.valueOf(iC))).intValue();
                int size7 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i11);
                    if (fdbq.f(hjf.d((ivt) obj6), "Hint")) {
                        break;
                    }
                    i11++;
                }
                Object obj10 = (ivt) obj6;
                int iIntValue7 = obj10 != null ? ((Number) fdatVar.a(obj10, Integer.valueOf(iC))).intValue() : 0;
                int size8 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i12);
                    if (fdbq.f(hjf.d((ivt) obj7), "Supporting")) {
                        break;
                    }
                    i12++;
                }
                Object obj11 = (ivt) obj7;
                return j(ivuVar, iIntValue6, iIntValue3, iIntValue, iIntValue2, i3, i4, iIntValue7, obj11 != null ? ((Number) fdatVar.a(obj11, Integer.valueOf(i2))).intValue() : 0, kim.k(0, 0, 0, 15), this.e.a());
            }
        }
        kjw.a("Collection contains no element matching the predicate.");
        throw new fcta();
    }

    private static final int h(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        int i8 = i3 + i4;
        return kim.c(j, i + Math.max(i5 + i8, Math.max(i7 + i8, i6)) + i2);
    }

    private static final int i(List list, int i, fdat fdatVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (fdbq.f(hjf.d((ivt) obj7), "TextField")) {
                int iIntValue = ((Number) fdatVar.a(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (fdbq.f(hjf.d((ivt) obj2), "Label")) {
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
                    if (fdbq.f(hjf.d((ivt) obj3), "Trailing")) {
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
                    if (fdbq.f(hjf.d((ivt) obj4), "Prefix")) {
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
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (fdbq.f(hjf.d((ivt) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                ivt ivtVar4 = (ivt) obj5;
                int iIntValue5 = ivtVar4 != null ? ((Number) fdatVar.a(ivtVar4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (fdbq.f(hjf.d((ivt) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                ivt ivtVar5 = (ivt) obj6;
                int iIntValue6 = ivtVar5 != null ? ((Number) fdatVar.a(ivtVar5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (fdbq.f(hjf.d((ivt) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                ivt ivtVar6 = (ivt) obj;
                return h(iIntValue6, iIntValue3, iIntValue4, iIntValue5, iIntValue, iIntValue2, ivtVar6 != null ? ((Number) fdatVar.a(ivtVar6, Integer.valueOf(i))).intValue() : 0, kim.k(0, 0, 0, 15));
            }
        }
        kjw.a("Collection contains no element matching the predicate.");
        throw new fcta();
    }

    private final int j(kio kioVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        egd egdVar = (egd) this.c;
        int iEp = kioVar.ep(egdVar.a + egdVar.b);
        int iMax = 0;
        int iB = fcxl.b(i, i7, i5, i6, kjx.c(i2, 0, f));
        if (i2 > 0) {
            float f2 = this.d;
            int iEp2 = kioVar.ep(f2 + f2);
            den denVar = hlm.a;
            iMax = Math.max(iEp2, kjx.c(0, i2, hlm.a.a(f)));
        }
        return kim.b(j, Math.max(i3, Math.max(i4, iEp + iMax + iB)) + i8);
    }

    @Override // defpackage.ixm
    public final int a(ivu ivuVar, List list, int i) {
        return g(ivuVar, list, i, new fdat() { // from class: gyb
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return Integer.valueOf(((ivt) obj).a(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // defpackage.ixm
    public final int b(ivu ivuVar, List list, int i) {
        return i(list, i, new fdat() { // from class: gxy
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return Integer.valueOf(((ivt) obj).b(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // defpackage.ixm
    public final int c(ivu ivuVar, List list, int i) {
        return g(ivuVar, list, i, new fdat() { // from class: gya
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return Integer.valueOf(((ivt) obj).c(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // defpackage.ixm
    public final int d(ivu ivuVar, List list, int i) {
        return i(list, i, new fdat() { // from class: gxx
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
        Object obj4;
        Object obj5;
        Object obj6;
        int i;
        int i2;
        Object obj7;
        egc egcVar = this.c;
        final float fA = this.e.a();
        egd egdVar = (egd) egcVar;
        int iEp = ixpVar.ep(egdVar.a);
        int iEp2 = ixpVar.ep(egdVar.b);
        long jM = kil.m(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i3);
            if (fdbq.f(iwa.b((ixk) obj), "Leading")) {
                break;
            }
            i3++;
        }
        ixk ixkVar = (ixk) obj;
        iyl iylVarE = ixkVar != null ? ixkVar.e(jM) : null;
        int iB = hjf.b(iylVarE);
        int iMax = Math.max(0, hjf.a(iylVarE));
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i4);
            if (fdbq.f(iwa.b((ixk) obj2), "Trailing")) {
                break;
            }
            i4++;
        }
        ixk ixkVar2 = (ixk) obj2;
        iyl iylVarE2 = ixkVar2 != null ? ixkVar2.e(kim.l(jM, -iB, 0, 2)) : null;
        int iB2 = iB + hjf.b(iylVarE2);
        int iMax2 = Math.max(iMax, hjf.a(iylVarE2));
        int size3 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i5);
            if (fdbq.f(iwa.b((ixk) obj3), "Prefix")) {
                break;
            }
            i5++;
        }
        ixk ixkVar3 = (ixk) obj3;
        iyl iylVarE3 = ixkVar3 != null ? ixkVar3.e(kim.l(jM, -iB2, 0, 2)) : null;
        int iB3 = iB2 + hjf.b(iylVarE3);
        int iMax3 = Math.max(iMax2, hjf.a(iylVarE3));
        int size4 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i6);
            if (fdbq.f(iwa.b((ixk) obj4), "Suffix")) {
                break;
            }
            i6++;
        }
        ixk ixkVar4 = (ixk) obj4;
        iyl iylVarE4 = ixkVar4 != null ? ixkVar4.e(kim.l(jM, -iB3, 0, 2)) : null;
        int iB4 = iB3 + hjf.b(iylVarE4);
        int iMax4 = Math.max(iMax3, hjf.a(iylVarE4));
        int size5 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i7);
            if (fdbq.f(iwa.b((ixk) obj5), "Label")) {
                break;
            }
            i7++;
        }
        int i8 = -iB4;
        ixk ixkVar5 = (ixk) obj5;
        fdci fdciVar = new fdci();
        fdciVar.a = ixkVar5 != null ? ixkVar5.e(kim.h(jM, i8, -iEp2)) : null;
        int size6 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list.get(i9);
            if (fdbq.f(iwa.b((ixk) obj6), "Supporting")) {
                break;
            }
            i9++;
        }
        ixk ixkVar6 = (ixk) obj6;
        int iC = ixkVar6 != null ? ixkVar6.c(kil.d(j)) : 0;
        int iA = hjf.a((iyl) fdciVar.a) + iEp;
        long jH = kim.h(kil.m(j, 0, 0, 0, 0, 11), i8, ((-iA) - iEp2) - iC);
        int size7 = list.size();
        int i10 = 0;
        while (i10 < size7) {
            ixk ixkVar7 = (ixk) list.get(i10);
            int i11 = size7;
            if (fdbq.f(iwa.b(ixkVar7), "TextField")) {
                final iyl iylVarE5 = ixkVar7.e(jH);
                long jM2 = kil.m(jH, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        i = iEp2;
                        i2 = iA;
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i12);
                    i = iEp2;
                    i2 = iA;
                    if (fdbq.f(iwa.b((ixk) obj7), "Hint")) {
                        break;
                    }
                    i12++;
                    iEp2 = i;
                    iA = i2;
                }
                ixk ixkVar8 = (ixk) obj7;
                iyl iylVarE6 = ixkVar8 != null ? ixkVar8.e(jM2) : null;
                int iMax5 = Math.max(iMax4, Math.max(hjf.a(iylVarE5), hjf.a(iylVarE6)) + i2 + i);
                final int iH = h(hjf.b(iylVarE), hjf.b(iylVarE2), hjf.b(iylVarE3), hjf.b(iylVarE4), iylVarE5.a, hjf.b((iyl) fdciVar.a), hjf.b(iylVarE6), j);
                iyl iylVarE7 = ixkVar6 != null ? ixkVar6.e(kil.m(kim.l(jM, 0, -iMax5, 1), 0, iH, 0, 0, 9)) : null;
                int iA2 = hjf.a(iylVarE7);
                final fdci fdciVar2 = fdciVar;
                final int iJ = j(ixpVar, iylVarE5.b, hjf.a((iyl) fdciVar.a), hjf.a(iylVarE), hjf.a(iylVarE2), hjf.a(iylVarE3), hjf.a(iylVarE4), hjf.a(iylVarE6), hjf.a(iylVarE7), j, fA);
                final int i13 = iJ - iA2;
                int size9 = list.size();
                int i14 = 0;
                while (i14 < size9) {
                    ixk ixkVar9 = (ixk) list.get(i14);
                    if (fdbq.f(iwa.b(ixkVar9), "Container")) {
                        final iyl iylVarE8 = ixkVar9.e(kim.d(iH != Integer.MAX_VALUE ? iH : 0, iH, i13 != Integer.MAX_VALUE ? i13 : 0, i13));
                        final int i15 = iEp;
                        final iyl iylVar = iylVarE;
                        final iyl iylVar2 = iylVarE7;
                        final iyl iylVar3 = iylVarE2;
                        final iyl iylVar4 = iylVarE3;
                        final iyl iylVar5 = iylVarE4;
                        final iyl iylVar6 = iylVarE6;
                        return ixpVar.ej(iH, iJ, fcvp.a, new fdap() { // from class: gxz
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj8) {
                                iyl iylVar7;
                                int iEp3;
                                iyl iylVar8;
                                iyk iykVar = (iyk) obj8;
                                iyl iylVar9 = iylVar2;
                                iyl iylVar10 = iylVarE8;
                                iyl iylVar11 = iylVar;
                                iyl iylVar12 = iylVar4;
                                iyl iylVar13 = iylVar5;
                                iyl iylVar14 = iylVar3;
                                iyl iylVar15 = iylVar6;
                                iyl iylVar16 = iylVarE5;
                                int i16 = iJ;
                                int i17 = iH;
                                ixp ixpVar2 = ixpVar;
                                gyc gycVar = this;
                                fdci fdciVar3 = fdciVar2;
                                Object obj9 = fdciVar3.a;
                                if (obj9 != null) {
                                    int i18 = i15;
                                    if (gycVar.a) {
                                        iylVar7 = iylVar9;
                                        iEp3 = ibw.n.a(((iyl) obj9).b, i13);
                                    } else {
                                        iylVar7 = iylVar9;
                                        iEp3 = ixpVar2.ep(gycVar.d) + i18;
                                    }
                                    iyl iylVar17 = (iyl) fdciVar3.a;
                                    int i19 = iylVar17.b + i18;
                                    kji kjiVarQ = ixpVar2.q();
                                    iykVar.s(iylVar10, 0, 0, 0.0f);
                                    int iA3 = i16 - hjf.a(iylVar7);
                                    if (iylVar11 != null) {
                                        iylVar8 = iylVar14;
                                        iyk.A(iykVar, iylVar11, 0, ibw.n.a(iylVar11.b, iA3));
                                    } else {
                                        iylVar8 = iylVar14;
                                        iylVar11 = null;
                                    }
                                    float f = fA;
                                    int iC2 = kjx.c(iEp3, i18, f);
                                    int iB5 = kjiVarQ == kji.a ? hjf.b(iylVar11) : hjf.b(iylVar8);
                                    gxv gxvVar = (gxv) gycVar.b;
                                    iyl iylVar18 = iylVar11;
                                    iykVar.s(iylVar17, kjx.c(gxvVar.b.a(iylVar17.a, (i17 - hjf.b(iylVar11)) - hjf.b(iylVar8), kjiVarQ) + iB5, gxvVar.a.a(iylVar17.a, (i17 - hjf.b(iylVar18)) - hjf.b(iylVar8), kjiVarQ) + iB5, f), iC2, 0.0f);
                                    if (iylVar12 != null) {
                                        iyk.A(iykVar, iylVar12, hjf.b(iylVar18), i19);
                                    } else {
                                        iylVar12 = null;
                                    }
                                    int iB6 = hjf.b(iylVar18) + hjf.b(iylVar12);
                                    iyk.A(iykVar, iylVar16, iB6, i19);
                                    if (iylVar15 != null) {
                                        iyk.A(iykVar, iylVar15, iB6, i19);
                                    }
                                    if (iylVar13 != null) {
                                        iyk.A(iykVar, iylVar13, (i17 - hjf.b(iylVar8)) - iylVar13.a, i19);
                                    }
                                    if (iylVar8 != null) {
                                        iyl iylVar19 = iylVar8;
                                        iyk.A(iykVar, iylVar19, i17 - iylVar19.a, ibw.n.a(iylVar19.b, iA3));
                                    }
                                    if (iylVar7 != null) {
                                        iyk.A(iykVar, iylVar7, 0, iA3);
                                    }
                                } else {
                                    float fEd = ixpVar2.ed();
                                    iykVar.t(iylVar10, 0L, 0.0f);
                                    int iA4 = i16 - hjf.a(iylVar9);
                                    int iB7 = fdcu.b(((egd) gycVar.c).a * fEd);
                                    if (iylVar11 != null) {
                                        iyk.A(iykVar, iylVar11, 0, ibw.n.a(iylVar11.b, iA4));
                                    } else {
                                        iylVar11 = null;
                                    }
                                    if (iylVar12 != null) {
                                        iyk.A(iykVar, iylVar12, hjf.b(iylVar11), gyc.f(gycVar, iA4, iB7, iylVar12));
                                    } else {
                                        iylVar12 = null;
                                    }
                                    int iB8 = hjf.b(iylVar11) + hjf.b(iylVar12);
                                    iyk.A(iykVar, iylVar16, iB8, gyc.f(gycVar, iA4, iB7, iylVar16));
                                    if (iylVar15 != null) {
                                        iyk.A(iykVar, iylVar15, iB8, gyc.f(gycVar, iA4, iB7, iylVar15));
                                    }
                                    if (iylVar13 != null) {
                                        iyk.A(iykVar, iylVar13, (i17 - hjf.b(iylVar14)) - iylVar13.a, gyc.f(gycVar, iA4, iB7, iylVar13));
                                    }
                                    if (iylVar14 != null) {
                                        iyk.A(iykVar, iylVar14, i17 - iylVar14.a, ibw.n.a(iylVar14.b, iA4));
                                    }
                                    if (iylVar9 != null) {
                                        iyk.A(iykVar, iylVar9, 0, iA4);
                                    }
                                }
                                return fctx.a;
                            }
                        });
                    }
                    i14++;
                    i13 = i13;
                    iEp = iEp;
                    iylVarE7 = iylVarE7;
                }
                kjw.a("Collection contains no element matching the predicate.");
                throw new fcta();
            }
            i10++;
            fdciVar = fdciVar;
            size7 = i11;
            jH = jH;
            iEp = iEp;
            iEp2 = iEp2;
        }
        kjw.a("Collection contains no element matching the predicate.");
        throw new fcta();
    }
}
