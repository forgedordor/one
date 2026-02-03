package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyhj implements fdat {
    final /* synthetic */ String a;
    final /* synthetic */ fdae b;
    final /* synthetic */ boolean c;
    final /* synthetic */ String d;

    public cyhj(String str, fdae fdaeVar, boolean z, String str2) {
        this.a = str;
        this.b = fdaeVar;
        this.c = z;
        this.d = str2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarD = efy.d(icoVar, 12.0f);
            String str = this.a;
            fdae fdaeVar = this.b;
            boolean z = this.c;
            String str2 = this.d;
            ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVar, 48);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarD);
            fdae fdaeVar2 = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar2);
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
            dthx.b(str, egp.a.a(icoVar, 1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar, 0, 0, 131068);
            dtdi.b(fdaeVar, null, z, null, null, null, null, hxe.d(-1240457261, new cyhi(str2), hmlVar), hmlVar, 805306368, 506);
            hmlVar.n();
        }
        return fctx.a;
    }
}
