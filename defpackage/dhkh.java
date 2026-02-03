package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhkh {
    private final fcsu a;

    public dhkh(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public final String a(String str, String str2) {
        try {
            fcsu fcsuVar = this.a;
            ephf ephfVarN = ((ephj) fcsuVar.b()).n(str, str2);
            if (((ephj) fcsuVar.b()).j(ephfVarN)) {
                return ((ephj) fcsuVar.b()).b(ephfVarN, ephg.E164);
            }
            return null;
        } catch (ephe unused) {
            dhja.q("Phone number formatting to E164 failed", new Object[0]);
            return null;
        }
    }
}
