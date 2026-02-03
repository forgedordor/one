package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crgr {
    private final fcsu a;
    private final cqce b;

    public crgr(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        this.b = cqce.g("Bugle", "SuggestedStickerProvider");
    }

    public final etyp a(String str, String str2) {
        ejlu ejluVar = ((crgq) this.a.b()).b;
        if (ejluVar == null) {
            return null;
        }
        String str3 = (String) crbf.B.e();
        int i = ekgb.d;
        etyp etypVarB = ejluVar.b(str, str2, str3, ekoe.a);
        if (!fdbq.f(etypVarB, etyp.a)) {
            return etypVarB;
        }
        cqbd cqbdVarE = this.b.e();
        cqbdVarE.I("No sticker found for emotion suggestion");
        cqbdVarE.A("emotion", str);
        cqbdVarE.r();
        return null;
    }
}
