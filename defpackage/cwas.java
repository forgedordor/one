package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwas {
    public static final void a(final djrr djrrVar, final String str, final fdae fdaeVar, final cwau cwauVar, hml hmlVar, final int i) {
        int i2;
        fdae fdaeVar2;
        long j;
        long j2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1312829854);
        if (i3 == 0) {
            i2 = (true != hmlVarC.B(djrrVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            fdaeVar2 = fdaeVar;
            i2 |= true != hmlVarC.F(fdaeVar2) ? 128 : 256;
        } else {
            fdaeVar2 = fdaeVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(cwauVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            boolean z = cwauVar.a;
            int i4 = ((i2 >> 6) & 14) | 1572864;
            if (cwauVar.b) {
                hmlVarC.v(542293791);
                ecq ecqVar = ecr.c;
                ibx ibxVar = ibw.k;
                ico icoVar = ics.e;
                ixm ixmVarA = edl.a(ecqVar, ibxVar, hmlVarC, 54);
                int iA = cwan.a(hmg.b(hmlVarC));
                hmw hmwVar = (hmw) hmlVarC;
                hxi hxiVarAk = hmwVar.ak();
                ics icsVarB = icj.b(hmlVarC, icoVar);
                fdae fdaeVar3 = jbb.a;
                hmlVarC.x();
                if (hmwVar.z) {
                    hmlVarC.j(fdaeVar3);
                } else {
                    hmlVarC.z();
                }
                hsk.b(hmlVarC, ixmVarA, jbb.e);
                hsk.b(hmlVarC, hxiVarAk, jbb.d);
                fdat fdatVar = jbb.f;
                if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                    Integer numValueOf = Integer.valueOf(iA);
                    hmwVar.af(numValueOf);
                    hmlVarC.h(numValueOf, fdatVar);
                }
                hsk.b(hmlVarC, icsVarB, jbb.c);
                ics icsVarA = iex.a(egq.k(icoVar, z ? 56.0f : 48.0f), evn.a);
                if (z) {
                    hmlVarC.v(805242025);
                    j2 = glz.a(hmlVarC).c;
                    hmwVar.ab();
                } else {
                    hmlVarC.v(805323276);
                    j2 = glz.a(hmlVarC).D;
                    hmwVar.ab();
                }
                dtfk.b(fdaeVar2, dkl.a(icsVarA, j2, ikj.a).a(joj.a(icoVar, str)), false, null, null, hxe.d(-1726409841, new cwaq(djrrVar, str, z), hmlVarC), hmlVarC, i4, 60);
                egt.a(egq.e(icoVar, 12.0f), hmlVarC);
                dthx.b(str, egq.o(icoVar, 64.0f), 0L, kjm.c(12), null, null, 0L, new khk(3), 0L, 2, true, 3, 0, null, null, hmlVarC, 3120, 3504, 116212);
                hmlVarC = hmlVarC;
                hmlVarC.n();
                hmwVar.ab();
            } else {
                hmlVarC.v(543654908);
                ico icoVar2 = ics.e;
                ics icsVarA2 = iex.a(egq.k(icoVar2, z ? 56.0f : 48.0f), evn.a);
                if (z) {
                    hmlVarC.v(544008060);
                    j = glz.a(hmlVarC).c;
                    ((hmw) hmlVarC).ab();
                } else {
                    hmlVarC.v(544085343);
                    j = glz.a(hmlVarC).D;
                    ((hmw) hmlVarC).ab();
                }
                dtfk.b(fdaeVar, dkl.a(icsVarA2, j, ikj.a).a(joj.a(icoVar2, str)), false, null, null, hxe.d(470090780, new cwar(djrrVar, str, z), hmlVarC), hmlVarC, i4, 60);
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cwao
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djrr djrrVar2 = djrrVar;
                    String str2 = str;
                    fdae fdaeVar4 = fdaeVar;
                    cwas.a(djrrVar2, str2, fdaeVar4, cwauVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final cwav cwavVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1787884150);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(cwavVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            cwau cwauVar = cwavVar.b;
            float f = true != cwauVar.a ? 8.0f : 16.0f;
            ecj ecjVarG = ecr.g(true != cwauVar.b ? 24.0f : 32.0f);
            ics icsVarJ = efy.j(ics.e, 0.0f, f, 0.0f, 16.0f, 5);
            ixm ixmVarA = egk.a(ecjVarG, ibw.m, hmlVarC, 0);
            int iA = cwan.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarJ);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            hmlVarC.v(1288717566);
            ekqh it = cwavVar.a.iterator();
            it.getClass();
            while (it.hasNext()) {
                dihq dihqVar = (dihq) it.next();
                djrr djrrVar = dihqVar.b;
                djrrVar.getClass();
                a(djrrVar, dihqVar.a, dihqVar.k, cwauVar, hmlVarC, 0);
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cwap
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cwas.b(cwavVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
