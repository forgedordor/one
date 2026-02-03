package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class efb implements ixu, eey {
    public final eci a;
    public final edx b;
    private final ecq d;
    private final float e;
    private final float f;
    private final int g;
    private final eev i;
    private final boolean c = true;
    private final int h = Alert.DURATION_SHOW_INDEFINITELY;

    public efb(eci eciVar, ecq ecqVar, float f, edx edxVar, float f2, int i, eev eevVar) {
        this.a = eciVar;
        this.d = ecqVar;
        this.e = f;
        this.b = edxVar;
        this.f = f2;
        this.g = i;
        this.i = eevVar;
    }

    public static final int k(ivt ivtVar, int i) {
        return ivtVar.c(i);
    }

    public static final int l(ivt ivtVar, int i) {
        return ivtVar.d(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int m(List list, int i, int i2, int i3, int i4, eev eevVar) {
        ivt ivtVar;
        boolean z;
        long jC;
        int i5;
        boolean z2;
        int i6;
        ctg ctgVar;
        List list2 = list;
        int i7 = 0;
        if (list2.isEmpty()) {
            jC = ctg.c(0, 0);
        } else {
            int i8 = Alert.DURATION_SHOW_INDEFINITELY;
            long jD = kim.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
            ivt ivtVar2 = (ivt) fcva.Q(list2, 0);
            int iK = ivtVar2 != null ? k(ivtVar2, i) : 0;
            int iL = ivtVar2 != null ? l(ivtVar2, iK) : 0;
            if (list2.size() > 1) {
                ivtVar = ivtVar2;
                z = true;
            } else {
                ivtVar = ivtVar2;
                z = false;
            }
            int i9 = iK;
            int i10 = iL;
            if (eei.a(z, 0, ctg.c(i, Alert.DURATION_SHOW_INDEFINITELY), ivtVar == null ? null : new ctg(ctg.c(iL, iK)), 0, 0, 0, false, false, i4, eevVar, jD, i2, i3).b) {
                jC = ctg.c(0, 0);
            } else {
                int size = list2.size();
                int i11 = i;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = i9;
                int i18 = i10;
                int i19 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    int i20 = i11 - i18;
                    int i21 = i12 + 1;
                    int iMax = Math.max(i13, i17);
                    ivt ivtVar3 = (ivt) fcva.Q(list2, i21);
                    int iK2 = ivtVar3 != null ? k(ivtVar3, i) : i7;
                    int iL2 = ivtVar3 != null ? l(ivtVar3, iK2) + i2 : i7;
                    if (i12 + 2 < list2.size()) {
                        i5 = size;
                        z2 = 1;
                    } else {
                        i5 = size;
                        z2 = i7;
                    }
                    int i22 = i14;
                    int i23 = i15;
                    int i24 = i21 - i19;
                    int i25 = i5;
                    long jC2 = ctg.c(i20, i8);
                    if (ivtVar3 == null) {
                        i6 = i20;
                        ctgVar = null;
                    } else {
                        i6 = i20;
                        ctgVar = new ctg(ctg.c(iL2, iK2));
                    }
                    int i26 = iK2;
                    int i27 = iL2;
                    int i28 = i6;
                    eeh eehVarA = eei.a(z2, i24, jC2, ctgVar, i22, i23, iMax, false, false, i4, eevVar, jD, i2, i3);
                    if (eehVarA.a) {
                        i15 = i23 + iMax + i3;
                        eei.b(eehVarA, eevVar);
                        int i29 = i27 - i2;
                        i14 = i22 + 1;
                        if (eehVarA.b) {
                            i16 = i21;
                            break;
                        }
                        i19 = i21;
                        i11 = i;
                        i18 = i29;
                        i13 = 0;
                    } else {
                        i14 = i22;
                        i13 = iMax;
                        i15 = i23;
                        i11 = i28;
                        i18 = i27;
                    }
                    i12 = i21;
                    i16 = i12;
                    size = i25;
                    i17 = i26;
                    i8 = Alert.DURATION_SHOW_INDEFINITELY;
                    i7 = 0;
                    list2 = list;
                }
                jC = ctg.c(i15 - i3, i16);
            }
        }
        return ctg.a(jC);
    }

    @Override // defpackage.ixu
    public final int a(ivu ivuVar, List list, int i) {
        List list2 = (List) fcva.Q(list, 1);
        ivt ivtVar = list2 != null ? (ivt) fcva.P(list2) : null;
        List list3 = (List) fcva.Q(list, 2);
        ivt ivtVar2 = list3 != null ? (ivt) fcva.P(list3) : null;
        eev eevVar = this.i;
        eevVar.a(ivtVar, ivtVar2, kim.k(0, i, 0, 13));
        List list4 = (List) fcva.P(list);
        if (list4 == null) {
            list4 = fcvo.a;
        }
        return m(list4, i, ivuVar.ep(this.e), ivuVar.ep(this.f), this.g, eevVar);
    }

    @Override // defpackage.ixu
    public final int b(ivu ivuVar, List list, int i) {
        List list2 = (List) fcva.Q(list, 1);
        ivt ivtVar = list2 != null ? (ivt) fcva.P(list2) : null;
        List list3 = (List) fcva.Q(list, 2);
        this.i.a(ivtVar, list3 != null ? (ivt) fcva.P(list3) : null, kim.k(0, 0, i, 7));
        List list4 = (List) fcva.P(list);
        if (list4 == null) {
            list4 = fcvo.a;
        }
        int iEp = ivuVar.ep(this.e);
        int i2 = this.g;
        int size = list4.size();
        int i3 = 0;
        int iMax = 0;
        int iB = 0;
        int i4 = 0;
        while (i3 < size) {
            iB += ((ivt) list4.get(i3)).b(i) + iEp;
            int i5 = i3 + 1;
            if (i5 - i4 == i2 || i5 == list4.size()) {
                iMax = Math.max(iMax, iB - iEp);
                i4 = i3;
                iB = 0;
            }
            i3 = i5;
        }
        return iMax;
    }

    @Override // defpackage.ixu
    public final int c(ivu ivuVar, List list, int i) {
        List list2 = (List) fcva.Q(list, 1);
        ivt ivtVar = list2 != null ? (ivt) fcva.P(list2) : null;
        List list3 = (List) fcva.Q(list, 2);
        ivt ivtVar2 = list3 != null ? (ivt) fcva.P(list3) : null;
        eev eevVar = this.i;
        eevVar.a(ivtVar, ivtVar2, kim.k(0, i, 0, 13));
        List list4 = (List) fcva.P(list);
        if (list4 == null) {
            list4 = fcvo.a;
        }
        return m(list4, i, ivuVar.ep(this.e), ivuVar.ep(this.f), this.g, eevVar);
    }

    @Override // defpackage.ixu
    public final int d(ivu ivuVar, List list, int i) {
        eev eevVar;
        boolean z;
        long j;
        ctg ctgVar;
        int i2;
        int[] iArr;
        List list2;
        eev eevVar2;
        long jC;
        int i3;
        int i4;
        ctg ctgVar2;
        List list3 = (List) fcva.Q(list, 1);
        ivt ivtVar = list3 != null ? (ivt) fcva.P(list3) : null;
        List list4 = (List) fcva.Q(list, 2);
        ivt ivtVar2 = list4 != null ? (ivt) fcva.P(list4) : null;
        eev eevVar3 = this.i;
        int i5 = 0;
        eevVar3.a(ivtVar, ivtVar2, kim.k(0, 0, i, 7));
        List list5 = (List) fcva.P(list);
        if (list5 == null) {
            list5 = fcvo.a;
        }
        int iEp = ivuVar.ep(this.e);
        int iEp2 = ivuVar.ep(this.f);
        int i6 = this.g;
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr2 = new int[size];
        int size2 = list5.size();
        int[] iArr3 = new int[size2];
        int size3 = list5.size();
        for (int i7 = 0; i7 < size3; i7++) {
            ivt ivtVar3 = (ivt) list5.get(i7);
            int iL = l(ivtVar3, i);
            iArr2[i7] = iL;
            iArr3[i7] = k(ivtVar3, iL);
        }
        list5.size();
        list5.size();
        int i8 = eevVar3.c;
        int size4 = list5.size();
        int i9 = Alert.DURATION_SHOW_INDEFINITELY;
        int iMin = Math.min(Alert.DURATION_SHOW_INDEFINITELY, size4);
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += iArr2[i11];
        }
        int size5 = i10 + ((list5.size() - 1) * iEp);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i12 = iArr3[0];
        int iA = fcur.A(iArr3);
        if (iA > 0) {
            int i13 = 1;
            while (true) {
                int i14 = iArr3[i13];
                if (i12 < i14) {
                    i12 = i14;
                }
                if (i13 == iA) {
                    break;
                }
                i13++;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i15 = iArr2[0];
        int iA2 = fcur.A(iArr2);
        if (iA2 > 0) {
            int i16 = 1;
            while (true) {
                int i17 = iArr2[i16];
                if (i15 < i17) {
                    i15 = i17;
                }
                if (i16 == iA2) {
                    break;
                }
                i16++;
            }
        }
        int i18 = size5;
        while (i15 <= i18 && i12 != i) {
            int i19 = (i15 + i18) / 2;
            int i20 = eeq.a;
            if (list5.isEmpty()) {
                jC = ctg.c(i5, i5);
                i2 = i6;
                list2 = list5;
                eevVar2 = eevVar3;
                iArr = iArr3;
            } else {
                long jD = kim.d(i5, i19, i5, i9);
                ivt ivtVar4 = (ivt) fcva.Q(list5, i5);
                int i21 = ivtVar4 != null ? iArr3[i5] : i5;
                int i22 = ivtVar4 != null ? iArr2[i5] : i5;
                if (list5.size() > 1) {
                    eevVar = eevVar3;
                    z = true;
                } else {
                    eevVar = eevVar3;
                    z = false;
                }
                int[] iArr4 = iArr3;
                long jC2 = ctg.c(i19, i9);
                if (ivtVar4 == null) {
                    j = jC2;
                    ctgVar = null;
                } else {
                    j = jC2;
                    ctgVar = new ctg(ctg.c(i22, i21));
                }
                int i23 = i21;
                int i24 = i22;
                i2 = i6;
                iArr = iArr4;
                if (eei.a(z, 0, j, ctgVar, 0, 0, 0, false, false, i2, eevVar, jD, iEp, iEp2).b) {
                    jC = ctg.c(0, 0);
                    list2 = list5;
                    eevVar2 = eevVar;
                } else {
                    int size6 = list5.size();
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = i19;
                    int i31 = i23;
                    int i32 = 0;
                    while (true) {
                        if (i26 >= size6) {
                            list2 = list5;
                            eevVar2 = eevVar;
                            break;
                        }
                        int i33 = i30 - i24;
                        int i34 = i26 + 1;
                        int iMax = Math.max(i25, i31);
                        ivt ivtVar5 = (ivt) fcva.Q(list5, i34);
                        int i35 = ivtVar5 != null ? iArr[i34] : 0;
                        int i36 = ivtVar5 != null ? iArr2[i34] + iEp : 0;
                        int i37 = i34 - i32;
                        list2 = list5;
                        int i38 = size6;
                        boolean z2 = i26 + 2 < list5.size();
                        long jC3 = ctg.c(i33, Alert.DURATION_SHOW_INDEFINITELY);
                        if (ivtVar5 == null) {
                            i4 = i36;
                            i3 = i33;
                            ctgVar2 = null;
                        } else {
                            i3 = i33;
                            i4 = i36;
                            ctgVar2 = new ctg(ctg.c(i36, i35));
                        }
                        int i39 = i35;
                        int i40 = i3;
                        eeh eehVarA = eei.a(z2, i37, jC3, ctgVar2, i28, i29, iMax, false, false, i2, eevVar, jD, iEp, iEp2);
                        eevVar2 = eevVar;
                        if (eehVarA.a) {
                            i29 += iMax + iEp2;
                            eei.b(eehVarA, eevVar2);
                            int i41 = i4 - iEp;
                            i28++;
                            if (eehVarA.b) {
                                i27 = i34;
                                break;
                            }
                            i32 = i34;
                            i4 = i41;
                            i40 = i19;
                            iMax = 0;
                        }
                        i26 = i34;
                        i27 = i26;
                        i31 = i39;
                        size6 = i38;
                        eevVar = eevVar2;
                        i25 = iMax;
                        i24 = i4;
                        i30 = i40;
                        list5 = list2;
                    }
                    jC = ctg.c(i29 - iEp2, i27);
                }
            }
            int iA3 = ctg.a(jC);
            if (iA3 > i || ctg.b(jC) < iMin) {
                i15 = i19 + 1;
                if (i15 > i18) {
                    return i15;
                }
            } else {
                if (iA3 >= i) {
                    return i19;
                }
                i18 = i19 - 1;
            }
            size5 = i19;
            eevVar3 = eevVar2;
            i6 = i2;
            iArr3 = iArr;
            list5 = list2;
            i5 = 0;
            i9 = Alert.DURATION_SHOW_INDEFINITELY;
            i12 = iA3;
        }
        return size5;
    }

    @Override // defpackage.ixu
    public final ixn e(ixp ixpVar, List list, long j) {
        eew eewVar;
        cuh cuhVar;
        ixk ixkVarA;
        ArrayList arrayList;
        ctg ctgVar;
        ArrayList arrayList2;
        eew eewVar2;
        int i;
        eev eevVar;
        long j2;
        ctg ctgVar2;
        ixk ixkVar;
        Iterator it;
        Integer numValueOf;
        Integer num;
        Integer numValueOf2;
        Integer num2;
        boolean z;
        ctg ctgVar3;
        cug cugVar;
        cug cugVar2;
        Integer numValueOf3;
        int i2;
        int i3;
        ixp ixpVar2 = ixpVar;
        int i4 = this.g;
        if (i4 != 0 && !list.isEmpty()) {
            if (kil.a(j) != 0) {
                List list2 = (List) fcva.N(list);
                if (list2.isEmpty()) {
                    return ixpVar2.ej(0, 0, fcvp.a, new fdap() { // from class: efa
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            return fctx.a;
                        }
                    });
                }
                List list3 = (List) fcva.Q(list, 1);
                ixk ixkVar2 = list3 != null ? (ixk) fcva.P(list3) : null;
                List list4 = (List) fcva.Q(list, 2);
                ixk ixkVar3 = list4 != null ? (ixk) fcva.P(list4) : null;
                list2.size();
                final eev eevVar2 = this.i;
                long jB = efx.b(j);
                long jC = efx.c(kim.d((10 & 1) != 0 ? kil.d(jB) : 0, (10 & 2) != 0 ? kil.b(jB) : 0, (10 & 4) != 0 ? kil.c(jB) : 0, kil.a(jB)));
                if (ixkVar2 != null) {
                    eeq.f(ixkVar2, jC, new fdap() { // from class: eet
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            iyl iylVar = (iyl) obj;
                            if (iylVar != null) {
                                iylVar.w();
                                iylVar.v();
                            }
                            return fctx.a;
                        }
                    });
                    eevVar2.a = ixkVar2;
                }
                if (ixkVar3 != null) {
                    eeq.f(ixkVar3, jC, new fdap() { // from class: eeu
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            iyl iylVar = (iyl) obj;
                            if (iylVar != null) {
                                iylVar.w();
                                iylVar.v();
                            }
                            return fctx.a;
                        }
                    });
                    eevVar2.b = ixkVar3;
                }
                Iterator it2 = list2.iterator();
                float f = this.e;
                float f2 = this.f;
                long jB2 = efx.b(j);
                int i5 = eeq.a;
                final hum humVar = new hum(new ixn[16]);
                int iB = kil.b(jB2);
                int iD = kil.d(jB2);
                int iA = kil.a(jB2);
                cuh cuhVar2 = ctk.a;
                cuh cuhVar3 = new cuh((byte[]) null);
                ArrayList arrayList3 = new ArrayList();
                float fCeil = (float) Math.ceil(ixpVar2.en(f));
                float fCeil2 = (float) Math.ceil(ixpVar2.en(f2));
                long jD = kim.d(0, iB, 0, iA);
                long jC2 = efx.c(kim.d((10 & 1) != 0 ? kil.d(jD) : 0, (10 & 2) != 0 ? kil.b(jD) : 0, (10 & 4) != 0 ? kil.c(jD) : 0, kil.a(jD)));
                final fdci fdciVar = new fdci();
                if (it2 instanceof edr) {
                    ixpVar2.el(iB);
                    ixpVar2.el(iA);
                    eewVar = new eew();
                } else {
                    eewVar = null;
                }
                if (it2.hasNext()) {
                    cuhVar = cuhVar3;
                    ixkVarA = eeq.a(it2, eewVar);
                } else {
                    cuhVar = cuhVar3;
                    ixkVarA = null;
                }
                if (ixkVarA != null) {
                    arrayList = arrayList3;
                    ctgVar = new ctg(eeq.f(ixkVarA, jC2, new fdap() { // from class: eel
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            int i6 = eeq.a;
                            fdciVar.a = (iyl) obj;
                            return fctx.a;
                        }
                    }));
                } else {
                    arrayList = arrayList3;
                    ctgVar = null;
                }
                Integer numValueOf4 = ctgVar != null ? Integer.valueOf(ctg.a(ctgVar.a)) : null;
                Integer numValueOf5 = ctgVar != null ? Integer.valueOf(ctg.b(ctgVar.a)) : null;
                int i6 = (int) fCeil2;
                int i7 = (int) fCeil;
                cug cugVar3 = new cug((byte[]) null);
                cug cugVar4 = new cug((byte[]) null);
                boolean zHasNext = it2.hasNext();
                long jC3 = ctg.c(iB, iA);
                ixk ixkVar4 = ixkVarA;
                ctg ctgVar4 = ctgVar;
                ArrayList arrayList4 = arrayList;
                long j3 = jC2;
                cug cugVar5 = cugVar4;
                cug cugVar6 = cugVar3;
                cuh cuhVar4 = cuhVar;
                eeh eehVarA = eei.a(zHasNext, 0, jC3, ctgVar4, 0, 0, 0, false, false, i4, eevVar2, jB2, i7, i6);
                int i8 = i4;
                eev eevVar3 = eevVar2;
                if (eehVarA.b) {
                    eei.b(eehVarA, eevVar3);
                }
                int i9 = iB;
                int i10 = iA;
                ixk ixkVar5 = ixkVar4;
                int i11 = 0;
                int iMax = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (!eehVarA.b && ixkVar5 != null) {
                    numValueOf4.getClass();
                    int iIntValue = numValueOf4.intValue();
                    numValueOf5.getClass();
                    int i16 = i11 + iIntValue;
                    iMax = Math.max(iMax, numValueOf5.intValue());
                    int i17 = i9 - iIntValue;
                    arrayList4.add(ixkVar5);
                    cuhVar4.f(i12, fdciVar.a);
                    int i18 = i12 + 1;
                    int i19 = i18 - i15;
                    boolean z2 = i19 < i8;
                    if (eewVar != null) {
                        if (z2) {
                            int i20 = i17 - i7;
                            arrayList2 = arrayList4;
                            i2 = i20 < 0 ? 0 : i20;
                        } else {
                            arrayList2 = arrayList4;
                            i2 = iB;
                        }
                        ixpVar2.el(i2);
                        if (z2) {
                            i3 = i10;
                        } else {
                            i3 = (i10 - iMax) - i6;
                            if (i3 < 0) {
                                i3 = 0;
                            }
                        }
                        ixpVar2.el(i3);
                    } else {
                        arrayList2 = arrayList4;
                    }
                    ixk ixkVarA2 = !it2.hasNext() ? null : eeq.a(it2, eewVar);
                    fdciVar.a = null;
                    if (ixkVarA2 != null) {
                        eewVar2 = eewVar;
                        i = i8;
                        eevVar = eevVar3;
                        j2 = j3;
                        ctgVar2 = new ctg(eeq.f(ixkVarA2, j2, new fdap() { // from class: eem
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj) {
                                int i21 = eeq.a;
                                fdciVar.a = (iyl) obj;
                                return fctx.a;
                            }
                        }));
                    } else {
                        eewVar2 = eewVar;
                        i = i8;
                        eevVar = eevVar3;
                        j2 = j3;
                        ctgVar2 = null;
                    }
                    if (ctgVar2 != null) {
                        ixkVar = ixkVarA2;
                        it = it2;
                        numValueOf = Integer.valueOf(ctg.a(ctgVar2.a) + i7);
                    } else {
                        ixkVar = ixkVarA2;
                        it = it2;
                        numValueOf = null;
                    }
                    if (ctgVar2 != null) {
                        num = numValueOf;
                        numValueOf2 = Integer.valueOf(ctg.b(ctgVar2.a));
                    } else {
                        num = numValueOf;
                        numValueOf2 = null;
                    }
                    boolean zHasNext2 = it.hasNext();
                    int i21 = i10;
                    long jC4 = ctg.c(i17, i21);
                    if (ctgVar2 == null) {
                        num2 = numValueOf2;
                        z = zHasNext2;
                        ctgVar3 = null;
                    } else {
                        num.getClass();
                        int iIntValue2 = num.intValue();
                        numValueOf2.getClass();
                        num2 = numValueOf2;
                        z = zHasNext2;
                        ctgVar3 = new ctg(ctg.c(iIntValue2, num2.intValue()));
                    }
                    int i22 = i13;
                    fdci fdciVar2 = fdciVar;
                    int iMin = iD;
                    eev eevVar4 = eevVar;
                    int i23 = i21;
                    int i24 = i14;
                    int i25 = i;
                    eehVarA = eei.a(z, i19, jC4, ctgVar3, i22, i24, iMax, false, false, i25, eevVar4, jB2, i7, i6);
                    eevVar3 = eevVar4;
                    if (eehVarA.a) {
                        iMin = Math.min(Math.max(iMin, i16), iB);
                        int i26 = i24 + iMax;
                        eei.b(eehVarA, eevVar3);
                        cugVar2 = cugVar5;
                        cugVar2.f(iMax);
                        int i27 = (iA - i26) - i6;
                        cugVar = cugVar6;
                        cugVar.f(i18);
                        i13 = i22 + 1;
                        i15 = i18;
                        i24 = i26 + i6;
                        i23 = i27;
                        numValueOf3 = num != null ? Integer.valueOf(num.intValue() - i7) : null;
                        i11 = 0;
                        iMax = 0;
                        i9 = iB;
                    } else {
                        cugVar = cugVar6;
                        cugVar2 = cugVar5;
                        i13 = i22;
                        i9 = i17;
                        i11 = i16;
                        numValueOf3 = num;
                    }
                    j3 = j2;
                    cugVar6 = cugVar;
                    cugVar5 = cugVar2;
                    i8 = i25;
                    eewVar = eewVar2;
                    i10 = i23;
                    numValueOf5 = num2;
                    ixpVar2 = ixpVar;
                    i12 = i18;
                    i14 = i24;
                    arrayList4 = arrayList2;
                    ixkVar5 = ixkVar;
                    numValueOf4 = numValueOf3;
                    fdciVar = fdciVar2;
                    iD = iMin;
                    it2 = it;
                }
                ArrayList arrayList5 = arrayList4;
                int iMax2 = iD;
                cug cugVar7 = cugVar6;
                cug cugVar8 = cugVar5;
                int size = arrayList5.size();
                iyl[] iylVarArr = new iyl[size];
                for (int i28 = 0; i28 < size; i28++) {
                    iylVarArr[i28] = (iyl) cuhVar4.a(i28);
                }
                int i29 = cugVar7.b;
                int[] iArr = new int[i29];
                int[] iArr2 = new int[i29];
                int[] iArr3 = cugVar7.a;
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                while (i31 < i29) {
                    int i33 = iArr3[i31];
                    ixn ixnVarA = egi.a(this, iMax2, kil.c(jD), kil.b(jD), cugVar8.a(i31), i7, ixpVar, arrayList5, iylVarArr, i30, i33, iArr, i31);
                    int iK = ixnVarA.k();
                    int iJ = ixnVarA.j();
                    iArr2[i31] = iJ;
                    i32 += iJ;
                    iMax2 = Math.max(iMax2, iK);
                    humVar.n(ixnVarA);
                    i31++;
                    i30 = i33;
                    i29 = i29;
                    iArr3 = iArr3;
                }
                int i34 = humVar.b;
                int i35 = i34 == 0 ? 0 : i32;
                if (i34 == 0) {
                    iMax2 = 0;
                }
                ecq ecqVar = this.d;
                int iEp = ixpVar.ep(ecqVar.a()) * (humVar.b - 1);
                int iC = kil.c(jB2);
                int iA2 = kil.a(jB2);
                int i36 = i35 + iEp;
                if (i36 >= iC) {
                    iC = i36;
                }
                if (iC <= iA2) {
                    iA2 = iC;
                }
                ecqVar.b(ixpVar, iA2, iArr2, iArr);
                int iD2 = kil.d(jB2);
                int iB2 = kil.b(jB2);
                fdap fdapVar = new fdap() { // from class: eek
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        int i37 = eeq.a;
                        hum humVar2 = humVar;
                        Object[] objArr = humVar2.a;
                        int i38 = humVar2.b;
                        for (int i39 = 0; i39 < i38; i39++) {
                            ((ixn) objArr[i39]).o();
                        }
                        return fctx.a;
                    }
                };
                if (iMax2 < iD2) {
                    iMax2 = iD2;
                }
                if (iMax2 <= iB2) {
                    iB2 = iMax2;
                }
                return ixpVar.ej(iB2, iA2, fcvp.a, fdapVar);
            }
            int i37 = this.i.c;
        }
        return ixpVar2.ej(0, 0, fcvp.a, new fdap() { // from class: eez
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return fctx.a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efb)) {
            return false;
        }
        efb efbVar = (efb) obj;
        boolean z = efbVar.c;
        if (!fdbq.f(this.a, efbVar.a) || !fdbq.f(this.d, efbVar.d) || !kir.b(this.e, efbVar.e) || !fdbq.f(this.b, efbVar.b) || !kir.b(this.f, efbVar.f) || this.g != efbVar.g) {
            return false;
        }
        int i = efbVar.h;
        return fdbq.f(this.i, efbVar.i);
    }

    @Override // defpackage.egh
    public final /* synthetic */ int f(iyl iylVar) {
        return iylVar.v();
    }

    @Override // defpackage.egh
    public final /* synthetic */ int g(iyl iylVar) {
        return iylVar.w();
    }

    @Override // defpackage.egh
    public final /* synthetic */ void h(int i, int[] iArr, int[] iArr2, ixp ixpVar) {
        this.a.b(ixpVar, i, iArr, ixpVar.q(), iArr2);
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() + 38161) * 31) + this.d.hashCode()) * 31) + Float.floatToIntBits(this.e)) * 31) + this.b.hashCode()) * 31) + Float.floatToIntBits(this.f)) * 31) + this.g) * 31) + Alert.DURATION_SHOW_INDEFINITELY) * 31) + 1922;
    }

    @Override // defpackage.egh
    public final /* synthetic */ long i(int i, int i2, int i3, boolean z) {
        return egk.b(z, i, i2, i3);
    }

    @Override // defpackage.egh
    public final /* synthetic */ ixn j(final iyl[] iylVarArr, ixp ixpVar, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        final kji kjiVar = kji.a;
        return ixpVar.ej(i, i2, fcvp.a, new fdap() { // from class: eex
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                edx edxVar;
                iyk iykVar = (iyk) obj;
                int[] iArr3 = iArr2;
                int i6 = iArr3 != null ? iArr3[i3] : 0;
                int i7 = i4;
                for (int i8 = i7; i8 < i5; i8++) {
                    iyl iylVar = iylVarArr[i8];
                    iylVar.getClass();
                    egj egjVarC = egg.c(iylVar);
                    if (egjVarC == null || (edxVar = egjVarC.c) == null) {
                        edxVar = ((efb) this).b;
                    }
                    iykVar.s(iylVar, iArr[i8 - i7], edxVar.a(i2 - iylVar.v(), kjiVar) + i6, 0.0f);
                }
                return fctx.a;
            }
        });
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.d + ", mainAxisSpacing=" + ((Object) kir.a(this.e)) + ", crossAxisAlignment=" + this.b + ", crossAxisArrangementSpacing=" + ((Object) kir.a(this.f)) + ", maxItemsInMainAxis=" + this.g + ", maxLines=2147483647, overflow=" + this.i + ')';
    }
}
