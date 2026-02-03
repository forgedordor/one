package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltr {
    public final List a;
    private final lty b;
    private final lty c;

    public ltr(lty ltyVar, lty ltyVar2) {
        float f;
        int i;
        float f2;
        List listG;
        float f3;
        float fA;
        int i2;
        float fA2;
        fcti fctiVarA;
        fcti fctiVarA2;
        float f4;
        float fC;
        this.b = ltyVar;
        this.c = ltyVar2;
        ltq ltqVarA = lto.a(new ltm(), ltyVar);
        ltq ltqVarA2 = lto.a(new ltm(), ltyVar2);
        List list = ltqVarA.b;
        List list2 = ltqVarA2.b;
        List list3 = ltk.a;
        list.getClass();
        list2.getClass();
        fcww fcwwVar = new fcww((byte[]) null);
        int i3 = ((fcww) list).c;
        for (int i4 = 0; i4 < i3; i4++) {
            if (((ltv) list.get(i4)).b instanceof ltg) {
                fcwwVar.add(list.get(i4));
            }
        }
        List<ltv> listA = fcva.a(fcwwVar);
        fcww fcwwVar2 = new fcww((byte[]) null);
        int i5 = ((fcww) list2).c;
        for (int i6 = 0; i6 < i5; i6++) {
            if (((ltv) list2.get(i6)).b instanceof ltg) {
                fcwwVar2.add(list2.get(i6));
            }
        }
        List<ltv> listA2 = fcva.a(fcwwVar2);
        listA.getClass();
        listA2.getClass();
        fcww fcwwVar3 = new fcww((byte[]) null);
        for (ltv ltvVar : listA) {
            for (ltv ltvVar2 : listA2) {
                lti ltiVar = ltvVar.b;
                lti ltiVar2 = ltvVar2.b;
                if ((ltiVar instanceof ltg) && (ltiVar2 instanceof ltg) && ((ltg) ltiVar).a != ((ltg) ltiVar2).a) {
                    f4 = Float.MAX_VALUE;
                    fC = Float.MAX_VALUE;
                } else {
                    f4 = Float.MAX_VALUE;
                    long jG = ltt.g(ltk.a(ltiVar), ltk.a(ltiVar2));
                    fC = (ltt.c(jG) * ltt.c(jG)) + (ltt.d(jG) * ltt.d(jG));
                }
                if (fC != f4) {
                    fcwwVar3.add(new ltd(fC, ltvVar, ltvVar2));
                }
            }
        }
        List<ltd> listAl = fcva.al(fcva.a(fcwwVar3), new ltj());
        char c = 2;
        float f5 = 1.0f;
        if (listAl.isEmpty()) {
            listG = ltk.a;
        } else {
            if (listAl.size() != 1) {
                ArrayList arrayList = new ArrayList();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                for (ltd ltdVar : listAl) {
                    ltv ltvVar3 = ltdVar.b;
                    ltv ltvVar4 = ltdVar.c;
                    if (!linkedHashSet.contains(ltvVar3) && !linkedHashSet2.contains(ltvVar4)) {
                        char c2 = c;
                        int iN = fcva.n(arrayList, arrayList.size(), new ltn(Float.valueOf(ltvVar3.a)));
                        if (iN >= 0) {
                            throw new IllegalArgumentException("There can't be two features with the same progress");
                        }
                        int i7 = (-iN) - 1;
                        int size = arrayList.size();
                        if (size > 0) {
                            fcti fctiVar = (fcti) arrayList.get(((i7 + size) - 1) % size);
                            f3 = f5;
                            float fFloatValue = ((Number) fctiVar.a).floatValue();
                            float fFloatValue2 = ((Number) fctiVar.b).floatValue();
                            fcti fctiVar2 = (fcti) arrayList.get(i7 % size);
                            float fFloatValue3 = ((Number) fctiVar2.a).floatValue();
                            float fFloatValue4 = ((Number) fctiVar2.b).floatValue();
                            if (ltl.b(ltvVar3.a, fFloatValue) >= 1.0E-4f && ltl.b(ltvVar3.a, fFloatValue3) >= 1.0E-4f && ltl.b(ltvVar4.a, fFloatValue2) >= 1.0E-4f && ltl.b(ltvVar4.a, fFloatValue4) >= 1.0E-4f && (size <= 1 || ltl.d(ltvVar4.a, fFloatValue2, fFloatValue4))) {
                            }
                            c = c2;
                            f5 = f3;
                        } else {
                            f3 = f5;
                        }
                        arrayList.add(i7, new fcti(Float.valueOf(ltvVar3.a), Float.valueOf(ltvVar4.a)));
                        linkedHashSet.add(ltvVar3);
                        linkedHashSet2.add(ltvVar4);
                        c = c2;
                        f5 = f3;
                    }
                }
                f = f5;
                i = -1;
                f2 = 1.0E-4f;
                listG = arrayList;
                fcti[] fctiVarArr = (fcti[]) listG.toArray(new fcti[0]);
                lte lteVar = new lte((fcti[]) Arrays.copyOf(fctiVarArr, fctiVarArr.length));
                fA = lteVar.a(0.0f);
                if (fA >= 0.0f || fA > f) {
                    throw new IllegalArgumentException("Cutting point is expected to be between 0 and 1");
                }
                if (fA < f2) {
                    i2 = 1;
                } else {
                    Iterator it = ltqVarA2.a.iterator();
                    int i8 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i8 = i;
                            break;
                        }
                        ltp ltpVar = (ltp) it.next();
                        float f6 = ltpVar.b;
                        if (fA <= ltpVar.c && f6 <= fA) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                    fcti fctiVarA3 = ((ltp) ltqVarA2.a.get(i8)).a(fA);
                    ltp ltpVar2 = (ltp) fctiVarA3.a;
                    List listI = fcva.i(((ltp) fctiVarA3.b).a);
                    int size2 = ltqVarA2.a.size();
                    for (int i9 = 1; i9 < size2; i9++) {
                        List list4 = ltqVarA2.a;
                        listI.add(((ltp) list4.get((i9 + i8) % list4.size())).a);
                    }
                    listI.add(ltpVar2.a);
                    cue cueVar = new cue(ltqVarA2.a.size() + 2);
                    int size3 = ltqVarA2.a.size() + 2;
                    int i10 = 0;
                    while (i10 < size3) {
                        cueVar.d(i10 == 0 ? 0.0f : i10 == ltqVarA2.a.size() + 1 ? f : lub.e(((ltp) ltqVarA2.a.get(((i8 + i10) - 1) % ltqVarA2.a.size())).c - fA));
                        i10++;
                    }
                    i2 = 1;
                    fcww fcwwVar4 = new fcww((byte[]) null);
                    int i11 = ((fcww) ltqVarA2.b).c;
                    for (int i12 = 0; i12 < i11; i12++) {
                        float f7 = ((ltv) ltqVarA2.b.get(i12)).a - fA;
                        float f8 = lub.a;
                        fcwwVar4.add(new ltv(lub.e(f7), ((ltv) ltqVarA2.b.get(i12)).b));
                    }
                    ltqVarA2 = new ltq(ltqVarA2.c, fcva.a(fcwwVar4), listI, cueVar);
                }
                ArrayList arrayList2 = new ArrayList();
                ltp ltpVar3 = (ltp) fcva.Q(ltqVarA, 0);
                ltp ltpVar4 = (ltp) fcva.Q(ltqVarA2, 0);
                int i13 = i2;
                int i14 = i13;
                while (ltpVar3 != null && ltpVar4 != null) {
                    float f9 = i14 == ltqVarA.a() ? f : ltpVar3.c;
                    if (i13 == ltqVarA2.a()) {
                        fA2 = f;
                    } else {
                        float f10 = ltpVar4.c + fA;
                        float f11 = lub.a;
                        fA2 = ltl.a(lteVar.b, lteVar.a, lub.e(f10));
                    }
                    float fMin = Math.min(f9, fA2);
                    float f12 = 1.0E-6f + fMin;
                    if (f9 > f12) {
                        fctiVarA = ltpVar3.a(fMin);
                    } else {
                        fcti fctiVar3 = new fcti(ltpVar3, fcva.Q(ltqVarA, i14));
                        i14++;
                        fctiVarA = fctiVar3;
                    }
                    ltp ltpVar5 = (ltp) fctiVarA.a;
                    ltpVar3 = (ltp) fctiVarA.b;
                    if (fA2 > f12) {
                        fctiVarA2 = ltpVar4.a(lub.e(lteVar.a(fMin) - fA));
                    } else {
                        fcti fctiVar4 = new fcti(ltpVar4, fcva.Q(ltqVarA2, i13));
                        i13++;
                        fctiVarA2 = fctiVar4;
                    }
                    ltp ltpVar6 = (ltp) fctiVarA2.a;
                    ltpVar4 = (ltp) fctiVarA2.b;
                    arrayList2.add(new fcti(ltpVar5.a, ltpVar6.a));
                }
                if (ltpVar3 != null || ltpVar4 != null) {
                    throw new IllegalArgumentException("Expected both Polygon's Cubic to be fully matched");
                }
                this.a = arrayList2;
                return;
            }
            ltd ltdVar2 = (ltd) fcva.N(listAl);
            float f13 = ltdVar2.b.a;
            float f14 = ltdVar2.c.a;
            listG = fcva.g(new fcti(Float.valueOf(f13), Float.valueOf(f14)), new fcti(Float.valueOf((f13 + 0.5f) % 1.0f), Float.valueOf((f14 + 0.5f) % 1.0f)));
        }
        f = 1.0f;
        i = -1;
        f2 = 1.0E-4f;
        fcti[] fctiVarArr2 = (fcti[]) listG.toArray(new fcti[0]);
        lte lteVar2 = new lte((fcti[]) Arrays.copyOf(fctiVarArr2, fctiVarArr2.length));
        fA = lteVar2.a(0.0f);
        if (fA >= 0.0f) {
        }
        throw new IllegalArgumentException("Cutting point is expected to be between 0 and 1");
    }
}
