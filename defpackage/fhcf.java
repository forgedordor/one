package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhcf extends fhcg {
    private final fhbm a;

    public fhcf(fhdu fhduVar, fexj fexjVar, fhbv fhbvVar, fhbm fhbmVar) {
        super(fhduVar, fexjVar, fhbvVar);
        this.a = fhbmVar;
    }

    @Override // defpackage.fhcg
    protected final Object a(fhbk fhbkVar, Object[] objArr) {
        fhbk fhbkVar2 = (fhbk) this.a.adapt(fhbkVar);
        fcxy fcxyVar = (fcxy) objArr[objArr.length - 1];
        try {
            fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
            fdiuVar.B();
            fdiuVar.d(new fhck(fhbkVar2));
            fhbkVar2.d(new fhcl(fdiuVar));
            Object objM = fdiuVar.m();
            if (objM == fcyl.a) {
                fcxyVar.getClass();
            }
            return objM;
        } catch (Exception e) {
            return fhco.a(e, fcxyVar);
        }
    }
}
