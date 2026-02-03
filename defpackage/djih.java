package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djih implements fdat {
    final /* synthetic */ djcy a;
    final /* synthetic */ float b;
    final /* synthetic */ igr c;
    final /* synthetic */ djga d;
    final /* synthetic */ djfn e;
    final /* synthetic */ int f;

    public djih(djcy djcyVar, int i, float f, igr igrVar, djga djgaVar, djfn djfnVar) {
        this.a = djcyVar;
        this.f = i;
        this.b = f;
        this.c = igrVar;
        this.d = djgaVar;
        this.e = djfnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djcy djcyVar = this.a;
            int i = this.f;
            float f = this.b;
            igr igrVar = this.c;
            djga djgaVar = this.d;
            djfn djfnVar = this.e;
            ecq ecqVar = ecr.d;
            ico icoVar = ics.e;
            ixm ixmVarA = edl.a(ecqVar, ibw.j, hmlVar, 6);
            int iA = djig.a(hmg.b(hmlVar));
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
            djco.g(djcyVar.b, false, i, f, null, hmlVar, 48, 16);
            ics icsVarJ = efy.j(icoVar, 16.0f, 0.0f, 4.0f, 0.0f, 10);
            ixm ixmVarA2 = egk.a(ecr.a, ibw.o, hmlVar, 48);
            int iA2 = djig.a(hmg.b(hmlVar));
            hxi hxiVarN2 = hmlVar.N();
            ics icsVarB2 = icj.b(hmlVar, icsVarJ);
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
            djco.m(egp.a, djcyVar, igrVar, i, f, null, djgaVar, hmlVar, 6, 112);
            djii.a(djcyVar, djfnVar, hmlVar, 0);
            hmlVar.n();
            hmlVar.n();
        }
        return fctx.a;
    }
}
