package defpackage;

import androidx.compose.foundation.HoverableElement;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdr {
    public final hox a = new hpl(null, hsi.a);
    public juo b;
    public final iac c;
    private final juo d;

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public fdr(juo juoVar) {
        this.d = juoVar;
        fdap fdapVar = new fdap() { // from class: fdh
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                jxx jxxVar;
                jum jumVar = (jum) obj;
                Object obj2 = jumVar.a;
                if (obj2 instanceof juy) {
                    obj2.getClass();
                    juy juyVar = (juy) obj2;
                    if (!fds.a(juyVar.a())) {
                        jum[] jumVarArr = new jum[2];
                        jumVarArr[0] = jumVar;
                        obj2.getClass();
                        jyj jyjVarA = juyVar.a();
                        if (jyjVarA == null || (jxxVar = jyjVarA.a) == null) {
                            jxxVar = new jxx(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65535);
                        }
                        jumVarArr[1] = new jum(jxxVar, jumVar.b, jumVar.c);
                        return fcva.f(jumVarArr);
                    }
                }
                return fcva.f(jumVar);
            }
        };
        jul julVar = new jul(juoVar);
        List list = julVar.a;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ?? Invoke = fdapVar.invoke(((juk) list.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList2 = new ArrayList(Invoke.size());
            int size2 = Invoke.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(juj.a((jum) Invoke.get(i2)));
            }
            fcva.y(arrayList, arrayList2);
        }
        julVar.a.clear();
        julVar.a.addAll(arrayList);
        this.b = julVar.b();
        this.c = new iac();
    }

    public static final jum d(jum jumVar, jyi jyiVar) {
        int iF = jyiVar.f() - 1;
        int i = jumVar.b;
        int iG = jyiVar.g(iF, false);
        if (i < iG) {
            return jum.a(jumVar, null, Math.min(jumVar.c, iG), 11);
        }
        return null;
    }

    public static final jxx e(jxx jxxVar, jxx jxxVar2) {
        return jxxVar != null ? jxxVar.d(jxxVar2) : jxxVar2;
    }

    public final jyi a() {
        return (jyi) this.a.a();
    }

    public final void b(hml hmlVar, final int i) {
        int i2;
        int i3;
        char c;
        boolean z;
        int i4;
        int i5 = i & 6;
        hml hmlVarC = hmlVar.c(1154651354);
        char c2 = 2;
        boolean z2 = true;
        if (i5 == 0) {
            i2 = (true != hmlVarC.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i6 = 0;
        if (hmlVarC.J((i2 & 3) != 2, i2 & 1)) {
            final jkp jkpVar = (jkp) hmlVarC.e(jmh.m);
            juo juoVar = this.b;
            List listG = juoVar.g(juoVar.a());
            int size = listG.size();
            int i7 = 0;
            while (i7 < size) {
                final jum jumVar = (jum) listG.get(i7);
                if (jumVar.b != jumVar.c) {
                    hmlVarC.v(725478904);
                    hmw hmwVar = (hmw) hmlVarC;
                    Object objS = hmwVar.S();
                    Object obj = hmk.a;
                    if (objS == obj) {
                        objS = new ebk();
                        hmwVar.af(objS);
                    }
                    ebk ebkVar = (ebk) objS;
                    c = c2;
                    ics icsVarA = ijn.a(ics.e, new fdap() { // from class: fdb
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            jyi jyiVarA;
                            jum jumVarD;
                            ikd ikdVarO;
                            ikl iklVar = (ikl) obj2;
                            fdr fdrVar = this.a;
                            if (!((Boolean) new fdm(fdrVar).invoke()).booleanValue() || (jyiVarA = fdrVar.a()) == null || (jumVarD = fdr.d(jumVar, jyiVarA)) == null) {
                                ikdVarO = null;
                            } else {
                                int i8 = jumVarD.b;
                                int i9 = jumVarD.c;
                                ikdVarO = jyiVarA.o(i8, i9);
                                ihu ihuVarM = jyiVarA.m(i8);
                                ikdVarO.o(((Float.floatToRawIntBits(ihuVarM.c) & 4294967295L) | (Float.floatToRawIntBits(jyiVarA.h(i8) == jyiVarA.h(i9 - 1) ? Math.min(jyiVarA.m(r1).b, ihuVarM.b) : 0.0f) << 32)) ^ (-9223372034707292160L));
                            }
                            fdq fdqVar = ikdVarO != null ? new fdq(ikdVarO) : null;
                            if (fdqVar != null) {
                                iklVar.A(fdqVar);
                                iklVar.r(true);
                            }
                            return fctx.a;
                        }
                    });
                    Object objS2 = hmwVar.S();
                    if (objS2 == obj) {
                        objS2 = new fdap() { // from class: fdi
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj2) {
                                jtn jtnVar = jte.z;
                                fctx fctxVar = fctx.a;
                                ((jto) obj2).e(jtnVar, fctxVar);
                                return fctxVar;
                            }
                        };
                        hmwVar.af(objS2);
                    }
                    z = z2;
                    ics icsVarA2 = jsh.c(icsVarA, false, (fdap) objS2).a(new fdw(new fdn(this, jumVar))).a(new HoverableElement(ebkVar)).a(new PointerHoverIconModifierElement(irz.c));
                    boolean zF = hmlVarC.F(this) | hmlVarC.D(jumVar) | hmlVarC.F(jkpVar);
                    Object objS3 = hmwVar.S();
                    if (zF || objS3 == obj) {
                        objS3 = new fdae() { // from class: fdj
                            @Override // defpackage.fdae
                            public final Object invoke() {
                                juy juyVar = (juy) jumVar.a;
                                boolean z3 = juyVar instanceof jux;
                                jkp jkpVar2 = jkpVar;
                                if (z3) {
                                    try {
                                        jkpVar2.a(((jux) juyVar).a);
                                    } catch (IllegalArgumentException unused) {
                                    }
                                } else if (juyVar instanceof juw) {
                                    juz juzVar = ((juw) juyVar).c;
                                }
                                return fctx.a;
                            }
                        };
                        hmwVar.af(objS3);
                    }
                    ecz.b(dli.f(icsVarA2, ebkVar, null, false, null, null, (fdae) objS3, 508), hmlVarC, i6);
                    juy juyVar = (juy) jumVar.a;
                    if (fds.a(juyVar.a())) {
                        i3 = i2;
                        i4 = i6;
                        hmlVarC.v(728330718);
                        hmwVar.ab();
                    } else {
                        hmlVarC.v(726302047);
                        Object objS4 = hmwVar.S();
                        if (objS4 == obj) {
                            objS4 = new fal(ebkVar);
                            hmwVar.af(objS4);
                        }
                        final fal falVar = (fal) objS4;
                        fctx fctxVar = fctx.a;
                        Object objS5 = hmwVar.S();
                        i4 = i6;
                        if (objS5 == obj) {
                            objS5 = new fdo(falVar, null);
                            hmwVar.af(objS5);
                        }
                        hob.g(fctxVar, (fdat) objS5, hmlVarC);
                        Object objValueOf = Boolean.valueOf(falVar.b());
                        Object objValueOf2 = Boolean.valueOf(falVar.a());
                        Object objValueOf3 = Boolean.valueOf(falVar.c());
                        jyj jyjVarA = juyVar.a();
                        Object obj2 = jyjVarA != null ? jyjVarA.a : null;
                        i3 = i2;
                        jyj jyjVarA2 = juyVar.a();
                        Object obj3 = jyjVarA2 != null ? jyjVarA2.b : null;
                        jyj jyjVarA3 = juyVar.a();
                        Object obj4 = jyjVarA3 != null ? jyjVarA3.c : null;
                        jyj jyjVarA4 = juyVar.a();
                        Object obj5 = jyjVarA4 != null ? jyjVarA4.d : null;
                        Object[] objArr = new Object[7];
                        objArr[i4] = objValueOf;
                        objArr[z ? 1 : 0] = objValueOf2;
                        objArr[c] = objValueOf3;
                        objArr[3] = obj2;
                        objArr[4] = obj3;
                        objArr[5] = obj4;
                        objArr[6] = obj5;
                        boolean zF2 = hmlVarC.F(this) | hmlVarC.D(jumVar);
                        Object objS6 = hmwVar.S();
                        if (zF2 || objS6 == obj) {
                            objS6 = new fdap() { // from class: fdk
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj6) {
                                    jyj jyjVarA5;
                                    jyj jyjVarA6;
                                    jyj jyjVarA7;
                                    final jum jumVar2 = jumVar;
                                    fbc fbcVar = (fbc) obj6;
                                    juy juyVar2 = (juy) jumVar2.a;
                                    jyj jyjVarA8 = juyVar2.a();
                                    jxx jxxVar = null;
                                    jxx jxxVar2 = jyjVarA8 != null ? jyjVarA8.a : null;
                                    fal falVar2 = falVar;
                                    jxx jxxVarE = fdr.e(fdr.e(jxxVar2, (!falVar2.a() || (jyjVarA7 = juyVar2.a()) == null) ? null : jyjVarA7.b), (!falVar2.b() || (jyjVarA6 = juyVar2.a()) == null) ? null : jyjVarA6.c);
                                    if (falVar2.c() && (jyjVarA5 = juyVar2.a()) != null) {
                                        jxxVar = jyjVarA5.d;
                                    }
                                    final jxx jxxVarE2 = fdr.e(jxxVarE, jxxVar);
                                    final fdce fdceVar = new fdce();
                                    fbcVar.b = fbcVar.a.b(new fdap() { // from class: fbb
                                        @Override // defpackage.fdap
                                        public final Object invoke(Object obj7) {
                                            jum jumVar3;
                                            int i8;
                                            int i9;
                                            jum jumVar4 = jumVar2;
                                            fdce fdceVar2 = fdceVar;
                                            jum jumVar5 = (jum) obj7;
                                            if (fdceVar2.a && (jumVar5.a instanceof jxx) && (i8 = jumVar5.b) == jumVar4.b && (i9 = jumVar5.c) == jumVar4.c) {
                                                jxx jxxVar3 = jxxVarE2;
                                                if (jxxVar3 == null) {
                                                    jxxVar3 = new jxx(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65535);
                                                }
                                                jumVar3 = new jum(jxxVar3, i8, i9);
                                            } else {
                                                jumVar3 = jumVar5;
                                            }
                                            fdceVar2.a = fdbq.f(jumVar4, jumVar5);
                                            return jumVar3;
                                        }
                                    });
                                    return fctx.a;
                                }
                            };
                            hmwVar.af(objS6);
                        }
                        c(objArr, (fdap) objS6, hmlVarC, (i3 << 6) & 896);
                        hmwVar.ab();
                    }
                    hmwVar.ab();
                } else {
                    i3 = i2;
                    c = c2;
                    z = z2;
                    i4 = i6;
                    hmlVarC.v(728344606);
                    ((hmw) hmlVarC).ab();
                }
                i7++;
                i6 = i4;
                i2 = i3;
                c2 = c;
                z2 = z;
            }
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fdl
                @Override // defpackage.fdat
                public final Object a(Object obj6, Object obj7) {
                    ((Integer) obj7).intValue();
                    int i8 = i;
                    this.a.b((hml) obj6, hpy.a(i8 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void c(final Object[] objArr, final fdap fdapVar, hml hmlVar, final int i) {
        int i2 = i & 48;
        hml hmlVarC = hmlVar.c(-2083052099);
        int i3 = i2 == 0 ? (true != hmlVarC.F(fdapVar) ? 16 : 32) | i : i;
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.F(this) ? 128 : 256;
        }
        hmlVarC.u(-358305778, 7);
        int i4 = i3 | (true != hmlVarC.B(7) ? 0 : 4);
        for (int i5 = 0; i5 < 7; i5++) {
            i4 |= true != hmlVarC.F(objArr[i5]) ? 0 : 4;
        }
        hmw hmwVar = (hmw) hmlVarC;
        hmwVar.ab();
        if ((i4 & 14) == 0) {
            i4 |= 2;
        }
        if (hmlVarC.J((i4 & 147) != 146, i4 & 1)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(fdapVar);
            fdcl.a(objArr, arrayList);
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zF = hmlVarC.F(this) | ((i4 & 112) == 32);
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdap() { // from class: fdf
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        fdr fdrVar = this.a;
                        iac iacVar = fdrVar.c;
                        fdap fdapVar2 = fdapVar;
                        iacVar.add(fdapVar2);
                        return new fdp(fdrVar, fdapVar2);
                    }
                };
                hmwVar.af(objS);
            }
            hob.d(array, (fdap) objS, hmlVarC);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fdg
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdr fdrVar = this.a;
                    Object[] objArr2 = objArr;
                    int i6 = i;
                    fdrVar.c(objArr2, fdapVar, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
