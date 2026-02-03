package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class diml implements fdat {
    final /* synthetic */ diks a;

    public diml(diks diksVar) {
        this.a = diksVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        long j;
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarA = idb.a(icoVar, 1.0f);
            diks diksVar = this.a;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar, 0);
            int iA = dimh.a(hmg.b(hmlVar));
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
            dikr dikrVarB = diksVar.b();
            hmlVar.v(-1345954156);
            if (dikrVarB != null) {
                hmlVar.v(-262992670);
                dlps dlpsVar = dikrVarB.a;
                float f = 12.0f;
                if ((dlpsVar instanceof dlpp) && ((dlpp) dlpsVar).b) {
                    f = 16.0f;
                }
                hmlVar.o();
                ics icsVarJ = efy.j(icoVar, 16.0f, f, 16.0f, 0.0f, 8);
                ixm ixmVarA2 = ecz.a(ibw.a, false);
                int iA2 = dimh.a(hmg.b(hmlVar));
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
                dlpo dlpoVar = dikrVarB.b;
                hmlVar.v(646348605);
                hmlVar.v(-1629244960);
                boolean zBooleanValue = ((Boolean) dljt.b(hmlVar).c.invoke()).booleanValue();
                hmlVar.o();
                if (zBooleanValue) {
                    hmlVar.v(-1629242906);
                    j = glz.a(hmlVar).q;
                    hmlVar.o();
                } else {
                    hmlVar.v(-1629242426);
                    boolean z = dljt.g(hmlVar) && diksVar.d() != null;
                    hmlVar.o();
                    if (z) {
                        hmlVar.v(-1629240179);
                        j = glz.a(hmlVar).v;
                        hmlVar.o();
                    } else {
                        hmlVar.v(-1629239486);
                        boolean z2 = dljt.g(hmlVar) && diksVar.f();
                        hmlVar.o();
                        if (z2) {
                            j = ije.a;
                        } else {
                            hmlVar.v(-1629237651);
                            boolean z3 = dljt.g(hmlVar) && diksVar.h() && diksVar.g();
                            hmlVar.o();
                            if (z3) {
                                j = ije.d;
                            } else {
                                hmlVar.v(-1629235489);
                                boolean z4 = dljt.g(hmlVar) && diksVar.g();
                                hmlVar.o();
                                if (z4) {
                                    j = ije.a;
                                } else {
                                    hmlVar.v(-1629232698);
                                    j = glz.a(hmlVar).q;
                                    hmlVar.o();
                                }
                            }
                        }
                    }
                }
                hmlVar.o();
                dlpn.j(dlpsVar, dlpoVar, null, new ije(j), hmlVar, 0);
                hmlVar.n();
            }
            hmlVar.o();
            if (diksVar instanceof dikn) {
                hmlVar.v(-1345934230);
                dlqb.a(hxe.d(-1654508758, new dimi(diksVar), hmlVar), hmlVar, 6);
                hmlVar.o();
            } else if (diksVar instanceof dikg) {
                hmlVar.v(-1345930057);
                dimx.a((dikg) diksVar, hmlVar, 0);
                hmlVar.o();
            } else if (diksVar instanceof dikp) {
                hmlVar.v(-1345926615);
                dlqb.a(hxe.d(-314928222, new dimj(diksVar), hmlVar), hmlVar, 6);
                hmlVar.o();
            } else {
                if (!(diksVar instanceof dikl)) {
                    hmlVar.v(-1345936492);
                    hmlVar.o();
                    throw new fctg();
                }
                hmlVar.v(-1345923424);
                dlqb.a(hxe.d(44486115, new dimk(diksVar), hmlVar), hmlVar, 6);
                hmlVar.o();
            }
            hmlVar.n();
        }
        return fctx.a;
    }
}
