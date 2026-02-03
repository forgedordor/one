package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpf {
    public static final void a(ics icsVar, long j, float f, hml hmlVar, final int i, final int i2) {
        int i3;
        float fEd;
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(-1249392198);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= 16;
        }
        if (((i3 | 3456) & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                if (i4 != 0) {
                    icsVar = ics.e;
                }
                long jG = fqq.a(hmlVarC).g();
                j = ijg.f(ije.d(jG), ije.c(jG), ije.b(jG), 0.12f, ije.f(jG));
                f = 1.0f;
            } else {
                hmlVarC.s();
            }
            hmlVarC.l();
            ico icoVar = ics.e;
            if (kir.b(f, 0.0f)) {
                hmlVarC.v(-455968886);
                fEd = 1.0f / ((kio) hmlVarC.e(jmh.e)).ed();
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(-455902329);
                ((hmw) hmlVarC).ab();
                fEd = f;
            }
            ecz.b(dkl.a(egq.e(egq.d(icsVar.a(icoVar), 1.0f), fEd), j, ikj.a), hmlVarC, 0);
        }
        final ics icsVar2 = icsVar;
        final long j2 = j;
        final float f2 = f;
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fpe
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar2;
                    long j3 = j2;
                    fpf.a(icsVar3, j3, f2, (hml) obj, hpy.a(i | 1), i2);
                    return fctx.a;
                }
            };
        }
    }
}
