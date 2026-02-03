package defpackage;

import android.os.Message;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgll extends dgmn {
    final /* synthetic */ dgng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgll(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    private final void n() {
        this.a.M(dgib.MSG_GET_CONSENT_COMPLETE);
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "GetGoogleToSConsentState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        super.b();
        dgng dgngVar = this.a;
        dgngVar.A(ewps.GET_GOOGLE_TOS_CONSENT_STAGE);
        dgngVar.at(27);
        eiju.g(dgngVar.A.b()).h(new ejvr() { // from class: dglj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.a.N(dgib.MSG_GET_CONSENT_API_SUCCESS, (dgjn) obj);
                return null;
            }
        }, dgngVar.w).e(Exception.class, new ejvr() { // from class: dglk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                dgng dgngVar2 = this.a.a;
                dgngVar2.z.f(exc, "googleToSConsentApi.getConsent failed", new Object[0]);
                dgngVar2.N(dgib.MSG_GET_CONSENT_API_ERROR, exc);
                return null;
            }
        }, eoqg.a);
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_GET_GOOGLE_TOS_CONSENT;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_GET_GOOGLE_TOS_CONSENT_STATE;
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
        dgng dgngVar = this.a;
        dgngVar.F("GetGoogleToSConsentState", message);
        int iOrdinal = dgng.al(message).ordinal();
        if (iOrdinal == 8) {
            dgngVar.at(49);
            if (dfpi.P()) {
                dgngVar.T(dgngVar.am);
                return true;
            }
            n();
            return true;
        }
        if (iOrdinal != 36) {
            if (iOrdinal != 37) {
                return super.q(message, dgibVar);
            }
            dgngVar.at(53);
            if (dfpi.P()) {
                dgngVar.T(dgngVar.am);
                return true;
            }
            n();
            return true;
        }
        dgngVar.ax(BasePaymentResult.ERROR_REQUEST_FAILED);
        dgjn dgjnVar = (dgjn) message.obj;
        if (dgjnVar.a() == cjqp.GOOGLE_TOS_CONSENTED) {
            dgngVar.at(51);
            if (!ejxp.a(dgjnVar.b())) {
                dgngVar.u.s(dgjnVar.b());
                n();
                return true;
            }
            dgngVar.at(50);
            dgngVar.z.e("Token from getConsent API is empty", new Object[0]);
            if (dfpi.P()) {
                dgngVar.T(dgngVar.am);
                return true;
            }
            n();
            return true;
        }
        dgngVar.at(52);
        dgngVar.z.e("getConsent API returns no consent.", new Object[0]);
        dgngVar.aE.b();
        if (dgngVar.ah()) {
            dgngVar.aF.b();
            dgngVar.z.e("Request for RCS Default On reprompt", new Object[0]);
            dgic.c(dgngVar.m, 25, null);
            dgngVar.T(dgngVar.aB);
            return true;
        }
        if (((Boolean) dfpi.t().a.r.a()).booleanValue()) {
            dgngVar.z.e("Request for reprompt.", new Object[0]);
            dgic.c(dgngVar.m, 22, null);
        }
        dgngVar.T(dgngVar.av);
        return true;
    }

    @Override // defpackage.dgmn
    public final Duration l() {
        return dgjo.i;
    }
}
