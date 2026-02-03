package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djcm implements fdau {
    final /* synthetic */ djdi a;
    final /* synthetic */ djdm b;
    final /* synthetic */ boolean c;
    final /* synthetic */ float d;
    final /* synthetic */ boolean e;
    final /* synthetic */ int f;

    public djcm(djdi djdiVar, djdm djdmVar, boolean z, int i, float f, boolean z2) {
        this.a = djdiVar;
        this.b = djdmVar;
        this.c = z;
        this.f = i;
        this.d = f;
        this.e = z2;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ede edeVar = (ede) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        edeVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(edeVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            final dljn dljnVarD = dljt.d(hmlVar);
            djdi djdiVar = this.a;
            Boolean boolValueOf = Boolean.valueOf(djdiVar == this.b.a);
            hmlVar.v(5004770);
            boolean zD = hmlVar.D(dljnVarD);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdap() { // from class: djck
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        ((cxg) obj4).getClass();
                        dljn dljnVar = dljnVarD;
                        dljl dljlVar = dljnVar.q;
                        des desVar = dljnVar.r.d;
                        return new cyt(dae.l(dea.c(100, 0, desVar, 2), 2), dae.m(dea.c(100, 0, desVar, 2), 2));
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            cwx.a(boolValueOf, null, (fdap) objF, null, null, null, hxe.d(527077378, new djcl(this.e, djdiVar), hmlVar), hmlVar, 1572864, 58);
            if (this.c) {
                long jL = djco.l(this.f, this.d, hmlVar);
                ics icsVarA = edeVar.a(egq.k(ics.e, 8.0f), new icd(0.9f, -0.9f));
                dky dkyVarA = dkz.a(1.2f, jL);
                evm evmVar = evn.a;
                ecz.b(dkl.a(efy.d(dkr.b(icsVarA, dkyVarA, evmVar), 1.0f), glz.a(hmlVar).a, evmVar), hmlVar, 0);
            }
        }
        return fctx.a;
    }
}
