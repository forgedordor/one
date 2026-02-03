package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkja implements fdat {
    final /* synthetic */ dkkr a;
    final /* synthetic */ fdae b;
    final /* synthetic */ iqa c;
    final /* synthetic */ hox d;
    final /* synthetic */ boolean e;
    final /* synthetic */ hox f;
    final /* synthetic */ float g;
    final /* synthetic */ fdau h;

    public dkja(dkkr dkkrVar, fdae fdaeVar, iqa iqaVar, hox hoxVar, boolean z, hox hoxVar2, float f, fdau fdauVar) {
        this.a = dkkrVar;
        this.b = fdaeVar;
        this.c = iqaVar;
        this.d = hoxVar;
        this.e = z;
        this.f = hoxVar2;
        this.g = f;
        this.h = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        boolean z;
        ics icsVarB;
        ics icsVarB2;
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hng hngVar = jmh.j;
            kji kjiVar = (kji) hmlVar.e(hngVar);
            hmlVar.v(-1782840523);
            dkkr dkkrVar = this.a;
            boolean z2 = dkke.o(dkkrVar) && !dkke.v(dkkrVar, hmlVar);
            hmlVar.o();
            if (z2) {
                hmlVar.v(566598276);
                fdae fdaeVar = this.b;
                iqa iqaVar = this.c;
                ics icsVarB3 = dkke.b(ics.e, dkkrVar, fdaeVar, iqaVar);
                fctx fctxVar = fctx.a;
                hmlVar.v(-1224400529);
                boolean zD = hmlVar.D(dkkrVar);
                hox hoxVar = this.d;
                boolean zD2 = zD | hmlVar.D(hoxVar) | hmlVar.B(kjiVar.ordinal()) | hmlVar.F(iqaVar);
                hox hoxVar2 = this.f;
                Object objF = hmlVar.f();
                if (zD2 || objF == hmk.a) {
                    objF = new dkiz(dkkrVar, hoxVar, kjiVar, iqaVar, hoxVar2);
                    hmlVar.y(objF);
                }
                hmlVar.o();
                icsVarB = itf.a(icsVarB3, fctxVar, (PointerInputEventHandler) objF);
                hmlVar.o();
                z = true;
            } else {
                dkgv dkgvVar = dkkrVar.y.b;
                if (dkgvVar != dkgv.b) {
                    hmlVar.v(566962092);
                    boolean z3 = this.e;
                    hox hoxVar3 = this.d;
                    ics icsVarB4 = ics.e;
                    kji kjiVar2 = (kji) hmlVar.e(hngVar);
                    iqa iqaVar2 = this.c;
                    hmlVar.v(5004770);
                    final hox hoxVar4 = this.f;
                    Object objF2 = hmlVar.f();
                    Object obj3 = hmk.a;
                    if (objF2 == obj3) {
                        objF2 = new fdap() { // from class: dkix
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj4) {
                                hoxVar4.b(Float.valueOf(dkke.a(((Float) obj4).floatValue())));
                                return fctx.a;
                            }
                        };
                        hmlVar.y(objF2);
                    }
                    fdap fdapVar = (fdap) objF2;
                    hmlVar.o();
                    hmlVar.v(-1376984276);
                    fdae fdaeVar2 = dkkrVar.n;
                    if (fdaeVar2 == null) {
                        hmlVar.o();
                        z = true;
                    } else {
                        z = true;
                        Object[] objArr = {dkgvVar, hoxVar3, dkkrVar.a};
                        hmlVar.v(-1224400529);
                        boolean zD3 = hmlVar.D(hoxVar3) | hmlVar.D(fdaeVar2) | hmlVar.B(kjiVar2.ordinal()) | hmlVar.D(dkkrVar) | hmlVar.E(z3) | hmlVar.F(iqaVar2);
                        Object objF3 = hmlVar.f();
                        if (zD3 || objF3 == obj3) {
                            Object dkjvVar = new dkjv(hoxVar3, fdapVar, fdaeVar2, kjiVar2, dkkrVar, z3, iqaVar2);
                            hmlVar.y(dkjvVar);
                            objF3 = dkjvVar;
                        }
                        hmlVar.o();
                        icsVarB4 = itf.b(icsVarB4, objArr, (PointerInputEventHandler) objF3);
                        hmlVar.o();
                    }
                    icsVarB = dkke.b(icsVarB4, dkkrVar, this.b, iqaVar2);
                    hmlVar.o();
                } else {
                    z = true;
                    hmlVar.v(567345810);
                    hmlVar.o();
                    icsVarB = ics.e;
                }
            }
            fcww fcwwVar = new fcww((byte[]) null);
            for (dkgp dkgpVar : dkkrVar.x) {
                fcwwVar.add(new jrr(dkgpVar.a, dkgpVar.b));
            }
            String str = dkkrVar.m;
            final fdap fdapVar2 = dkkrVar.l;
            if (str != null && fdapVar2 != null) {
                fcwwVar.add(new jrr(str, new fdae() { // from class: dkhv
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdapVar2.invoke(dkkn.b);
                        return true;
                    }
                }));
            }
            final List listA = fcva.a(fcwwVar);
            if (!listA.isEmpty()) {
                icsVarB = jsh.c(icsVarB, false, new fdap() { // from class: dkhw
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        jto jtoVar = (jto) obj4;
                        jtoVar.getClass();
                        List list = listA;
                        jtk.l(jtoVar, list.subList(0, Math.min(((fcww) list).c, 32)));
                        return fctx.a;
                    }
                });
            }
            ics icsVarB5 = dihi.b(icsVarB);
            iby ibyVarE = dkks.e(dkkrVar);
            hox hoxVar5 = this.f;
            float f = this.g;
            fdau fdauVar = this.h;
            ixm ixmVarA = ecz.a(ibyVarE, false);
            int iA = dkiw.a(hmg.b(hmlVar));
            hxi hxiVarN = hmlVar.N();
            ics icsVarB6 = icj.b(hmlVar, icsVarB5);
            fdae fdaeVar3 = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar3);
            } else {
                hmlVar.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVar, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVar, hxiVarN, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Object objValueOf = Integer.valueOf(iA);
                hmlVar.y(objValueOf);
                hmlVar.h(objValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVar, icsVarB6, fdatVar4);
            boolean z4 = f == 0.0f ? false : z;
            edf edfVar = edf.a;
            boolean z5 = z;
            dkke.k(edfVar, dkkrVar, hoxVar5, z4, hmlVar, 390);
            dkke.i(edfVar, dkkrVar, hmlVar, 6);
            dkgu dkguVar = dkkrVar.y;
            hmlVar.v(-222734315);
            if (dkguVar.j.a) {
                int i = dkguVar.k - 1;
                icsVarB2 = i != 0 ? i != z5 ? egq.d(ics.e, 1.0f) : efm.b(ics.e, z5 ? 1 : 0) : efm.b(ics.e, 2);
            } else {
                icsVarB2 = dkguVar.e ? efm.b(ics.e, 2) : efm.b(ics.e, z5 ? 1 : 0);
            }
            ixm ixmVarA2 = edl.a(ecr.c, ibw.j, hmlVar, 0);
            int iA2 = dkiw.a(hmg.b(hmlVar));
            hxi hxiVarN2 = hmlVar.N();
            ics icsVarB7 = icj.b(hmlVar, icsVarB2);
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar3);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA2, fdatVar);
            hsk.b(hmlVar, hxiVarN2, fdatVar2);
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA2))) {
                Object objValueOf2 = Integer.valueOf(iA2);
                hmlVar.y(objValueOf2);
                hmlVar.h(objValueOf2, fdatVar3);
            }
            hsk.b(hmlVar, icsVarB7, fdatVar4);
            Object obj4 = edp.a;
            dkke.l(dkguVar, hmlVar, 0);
            fdauVar.a(obj4, hmlVar, 6);
            hmlVar.n();
            hmlVar.o();
            hmlVar.n();
            if (dkguVar.b == dkgv.a) {
                dkke.m(dkguVar.a, dkkrVar.v.d, hmlVar, 0);
            }
        }
        return fctx.a;
    }
}
