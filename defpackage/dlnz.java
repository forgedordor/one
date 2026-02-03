package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlnz implements fdat {
    final /* synthetic */ dlnp a;
    final /* synthetic */ ddp b;
    final /* synthetic */ dkri c;

    public dlnz(dlnp dlnpVar, ddp ddpVar, dkri dkriVar) {
        this.a = dlnpVar;
        this.b = ddpVar;
        this.c = dkriVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        long j;
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(-1134284419);
            ico icoVar = ics.e;
            ics icsVarA = iex.a(egq.w(icoVar, 0.0f, 48.0f, 0.0f, 0.0f, 13), glz.c(hmlVar).c);
            dlnp dlnpVar = this.a;
            ddp ddpVar = this.b;
            if (dlnpVar.d) {
                hmlVar.v(1319568565);
                hmlVar.v(1090040300);
                boolean z = !((Boolean) dljt.b(hmlVar).c.invoke()).booleanValue() && dljt.h(hmlVar);
                hmlVar.o();
                if (z) {
                    hmlVar.v(-568401491);
                    j = dljt.a(hmlVar).d.c;
                    hmlVar.o();
                } else {
                    hmlVar.v(-568332206);
                    j = glz.a(hmlVar).H;
                    hmlVar.o();
                }
                hmlVar.o();
                icsVarA = icsVarA.a(dkl.a(icoVar, ijg.f(ije.d(j), ije.c(j), ije.b(j), ((Number) ddpVar.d()).floatValue(), ije.f(j)), ikj.a));
            }
            hmlVar.o();
            fdae fdaeVar = dlnpVar.g;
            if (fdaeVar != null) {
                icsVarA = icsVarA.a(dli.e(icoVar, false, null, fdaeVar, 15));
            }
            dkri dkriVar = this.c;
            ixm ixmVarA = egk.a(ecr.g(12.0f), ibw.n, hmlVar, 54);
            int iA = dlny.a(hmg.b(hmlVar));
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarA);
            fdae fdaeVar2 = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar2);
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
            hmlVar.v(-70762714);
            if (dkriVar != null) {
                dkqr.h(dkriVar, joj.a(egq.k(icoVar, ((Boolean) dljt.b(hmlVar).c.invoke()).booleanValue() ? 40.0f : dlnpVar.f.a), "monogram_test_tag"), hmlVar, 0);
            }
            hmlVar.o();
            ixm ixmVarA2 = edl.a(ecr.c, ibw.j, hmlVar, 0);
            int iA2 = dlny.a(hmg.b(hmlVar));
            hxi hxiVarN2 = hmlVar.N();
            ics icsVarB2 = icj.b(hmlVar, icoVar);
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar2);
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
            dlod.a(dlnpVar.a, hmlVar, 0);
            String str = dlnpVar.b;
            hmlVar.v(14515013);
            if (str != null) {
                dlob.d(str, hmlVar, 0);
            }
            hmlVar.o();
            hmlVar.n();
            hmlVar.n();
        }
        return fctx.a;
    }
}
