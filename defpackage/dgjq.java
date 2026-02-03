package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgjq {
    private static final dhip b = new dhip("RcsDefaultOnConsentCacheImpl");
    public final dgrs a;
    private final diep c;

    public dgjq(dgrs dgrsVar, diep diepVar) {
        this.a = dgrsVar;
        this.c = diepVar;
    }

    public final cjxj a() {
        dgrs dgrsVar = this.a;
        cjxn cjxnVarE = dgrsVar.e();
        cjxj cjxjVarB = cjxj.b(cjxnVarE.h);
        if (cjxjVarB == null) {
            cjxjVarB = cjxj.UNRECOGNIZED;
        }
        if (cjxjVarB.equals(cjxj.OOB_CONSENT) && dgrsVar.g().isEmpty()) {
            dgrsVar.z(cjxn.a);
            return cjxj.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED;
        }
        cjxj cjxjVarB2 = cjxj.b(cjxnVarE.h);
        return cjxjVarB2 == null ? cjxj.UNRECOGNIZED : cjxjVarB2;
    }

    public final void b() {
        dhja.d(b, "cleanUpRcsDefaultOnConsentCache", new Object[0]);
        dgrs dgrsVar = this.a;
        dgrsVar.z(cjxn.a);
        dgrsVar.s(null);
    }

    public final synchronized void c(cjxn cjxnVar) {
        cjxj cjxjVarB = cjxj.b(cjxnVar.h);
        if (cjxjVarB == null) {
            cjxjVarB = cjxj.UNRECOGNIZED;
        }
        cjxj cjxjVarA = a();
        if ((cjxjVarB.equals(cjxj.OOB_CONSENT) || cjxjVarB.equals(cjxj.NO_OOB_CONSENT)) && cjxjVarA.equals(cjxj.LEGAL_FYI_SEEN)) {
            dhja.d(b, "setRcsDefaultOnConfiguration: skipped setting OOB-provided consent as user already saw Legal FYI.", new Object[0]);
        } else {
            dhja.d(b, "setRcsDefaultOnConfiguration", new Object[0]);
            this.a.z(cjxnVar);
        }
    }

    public final void d() {
        Instant instantF = this.c.f();
        evvo evvoVar = (evvo) evvp.a.createBuilder();
        long epochSecond = instantF.getEpochSecond();
        evvoVar.copyOnWrite();
        ((evvp) evvoVar.instance).b = epochSecond;
        int nano = instantF.getNano();
        evvoVar.copyOnWrite();
        ((evvp) evvoVar.instance).c = nano;
        evvp evvpVar = (evvp) evvoVar.build();
        try {
            this.a.b.o("rcs_provisioning_rcs_default_on_server_update_time_key", evvpVar);
            dhja.l(dgrs.a, "putRcsProvisioningRcsDefaultOnServerUpdateTime %s", evvpVar);
        } catch (dhhd e) {
            dhja.j(e, dgrs.a, "Error while putting RCS Default On server update time in bugle storage", new Object[0]);
        }
    }

    public final boolean e() {
        cjxj cjxjVarA = a();
        return cjxjVarA.equals(cjxj.LEGAL_FYI_SEEN) || cjxjVarA.equals(cjxj.OOB_CONSENT);
    }
}
