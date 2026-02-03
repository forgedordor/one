package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fug implements fdat {
    final /* synthetic */ ics a;
    final /* synthetic */ ikp b;
    final /* synthetic */ long c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ boolean f;
    final /* synthetic */ fdae g;
    final /* synthetic */ fdat h;
    final /* synthetic */ ebk i;

    public fug(ics icsVar, ikp ikpVar, long j, float f, float f2, ebk ebkVar, boolean z, fdae fdaeVar, fdat fdatVar) {
        this.a = icsVar;
        this.b = ikpVar;
        this.c = j;
        this.d = f;
        this.e = f2;
        this.i = ebkVar;
        this.f = z;
        this.g = fdaeVar;
        this.h = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ics icsVar = this.a;
            ikp ikpVar = this.b;
            long j = this.c;
            ics icsVarC = dli.c(iex.a(dkl.a(ifl.a(fqo.a(icsVar), this.e, ikpVar, 0L, 0L, 24).a(ics.e), fuh.c(j, (fos) hmlVar.e(fpt.a), this.d, hmlVar), ikpVar), ikpVar), this.i, fsd.a(false, 0.0f, 7), this.f, null, null, this.g, 24);
            fdat fdatVar = this.h;
            ixm ixmVarA = ecz.a(ibw.a, true);
            int iA = hmg.a(hmlVar);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarC);
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
            fdatVar.a(hmlVar, 0);
            hmlVar.n();
        }
        return fctx.a;
    }
}
