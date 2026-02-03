package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjv {
    public static final void a(final zjs zjsVar, final boolean z, final dklt dkltVar, final ddp ddpVar, hml hmlVar, final int i) {
        ddp ddpVar2 = ddpVar;
        dkltVar.getClass();
        ddpVar2.getClass();
        int i2 = i & 6;
        hml hmlVarC = hmlVar.c(-1580521517);
        int i3 = i2 == 0 ? (true != hmlVarC.D(zjsVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.D(dkltVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != ((i & 4096) == 0 ? hmlVarC.D(ddpVar2) : hmlVarC.F(ddpVar2)) ? 1024 : 2048;
        }
        int i4 = i3;
        if ((i4 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarD = egq.d(ics.e, 1.0f);
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarD);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i5 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i5))) {
                Integer numValueOf = Integer.valueOf(i5);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            hmlVarC.v(-1572088269);
            for (yki ykiVar : zjsVar.a) {
                dkke.c(ykiVar.a, null, z, ddpVar2, dkltVar, hxe.d(-534894831, new zju(ykiVar), hmlVarC), hmlVarC, (57344 & (i4 << 6)) | ((i4 << 3) & 896) | 200704 | (i4 & 7168), 2);
                ddpVar2 = ddpVar;
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: zjt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    zjs zjsVar2 = zjsVar;
                    boolean z2 = z;
                    dklt dkltVar2 = dkltVar;
                    zjv.a(zjsVar2, z2, dkltVar2, ddpVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
