package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghn implements fdat {
    final /* synthetic */ fdae a;
    final /* synthetic */ boolean b;
    final /* synthetic */ fdae c;
    final /* synthetic */ boolean d;

    public ghn(fdae fdaeVar, boolean z, fdae fdaeVar2, boolean z2) {
        this.a = fdaeVar;
        this.b = z;
        this.c = fdaeVar2;
        this.d = z2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            fdae fdaeVar = this.a;
            boolean z = this.b;
            fdae fdaeVar2 = this.c;
            boolean z2 = this.d;
            ico icoVar = ics.e;
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVar, 0);
            int iA = hmg.a(hmlVar);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icoVar);
            fdae fdaeVar3 = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar3);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            gjz.b(fdaeVar, null, z, null, null, gdk.c, hmlVar, 1572864, 58);
            gjz.b(fdaeVar2, null, z2, null, null, gdk.d, hmlVar, 1572864, 58);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
