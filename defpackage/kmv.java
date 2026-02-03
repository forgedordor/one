package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kmv extends fdbr implements fdat {
    final /* synthetic */ knx a;
    final /* synthetic */ hsf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmv(knx knxVar, hsf hsfVar) {
        super(2);
        this.a = knxVar;
        this.b = hsfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            ico icoVar = ics.e;
            Object objF = hmlVar.f();
            Object obj3 = hmk.a;
            if (objF == obj3) {
                objF = kmt.a;
                hmlVar.y(objF);
            }
            ics icsVarC = jsh.c(icoVar, false, (fdap) objF);
            knx knxVar = this.a;
            boolean zF = hmlVar.F(knxVar);
            Object objF2 = hmlVar.f();
            if (zF || objF2 == obj3) {
                objF2 = new kmu(knxVar);
                hmlVar.y(objF2);
            }
            ics icsVarA = ien.a(iye.a(icsVarC, (fdap) objF2), true != ((Boolean) knxVar.h.a()).booleanValue() ? 0.0f : 1.0f);
            hsf hsfVar = this.b;
            int i2 = kna.a;
            fdat fdatVar = (fdat) hsfVar.a();
            Object objF3 = hmlVar.f();
            if (objF3 == obj3) {
                objF3 = kmz.a;
                hmlVar.y(objF3);
            }
            ixm ixmVar = (ixm) objF3;
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
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
            int i3 = (int) j;
            hsk.b(hmlVar, ixmVar, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar2 = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i3))) {
                Integer numValueOf = Integer.valueOf(i3);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar2);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            fdatVar.a(hmlVar, 0);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
