package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgrs {
    public static final dhip a = new dhip("ProvisioningEngineDataRetriever");
    public final dhhc b;
    public final eosc c;
    public final fcsu d;
    private final Context e;
    private final dhes f;
    private final deyz g;
    private final cebq h;
    private final fcsu i;

    public dgrs(Context context, dhhc dhhcVar, dhes dhesVar, eosc eoscVar, deyz deyzVar, cebq cebqVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.e = context;
        this.b = dhhcVar;
        this.f = dhesVar;
        this.c = eoscVar;
        this.g = deyzVar;
        this.h = cebqVar;
        this.d = fcsuVar;
        this.i = fcsuVar2;
    }

    private final boolean L(String str) {
        return dfpi.z() ? this.h.c(str).y : dfog.z();
    }

    private final boolean M(dgiq dgiqVar) {
        return ((dfmh) this.i.b()).a() ? dgiqVar.T() && !dgiqVar.X() : dgiqVar.T() && dgiqVar.a() == 1 && !dgiqVar.X();
    }

    public final void A(String str, String str2) {
        try {
            this.b.j(dhhc.g("provisioning_target_after_attestation", str), str2, "bugle");
        } catch (dhhd e) {
            dhja.j(e, a, "Error while putting target state after attestation for given SIM in Bugle storage", new Object[0]);
        }
    }

    public final void B(String str, int i) {
        try {
            this.b.i(dhhc.g("upiAttemptsCount", str), i, "RcsApplicationData");
        } catch (dhhd e) {
            dhja.j(e, a, "Error while putting UPI attempts count into bugle storage", new Object[0]);
        }
    }

    public final void C(String str) {
        dgiq dgiqVarF = f(str);
        dgiqVarF.I(true);
        x(str, dgiqVarF);
    }

    public final boolean D() {
        boolean zF;
        try {
            zF = this.b.k("enable_rcs", true, "bugle");
        } catch (dhhd e) {
            dhja.j(e, a, "Error while retrieving preferences RCS enabled/disabled from Bugle", new Object[0]);
            zF = ((dgsz) this.d.b()).F();
        }
        dhja.l(a, "Rcs is enabled from user settings: %s", Boolean.valueOf(zF));
        return zF;
    }

    public final boolean E(String str) {
        return M(f(str));
    }

    public final boolean F(String str) {
        dgiq dgiqVarF = f(str);
        return !dgiqVarF.m().C() && M(dgiqVarF);
    }

    public final boolean G(String str) {
        dgiq dgiqVarF = f(str);
        return dgiqVarF.m().C() && M(dgiqVarF);
    }

    public final boolean H() {
        try {
            return this.b.m("rcs_tos_state", "bugle") == 2;
        } catch (dhhd e) {
            dhja.j(e, a, "Error while retrieving Google Tos Consent in bugle storage, defaulting to local storage", new Object[0]);
            K(2);
            return ((dgsz) this.d.b()).H();
        }
    }

    public final void I(boolean z) {
        try {
            dhhc dhhcVar = this.b;
            if (z) {
                dhhcVar.i("rcs_tos_state", 2, "bugle");
            } else {
                dhhcVar.i("rcs_tos_state", 0, "bugle");
            }
        } catch (dhhd e) {
            dhja.j(e, a, "Error while putting Google Tos Consent in bugle storage, defaulting to local storage", new Object[0]);
            ((dgsz) this.d.b()).t(z);
            K(2);
        }
    }

    @Deprecated
    public final void J() {
        if (dfar.b()) {
            I(true);
            return;
        }
        try {
            this.b.i("rcs_tos_state", 1, "bugle");
        } catch (dhhd e) {
            dhja.j(e, a, "Error while putting Carrier Consent in bugle storage, defaulting to local storage", new Object[0]);
            ((dgsz) this.d.b()).L();
            K(3);
        }
    }

    public final void K(int i) {
        if (((Boolean) dfog.o().a.Y.a()).booleanValue()) {
            this.g.d(this.e, i);
        }
    }

    public final int a(String str) {
        try {
            return this.b.m(dhhc.g("upiAttemptsCount", str), "RcsApplicationData");
        } catch (dhhd e) {
            dhja.j(e, a, "Error while retrieving UPI attempts count from bugle storage", new Object[0]);
            return -1;
        }
    }

    public final cjtu b(String str) {
        try {
            return (cjtu) this.b.n(dhhc.g("phone_number_record_for_sim_", str), cjtu.a);
        } catch (dhhd e) {
            dhja.j(e, a, "Error while retrieving phone number record from bugle storage.", new Object[0]);
            return cjtu.a;
        }
    }

    public final cjty c(String str) {
        try {
            return (cjty) this.b.n(dhhc.g("provisioning_otp_sms", str), cjty.a);
        } catch (dhhd e) {
            dhja.j(e, a, "Error while retrieving ProvisioningOtpSms from bugle storage", new Object[0]);
            return cjty.a;
        }
    }

    public final cjua d(String str) {
        try {
            return (cjua) this.b.n(dhhc.g("provisioning_success_data_for_sim_", str), cjua.a);
        } catch (dhhd e) {
            dhja.j(e, a, "Error while retrieving provisioningSuccessData from Bugle storage.", new Object[0]);
            return cjua.a;
        }
    }

    public final cjxn e() {
        try {
            return (cjxn) this.b.n("rcs_provisioning_rcs_default_on_configuration", cjxn.a);
        } catch (dhhd e) {
            dhja.j(e, a, "Error while retrieving RcsProvisioningRcsDefaultOnConfiguration from Bugle storage.", new Object[0]);
            return cjxn.a;
        }
    }

    public final dgiq f(String str) {
        if (dfog.D()) {
            try {
                dgiq dgiqVarA = this.b.a(str);
                if (dgiqVarA != null) {
                    return dgiqVarA;
                }
                dhja.l(a, "No RCS Configuration was found in Bugle for simID: %s", dhiz.SIM_ID.c(str));
            } catch (dhhd e) {
                K(5);
                dhja.j(e, a, "Error while retrieving RCS configuration from Bugle", new Object[0]);
            }
        } else {
            dhja.p(a, "RCS Configuration storage in Bugle is disabled by p/h flag, using ProvisioningEngineStateCache.getProvisioningConfigurationForGivenSim()", new Object[0]);
        }
        return ((dgsz) this.d.b()).e(str);
    }

    public final Optional g() {
        try {
            String strH = this.b.h("gmscoreIidToken", "", "RcsApplicationData");
            return dhim.d(strH) ? Optional.empty() : Optional.of(strH);
        } catch (dhhd e) {
            dhja.j(e, a, "Error while retrieving GMSCore IID token from bugle storage", new Object[0]);
            return Optional.empty();
        }
    }

    public final Optional h(String str) {
        try {
            return Optional.of(this.b.h("msisdn_token_for_sim_".concat(String.valueOf(str)), "", "bugle"));
        } catch (dhhd e) {
            dhja.j(e, a, "Error while retrieving MSISDN token from bugle storage", new Object[0]);
            return Optional.empty();
        }
    }

    public final Optional i(String str, ewpa ewpaVar) {
        if (L(str)) {
            try {
                dhhc dhhcVar = this.b;
                String strD = dhhc.d(str, ewpaVar);
                cjtu cjtuVar = cjtu.a;
                cjtu cjtuVar2 = (cjtu) dhhcVar.n(strD, cjtuVar);
                return Objects.equals(cjtuVar2, cjtuVar) ? Optional.empty() : Optional.of(cjtuVar2);
            } catch (dhhd e) {
                dhja.j(e, a, "Error while retrieving phone number record from bugle storage.", new Object[0]);
            }
        }
        return Optional.empty();
    }

    public final Optional j(String str) {
        if (dfog.D()) {
            try {
                dgiq dgiqVarA = this.b.a(str);
                if (dgiqVarA != null) {
                    return Optional.of(dgiqVarA);
                }
                dhja.l(a, "No RCS Configuration was found in Bugle for simID: %s", dhiz.SIM_ID.c(str));
            } catch (dhhd e) {
                K(5);
                dhja.t(e, a, "Error while retrieving RCS configuration from Bugle", new Object[0]);
            }
        } else {
            dhja.l(a, "RCS Configuration storage in Bugle is disabled by p/h flag, using ProvisioningEngineStateCache.getProvisioningConfigurationForGivenSimIfExist()", new Object[0]);
        }
        return ((dgsz) this.d.b()).g(str);
    }

    @Deprecated
    public final Optional k() {
        return j(dfog.T() ? q() : this.f.l());
    }

    public final Optional l() {
        try {
            cjxn cjxnVar = (cjxn) this.b.n("rcsProvisioningGoogleToSConfiguration", cjxn.a);
            dhip dhipVar = a;
            cjqp cjqpVarB = cjqp.b(cjxnVar.c);
            if (cjqpVarB == null) {
                cjqpVarB = cjqp.UNRECOGNIZED;
            }
            evvp evvpVar = cjxnVar.g;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            dhja.l(dhipVar, "getRcsProvisioningGoogleTosConfiguration %s, consentState = %s, ServerUpdateTime = %s", cjxnVar, cjqpVarB, Long.valueOf(evvpVar.b));
            return Optional.of(cjxnVar);
        } catch (dhhd e) {
            dhja.j(e, a, "Error while retrieving RcsProvisioningGoogleTosConfiguration from bugle storage", new Object[0]);
            return Optional.empty();
        }
    }

    @Deprecated
    public final String m() {
        fcsu fcsuVar = this.d;
        dhes dhesVar = this.f;
        String strJ = ((dgsz) fcsuVar.b()).j(dhesVar.l());
        return !TextUtils.isEmpty(strJ) ? strJ : dhesVar.h();
    }

    public final String n(cmmh cmmhVar) {
        String strJ = ((dgsz) this.d.b()).j(cmmhVar.c);
        return !TextUtils.isEmpty(strJ) ? strJ : cmmhVar.q;
    }

    public final String o(String str) {
        try {
            String strH = this.b.h("manual_msisdn_entered_phone_number_for_sim_".concat(String.valueOf(str)), "", "bugle");
            if (!TextUtils.isEmpty(strH)) {
                return strH;
            }
        } catch (dhhd e) {
            K(6);
            dhja.j(e, a, "Error while retrieving manually entered MSISDN from Bugle's ContentProvider. Using ProvisioningEngineStateCache.getMsisdnForGivenSim()", new Object[0]);
        }
        String strJ = ((dgsz) this.d.b()).j(str);
        dhja.l(a, "Manually entered MSISDN is: %s", dhiz.SIM_ID.c(strJ));
        return strJ;
    }

    public final String p(String str) {
        try {
            return this.b.h(dhhc.g("provisioning_attestation_nonce", str), "", "bugle");
        } catch (dhhd e) {
            dhja.j(e, a, "Error while getting attestation nonce from Bugle storage", new Object[0]);
            return "";
        }
    }

    public final String q() {
        String strL;
        try {
            strL = this.b.h("sim_id", "", "sim_state_tracker");
        } catch (dhhd e) {
            dhja.j(e, a, "Error while retrieving simId from Bugle, using local simId", new Object[0]);
            strL = this.f.l();
        }
        dhja.d(a, "simId from Bugle is: %s", dhiz.SIM_ID.c(strL));
        return strL;
    }

    public final void r(String str) {
        dgiq dgiqVarF = f(str);
        dgiqVarF.C();
        dgiqVarF.F();
        x(str, dgiqVarF);
    }

    public final void s(String str) {
        try {
            this.b.j("gmscoreIidToken", str, "RcsApplicationData");
            dhja.l(a, "putGMSCoreIIDToken %s", dhiz.GENERIC.c(str));
        } catch (dhhd e) {
            dhja.j(e, a, "Error while putting GMSCore IID token in bugle storage", new Object[0]);
        }
    }

    public final void t(String str, cjtu cjtuVar) {
        try {
            this.b.o(dhhc.g("phone_number_record_for_sim_", str), cjtuVar);
            dhja.l(a, "putPhoneNumberRecord with phone number: %s for simdId: %s", dhiz.PHONE_NUMBER.c(cjtuVar.c), dhiz.SIM_ID.c(str));
        } catch (dhhd e) {
            dhja.j(e, a, "Error while putting phone number record in bugle storage", new Object[0]);
        }
    }

    public final void u(String str, ewpa ewpaVar, cjtu cjtuVar) {
        if (L(str)) {
            try {
                this.b.o(dhhc.d(str, ewpaVar), cjtuVar);
                dhja.l(a, "putPhoneNumberRecord with phone number: %s for simdId: %s", dhiz.PHONE_NUMBER.c(cjtuVar.c), dhiz.SIM_ID.c(str));
            } catch (dhhd e) {
                dhja.j(e, a, "Error while putting phone number record in bugle storage", new Object[0]);
            }
        }
    }

    public final void v(String str, String str2) {
        try {
            this.b.j(dhhc.g("provisioning_attestation_nonce", str), str2, "bugle");
        } catch (dhhd e) {
            dhja.j(e, a, "Error while putting attestation nonce in Bugle storage", new Object[0]);
        }
    }

    public final void w(String str, cjty cjtyVar) {
        try {
            this.b.o(dhhc.g("provisioning_otp_sms", str), cjtyVar);
        } catch (dhhd e) {
            dhja.j(e, a, "Error while updating otp storage in Bugle data store", new Object[0]);
        }
    }

    public final void x(String str, dgiq dgiqVar) {
        ((dgsz) this.d.b()).z(str, dgiqVar);
        if (dfog.D()) {
            try {
                this.b.j("provisioning_engine_rcs_configuration_".concat(String.valueOf(str)), new esyd().k(dgiqVar), "bugle");
            } catch (dhhd e) {
                dhja.j(e, a, "Error while putting RCS Configuration for simId: %s", dhiz.SIM_ID.c(str));
                K(5);
            }
        } else {
            dhja.l(a, "RCS Configuration storage in Bugle is disabled by p/h flag", new Object[0]);
        }
        dhja.l(a, "Rcs Configuration was updated", new Object[0]);
    }

    public final void y(cjxn cjxnVar) {
        try {
            this.b.o("rcsProvisioningGoogleToSConfiguration", cjxnVar);
            dhip dhipVar = a;
            cjqp cjqpVarB = cjqp.b(cjxnVar.c);
            if (cjqpVarB == null) {
                cjqpVarB = cjqp.UNRECOGNIZED;
            }
            evvp evvpVar = cjxnVar.g;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            dhja.l(dhipVar, "putRcsProvisioningGoogleTosConfiguration %s, consentState = %s, ServerUpdateTime = %s", cjxnVar, cjqpVarB, Long.valueOf(evvpVar.b));
        } catch (dhhd e) {
            dhja.j(e, a, "Error while putting RcsProvisioningGoogleTosConfiguration in bugle storage", new Object[0]);
        }
    }

    public final void z(cjxn cjxnVar) {
        try {
            this.b.o("rcs_provisioning_rcs_default_on_configuration", cjxnVar);
            dhip dhipVar = a;
            cjxj cjxjVarB = cjxj.b(cjxnVar.h);
            if (cjxjVarB == null) {
                cjxjVarB = cjxj.UNRECOGNIZED;
            }
            evvp evvpVar = cjxnVar.g;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            dhja.l(dhipVar, "putRcsProvisioningRcsDefaultOnConfiguration %s, consentState = %s, ServerUpdateTime = %s", cjxnVar, cjxjVarB, Long.valueOf(evvpVar.b));
        } catch (dhhd e) {
            dhja.j(e, a, "Error while putting RcsProvisioningRcsDefaultOnConfiguration in bugle storage", new Object[0]);
        }
    }
}
