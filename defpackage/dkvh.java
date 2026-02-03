package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkvh implements fdat {
    final /* synthetic */ dkxr a;
    final /* synthetic */ boolean b;
    final /* synthetic */ edp c;

    public dkvh(dkxr dkxrVar, edp edpVar, boolean z) {
        this.a = dkxrVar;
        this.c = edpVar;
        this.b = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        dkvp dkvpVar;
        dkvp dkvpVar2;
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(273246716);
            dkxr dkxrVar = this.a;
            int i = dkxrVar.d;
            if (i == 1 && (dkvpVar2 = dkxrVar.a) != null) {
                dkvo.c(dkvpVar2, true, iwa.a(ics.e, "horizontal_card_media"), hmlVar, 432, 0);
            }
            hmlVar.o();
            ico icoVar = ics.e;
            ics icsVarU = egq.u(edp.b(iwa.a(icoVar, "horizontal_text_content"), 1.0f, true), 112.0f, 0.0f, 2);
            boolean z = this.b;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar, 0);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarU);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            int i2 = (int) j;
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i2))) {
                Integer numValueOf = Integer.valueOf(i2);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            dkxj.i(dkxrVar, z, hmlVar, 0);
            hmlVar.n();
            if (i == 2 && (dkvpVar = dkxrVar.a) != null) {
                dkvo.c(dkvpVar, true, iwa.a(icoVar, "horizontal_card_media"), hmlVar, 432, 0);
            }
        }
        return fctx.a;
    }
}
