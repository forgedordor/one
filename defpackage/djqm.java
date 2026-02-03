package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djqm {
    public static final void a(final djqn djqnVar, ics icsVar, hml hmlVar, final int i) {
        int i2;
        hmw hmwVar;
        final ics icsVar2;
        hml hmlVarC = hmlVar.c(1081593243);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(djqnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            List list = djqnVar.b;
            final ico icoVar = ics.e;
            if (list.isEmpty()) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: djqh
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            djqn djqnVar2 = djqnVar;
                            int i4 = i;
                            djqm.a(djqnVar2, icoVar, (hml) obj, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            ics icsVarD = egq.d(icoVar, 1.0f);
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hmw hmwVar2 = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar2.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarD);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i4 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(i4))) {
                Integer numValueOf = Integer.valueOf(i4);
                hmwVar2.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            dthx.b(djqnVar.a, efy.j(icoVar, 16.0f, 16.0f, 0.0f, 0.0f, 12), glz.a(hmlVarC).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).m, hmlVarC, 48, 0, 65528);
            hmlVarC = hmlVarC;
            ics icsVarJ = efy.j(icoVar, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            ecj ecjVarG = ecr.g(8.0f);
            egc egcVarG = efy.g(8.0f, 0.0f, 2);
            hmlVarC.v(5004770);
            int i5 = i3 & 14;
            Object objS = hmwVar2.S();
            if (i5 == 4 || objS == hmk.a) {
                objS = new fdap() { // from class: djqi
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        eio eioVar = (eio) obj;
                        eioVar.getClass();
                        List list2 = djqnVar.b;
                        eioVar.a(list2.size(), null, new djqk(list2), new hxd(802480018, true, new djql(list2)));
                        return fctx.a;
                    }
                };
                hmwVar = hmwVar2;
                hmwVar.af(objS);
            } else {
                hmwVar = hmwVar2;
            }
            hmwVar.ab();
            eig.b(icsVarJ, null, egcVarG, ecjVarG, null, null, false, null, (fdap) objS, hmlVarC, 24966, 490);
            hmlVarC.n();
            icsVar2 = icoVar;
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: djqj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djqn djqnVar2 = djqnVar;
                    int i6 = i;
                    djqm.a(djqnVar2, icsVar2, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
