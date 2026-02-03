package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dizh implements fdav {
    final /* synthetic */ dizj a;

    public dizh(dizj dizjVar) {
        this.a = dizjVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        final hdf hdfVar = (hdf) obj;
        int iIntValue = ((Number) obj2).intValue();
        hml hmlVar = (hml) obj3;
        ((Number) obj4).intValue();
        hdfVar.getClass();
        dize dizeVar = (dize) this.a.a.get(iIntValue);
        ico icoVar = ics.e;
        ics icsVarE = dli.e(icoVar, false, null, dizeVar.c(), 15);
        final eve eveVar = glz.c(hmlVar).e;
        hmlVar.v(440683050);
        hmlVar.v(152582312);
        final kio kioVar = (kio) hmlVar.e(jmh.e);
        boolean zD = hmlVar.D(hdfVar.a) | hmlVar.D(kioVar);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = new evj(new fdau() { // from class: hde
                @Override // defpackage.fdau
                public final Object a(Object obj5, Object obj6, Object obj7) {
                    ikd ikdVar = (ikd) obj5;
                    ihu ihuVarD = hdfVar.a.a().d(iia.c(((ihz) obj6).a));
                    ika.a(ikdVar, eveVar.a(ihuVarD.b(), (kji) obj7, kioVar));
                    float f = ihuVarD.b;
                    float f2 = ihuVarD.c;
                    ikdVar.o((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    return fctx.a;
                }
            });
            hmlVar.y(objF);
        }
        hmlVar.o();
        ics icsVarA = iex.a(icsVarE, (evj) objF);
        hmlVar.o();
        ixm ixmVarA = ecz.a(ibw.a, false);
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
        edf edfVar = edf.a;
        djrv.a(dizeVar.a(), dizeVar.b(), egq.b(icoVar, 1.0f), null, null, null, iuz.a, null, 0.0f, null, null, null, null, null, null, null, hmlVar, 12583296, 0, 524152);
        hmlVar.v(1296432185);
        if (dizeVar instanceof dizd) {
            dtfn.a(djrs.b(djrr.di, hmlVar), null, edfVar.a(egq.k(icoVar, 24.0f), ibw.e), ije.d, hmlVar, 3072, 0);
        }
        hmlVar.o();
        hmlVar.n();
        return fctx.a;
    }
}
