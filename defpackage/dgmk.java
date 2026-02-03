package defpackage;

import android.os.Message;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.time.Duration;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgmk extends dgmn {
    final /* synthetic */ dgng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgmk(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    private final void n() {
        this.a.M(dgib.MSG_SET_CONSENT_COMPLETE);
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "SetGoogleToSConsentState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        super.b();
        dgng dgngVar = this.a;
        dgngVar.A(ewps.SET_GOOGLE_TOS_CONSENT_STAGE);
        dgngVar.at(27);
        final cjqp cjqpVarA = dgngVar.aE.a();
        eiju.g(dgngVar.A.f((dgngVar.ah() && dgngVar.ak() && dgngVar.aF.a().equals(cjxj.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED)) ? ewri.RCS_DEFAULT_ON_OOB_CONSENT : dgngVar.ak() ? ewri.LEGAL_FYI_SEEN : ewri.GOOGLE_TOS_UI)).h(new ejvr() { // from class: dgmh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.a.N(dgib.MSG_SET_CONSENT_API_SUCCESS, new dgjm(cjqpVarA, (String) obj));
                return null;
            }
        }, dgngVar.w).e(Exception.class, new ejvr() { // from class: dgmi
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cjqp cjqpVar = cjqpVarA;
                Exception exc = (Exception) obj;
                dgng dgngVar2 = this.a.a;
                dgngVar2.z.f(exc, "googleToSConsentApi.setConsent %s failed", cjqpVar);
                dgngVar2.N(dgib.MSG_SET_CONSENT_API_ERROR, exc);
                return null;
            }
        }, eoqg.a);
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_SET_GOOGLE_TOS_CONSENT;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE;
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
        dgngVar.F("SetGoogleToSConsentState", message);
        int iOrdinal = dgng.al(message).ordinal();
        if (iOrdinal == 8) {
            dgngVar.at(49);
            if (dfpi.P()) {
                dgngVar.T(dgngVar.am);
            } else {
                n();
            }
        } else {
            if (iOrdinal == 34) {
                dgngVar.ax(BasePaymentResult.ERROR_REQUEST_FAILED);
                if (ejxp.a(((dgjn) message.obj).b())) {
                    dgngVar.z.e("Token from setConsent API is empty", new Object[0]);
                    if (dfpi.P()) {
                        dgngVar.T(dgngVar.am);
                        return true;
                    }
                }
                n();
                return true;
            }
            if (iOrdinal != 35) {
                return super.q(message, dgibVar);
            }
            dgngVar.at(53);
            if (dgngVar.ai() && dgngVar.ah() && (message.obj instanceof dcff)) {
                dcff dcffVar = (dcff) message.obj;
                if (dcffVar != null && dcffVar.a.g == 34506) {
                    dgngVar.K();
                    dgngVar.J.ifPresent(new Consumer() { // from class: dgmj
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            ((dgie) obj).o(3, this.a.a.h);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            } else if (dfpi.P()) {
                dgngVar.T(dgngVar.am);
            } else {
                n();
            }
        }
        return true;
    }

    @Override // defpackage.dgmn
    public final Duration l() {
        return dgjo.i;
    }
}
