package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dirm implements fdau {
    final /* synthetic */ diqi a;

    public dirm(diqi diqiVar) {
        this.a = diqiVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ede) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            diqi diqiVar = this.a;
            qrs qrsVarD = qsm.d(diqiVar.a, hmlVar);
            final qqr qqrVarC = qrb.c(hmlVar);
            Boolean bool = (Boolean) hmlVar.e(dkfh.a);
            boolean zBooleanValue = bool.booleanValue();
            hmlVar.v(-1803270647);
            qnm qnmVarA = qrsVarD.a();
            Integer numValueOf = Integer.valueOf(diqiVar.c);
            hmlVar.v(-1746271574);
            boolean zD = hmlVar.D(qqrVarC) | hmlVar.E(zBooleanValue) | hmlVar.D(qrsVarD);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new dirk(qqrVarC, zBooleanValue, qrsVarD, null);
                hmlVar.y(objF);
            }
            hmlVar.o();
            hob.f(qnmVarA, numValueOf, (fdat) objF, hmlVar);
            hmlVar.v(-1746271574);
            boolean zE = hmlVar.E(zBooleanValue) | hmlVar.D(qrsVarD) | hmlVar.D(qqrVarC);
            Object objF2 = hmlVar.f();
            if (zE || objF2 == hmk.a) {
                objF2 = new dirl(zBooleanValue, qqrVarC, qrsVarD, null);
                hmlVar.y(objF2);
            }
            hmlVar.o();
            hob.g(bool, (fdat) objF2, hmlVar);
            hmlVar.o();
            hmlVar.v(-66016182);
            hmlVar.v(5004770);
            boolean zD2 = hmlVar.D(qqrVarC);
            Object objF3 = hmlVar.f();
            if (zD2 || objF3 == hmk.a) {
                objF3 = new fdae() { // from class: dirj
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return Float.valueOf(qqrVarC.e());
                    }
                };
                hmlVar.y(objF3);
            }
            hmlVar.o();
            hmlVar.o();
            ics icsVarC = egq.c(efy.d(ics.e, 4.0f), 1.0f);
            float f = diqiVar.b;
            ics icsVarA = ifj.a(icsVarC, f, f);
            qrj.b(qrsVarD.a(), (fdae) objF3, icsVarA, 0, null, null, null, false, hmlVar, 0, 0, 8184);
        }
        return fctx.a;
    }
}
