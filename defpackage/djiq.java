package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djiq implements fdat {
    final /* synthetic */ djcy a;
    final /* synthetic */ float b;
    final /* synthetic */ igr c;
    final /* synthetic */ djga d;
    final /* synthetic */ int e;

    public djiq(djcy djcyVar, int i, float f, igr igrVar, djga djgaVar) {
        this.a = djcyVar;
        this.e = i;
        this.b = f;
        this.c = igrVar;
        this.d = djgaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djcy djcyVar = this.a;
            int i = this.e;
            float f = this.b;
            igr igrVar = this.c;
            djga djgaVar = this.d;
            ico icoVar = ics.e;
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVar, 0);
            int iA = djip.a(hmg.b(hmlVar));
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
            fdat fdatVar = jbb.e;
            hsk.b(hmlVar, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVar, hxiVarN, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVar, icsVarB, fdatVar4);
            ixm ixmVarA2 = edl.a(ecr.c, ibw.j, hmlVar, 0);
            int iA2 = djip.a(hmg.b(hmlVar));
            hxi hxiVarN2 = hmlVar.N();
            ics icsVarB2 = icj.b(hmlVar, icoVar);
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA2, fdatVar);
            hsk.b(hmlVar, hxiVarN2, fdatVar2);
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmlVar.y(numValueOf2);
                hmlVar.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVar, icsVarB2, fdatVar4);
            djco.k(djcyVar.c, true != ((Boolean) dljt.b(hmlVar).c.invoke()).booleanValue() ? 0 : i, f, true, hmlVar, 3072, 0);
            djco.g(djcyVar.b, false, i, f, null, hmlVar, 48, 16);
            djir.a(djcyVar, igrVar, i, f, djgaVar, hmlVar, 0);
            hmlVar.n();
            hmlVar.n();
        }
        return fctx.a;
    }
}
