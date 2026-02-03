package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kix {
    public static float a(kiy kiyVar, long j) {
        kjq kjqVarB;
        if (!kjn.b(kjl.c(j), 4294967296L)) {
            kiz.b("Only Sp can convert to Px");
        }
        int i = kjr.a;
        if (kjr.a(kiyVar.ee()) && (kjqVarB = kjr.b(kiyVar.ee())) != null) {
            return kjqVarB.b(kjl.a(j));
        }
        float fA = kjl.a(j);
        float fEe = kiyVar.ee();
        return fA * fEe;
    }

    public static long b(kiy kiyVar, float f) {
        int i = kjr.a;
        if (!kjr.a(kiyVar.ee())) {
            return kjm.b(f / kiyVar.ee());
        }
        kjq kjqVarB = kjr.b(kiyVar.ee());
        return kjm.b(kjqVarB != null ? kjqVarB.a(f) : f / kiyVar.ee());
    }
}
