package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.google.android.gms.constellation.IdTokenRequest;
import com.google.android.gms.constellation.ImsiRequest;
import com.google.android.gms.constellation.PhoneNumberVerification;
import com.google.android.gms.constellation.VerifyPhoneNumberRequest;
import com.google.android.gms.constellation.VerifyPhoneNumberResponse;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgmq extends dgmn {
    final /* synthetic */ dgng a;
    private int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgmq(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
        this.b = 0;
    }

    private final void w(String str, Optional optional) {
        dgng dgngVar = this.a;
        dgngVar.z.a("UPI - successfully verified phone number", new Object[0]);
        dgngVar.at(55);
        dgrs dgrsVar = dgngVar.u;
        String str2 = dgngVar.l;
        String strO = o();
        String strR = dgngVar.r();
        String strN = n();
        int iD = dfpi.d();
        String str3 = dgngVar.h;
        dgngVar.n.o(dgngVar.m, str2, strO, strR, strN, iD, dgrsVar.a(str3), new dggp(str3), optional);
        try {
            dgrsVar.b.j("msisdn_token_for_sim_".concat(String.valueOf(str3)), str, "bugle");
        } catch (dhhd e) {
            dhja.j(e, dgrs.a, "Error while putting MSISDN token into bugle storage", new Object[0]);
        }
        dgng dgngVar2 = this.a;
        if (((dflr) dgngVar2.Z.b()).a() && ((dflt) dgngVar2.ab.b()).a()) {
            p(dgngVar2.aD, ewrp.RCS_PROVISIONING_REQUEST_ATTESTATION_STATE);
            dgngVar2.N(dgib.MSG_VERIFY_NUMBER_SUCCESS, str);
        } else {
            p(dgngVar2.ak, ewrp.RCS_PROVISIONING_REQUEST_WITH_MSISDN_TOKEN_STATE);
            dgngVar2.N(dgib.MSG_VERIFY_NUMBER_SUCCESS, str);
        }
    }

    private static final int x(int i) {
        switch (i) {
            case 2:
                return 8;
            case 3:
                return 9;
            case 4:
                return 10;
            case 5:
                return 14;
            case 6:
                return 12;
            case 7:
                return 11;
            case 8:
                return 13;
            default:
                return 7;
        }
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "VerifyMsisdnState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        defn defnVarB;
        boolean zR;
        String strX;
        VerifyPhoneNumberRequest verifyPhoneNumberRequestA;
        super.b();
        dgng dgngVar = this.a;
        dgngVar.A(ewps.VERIFY_MSISDN_STAGE);
        dgngVar.z.a("UPI - calling verifyPhoneNumber API", new Object[0]);
        dgngVar.at(54);
        this.b++;
        dgrs dgrsVar = dgngVar.u;
        String str = dgngVar.l;
        String strO = o();
        String strR = dgngVar.r();
        String strN = n();
        int iD = dfpi.d();
        String str2 = dgngVar.h;
        int iA = dgrsVar.a(str2);
        dggp dggpVar = new dggp(str2);
        deyo deyoVar = dgngVar.n;
        Context context = dgngVar.m;
        deyoVar.n(context, str, strO, strR, strN, iD, iA, dggpVar);
        String strB = ejwk.b(dgngVar.l);
        String strB2 = ejwk.b(dgrsVar.o(str2));
        boolean zD = dgngVar.D.d(str2);
        dgnt dgntVar = dgngVar.B;
        if (dgntVar.a.h(context, 204390000) == 0) {
            Optional optionalA = dgnt.a(context);
            if (optionalA.isEmpty()) {
                defnVarB = degc.b(new dgns());
            } else {
                String str3 = dgngVar.j;
                dcoc dcocVar = new dcoc(context);
                Object obj = optionalA.get();
                dgjq dgjqVar = dgntVar.e;
                dcoi dcoiVar = new dcoi();
                dcoiVar.a = (String) obj;
                int i = elcz.a;
                dcoiVar.b = elcx.a.c(a.q(str3, strB, "."), StandardCharsets.UTF_8).toString();
                IdTokenRequest idTokenRequestA = dcoiVar.a();
                Bundle bundle = new Bundle();
                bundle.putString("session_id", strB);
                bundle.putString("required_consumer_consent", "RCS");
                cebq cebqVar = dgntVar.b;
                int iA2 = ettr.a(cebqVar.c(str2).G);
                if (iA2 == 0) {
                    iA2 = 1;
                }
                if (iA2 == 6) {
                    bundle.putString("one_time_verification", "True");
                }
                boolean z = cebqVar.c(str2).n;
                if (iA2 == 5 && !z) {
                    bundle.putString("one_time_verification", "True");
                }
                if (dfpi.z()) {
                    zR = iA2 == 5;
                    strX = cebqVar.d(str2).b;
                } else {
                    zR = dfpi.R();
                    strX = dfpi.x();
                }
                if (dhla.d(context) || (dgntVar.d.a() && iA2 == 5)) {
                    bundle.putString("consent_type", "RCS_DEFAULT_ON_LEGAL_FYI_IN_SETTINGS");
                } else {
                    if (dfpi.z() ? dgntVar.c.a(str2) : dfpi.G()) {
                        int iA3 = dgjqVar.a().a();
                        if (iA3 == 1) {
                            bundle.putString("consent_type", "RCS_DEFAULT_ON_LEGAL_FYI");
                        } else if (iA3 == 2) {
                            bundle.putString("consent_type", "RCS_DEFAULT_ON_OUT_OF_BOX");
                        }
                    }
                }
                if (!zR) {
                    bundle.putString("IMSI", str3);
                    if (cebqVar.c(str2).H) {
                        dcop dcopVar = new dcop();
                        dcopVar.a = strX;
                        dcopVar.b = idTokenRequestA;
                        dcopVar.c = bundle;
                        dcopVar.b();
                        verifyPhoneNumberRequestA = dcopVar.a();
                    } else {
                        dcop dcopVar2 = new dcop();
                        dcopVar2.a = strX;
                        dcopVar2.b = idTokenRequestA;
                        dcopVar2.c = bundle;
                        verifyPhoneNumberRequestA = dcopVar2.a();
                    }
                } else {
                    if (str3 == null) {
                        throw new IllegalStateException("IMSI is required");
                    }
                    List listSingletonList = Collections.singletonList(new ImsiRequest(str3, strB2));
                    if (zD) {
                        bundle.putString("force_provisioning", "true");
                    }
                    dcop dcopVar3 = new dcop();
                    dcopVar3.a = strX;
                    dcopVar3.b = idTokenRequestA;
                    dcopVar3.c = bundle;
                    dcopVar3.d = listSingletonList;
                    dcopVar3.b();
                    verifyPhoneNumberRequestA = dcopVar3.a();
                }
                defnVarB = dcocVar.a(verifyPhoneNumberRequestA);
            }
        } else {
            defnVarB = degc.b(new dgnr());
        }
        eosc eoscVar = dgngVar.w;
        defnVarB.q(eoscVar, new defh() { // from class: dgmo
            /* JADX WARN: Type inference failed for: r1v2, types: [fcsu, java.lang.Object] */
            @Override // defpackage.defh
            public final void e(Object obj2) {
                dgmq dgmqVar = this.a;
                VerifyPhoneNumberResponse verifyPhoneNumberResponse = (VerifyPhoneNumberResponse) obj2;
                dgng dgngVar2 = dgmqVar.a;
                if (!((dflr) dgngVar2.Z.b()).a()) {
                    dgmqVar.u(verifyPhoneNumberResponse);
                    return;
                }
                Optional optional = dgngVar2.ad;
                optional.isPresent();
                eieh eiehVarC = ((eigp) optional.get().b()).c("ProvisioningEngineStateMachine:UpiSuccessListener", "com/google/android/ims/provisioning/engine/ProvisioningEngineStateMachine$VerifyMsisdnState", "verifyPhoneNumberSuccessListenerTraced", 2575);
                try {
                    dgmqVar.u(verifyPhoneNumberResponse);
                    eiehVarC.close();
                } catch (Throwable th) {
                    try {
                        eiehVarC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        defnVarB.p(eoscVar, new defe() { // from class: dgmp
            @Override // defpackage.defe
            public final void d(Exception exc) {
                Optional optional;
                boolean z2;
                String message = exc.getMessage();
                dgmq dgmqVar = this.a;
                dgng dgngVar2 = dgmqVar.a;
                boolean z3 = true;
                dgngVar2.z.e("UPI - verifyPhoneNumber API returned an exception: %s", message);
                Optional optionalEmpty = Optional.empty();
                dgsz dgszVar = (dgsz) dgngVar2.L.b();
                String str4 = dgngVar2.h;
                Optional optionalOf = Optional.of(dgszVar.f(str4));
                int i2 = 7;
                if (exc instanceof dcff) {
                    int iA4 = ((dcff) exc).a();
                    Optional optionalOf2 = Optional.of(Integer.valueOf(iA4));
                    if (iA4 != 7 && iA4 != 8 && iA4 != 20 && iA4 != 5002) {
                        z3 = false;
                    }
                    i2 = 6;
                    optional = optionalOf2;
                    z2 = z3;
                } else {
                    if (exc instanceof dgnr) {
                        i2 = 2;
                    } else if (exc instanceof dgns) {
                        i2 = 3;
                    }
                    optional = optionalEmpty;
                    z2 = false;
                }
                dgngVar2.n.v(dgngVar2.m, dgngVar2.l, dgmqVar.o(), dgngVar2.r(), dgmqVar.n(), i2, z2, optional, dfpi.d(), dgngVar2.u.a(str4), new dggp(str4), Optional.empty(), optionalOf);
                if (z2) {
                    dgmqVar.t();
                } else {
                    dgmqVar.s(false);
                }
            }
        });
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_VERIFY_MSISDN;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_VERIFY_MSISDN_STATE;
    }

    @Override // defpackage.dgmn
    public final boolean h() {
        return true;
    }

    @Override // defpackage.dgmn
    public final boolean i() {
        return false;
    }

    @Override // defpackage.dgmn
    public final boolean j() {
        return true;
    }

    @Override // defpackage.dgop
    public final boolean k(Message message, dgib dgibVar) {
        return super.q(message, dgibVar);
    }

    public final String n() {
        String str = this.a.j;
        return str.substring(0, Math.min(str.length(), 6));
    }

    public final String o() {
        return String.format(Locale.US, "%s-%d", this.a.l, Integer.valueOf(this.b));
    }

    public final void s(boolean z) {
        dgng dgngVar = this.a;
        dgngVar.at(56);
        if (dgngVar.aj()) {
            if (!z || dhla.d(dgngVar.m)) {
                dgngVar.z.d("UPI - non-retryable verifyPhoneNumber failure, falling back to non-UPI is removed", new Object[0]);
                p(dgngVar.am, ewrp.RCS_PROVISIONING_RETRY_STATE);
                return;
            } else {
                dgngVar.z.d("UPI - Transitioning into WaitingForManualMsisdnEntryState", new Object[0]);
                p(dgngVar.ay, ewrp.RCS_PROVISIONING_WAITING_FOR_MANUAL_MSISDN_ENTRY_STATE);
                return;
            }
        }
        if (dfpi.B()) {
            dgngVar.z.d("UPI - non-retryable verifyPhoneNumber failure, fallback to non-UPI is disabled", new Object[0]);
            p(dgngVar.am, ewrp.RCS_PROVISIONING_RETRY_STATE);
        } else {
            dgngVar.z.d("UPI - non-retryable verifyPhoneNumber failure, falling back to non-UPI", new Object[0]);
            dgmn dgmnVarH = dgngVar.h();
            p(dgmnVarH, dgmnVarH.g());
        }
    }

    public final void t() {
        dgng dgngVar = this.a;
        dgngVar.z.d("UPI - retryable verifyPhoneNumber failure", new Object[0]);
        dgngVar.at(56);
        p(dgngVar.an, ewrp.RCS_PROVISIONING_REPLAY_REQUEST_STATE);
    }

    public final void u(VerifyPhoneNumberResponse verifyPhoneNumberResponse) {
        dgng dgngVar = this.a;
        fcsu fcsuVar = dgngVar.L;
        dgsz dgszVar = (dgsz) fcsuVar.b();
        String str = dgngVar.h;
        Optional optionalOf = Optional.of(dgszVar.f(str));
        PhoneNumberVerification[] phoneNumberVerificationArr = verifyPhoneNumberResponse.a;
        int length = phoneNumberVerificationArr.length;
        if (length != 1) {
            dgngVar.z.e("UPI - expected 1 verification, instead verified %d numbers", Integer.valueOf(length));
            dgngVar.n.v(dgngVar.m, dgngVar.l, o(), dgngVar.r(), n(), length != 0 ? 5 : 4, false, Optional.empty(), dfpi.d(), dgngVar.u.a(str), new dggp(str), Optional.empty(), optionalOf);
            s(false);
        }
        PhoneNumberVerification phoneNumberVerification = phoneNumberVerificationArr[0];
        if (!((Boolean) dfpi.t().a.aq.a()).booleanValue()) {
            dgngVar.z.a("UPI - verification timestampMillis = %d, verificationMethod = %d", Long.valueOf(phoneNumberVerification.b), Integer.valueOf(phoneNumberVerification.c));
            w(phoneNumberVerification.e, optionalOf);
            return;
        }
        int i = phoneNumberVerification.g;
        dgke dgkeVar = dgngVar.z;
        Long lValueOf = Long.valueOf(phoneNumberVerification.b);
        Integer numValueOf = Integer.valueOf(phoneNumberVerification.c);
        Integer numValueOf2 = Integer.valueOf(i);
        long j = phoneNumberVerification.h;
        Long lValueOf2 = Long.valueOf(j);
        dgkeVar.a("UPI - verification timestampMillis = %d, verificationMethod = %d, verificationStatus = %d, retryAfterSeconds = %d", lValueOf, numValueOf, numValueOf2, lValueOf2);
        switch (i) {
            case 1:
                dgsz dgszVar2 = (dgsz) fcsuVar.b();
                epie epieVar = epie.ELIGIBLE;
                dgszVar2.D(str, epieVar);
                w(phoneNumberVerification.e, Optional.of(epieVar));
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                dgngVar.n.v(dgngVar.m, dgngVar.l, o(), dgngVar.r(), n(), x(i), true, Optional.empty(), dfpi.d(), dgngVar.u.a(str), new dggp(str), Optional.of(Integer.valueOf((int) j)), optionalOf);
                if (!((Boolean) dgng.d.a()).booleanValue()) {
                    t();
                    break;
                } else if (j > 0) {
                    dgngVar.z.d("UPI - retryable verifyPhoneNumber failure with retry after seconds %d", lValueOf2);
                    dgngVar.at(56);
                    ((dgsz) fcsuVar.b()).C(str, dgngVar.K.f().plusSeconds(j));
                    p(dgngVar.am, ewrp.RCS_PROVISIONING_RETRY_STATE);
                    break;
                } else if (j != 0) {
                    t();
                    break;
                } else {
                    p(dgngVar.ae, ewrp.RCS_PROVISIONING_ENABLED_STATE);
                    break;
                }
            case 7:
                dgngVar.n.v(dgngVar.m, dgngVar.l, o(), dgngVar.r(), n(), x(i), false, Optional.empty(), dfpi.d(), dgngVar.u.a(str), new dggp(str), Optional.of(Integer.valueOf((int) j)), optionalOf);
                s(true);
                break;
            case 8:
                dgsz dgszVar3 = (dgsz) fcsuVar.b();
                epie epieVar2 = epie.INELIGIBLE;
                dgszVar3.D(str, epieVar2);
                w(phoneNumberVerification.e, Optional.of(epieVar2));
                break;
            default:
                dgngVar.z.a("UPI - Unrecognized VerificationStatus from calling verifyPhoneNumber: %d", numValueOf2);
                dgngVar.n.v(dgngVar.m, dgngVar.l, o(), dgngVar.r(), n(), x(i), true, Optional.empty(), dfpi.d(), dgngVar.u.a(str), new dggp(str), Optional.of(Integer.valueOf((int) j)), optionalOf);
                break;
        }
    }
}
