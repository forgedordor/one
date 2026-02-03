package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fut implements fdat {
    final /* synthetic */ hox a;
    final /* synthetic */ egc b;
    final /* synthetic */ fdat c;

    public fut(hox hoxVar, egc egcVar, fdat fdatVar) {
        this.a = hoxVar;
        this.b = egcVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ics icsVarA = iwa.a(ics.e, "border");
            final long j = ((ihz) this.a.a()).a;
            final egc egcVar = this.b;
            int i = frk.a;
            ics icsVarC = ifb.c(icsVarA, new fdap() { // from class: fre
                @Override // defpackage.fdap
                public final Object invoke(Object obj3) {
                    imw imwVar = (imw) obj3;
                    int i2 = frk.a;
                    long j2 = j;
                    float fC = ihz.c(j2);
                    if (fC > 0.0f) {
                        egc egcVar2 = egcVar;
                        float fEn = imwVar.en(4.0f);
                        float fEn2 = imwVar.en(egcVar2.b(imwVar.q())) - fEn;
                        float fC2 = fC + fEn2 + fEn + fEn;
                        float fC3 = imwVar.q().ordinal() != 1 ? fddu.c(fEn2, 0.0f) : ihz.c(imwVar.b()) - fC2;
                        if (imwVar.q().ordinal() == 1) {
                            fC2 = ihz.c(imwVar.b()) - fddu.c(fEn2, 0.0f);
                        }
                        float f = fC2;
                        float fA = ihz.a(j2);
                        float f2 = fA / 2.0f;
                        imt imtVarT = imwVar.t();
                        long jA = imtVarT.a();
                        imtVarT.b().l();
                        try {
                            imtVarT.c.b(fC3, (-fA) / 2.0f, f, f2, 0);
                            imwVar.p();
                        } finally {
                            imtVarT.b().j();
                            imtVarT.h(jA);
                        }
                    } else {
                        imwVar.p();
                    }
                    return fctx.a;
                }
            });
            fdat fdatVar = this.c;
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
            if (fdatVar == null) {
                hmlVar.v(-1295979683);
            } else {
                hmlVar.v(235288868);
                fdatVar.a(hmlVar, 0);
            }
            hmlVar.o();
            hmlVar.n();
        }
        return fctx.a;
    }
}
