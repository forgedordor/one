package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghj implements fdat {
    final /* synthetic */ ejy a;
    final /* synthetic */ fddq b;
    final /* synthetic */ hhr c;
    final /* synthetic */ hhv d;
    final /* synthetic */ fdap e;
    final /* synthetic */ hhq f;
    final /* synthetic */ Long g;
    final /* synthetic */ geq h;
    final /* synthetic */ gfd i;
    final /* synthetic */ djll j;

    public ghj(ejy ejyVar, fddq fddqVar, hhr hhrVar, hhv hhvVar, fdap fdapVar, hhq hhqVar, Long l, gfd gfdVar, djll djllVar, geq geqVar) {
        this.a = ejyVar;
        this.b = fddqVar;
        this.c = hhrVar;
        this.d = hhvVar;
        this.e = fdapVar;
        this.f = hhqVar;
        this.g = l;
        this.i = gfdVar;
        this.j = djllVar;
        this.h = geqVar;
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
                objF = new fdap() { // from class: ghe
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        jtk.m((jto) obj4, new jry(new fdae() { // from class: ghg
                            @Override // defpackage.fdae
                            public final Object invoke() {
                                return Float.valueOf(0.0f);
                            }
                        }, new fdae() { // from class: ghh
                            @Override // defpackage.fdae
                            public final Object invoke() {
                                return Float.valueOf(0.0f);
                            }
                        }, false));
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            ics icsVarC = jsh.c(icoVar, false, (fdap) objF);
            ejy ejyVar = this.a;
            gev gevVar = gev.a;
            dep depVarA = deq.a();
            dew dewVarB = gpg.b(4, hmlVar);
            boolean zD = hmlVar.D(depVarA) | hmlVar.D(ejyVar);
            Object objF2 = hmlVar.f();
            if (zD || objF2 == obj3) {
                objF2 = new ean(new geu(new ead(ejyVar, eau.a)), depVarA, dewVarB);
                hmlVar.y(objF2);
            }
            final fddq fddqVar = this.b;
            dzo dzoVar = (dzo) objF2;
            boolean zF = hmlVar.F(fddqVar);
            final hhr hhrVar = this.c;
            boolean zF2 = zF | hmlVar.F(hhrVar);
            final hhv hhvVar = this.d;
            boolean zD2 = zF2 | hmlVar.D(hhvVar);
            final fdap fdapVar = this.e;
            boolean zD3 = zD2 | hmlVar.D(fdapVar);
            final hhq hhqVar = this.f;
            boolean zD4 = zD3 | hmlVar.D(hhqVar);
            final Long l = this.g;
            boolean zD5 = zD4 | hmlVar.D(l);
            final gfd gfdVar = this.i;
            boolean zF3 = zD5 | hmlVar.F(gfdVar);
            final djll djllVar = this.j;
            boolean zD6 = zF3 | hmlVar.D(djllVar);
            final geq geqVar = this.h;
            boolean zD7 = zD6 | hmlVar.D(geqVar);
            Object objF3 = hmlVar.f();
            if (zD7 || objF3 == obj3) {
                fdap fdapVar2 = new fdap() { // from class: ghf
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        egc egcVar = ghx.a;
                        fddq fddqVar2 = fddqVar;
                        ejk.b((eio) obj4, ((fddqVar2.b - fddqVar2.a) + 1) * 12, null, new hxd(72599078, true, new ghi(hhrVar, hhvVar, fdapVar, hhqVar, l, gfdVar, djllVar, geqVar)), 6);
                        return fctx.a;
                    }
                };
                hmlVar.y(fdapVar2);
                objF3 = fdapVar2;
            }
            eig.b(icsVarC, ejyVar, null, null, null, dzoVar, false, null, (fdap) objF3, hmlVar, 0, 444);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
