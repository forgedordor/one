package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class frq implements ixm {
    public final float a;
    public final egc b;
    private final fdap c;

    public frq(fdap fdapVar, float f, egc egcVar) {
        this.c = fdapVar;
        this.a = f;
        this.b = egcVar;
    }

    private final int f(ivu ivuVar, List list, int i, fdat fdatVar) {
        Object obj;
        Object obj2;
        int iA;
        int iIntValue;
        Object obj3;
        int iIntValue2;
        Object obj4;
        int size = list.size();
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 >= size) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i2);
            if (fdbq.f(fuy.c((ivt) obj2), "Leading")) {
                break;
            }
            i2++;
        }
        ivt ivtVar = (ivt) obj2;
        if (ivtVar != null) {
            iA = fwj.a(i, ivtVar.b(Alert.DURATION_SHOW_INDEFINITELY));
            iIntValue = ((Number) fdatVar.a(ivtVar, Integer.valueOf(i))).intValue();
        } else {
            iA = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i3);
            if (fdbq.f(fuy.c((ivt) obj3), "Trailing")) {
                break;
            }
            i3++;
        }
        ivt ivtVar2 = (ivt) obj3;
        if (ivtVar2 != null) {
            iA = fwj.a(iA, ivtVar2.b(Alert.DURATION_SHOW_INDEFINITELY));
            iIntValue2 = ((Number) fdatVar.a(ivtVar2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i4);
            if (fdbq.f(fuy.c((ivt) obj4), "Label")) {
                break;
            }
            i4++;
        }
        Object obj5 = (ivt) obj4;
        int iIntValue3 = obj5 != null ? ((Number) fdatVar.a(obj5, Integer.valueOf(kjx.c(iA, i, this.a)))).intValue() : 0;
        int size4 = list.size();
        for (int i5 = 0; i5 < size4; i5++) {
            Object obj6 = list.get(i5);
            if (fdbq.f(fuy.c((ivt) obj6), "TextField")) {
                int iIntValue4 = ((Number) fdatVar.a(obj6, Integer.valueOf(iA))).intValue();
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        break;
                    }
                    Object obj7 = list.get(i6);
                    if (fdbq.f(fuy.c((ivt) obj7), "Hint")) {
                        obj = obj7;
                        break;
                    }
                    i6++;
                }
                Object obj8 = (ivt) obj;
                return frk.a(iIntValue, iIntValue2, iIntValue4, iIntValue3, obj8 != null ? ((Number) fdatVar.a(obj8, Integer.valueOf(iA))).intValue() : 0, this.a, kim.k(0, 0, 0, 15), ivuVar.ed(), this.b);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int g(ivu ivuVar, List list, int i, fdat fdatVar) {
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
                return frk.b(iIntValue4, iIntValue3, iIntValue, iIntValue2, ivtVar4 != null ? ((Number) fdatVar.a(ivtVar4, Integer.valueOf(i))).intValue() : 0, this.a, kim.k(0, 0, 0, 15), ivuVar.ed(), this.b);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.ixm
    public final int a(ivu ivuVar, List list, int i) {
        return f(ivuVar, list, i, new fdat() { // from class: frp
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return Integer.valueOf(((ivt) obj).a(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // defpackage.ixm
    public final int b(ivu ivuVar, List list, int i) {
        return g(ivuVar, list, i, new fdat() { // from class: frm
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return Integer.valueOf(((ivt) obj).b(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // defpackage.ixm
    public final int c(ivu ivuVar, List list, int i) {
        return f(ivuVar, list, i, new fdat() { // from class: frl
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                return Integer.valueOf(((ivt) obj).c(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // defpackage.ixm
    public final int d(ivu ivuVar, List list, int i) {
        return g(ivuVar, list, i, new fdat() { // from class: fro
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
        final frq frqVar = this;
        egc egcVar = frqVar.b;
        egd egdVar = (egd) egcVar;
        int iEp = ixpVar.ep(egdVar.b);
        long jM = kil.m(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (fdbq.f(iwa.b((ixk) obj), "Leading")) {
                break;
            }
            i++;
        }
        ixk ixkVar = (ixk) obj;
        iyl iylVarE = ixkVar != null ? ixkVar.e(jM) : null;
        int iB = fuy.b(iylVarE);
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i2);
            if (fdbq.f(iwa.b((ixk) obj2), "Trailing")) {
                break;
            }
            i2++;
        }
        ixk ixkVar2 = (ixk) obj2;
        char c = 2;
        iyl iylVarE2 = ixkVar2 != null ? ixkVar2.e(kim.l(jM, -iB, 0, 2)) : null;
        int iB2 = iB + fuy.b(iylVarE2);
        int iEp2 = ixpVar.ep(egcVar.b(ixpVar.q())) + ixpVar.ep(egcVar.c(ixpVar.q()));
        float f = frqVar.a;
        int i3 = -iEp;
        int i4 = -iB2;
        long jH = kim.h(jM, kjx.c(i4 - iEp2, -iEp2, f), i3);
        int size3 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i5);
            char c2 = c;
            if (fdbq.f(iwa.b((ixk) obj3), "Label")) {
                break;
            }
            i5++;
            c = c2;
        }
        ixk ixkVar3 = (ixk) obj3;
        iyl iylVarE3 = ixkVar3 != null ? ixkVar3.e(jH) : null;
        frqVar.c.invoke(new ihz(iylVarE3 != null ? iia.a(iylVarE3.a, iylVarE3.b) : 0L));
        long jM2 = kil.m(kim.h(j, i4, i3 - Math.max(fuy.a(iylVarE3) / 2, ixpVar.ep(egdVar.a))), 0, 0, 0, 0, 11);
        int size4 = list.size();
        int i6 = 0;
        while (i6 < size4) {
            ixk ixkVar4 = (ixk) list.get(i6);
            egc egcVar2 = egcVar;
            if (fdbq.f(iwa.b(ixkVar4), "TextField")) {
                final iyl iylVarE4 = ixkVar4.e(jM2);
                long jM3 = kil.m(jM2, 0, 0, 0, 0, 14);
                int size5 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i7);
                    int i8 = size5;
                    if (fdbq.f(iwa.b((ixk) obj4), "Hint")) {
                        break;
                    }
                    i7++;
                    size5 = i8;
                }
                ixk ixkVar5 = (ixk) obj4;
                final iyl iylVarE5 = ixkVar5 != null ? ixkVar5.e(jM3) : null;
                final int iB3 = frk.b(fuy.b(iylVarE), fuy.b(iylVarE2), iylVarE4.a, fuy.b(iylVarE3), fuy.b(iylVarE5), f, j, ixpVar.ed(), egcVar2);
                final int iA = frk.a(fuy.a(iylVarE), fuy.a(iylVarE2), iylVarE4.b, fuy.a(iylVarE3), fuy.a(iylVarE5), f, j, ixpVar.ed(), egcVar2);
                int size6 = list.size();
                int i9 = 0;
                while (i9 < size6) {
                    ixk ixkVar6 = (ixk) list.get(i9);
                    if (fdbq.f(iwa.b(ixkVar6), "border")) {
                        final iyl iylVarE6 = ixkVar6.e(kim.d(iB3 != Integer.MAX_VALUE ? iB3 : 0, iB3, iA != Integer.MAX_VALUE ? iA : 0, iA));
                        final iyl iylVar = iylVarE;
                        final iyl iylVar2 = iylVarE3;
                        final iyl iylVar3 = iylVarE2;
                        return ixpVar.ej(iB3, iA, fcvp.a, new fdap() { // from class: frn
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj5) {
                                frq frqVar2 = frqVar;
                                egc egcVar3 = frqVar2.b;
                                iyk iykVar = (iyk) obj5;
                                ixp ixpVar2 = ixpVar;
                                float fEd = ixpVar2.ed();
                                float f2 = ((egd) egcVar3).a * fEd;
                                kji kjiVarQ = ixpVar2.q();
                                int i10 = frk.a;
                                int iB4 = fdcu.b(f2);
                                float fB = efy.b(egcVar3, kjiVarQ) * fEd;
                                float f3 = fEd * 12.0f;
                                int iB5 = fdcu.b(fB);
                                iyl iylVar4 = iylVar;
                                int i11 = iA;
                                if (iylVar4 != null) {
                                    iyk.A(iykVar, iylVar4, 0, ibw.n.a(iylVar4.b, i11));
                                }
                                iyl iylVar5 = iylVar3;
                                if (iylVar5 != null) {
                                    iyk.A(iykVar, iylVar5, iB3 - iylVar5.a, ibw.n.a(iylVar5.b, i11));
                                }
                                iyl iylVar6 = iylVar2;
                                if (iylVar6 != null) {
                                    float f4 = frqVar2.a;
                                    iyk.A(iykVar, iylVar6, fdcu.b(iylVar4 == null ? 0.0f : (fuy.b(iylVar4) - f3) * (1.0f - f4)) + iB5, kjx.c(iB4, -(iylVar6.b / 2), f4));
                                }
                                iyl iylVar7 = iylVarE5;
                                iyk.A(iykVar, iylVarE4, fuy.b(iylVar4), Math.max(iB4, fuy.a(iylVar6) / 2));
                                if (iylVar7 != null) {
                                    iyk.A(iykVar, iylVar7, fuy.b(iylVar4), Math.max(iB4, fuy.a(iylVar6) / 2));
                                }
                                iykVar.t(iylVarE6, 0L, 0.0f);
                                return fctx.a;
                            }
                        });
                    }
                    i9++;
                    iylVarE3 = iylVarE3;
                    frqVar = this;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i6++;
            iylVarE3 = iylVarE3;
            egcVar = egcVar2;
            frqVar = this;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
