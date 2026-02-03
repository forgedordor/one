package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gqe implements ixm {
    public final boolean a;
    public final gxw b;
    public final egc c;
    public final float d;
    private final fdap e;
    private final hil f;

    public gqe(fdap fdapVar, boolean z, gxw gxwVar, hil hilVar, egc egcVar, float f) {
        this.e = fdapVar;
        this.a = z;
        this.b = gxwVar;
        this.f = hilVar;
        this.c = egcVar;
        this.d = f;
    }

    public static final int f(int i, gqe gqeVar, int i2, int i3, iyl iylVar, iyl iylVar2) {
        if (gqeVar.a) {
            i3 = ibw.n.a(iylVar2.b, i2);
        }
        return Math.max(i3, hjf.a(iylVar) / 2);
    }

    private final int g(kio kioVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int iMax = i + Math.max(i5 + i8, Math.max(i7 + i8, kjx.c(i6, 0, f)));
        egc egcVar = this.c;
        kji kjiVar = kji.a;
        return kim.c(j, Math.max(iMax + i2, fdcu.b((i6 + kioVar.en(egcVar.b(kjiVar) + egcVar.c(kjiVar))) * f)));
    }

    private final int h(ivu ivuVar, List list, int i, fdat fdatVar) {
        Object obj;
        int iC;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int iIntValue4;
        Object obj6;
        Object obj7;
        gqe gqeVar = this;
        float fA = gqeVar.f.a();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (fdbq.f(hjf.d((ivt) obj), "Leading")) {
                break;
            }
            i2++;
        }
        ivt ivtVar = (ivt) obj;
        if (ivtVar != null) {
            iC = hjf.c(i, ivtVar.b(Alert.DURATION_SHOW_INDEFINITELY));
            iIntValue = ((Number) fdatVar.a(ivtVar, Integer.valueOf(i))).intValue();
        } else {
            iC = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (fdbq.f(hjf.d((ivt) obj2), "Trailing")) {
                break;
            }
            i3++;
        }
        ivt ivtVar2 = (ivt) obj2;
        if (ivtVar2 != null) {
            iC = hjf.c(iC, ivtVar2.b(Alert.DURATION_SHOW_INDEFINITELY));
            iIntValue2 = ((Number) fdatVar.a(ivtVar2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i4);
            if (fdbq.f(hjf.d((ivt) obj3), "Label")) {
                break;
            }
            i4++;
        }
        Object obj8 = (ivt) obj3;
        int iIntValue5 = obj8 != null ? ((Number) fdatVar.a(obj8, Integer.valueOf(kjx.c(iC, i, fA)))).intValue() : 0;
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
        if (ivtVar3 != null) {
            iIntValue3 = ((Number) fdatVar.a(ivtVar3, Integer.valueOf(iC))).intValue();
            iC = hjf.c(iC, ivtVar3.b(Alert.DURATION_SHOW_INDEFINITELY));
        } else {
            iIntValue3 = 0;
        }
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
        if (ivtVar4 != null) {
            iIntValue4 = ((Number) fdatVar.a(ivtVar4, Integer.valueOf(iC))).intValue();
            iC = hjf.c(iC, ivtVar4.b(Alert.DURATION_SHOW_INDEFINITELY));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list.size();
        int i7 = 0;
        while (i7 < size6) {
            Object obj9 = list.get(i7);
            if (fdbq.f(hjf.d((ivt) obj9), "TextField")) {
                int iIntValue6 = ((Number) fdatVar.a(obj9, Integer.valueOf(iC))).intValue();
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i8);
                    if (fdbq.f(hjf.d((ivt) obj6), "Hint")) {
                        break;
                    }
                    i8++;
                }
                Object obj10 = (ivt) obj6;
                int iIntValue7 = obj10 != null ? ((Number) fdatVar.a(obj10, Integer.valueOf(iC))).intValue() : 0;
                int size8 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i9);
                    if (fdbq.f(hjf.d((ivt) obj7), "Supporting")) {
                        break;
                    }
                    i9++;
                }
                Object obj11 = (ivt) obj7;
                return gqeVar.j(ivuVar, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue6, iIntValue5, iIntValue7, obj11 != null ? ((Number) fdatVar.a(obj11, Integer.valueOf(i))).intValue() : 0, kim.k(0, 0, 0, 15), fA);
            }
            i7++;
            iIntValue4 = iIntValue4;
            gqeVar = this;
        }
        kjw.a("Collection contains no element matching the predicate.");
        throw new fcta();
    }

    private final int i(ivu ivuVar, List list, int i, fdat fdatVar) {
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
                    if (fdbq.f(hjf.d((ivt) obj4), "Leading")) {
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
                    if (fdbq.f(hjf.d((ivt) obj5), "Prefix")) {
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
                    if (fdbq.f(hjf.d((ivt) obj6), "Suffix")) {
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
                return g(ivuVar, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, ivtVar6 != null ? ((Number) fdatVar.a(ivtVar6, Integer.valueOf(i))).intValue() : 0, kim.k(0, 0, 0, 15), this.f.a());
            }
        }
        kjw.a("Collection contains no element matching the predicate.");
        throw new fcta();
    }

    private final int j(kio kioVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int iB = fcxl.b(i5, i7, i3, i4, kjx.c(i6, 0, f));
        egd egdVar = (egd) this.c;
        float fEn = kioVar.en(egdVar.a);
        return kim.b(j, Math.max(i, Math.max(i2, fdcu.b(kjx.b(fEn, Math.max(fEn, i6 / 2.0f), f) + iB + kioVar.en(egdVar.b)))) + i8);
    }

    @Override // defpackage.ixm
    public final int a(ivu ivuVar, List list, int i) {
        return h(ivuVar, list, i, new fdat() { // from class: gqc
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return Integer.valueOf(((ivt) obj).a(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // defpackage.ixm
    public final int b(ivu ivuVar, List list, int i) {
        return i(ivuVar, list, i, new fdat() { // from class: gqa
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return Integer.valueOf(((ivt) obj).b(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // defpackage.ixm
    public final int c(ivu ivuVar, List list, int i) {
        return h(ivuVar, list, i, new fdat() { // from class: gpz
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return Integer.valueOf(((ivt) obj).c(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // defpackage.ixm
    public final int d(ivu ivuVar, List list, int i) {
        return i(ivuVar, list, i, new fdat() { // from class: gqd
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return Integer.valueOf(((ivt) obj).d(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // defpackage.ixm
    public final ixn e(final ixp ixpVar, List list, long j) {
        Object obj;
        int i;
        Object obj2;
        float f;
        iyl iylVarE;
        Object obj3;
        int i2;
        iyl iylVarE2;
        Object obj4;
        int i3;
        iyl iylVarE3;
        Object obj5;
        int i4;
        long j2;
        long jFloatToRawIntBits;
        Object obj6;
        Object obj7;
        List list2 = list;
        egc egcVar = this.c;
        float fA = this.f.a();
        egd egdVar = (egd) egcVar;
        int iEp = ixpVar.ep(egdVar.b);
        int i5 = -iEp;
        long jM = kil.m(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i6);
            if (fdbq.f(iwa.b((ixk) obj), "Leading")) {
                break;
            }
            i6++;
        }
        ixk ixkVar = (ixk) obj;
        iyl iylVarE4 = ixkVar != null ? ixkVar.e(jM) : null;
        int iB = hjf.b(iylVarE4);
        int iMax = Math.max(0, hjf.a(iylVarE4));
        int size2 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size2) {
                i = iEp;
                obj2 = null;
                break;
            }
            obj2 = list2.get(i7);
            i = iEp;
            if (fdbq.f(iwa.b((ixk) obj2), "Trailing")) {
                break;
            }
            i7++;
            iEp = i;
        }
        ixk ixkVar2 = (ixk) obj2;
        if (ixkVar2 != null) {
            f = fA;
            iylVarE = ixkVar2.e(kim.l(jM, -iB, 0, 2));
        } else {
            f = fA;
            iylVarE = null;
        }
        int iB2 = iB + hjf.b(iylVarE);
        int iMax2 = Math.max(iMax, hjf.a(iylVarE));
        int size3 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i8);
            int i9 = size3;
            if (fdbq.f(iwa.b((ixk) obj3), "Prefix")) {
                break;
            }
            i8++;
            size3 = i9;
        }
        ixk ixkVar3 = (ixk) obj3;
        if (ixkVar3 != null) {
            i2 = iB2;
            iylVarE2 = ixkVar3.e(kim.l(jM, -iB2, 0, 2));
        } else {
            i2 = iB2;
            iylVarE2 = null;
        }
        int iB3 = i2 + hjf.b(iylVarE2);
        int iMax3 = Math.max(iMax2, hjf.a(iylVarE2));
        int size4 = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i10);
            int i11 = size4;
            if (fdbq.f(iwa.b((ixk) obj4), "Suffix")) {
                break;
            }
            i10++;
            size4 = i11;
        }
        ixk ixkVar4 = (ixk) obj4;
        if (ixkVar4 != null) {
            i3 = iB3;
            iylVarE3 = ixkVar4.e(kim.l(jM, -iB3, 0, 2));
        } else {
            i3 = iB3;
            iylVarE3 = null;
        }
        int iB4 = i3 + hjf.b(iylVarE3);
        int iMax4 = Math.max(iMax3, hjf.a(iylVarE3));
        int size5 = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list2.get(i12);
            int i13 = size5;
            if (fdbq.f(iwa.b((ixk) obj5), "Label")) {
                break;
            }
            i12++;
            size5 = i13;
        }
        ixk ixkVar5 = (ixk) obj5;
        final fdci fdciVar = new fdci();
        int iEp2 = ixpVar.ep(egcVar.b(ixpVar.q())) + ixpVar.ep(egcVar.c(ixpVar.q()));
        fdciVar.a = ixkVar5 != null ? ixkVar5.e(kim.h(jM, -kjx.c(iB4 + iEp2, iEp2, f), i5)) : null;
        iyl iylVar = (iyl) fdciVar.a;
        if (iylVar != null) {
            float f2 = iylVar.a;
            i4 = i5;
            j2 = jM;
            jFloatToRawIntBits = (Float.floatToRawIntBits(iylVar.b) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
        } else {
            i4 = i5;
            j2 = jM;
            jFloatToRawIntBits = 0;
        }
        this.e.invoke(new ihz(jFloatToRawIntBits));
        int size6 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i14);
            if (fdbq.f(iwa.b((ixk) obj6), "Supporting")) {
                break;
            }
            i14++;
        }
        ixk ixkVar6 = (ixk) obj6;
        int iC = ixkVar6 != null ? ixkVar6.c(kil.d(j)) : 0;
        int iMax5 = Math.max(hjf.a((iyl) fdciVar.a) / 2, ixpVar.ep(egdVar.a));
        long j3 = j;
        long jM2 = kil.m(kim.h(j3, -iB4, (i4 - iMax5) - iC), 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i15 = 0;
        while (i15 < size7) {
            ixk ixkVar7 = (ixk) list2.get(i15);
            if (fdbq.f(iwa.b(ixkVar7), "TextField")) {
                final iyl iylVarE5 = ixkVar7.e(jM2);
                long jM3 = kil.m(jM2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i16);
                    int i17 = size8;
                    if (fdbq.f(iwa.b((ixk) obj7), "Hint")) {
                        break;
                    }
                    i16++;
                    size8 = i17;
                }
                ixk ixkVar8 = (ixk) obj7;
                iyl iylVarE6 = ixkVar8 != null ? ixkVar8.e(jM3) : null;
                int iMax6 = Math.max(iMax4, Math.max(hjf.a(iylVarE5), hjf.a(iylVarE6)) + iMax5 + i);
                ixk ixkVar9 = ixkVar6;
                final iyl iylVar2 = iylVarE;
                final iyl iylVar3 = iylVarE4;
                final float f3 = f;
                final int iG = g(ixpVar, hjf.b(iylVarE4), hjf.b(iylVarE), hjf.b(iylVarE2), hjf.b(iylVarE3), iylVarE5.a, hjf.b((iyl) fdciVar.a), hjf.b(iylVarE6), j3, f3);
                iyl iylVarE7 = ixkVar9 != null ? ixkVar9.e(kil.m(kim.l(j2, 0, -iMax6, 1), 0, iG, 0, 0, 9)) : null;
                int iA = hjf.a(iylVarE7);
                final int iJ = j(ixpVar, hjf.a(iylVar3), hjf.a(iylVar2), hjf.a(iylVarE2), hjf.a(iylVarE3), iylVarE5.b, hjf.a((iyl) fdciVar.a), hjf.a(iylVarE6), hjf.a(iylVarE7), j, f3);
                int i18 = iJ - iA;
                int size9 = list.size();
                int i19 = 0;
                while (i19 < size9) {
                    ixk ixkVar10 = (ixk) list.get(i19);
                    if (fdbq.f(iwa.b(ixkVar10), "Container")) {
                        final iyl iylVarE8 = ixkVar10.e(kim.d(iG != Integer.MAX_VALUE ? iG : 0, iG, i18 != Integer.MAX_VALUE ? i18 : 0, i18));
                        final iyl iylVar4 = iylVarE6;
                        final iyl iylVar5 = iylVarE2;
                        final iyl iylVar6 = iylVarE3;
                        final iyl iylVar7 = iylVarE7;
                        return ixpVar.ej(iG, iJ, fcvp.a, new fdap() { // from class: gqb
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj8) {
                                int i20;
                                gqe gqeVar;
                                int i21;
                                int i22;
                                gqe gqeVar2;
                                float fC;
                                float f4;
                                float fC2;
                                iyk iykVar = (iyk) obj8;
                                iyl iylVar8 = (iyl) fdciVar.a;
                                gqe gqeVar3 = this.a;
                                ixp ixpVar2 = ixpVar;
                                float f5 = gqeVar3.d;
                                float fEd = ixpVar2.ed();
                                kji kjiVarQ = ixpVar2.q();
                                float fEn = ixpVar2.en(f5);
                                iykVar.s(iylVarE8, 0, 0, 0.0f);
                                iyl iylVar9 = iylVar7;
                                int iA2 = iJ - hjf.a(iylVar9);
                                egc egcVar2 = gqeVar3.c;
                                int iB5 = fdcu.b(((egd) egcVar2).a * fEd);
                                iyl iylVar10 = iylVar3;
                                if (iylVar10 != null) {
                                    iyk.A(iykVar, iylVar10, 0, ibw.n.a(iylVar10.b, iA2));
                                }
                                iyl iylVar11 = iylVar2;
                                int i23 = iG;
                                if (iylVar8 != null) {
                                    int iA3 = gqeVar3.a ? ibw.n.a(iylVar8.b, iA2) : iB5;
                                    float f6 = f3;
                                    int iC2 = kjx.c(iA3, -(iylVar8.b / 2), f6);
                                    float fB = efy.b(egcVar2, kjiVarQ) * fEd;
                                    float fA2 = efy.a(egcVar2, kjiVarQ) * fEd;
                                    if (iylVar10 == null) {
                                        i20 = iA2;
                                        fC = fB;
                                    } else {
                                        i20 = iA2;
                                        fC = iylVar10.a + fddu.c(fB - fEn, 0.0f);
                                    }
                                    if (iylVar11 == null) {
                                        f4 = fC;
                                        fC2 = fA2;
                                    } else {
                                        f4 = fC;
                                        fC2 = iylVar11.a + fddu.c(fA2 - fEn, 0.0f);
                                    }
                                    kji kjiVar = kji.a;
                                    float f7 = kjiVarQ == kjiVar ? fB : fA2;
                                    float f8 = kjiVarQ == kjiVar ? f4 : fC2;
                                    gxw gxwVar = gqeVar3.b;
                                    int i24 = iylVar8.a;
                                    int iB6 = i23 - fdcu.b(f4 + fC2);
                                    gqeVar = gqeVar3;
                                    gxv gxvVar = (gxv) gxwVar;
                                    iykVar.s(iylVar8, fdcu.b(kjx.b(gxvVar.b.a(i24, iB6, kjiVarQ) + f8, gxvVar.a.a(iylVar8.a, i23 - fdcu.b(fB + fA2), kjiVarQ) + f7, f6)), iC2, 0.0f);
                                } else {
                                    i20 = iA2;
                                    gqeVar = gqeVar3;
                                }
                                iyl iylVar12 = iylVar5;
                                if (iylVar12 != null) {
                                    i21 = iB5;
                                    i22 = i20;
                                    gqeVar2 = gqeVar;
                                    iyk.A(iykVar, iylVar12, hjf.b(iylVar10), gqe.f(0, gqeVar2, i22, i21, iylVar8, iylVar12));
                                } else {
                                    i21 = iB5;
                                    i22 = i20;
                                    gqeVar2 = gqeVar;
                                }
                                iyl iylVar13 = iylVar4;
                                iyl iylVar14 = iylVarE5;
                                int iB7 = hjf.b(iylVar10) + hjf.b(iylVar12);
                                iyk.A(iykVar, iylVar14, iB7, gqe.f(0, gqeVar2, i22, i21, iylVar8, iylVar14));
                                if (iylVar13 != null) {
                                    iyk.A(iykVar, iylVar13, iB7, gqe.f(0, gqeVar2, i22, i21, iylVar8, iylVar13));
                                }
                                iyl iylVar15 = iylVar6;
                                if (iylVar15 != null) {
                                    iyk.A(iykVar, iylVar15, (i23 - hjf.b(iylVar11)) - iylVar15.a, gqe.f(0, gqeVar2, i22, i21, iylVar8, iylVar15));
                                }
                                if (iylVar11 != null) {
                                    iyk.A(iykVar, iylVar11, i23 - iylVar11.a, ibw.n.a(iylVar11.b, i22));
                                }
                                if (iylVar9 != null) {
                                    iyk.A(iykVar, iylVar9, 0, i22);
                                }
                                return fctx.a;
                            }
                        });
                    }
                    i19++;
                    iJ = iJ;
                }
                kjw.a("Collection contains no element matching the predicate.");
                throw new fcta();
            }
            i15++;
            ixkVar6 = ixkVar6;
            iylVarE4 = iylVarE4;
            iylVarE = iylVarE;
            j3 = j;
            list2 = list2;
            f = f;
            jM2 = jM2;
        }
        kjw.a("Collection contains no element matching the predicate.");
        throw new fcta();
    }
}
