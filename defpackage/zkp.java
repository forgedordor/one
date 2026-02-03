package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zkp {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20 */
    public static final void a(final zkm zkmVar, hml hmlVar, final int i) {
        int i2;
        ?? r2;
        hmw hmwVar;
        ics icsVarA;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1737424071);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(zkmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hmw hmwVar2 = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar2.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
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
            dkoj.a(zkmVar.b, null, false, hmlVarC, 0, 6);
            hmlVarC.v(1850976119);
            hmlVarC.v(1850964997);
            boolean z = ((Boolean) dljt.b(hmlVarC).c.invoke()).booleanValue() || dljt.h(hmlVarC);
            hmwVar2.ab();
            if (z) {
                r2 = 0;
                hmwVar = hmwVar2;
                icsVarA = efy.j(icoVar, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            } else {
                r2 = 0;
                hmwVar = hmwVar2;
                icsVarA = icoVar;
            }
            dlky dlkyVar = zkmVar.a;
            if (dlkyVar instanceof dlkx) {
                icsVarA = icsVarA.a(joj.a(icoVar, ((dlkx) dlkyVar).a.a));
            }
            if (dlkyVar instanceof dlkw) {
                List list = ((dlkw) dlkyVar).a;
                hmlVarC.v(1849434622);
                Object objS = hmwVar.S();
                if (objS == hmk.a) {
                    objS = new fdap() { // from class: zkn
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            dlkv dlkvVar = (dlkv) obj;
                            dlkvVar.getClass();
                            return dlkvVar.a;
                        }
                    };
                    hmwVar.af(objS);
                }
                hmwVar.ab();
                icsVarA = icsVarA.a(joj.a(icoVar, fcva.aF(list, "\n", null, null, (fdap) objS, 30)));
            }
            hmwVar.ab();
            hmlVarC.v(1850987743);
            boolean z2 = (((Boolean) dljt.b(hmlVarC).c.invoke()).booleanValue() || dljt.h(hmlVarC)) ? r2 : true;
            hmwVar.ab();
            dlku.c(dlkyVar, icsVarA, z2, hmlVarC, r2);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: zko
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    zkp.a(zkmVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
