package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chet implements cher, cheq {
    public final cheq a;
    private final fdjx b;

    public chet(cheq cheqVar, fdjx fdjxVar) {
        cheqVar.getClass();
        fdjxVar.getClass();
        this.a = cheqVar;
        this.b = fdjxVar;
    }

    @Override // defpackage.cheq
    public final auau a() {
        return this.a.a();
    }

    @Override // defpackage.cheq
    public final Object b(chfi chfiVar, axcm axcmVar, awjl awjlVar, awpx awpxVar, int i, chfg chfgVar, chfo chfoVar, fhaz fhazVar, basd basdVar, eyga eygaVar, fcxy fcxyVar) {
        return this.a.b(chfiVar, axcmVar, awjlVar, null, 1, chfgVar, chfoVar, fhazVar, basdVar, eygaVar, fcxyVar);
    }

    @Override // defpackage.cheq
    public final Object c(chfi chfiVar, axcm axcmVar, awjl awjlVar, awpx awpxVar, chfg chfgVar, chfo chfoVar, fhaz fhazVar, basd basdVar, eyga eygaVar, fcxy fcxyVar) {
        return this.a.c(chfiVar, axcmVar, awjlVar, awpxVar, chfgVar, chfoVar, fhazVar, basdVar, eygaVar, fcxyVar);
    }

    @Override // defpackage.cher
    public final eiju d(chfi chfiVar, axcm axcmVar, awjl awjlVar, awpx awpxVar, chfg chfgVar, chfo chfoVar, fhaz fhazVar, basd basdVar, eyga eygaVar) {
        fhazVar.getClass();
        basdVar.getClass();
        eygaVar.getClass();
        return auvw.c(this.b, fcyi.a, fdjz.a, new ches(this, chfiVar, axcmVar, awjlVar, awpxVar, chfgVar, chfoVar, fhazVar, basdVar, eygaVar, null));
    }
}
