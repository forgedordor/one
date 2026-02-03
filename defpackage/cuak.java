package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuak {
    public static final void a(final ctye ctyeVar, hml hmlVar, final int i) {
        int i2;
        egc egdVar;
        hmw hmwVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-530729905);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(ctyeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i4 = i2 & 14;
            ejy ejyVarA = ekb.a(0, hmlVarC, 3);
            ctyd ctydVar = ctyeVar.f;
            ics icsVarD = (!ctydVar.c || ctyeVar.e == null) ? ctyeVar.b.isEmpty() ? egq.d(ics.e, 1.0f) : egq.b(egq.d(ics.e, 1.0f), 1.0f) : egq.b(egq.b(ics.e, 1.0f), 1.0f);
            hmlVarC.v(1069683169);
            if (ctyeVar.d != null) {
                hmlVarC.v(5004770);
                hmw hmwVar2 = (hmw) hmlVarC;
                Object objS = hmwVar2.S();
                if (i4 == 4 || objS == hmk.a) {
                    objS = new fdap() { // from class: ctzi
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            jto jtoVar = (jto) obj;
                            jtoVar.getClass();
                            String str = ctyeVar.d;
                            str.getClass();
                            jtk.o(jtoVar, str);
                            return fctx.a;
                        }
                    };
                    hmwVar2.af(objS);
                }
                hmwVar2.ab();
                icsVarD = jsh.c(icsVarD, false, (fdap) objS);
            }
            hmw hmwVar3 = (hmw) hmlVarC;
            hmwVar3.ab();
            hmlVarC.v(1069690083);
            if (!ctydVar.a || ctyeVar.b.isEmpty()) {
                egdVar = new egd(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                kio kioVar = (kio) hmlVarC.e(jmh.e);
                egdVar = efy.h(0.0f, 0.0f, 0.0f, kioVar.el(ehv.f(hmlVarC).a(kioVar)), 7);
            }
            hmwVar3.ab();
            ics icsVarA = joj.a(icsVarD, "ContactSuggestionList");
            ibx ibxVar = ctydVar.b ? ibw.k : ibw.j;
            hmlVarC.v(5004770);
            Object objS2 = hmwVar3.S();
            if (i4 == 4 || objS2 == hmk.a) {
                objS2 = new fdap() { // from class: ctzj
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        eio eioVar = (eio) obj;
                        eioVar.getClass();
                        ctye ctyeVar2 = ctyeVar;
                        List list = ctyeVar2.b;
                        if (!list.isEmpty()) {
                            ejk.a(eioVar, ctyeVar2.a, ctya.a, 2);
                        }
                        ctyd ctydVar2 = ctyeVar2.f;
                        if (ctydVar2.c) {
                            ejk.a(eioVar, "emergency", new hxd(-557073546, true, new ctzn(ctyeVar2)), 2);
                        }
                        if (ctydVar2.b) {
                            eioVar.a(list.size(), new cuah(new fdat() { // from class: ctzl
                                @Override // defpackage.fdat
                                public final Object a(Object obj2, Object obj3) {
                                    ((Integer) obj2).intValue();
                                    cubn cubnVar = (cubn) obj3;
                                    cubnVar.getClass();
                                    return cubnVar.b();
                                }
                            }, list), new cuai(list), new hxd(2039820996, true, new cuaj(list, ctyeVar2)));
                        } else {
                            eioVar.a(list.size(), new cuae(new fdap() { // from class: ctzm
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj2) {
                                    cubn cubnVar = (cubn) obj2;
                                    cubnVar.getClass();
                                    return cubnVar.b();
                                }
                            }, list), new cuaf(list), new hxd(802480018, true, new cuag(list)));
                        }
                        return fctx.a;
                    }
                };
                hmwVar3.af(objS2);
            }
            hmwVar3.ab();
            boolean z = true;
            eig.a(icsVarA, ejyVarA, egdVar, false, null, ibxVar, null, false, null, (fdap) objS2, hmlVarC, 0, 472);
            String str = ctyeVar.a;
            hmlVarC.v(-1633490746);
            if (i4 != 4) {
                z = false;
            }
            boolean zD = z | hmlVarC.D(ejyVarA);
            Object objS3 = hmwVar3.S();
            if (zD || objS3 == hmk.a) {
                objS3 = new ctzv(ctyeVar, ejyVarA, null);
                hmwVar = hmwVar3;
                hmwVar.af(objS3);
            } else {
                hmwVar = hmwVar3;
            }
            hmwVar.ab();
            hob.g(str, (fdat) objS3, hmlVarC);
            fdae fdaeVar = ctyeVar.g;
            if (fdaeVar != null) {
                hmlVarC.v(-1746271574);
                boolean zD2 = z | hmlVarC.D(ejyVarA) | hmlVarC.D(fdaeVar);
                Object objS4 = hmwVar.S();
                if (zD2 || objS4 == hmk.a) {
                    objS4 = new cuad(ctyeVar, fdaeVar, ejyVarA, null);
                    hmwVar.af(objS4);
                }
                hmwVar.ab();
                hob.g(str, (fdat) objS4, hmlVarC);
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ctzk
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    cuak.a(ctyeVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final boolean b(List list, String str) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (fdbq.f(((eji) it.next()).d.toString(), str)) {
                return true;
            }
        }
        return false;
    }
}
