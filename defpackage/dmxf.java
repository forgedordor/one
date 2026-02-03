package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmxf implements fdat {
    final /* synthetic */ gak a;
    final /* synthetic */ hsf b;
    final /* synthetic */ dmvm c;
    final /* synthetic */ hox d;
    final /* synthetic */ edk e;
    final /* synthetic */ hrg f;
    final /* synthetic */ dmxn g;

    public dmxf(gak gakVar, dmxn dmxnVar, hsf hsfVar, edk edkVar, dmvm dmvmVar, hrg hrgVar, hox hoxVar) {
        this.a = gakVar;
        this.g = dmxnVar;
        this.b = hsfVar;
        this.e = edkVar;
        this.c = dmvmVar;
        this.f = hrgVar;
        this.d = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            Object objF = hmlVar.f();
            Object obj3 = hmk.a;
            if (objF == obj3) {
                objF = hob.a(fcyi.a, hmlVar);
                hmlVar.y(objF);
            }
            final fdjx fdjxVar = (fdjx) objF;
            hmlVar.v(-1633490746);
            boolean zF = hmlVar.F(fdjxVar);
            final gak gakVar = this.a;
            boolean zD = zF | hmlVar.D(gakVar);
            Object objF2 = hmlVar.f();
            if (zD || objF2 == obj3) {
                objF2 = new fdae() { // from class: dmwu
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdil.d(fdjxVar, null, null, new dmxe(gakVar, null), 3);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF2);
            }
            fdae fdaeVar = (fdae) objF2;
            hmlVar.o();
            dmxn dmxnVar = this.g;
            long j = ije.g;
            long j2 = glz.a(hmlVar).J;
            long j3 = glz.a(hmlVar).G;
            hsf hsfVar = this.b;
            edk edkVar = this.e;
            dmvm dmvmVar = this.c;
            hrg hrgVar = this.f;
            dtdb.a(hxe.d(-1363669419, new dmwy(hsfVar, dmxnVar, edkVar, dmvmVar, gakVar, fdaeVar, hrgVar), hmlVar), null, gakVar, dmxnVar.a, null, j3, j2, 0.0f, 0.0f, hxe.d(-588813298, new dmwz(hrgVar), hmlVar), false, hxe.d(1398593821, new dmxb(dmvmVar, fdaeVar, hrgVar, this.d), hmlVar), null, j, 0L, hxe.d(1947012094, new dmxd(fdaeVar, hrgVar), hmlVar), hmlVar, 805306374, 199728);
        }
        return fctx.a;
    }
}
