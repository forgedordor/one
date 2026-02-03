package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class ceqa {
    private final cepb a;
    private final fcrn b;

    public ceqa(cepb cepbVar, fcrn fcrnVar) {
        this.a = cepbVar;
        this.b = fcrnVar;
    }

    public final fcrn a(ceog ceogVar, fbrg fbrgVar) {
        String strF;
        cepb cepbVar = this.a;
        fbrg fbrgVarE = cepbVar.e();
        if (fbrgVar != null) {
            fbrgVarE.g(fbrgVar);
        }
        fcrn fcrnVar = this.b;
        if (ceogVar != null) {
            strF = ceogVar.b;
        } else {
            strF = cepbVar.f();
            strF.getClass();
        }
        fcrn fcrnVarD = ceqb.d(fcrnVar, fbrgVarE, strF);
        fcrnVarD.getClass();
        return fcrnVarD;
    }
}
