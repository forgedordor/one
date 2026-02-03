package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hds implements fdav {
    final /* synthetic */ hec a;
    final /* synthetic */ hdu b;
    final /* synthetic */ fdav c;

    public hds(hec hecVar, hdu hduVar, fdav fdavVar) {
        this.a = hecVar;
        this.b = hduVar;
        this.c = fdavVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        hml hmlVar = (hml) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        Object objF = hmlVar.f();
        Object obj5 = hmk.a;
        if (objF == obj5) {
            objF = new hdd();
            hmlVar.y(objF);
        }
        hdd hddVar = (hdd) objF;
        Object objF2 = hmlVar.f();
        if (objF2 == obj5) {
            objF2 = new hdf(hddVar);
            hmlVar.y(objF2);
        }
        hdf hdfVar = (hdf) objF2;
        Object objF3 = hmlVar.f();
        if (objF3 == obj5) {
            objF3 = new hdr(hddVar);
            hmlVar.y(objF3);
        }
        hec hecVar = this.a;
        final hdu hduVar = this.b;
        hdr hdrVar = (hdr) objF3;
        ico icoVar = ics.e;
        boolean zD = hmlVar.D(hduVar);
        Object objF4 = hmlVar.f();
        if (zD || objF4 == obj5) {
            objF4 = new fdae() { // from class: hdq
                @Override // defpackage.fdae
                public final Object invoke() {
                    return hduVar.b();
                }
            };
            hmlVar.y(objF4);
        }
        ics icsVarA = hdt.a(icoVar, iIntValue, hecVar, (fdae) objF4, hddVar, hdrVar);
        fdav fdavVar = this.c;
        ixm ixmVarA = ecz.a(ibw.a, false);
        int iA = hmg.a(hmlVar);
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
        hsk.b(hmlVar, ixmVarA, jbb.e);
        hsk.b(hmlVar, hxiVarN, jbb.d);
        fdat fdatVar = jbb.f;
        if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
            Integer numValueOf = Integer.valueOf(iA);
            hmlVar.y(numValueOf);
            hmlVar.h(numValueOf, fdatVar);
        }
        hsk.b(hmlVar, icsVarB, jbb.c);
        fdavVar.a(hdfVar, Integer.valueOf(iIntValue), hmlVar, Integer.valueOf(iIntValue2 & 112));
        hmlVar.n();
        return fctx.a;
    }
}
