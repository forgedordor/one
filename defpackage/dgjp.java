package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgjp {
    public final dgrs a;

    public dgjp(dgrs dgrsVar) {
        this.a = dgrsVar;
    }

    public final cjqp a() {
        Optional optionalL = this.a.l();
        if (!optionalL.isPresent()) {
            return cjqp.GOOGLE_TOS_CONSENT_STATE_UNSPECIFIED;
        }
        cjqp cjqpVarB = cjqp.b(((cjxn) optionalL.get()).c);
        return cjqpVarB == null ? cjqp.UNRECOGNIZED : cjqpVarB;
    }

    public final void b() {
        dhja.c("cleanUpGoogleTosConsentCache", new Object[0]);
        dgrs dgrsVar = this.a;
        dgrsVar.y(cjxn.a);
        dgrsVar.s(null);
        dgrsVar.I(false);
    }

    public final void c(cjxn cjxnVar) {
        dhja.c("setGoogleTosConfiguration", new Object[0]);
        this.a.y(cjxnVar);
    }

    public final boolean d() {
        return a().equals(cjqp.GOOGLE_TOS_CONSENTED);
    }
}
