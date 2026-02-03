package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hkl implements fdat {
    final /* synthetic */ hox a;
    final /* synthetic */ gxw b;
    final /* synthetic */ egc c;
    final /* synthetic */ fdat d;

    public hkl(hox hoxVar, gxw gxwVar, egc egcVar, fdat fdatVar) {
        this.a = hoxVar;
        this.b = gxwVar;
        this.c = egcVar;
        this.d = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            ics icsVarA = iwa.a(ics.e, "Container");
            final hox hoxVar = this.a;
            final fdbt fdbtVar = new fdbt(hoxVar) { // from class: hkk
                @Override // defpackage.fdbt, defpackage.fdee
                public final Object a() {
                    return ((hox) this.g).a();
                }
            };
            gxw gxwVar = this.b;
            final egc egcVar = this.c;
            final ibx ibxVar = ((gxv) gxwVar).a;
            ics icsVarC = ifb.c(icsVarA, new fdap() { // from class: gpn
                @Override // defpackage.fdap
                public final Object invoke(Object obj3) {
                    imw imwVar = (imw) obj3;
                    long j = ((ihz) ((fdbs) fdbtVar).a()).a;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                    if (fIntBitsToFloat > 0.0f) {
                        ibx ibxVar2 = ibxVar;
                        egc egcVar2 = egcVar;
                        float fEn = imwVar.en(4.0f);
                        float fA = ibxVar2.a(fdcu.b(fIntBitsToFloat), fdcu.b((Float.intBitsToFloat((int) (imwVar.b() >> 32)) - r10) - imwVar.en(egcVar2.c(imwVar.q()))), imwVar.q()) + imwVar.en(egcVar2.b(imwVar.q()));
                        float f = fIntBitsToFloat / 2.0f;
                        float f2 = fA + f;
                        float fC = fddu.c((f2 - f) - fEn, 0.0f);
                        float fD = fddu.d(f2 + f + fEn, Float.intBitsToFloat((int) (imwVar.b() >> 32)));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                        float f3 = -fIntBitsToFloat2;
                        float f4 = fIntBitsToFloat2 / 2.0f;
                        imt imtVarT = imwVar.t();
                        long jA = imtVarT.a();
                        imtVarT.b().l();
                        try {
                            imtVarT.c.b(fC, f3 / 2.0f, fD, f4, 0);
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
            fdat fdatVar = this.d;
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
            fdatVar.a(hmlVar, 0);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
