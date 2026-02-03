package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cubh extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cubl c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cubh(fcxy fcxyVar, cubl cublVar) {
        super(3, fcxyVar);
        this.c = cublVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cubh cubhVar = new cubh((fcxy) obj3, this.c);
        cubhVar.d = (fdpm) obj;
        cubhVar.b = obj2;
        return cubhVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r7 = this.d;
            fcti fctiVar = (fcti) this.b;
            String str = (String) fctiVar.a;
            cudx cudxVar = (cudx) fctiVar.b;
            cubl cublVar = this.c;
            alqm alqmVar = null;
            if (cublVar.e.k(str)) {
                alqm alqmVarB = cublVar.b(str);
                if (!cudxVar.b(alqmVarB) && (!((aquo) cublVar.g.b()).a() || !alqmVarB.b().isPresent())) {
                    alqmVar = alqmVarB;
                }
            }
            fdpl auxsVar = alqmVar == null ? new auxs(new fdae() { // from class: cubc
                @Override // defpackage.fdae
                public final Object invoke() {
                    return new cuba(null, 3);
                }
            }) : new cubk(cublVar.j.c(alqmVar), cublVar, alqmVar, cudxVar);
            this.a = 1;
            if (fdpy.c(r7, auxsVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
