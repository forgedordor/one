package defpackage;

import android.os.Message;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dglr extends dgmn {
    final /* synthetic */ dgng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dglr(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    private final void n(final boolean z) {
        dgng dgngVar = this.a;
        dgsy dgsyVar = dgngVar.v;
        Optional optionalOf = Optional.of(dgngVar.h);
        if (dgsyVar.j(dgsyVar.e(optionalOf))) {
            return;
        }
        dgsyVar.r(new dgsx() { // from class: dgrx
            @Override // defpackage.dgsx
            public final void a(ewox ewoxVar) {
                ekgp ekgpVar = dgsy.a;
                ewpd ewpdVar = z ? ewpd.TRUE : ewpd.FALSE;
                ewoxVar.copyOnWrite();
                ewpg ewpgVar = (ewpg) ewoxVar.instance;
                ewpg ewpgVar2 = ewpg.a;
                ewpgVar.i = ewpdVar.d;
                ewpgVar.b |= 64;
            }
        }, dgsyVar.e(optionalOf));
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "ReadyState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        super.b();
        dgng dgngVar = this.a;
        dgngVar.A(ewps.READY_STAGE);
        if (dgngVar.g().Q()) {
            dgngVar.p.b(dgngVar.h);
            n(true);
            if (!((dflr) dgngVar.Z.b()).a() || !((dflt) dgngVar.ab.b()).a() || !dgngVar.g().u().isEmpty()) {
                p(dgngVar.ar, ewrp.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE);
                return;
            } else {
                p(dgngVar.aD, ewrp.RCS_PROVISIONING_REQUEST_ATTESTATION_STATE);
                dgngVar.M(dgib.MSG_MLS_SIGNUP_WITH_CONFIG_REFRESH);
                return;
            }
        }
        if (((dflk) dgngVar.R.b()).a()) {
            auvh.e(((cerz) dgngVar.S.b()).a().h(new ejvr() { // from class: dglq
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    Optional optional = (Optional) obj;
                    boolean zIsEmpty = optional.isEmpty();
                    dglr dglrVar = this.a;
                    if (zIsEmpty) {
                        dglrVar.a.z.e("GMSCoreIIDToken not found in Constellation Client.", new Object[0]);
                        return false;
                    }
                    dgng dgngVar2 = dglrVar.a;
                    dgngVar2.u.s((String) optional.get());
                    dgngVar2.z.d("GMSCoreIIDToken from C11n Client saved to bugle storage.", new Object[0]);
                    return true;
                }
            }, dgngVar.w));
        }
        cebq cebqVar = dgngVar.Y;
        String str = dgngVar.h;
        int iA = ettr.a(cebqVar.c(str).G);
        if (iA == 0) {
            iA = 1;
        }
        if ((((Boolean) dfpi.t().a.ap.a()).booleanValue() && iA == 6) || (!dfpi.z() ? ((Boolean) dfpi.t().a.v.a()).booleanValue() : !(iA != 4 && iA != 5))) {
            if (dgngVar.aj()) {
                dgngVar.z.a("UPI GC enabled, always try provisioning with UPI", new Object[0]);
            } else {
                dgrs dgrsVar = dgngVar.u;
                int iA2 = dgrsVar.a(str);
                dgngVar.z.a("UPI enabled, upiAttemptsCount = %d", Integer.valueOf(iA2));
                if (iA2 < 0 || iA2 >= dfpi.d()) {
                    dgrsVar.B(str, 0);
                } else {
                    dgrsVar.B(str, iA2 + 1);
                }
            }
            dgngVar.p.b(str);
            n(false);
            p(dgngVar.aj, ewrp.RCS_PROVISIONING_VERIFY_MSISDN_STATE);
            return;
        }
        n(false);
        cjty cjtyVarC = dgngVar.u.c(str);
        if ((1 & cjtyVarC.b) != 0 && !cjtyVarC.c.isEmpty() && (cjtyVarC.b & 8) != 0) {
            evvp evvpVar = cjtyVarC.f;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            if (TimeUnit.SECONDS.toMillis(evvpVar.b) + TimeUnit.MINUTES.toMillis(((Long) dfog.o().a.t.a()).longValue()) > dhkl.a().longValue()) {
                p(dgngVar.ap, ewrp.RCS_PROVISIONING_VERIFY_OTP_STATE);
                return;
            }
        }
        dgngVar.p.b(str);
        dgmn dgmnVarH = dgngVar.h();
        p(dgmnVarH, dgmnVarH.g());
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_READY;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_READY_STATE;
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
}
