package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hkq implements fdau {
    final /* synthetic */ hsf a;
    final /* synthetic */ long b;
    final /* synthetic */ jyq c;
    final /* synthetic */ fdat d;

    public hkq(hsf hsfVar, long j, jyq jyqVar, fdat fdatVar) {
        this.a = hsfVar;
        this.b = j;
        this.c = jyqVar;
        this.d = fdatVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ics icsVar = (ics) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(icsVar) ? 2 : 4;
        }
        if (hmlVar.J((iIntValue & 19) != 18, iIntValue & 1)) {
            final hsf hsfVar = this.a;
            boolean zD = hmlVar.D(hsfVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdap() { // from class: hkp
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        ((ikl) obj4).a(((Number) hsfVar.a()).floatValue());
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            ics icsVarA = ijn.a(icsVar, (fdap) objF);
            long j = this.b;
            jyq jyqVar = this.c;
            fdat fdatVar = this.d;
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = hmg.a(hmlVar);
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
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar2 = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar2);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            hlb.d(j, jyqVar, fdatVar, hmlVar, 0);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
