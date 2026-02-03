package defpackage;

import android.content.Context;
import android.os.Message;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dglb extends dgmn {
    final /* synthetic */ dgng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dglb(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    private final void n() {
        ewrp ewrpVar = ewrp.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE;
        dgng dgngVar = this.a;
        dgngVar.n.a(dgngVar.m, ewrpVar, dgngVar.l, new dggp(dgngVar.h), ewrg.CONSENT_ALREADY_GRANTED);
        dgngVar.B();
    }

    private final void o(int i) {
        dgng dgngVar = this.a;
        if (dgngVar.g().ac()) {
            r(dgngVar.ah, ewrp.RCS_PROVISIONING_READY_STATE, i);
        } else {
            dgngVar.z.d("Configuration is still valid", new Object[0]);
            r(dgngVar.at, ewrp.RCS_PROVISIONING_CONFIGURED_STATE, i);
        }
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "CheckPreconditionsState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        super.b();
        ewrp ewrpVar = ewrp.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE;
        dgng dgngVar = this.a;
        String strValueOf = String.valueOf(dgngVar.Y());
        String str = dgngVar.l;
        String str2 = dgngVar.h;
        dggp dggpVar = new dggp(str2);
        deyo deyoVar = dgngVar.n;
        Context context = dgngVar.m;
        deyoVar.t(context, ewrpVar, 2, strValueOf, str, dggpVar);
        if (dgngVar.ak()) {
            dgke dgkeVar = dgngVar.z;
            dgrs dgrsVar = dgngVar.u;
            Boolean boolValueOf = Boolean.valueOf(dgngVar.aE.d());
            Boolean boolValueOf2 = Boolean.valueOf(dgrsVar.H());
            dgjq dgjqVar = dgngVar.aF;
            dgkeVar.d("provisioningEngineDataRetriever = %s, googleToSConsentCache.hasClientConsent() = %s, provisioningEngineDataRetriever.getGoogleTosConsent = %s rcsDefaultOnConsentCache.hasClientConsent = %s", dgrsVar, boolValueOf, boolValueOf2, Boolean.valueOf(dgjqVar.e()));
            dgngVar.S(ewps.RCS_DEFAULT_ON_STAGE);
            dgngVar.at(35);
            dgngVar.at(61);
            if (((dflk) dgngVar.R.b()).a() && dgngVar.aj()) {
                if (!dgngVar.Y.c(str2).v) {
                    p(dgngVar.ah, ewrp.RCS_PROVISIONING_READY_STATE);
                    return;
                } else {
                    dgngVar.aa.isPresent();
                    p(dgngVar.aC, ewrp.RCS_PROVISIONING_WAITING_FOR_APP_OPEN_STATE);
                    return;
                }
            }
            if (!dgjqVar.e()) {
                p(dgngVar.aB, ewrp.RCS_PROVISIONING_WAITING_FOR_RCS_DEFAULT_ON_STATE);
                return;
            }
            deyoVar.a(context, ewrpVar, dgngVar.l, new dggp(str2), ewrg.RCS_DEFAULT_ON_ALREADY_SEEN);
            dgngVar.B();
            if (dfpi.I()) {
                cjxn cjxnVarE = dgjqVar.a.e();
                if ((cjxnVarE.b & 2) != 0) {
                    evvp evvpVar = cjxnVarE.g;
                    if (evvpVar == null) {
                        evvpVar = evvp.a;
                    }
                    evvp evvpVar2 = cjxnVarE.f;
                    if (evvpVar2 == null) {
                        evvpVar2 = evvp.a;
                    }
                    evvp evvpVar3 = evxc.a;
                    if (evxb.a(evvpVar, evvpVar2) > 0) {
                        if (dgrsVar.g().isEmpty()) {
                            p(dgngVar.aA, ewrp.RCS_PROVISIONING_GET_GOOGLE_TOS_CONSENT_STATE);
                            return;
                        }
                    }
                }
                p(dgngVar.az, ewrp.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE);
                return;
            }
            o(1);
            return;
        }
        if (dgngVar.Y()) {
            dgngVar.S(ewps.GOOGLE_TOS_STAGE);
            dgngVar.at(35);
            dgngVar.at(3);
            if (dfpi.N() || dfpi.I()) {
                dgke dgkeVar2 = dgngVar.z;
                dgrs dgrsVar2 = dgngVar.u;
                dgjp dgjpVar = dgngVar.aE;
                dgkeVar2.d("provisioningEngineDataRetriever = %s, googleToSConsentCache.hasClientConsent() = %s, provisioningEngineDataRetriever.getGoogleTosConsent = %s", dgrsVar2, Boolean.valueOf(dgjpVar.d()), Boolean.valueOf(dgrsVar2.H()));
                if (!dgjpVar.d() && !dgrsVar2.H()) {
                    p(this.a.av, ewrp.RCS_PROVISIONING_WAITING_FOR_GOOGLE_TOS_STATE);
                    return;
                }
                if (dgjpVar.d()) {
                    Optional optionalL = dgjpVar.a.l();
                    if (!optionalL.isPresent() || (((cjxn) optionalL.get()).b & 2) == 0) {
                        n();
                        p(dgngVar.az, ewrp.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE);
                        return;
                    }
                }
                if (dgrsVar2.H() && !dgjpVar.d() && dfpi.C()) {
                    if (dgrsVar2.H()) {
                        try {
                            if (!dgrsVar2.b.k("did_show_google_tos_prompt", false, "bugle")) {
                                dgng dgngVar2 = this.a;
                                dgngVar2.z.d("Restoring Google Tos Consent from Backup", new Object[0]);
                                dgngVar2.at(58);
                            }
                        } catch (dhhd unused) {
                            dhja.h(dgrs.a, "Error while retrieving did show Google Tos prompt from Bugle Storage. Returning default value: %s", true);
                        }
                    }
                    n();
                    dgng dgngVar3 = this.a;
                    dgngVar3.w();
                    p(dgngVar3.az, ewrp.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE);
                    return;
                }
                if (dfpi.I()) {
                    n();
                    if (dgrsVar2.g().isEmpty() || !dfpi.X()) {
                        p(dgngVar.aA, ewrp.RCS_PROVISIONING_GET_GOOGLE_TOS_CONSENT_STATE);
                        return;
                    }
                }
            } else {
                dgng dgngVar4 = this.a;
                if (!dgngVar4.u.H()) {
                    p(dgngVar4.av, ewrp.RCS_PROVISIONING_WAITING_FOR_GOOGLE_TOS_STATE);
                    return;
                }
                dgngVar4.at(5);
                deyo deyoVar2 = dgngVar4.n;
                ewrp ewrpVar2 = ewrp.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE;
                String str3 = dgngVar4.l;
                dggp dggpVar2 = new dggp(dgngVar4.h);
                ewrg[] ewrgVarArr = new ewrg[1];
                ewrg ewrgVar = dgngVar4.Y() ? ewrg.CONSENT_ALREADY_GRANTED : ewrg.GOOGLE_TOS_DISABLED;
                Context context2 = dgngVar4.m;
                ewrgVarArr[0] = ewrgVar;
                deyoVar2.a(context2, ewrpVar2, str3, dggpVar2, ewrgVarArr);
                dgngVar4.B();
            }
        }
        o(1);
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_CHECK_PRECONDITIONS;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE;
    }

    @Override // defpackage.dgmn
    public final boolean h() {
        return false;
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
        this.a.F("CheckPreconditionsState", message);
        int iOrdinal = dgng.al(message).ordinal();
        if (iOrdinal != 38 && iOrdinal != 39) {
            return super.q(message, dgibVar);
        }
        o(2);
        return true;
    }
}
