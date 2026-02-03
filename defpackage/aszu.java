package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aszu {
    private static final eksp a = eksp.c("BugleRcsCapabilities");
    private final cogw b;
    private final aszw c;

    public aszu(cogw cogwVar, aszw aszwVar) {
        this.b = cogwVar;
        this.c = aszwVar;
    }

    public final boolean a(asts astsVar) {
        boolean zIsAfter = astsVar.b().plus(astsVar.c() ? this.c.b() : this.c.a()).isAfter(this.b.f());
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/validity/RcsCapabilitiesValidityChecker", "areCapabilitiesValid", 44, "RcsCapabilitiesValidityChecker.java")).G("RcsCapabilitiesValidityChecker: areCapabilitiesValid: %s for capabilities %s", zIsAfter, astsVar);
        return zIsAfter;
    }
}
