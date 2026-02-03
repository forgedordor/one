package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djdd implements fdat {
    final /* synthetic */ djdh a;
    final /* synthetic */ ije b;
    final /* synthetic */ boolean c;

    public djdd(djdh djdhVar, ije ijeVar, boolean z) {
        this.a = djdhVar;
        this.b = ijeVar;
        this.c = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djdh djdhVar = this.a;
            ije ijeVar = this.b;
            boolean z = this.c;
            icc iccVar = ibw.n;
            ico icoVar = ics.e;
            ixm ixmVarA = egk.a(ecr.a, iccVar, hmlVar, 48);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icoVar);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            int i = (int) j;
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i))) {
                Integer numValueOf = Integer.valueOf(i);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            djdg.d(egp.a, djdhVar.a, ijeVar, hmlVar, 6);
            djdg.b(djdhVar.d, djdhVar.b, !z, hmlVar, 0);
            hmlVar.n();
        }
        return fctx.a;
    }
}
