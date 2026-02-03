package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgio {
    private final crmx a;
    private final dggl b;

    public dgio(crmx crmxVar, dggl dgglVar) {
        crmxVar.getClass();
        dgglVar.getClass();
        this.a = crmxVar;
        this.b = dgglVar;
    }

    public final Optional a(dgiq dgiqVar) {
        dgiqVar.getClass();
        if (dgiqVar.c() == 0) {
            ((eksl) dgip.a.h()).q("Could not retrieve MSISDN from configuration. Configuration is empty.");
            return Optional.empty();
        }
        dgis dgisVarM = dgiqVar.m();
        if (dgisVarM == null) {
            ((eksl) dgip.a.h()).q("Could not retrieve MSISDN from configuration. ImsConfiguration is null.");
            return Optional.empty();
        }
        String strW = dgisVarM.w();
        if (strW.length() == 0) {
            ((eksl) dgip.a.h()).q("Could not retrieve MSISDN from configuration. Public identity is null/empty.");
            return Optional.empty();
        }
        crmx crmxVar = this.a;
        String strK = dhjv.k(strW, crmxVar);
        if (strK == null) {
            return Optional.empty();
        }
        if (strK.length() <= 0 || crmxVar.I(strK)) {
            return Optional.ofNullable(this.b.a(strK));
        }
        ((eksl) dgip.a.j()).t("Phone number is not in canonical format. Phone number: %s", dhiz.PHONE_NUMBER.c(strK));
        throw new IllegalArgumentException("Phone number is not in canonical format.");
    }
}
