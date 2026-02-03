package defpackage;

import java.io.Reader;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhep implements fhbv {
    private final esyv a;

    public fhep(esyv esyvVar) {
        this.a = esyvVar;
    }

    @Override // defpackage.fhbv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        fezk fezkVar = (fezk) obj;
        Reader feziVar = fezkVar.d;
        if (feziVar == null) {
            feziVar = new fezi(fezkVar.c(), fezkVar.e());
            fezkVar.d = feziVar;
        }
        etdb etdbVarN = esyd.n(feziVar);
        try {
            Object objA = this.a.a(etdbVarN);
            if (etdbVarN.t() == 10) {
                return objA;
            }
            throw new esyk("JSON document was not fully consumed.");
        } finally {
            fezkVar.close();
        }
    }
}
