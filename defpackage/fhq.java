package defpackage;

import androidx.compose.foundation.layout.SizeElement;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fhq implements fdat {
    final /* synthetic */ long a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ics c;
    final /* synthetic */ fih d;

    public fhq(long j, boolean z, ics icsVar, fih fihVar) {
        this.a = j;
        this.b = z;
        this.c = icsVar;
        this.d = fihVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (hmlVar.J((iIntValue & 3) != 2, iIntValue & 1)) {
            long j = this.a;
            if (j != 9205357640488583168L) {
                hmlVar.v(3458184);
                boolean z = this.b;
                eci eciVar = z ? ece.b : ece.a;
                ics icsVarA = this.c.a(new SizeElement(kiw.b(j), kiw.a(j), Float.NaN, Float.NaN, false));
                final fih fihVar = this.d;
                ixm ixmVarA = egk.a(eciVar, ibw.m, hmlVar, 0);
                long jB = hmg.b(hmlVar);
                long j2 = jB ^ (jB >>> 32);
                hxi hxiVarN = hmlVar.N();
                ics icsVarB = icj.b(hmlVar, icsVarA);
                fdae fdaeVar = jbb.a;
                hmlVar.M();
                hmlVar.x();
                if (hmlVar.H()) {
                    hmlVar.j(fdaeVar);
                } else {
                    hmlVar.z();
                }
                int i = (int) j2;
                hsk.b(hmlVar, ixmVarA, jbb.e);
                hsk.b(hmlVar, hxiVarN, jbb.d);
                fdat fdatVar = jbb.f;
                if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i))) {
                    Integer numValueOf = Integer.valueOf(i);
                    hmlVar.y(numValueOf);
                    hmlVar.h(numValueOf, fdatVar);
                }
                hsk.b(hmlVar, icsVarB, jbb.c);
                ico icoVar = ics.e;
                boolean zF = hmlVar.F(fihVar);
                Object objF = hmlVar.f();
                if (zF || objF == hmk.a) {
                    objF = new fdae() { // from class: fho
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            return Boolean.valueOf((fihVar.a() & 9223372034707292159L) != 9205357640488583168L);
                        }
                    };
                    hmlVar.y(objF);
                }
                fhv.c(icoVar, (fdae) objF, z, hmlVar, 6);
                hmlVar.n();
                hmlVar.o();
            } else {
                hmlVar.v(4387192);
                ics icsVar = this.c;
                final fih fihVar2 = this.d;
                boolean zF2 = hmlVar.F(fihVar2);
                Object objF2 = hmlVar.f();
                if (zF2 || objF2 == hmk.a) {
                    objF2 = new fdae() { // from class: fhp
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            return Boolean.valueOf((fihVar2.a() & 9223372034707292159L) != 9205357640488583168L);
                        }
                    };
                    hmlVar.y(objF2);
                }
                fhv.c(icsVar, (fdae) objF2, this.b, hmlVar, 0);
                hmlVar.o();
            }
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
