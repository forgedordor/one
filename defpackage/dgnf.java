package defpackage;

import android.os.Bundle;
import android.os.Message;
import com.google.android.ims.provisioning.config.ServerMessage;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgnf extends dgmn {
    final /* synthetic */ dgng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgnf(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    private final void n() {
        dgng dgngVar = this.a;
        dgrs dgrsVar = dgngVar.u;
        String str = dgngVar.h;
        dgiq dgiqVarF = dgrsVar.f(str);
        dgiqVarF.ae();
        dgrsVar.x(str, dgiqVarF);
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "WaitingForTermsAndConditionsState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        super.b();
        dgng dgngVar = this.a;
        dgngVar.A(ewps.TERMS_AND_CONDITIONS_STAGE);
        String str = dgngVar.l;
        String str2 = dgngVar.h;
        dgngVar.n.y(dgngVar.m, 5, str, new dggp(str2));
        dgrs dgrsVar = dgngVar.u;
        try {
            if (dgrsVar.b.k("configuration_terms_and_conditions_consent_".concat(String.valueOf(str2)), false, "RcsApplicationData")) {
                n();
                dgng dgngVar2 = this.a;
                dgngVar2.at(17);
                p(dgngVar2.at, ewrp.RCS_PROVISIONING_CONFIGURED_STATE);
                return;
            }
        } catch (dhhd e) {
            dhja.j(e, dgrs.a, "Error while retrieving consent for Configuration Terms and Conditions", new Object[0]);
            dgrsVar.K(4);
        }
        dgng dgngVar3 = this.a;
        cjyi cjyiVar = (cjyi) dgngVar3.O.b();
        String str3 = dgngVar3.h;
        int iK = cjyiVar.k(new dggp(str3)) - 2;
        if (iK == 1) {
            n();
            dgngVar3.at(17);
            p(dgngVar3.at, ewrp.RCS_PROVISIONING_CONFIGURED_STATE);
            return;
        }
        if (iK == 2) {
            if (dgngVar3.N) {
                fcsu fcsuVar = dgngVar3.M;
                ((cjzq) fcsuVar.b()).m(new dggp(str3), ckcc.PER_SIM_TOGGLE_STATE_DISABLED);
                ((cjzq) fcsuVar.b()).k();
            } else {
                ((cjzq) dgngVar3.M.b()).n(ckbz.TOGGLE_STATE_USER_DISABLED);
            }
            dgngVar3.M(dgib.MSG_T_AND_C_REJECTED);
            return;
        }
        dgiq dgiqVarG = dgngVar3.g();
        if (dgiqVarG.q() != null) {
            ServerMessage serverMessageQ = dgiqVarG.q();
            dfiq dfiqVar = (dfiq) dfir.a.createBuilder();
            String str4 = serverMessageQ.mMessage;
            dfiqVar.copyOnWrite();
            dfir dfirVar = (dfir) dfiqVar.instance;
            str4.getClass();
            dfirVar.b = 1 | dfirVar.b;
            dfirVar.c = str4;
            String strB = ejwk.b(serverMessageQ.mTitle);
            dfiqVar.copyOnWrite();
            dfir dfirVar2 = (dfir) dfiqVar.instance;
            dfirVar2.b = 2 | dfirVar2.b;
            dfirVar2.d = strB;
            boolean z = serverMessageQ.mHasAcceptButton;
            dfiqVar.copyOnWrite();
            dfir dfirVar3 = (dfir) dfiqVar.instance;
            dfirVar3.b = 4 | dfirVar3.b;
            dfirVar3.e = z;
            boolean z2 = serverMessageQ.mHasRejectButton;
            dfiqVar.copyOnWrite();
            dfir dfirVar4 = (dfir) dfiqVar.instance;
            dfirVar4.b |= 8;
            dfirVar4.f = z2;
            dfir dfirVar5 = (dfir) dfiqVar.build();
            Bundle bundle = new Bundle();
            bundle.putByteArray("com.google.android.ims.provisioning.enginge.provisioning_alert_server_message", dfirVar5.toByteArray());
            bundle.putString("com.google.android.ims.provisioning.sim.id.key", str3);
            dgngVar3.K();
            dgngVar3.at(16);
            dgic.c(dgngVar3.m, 9, bundle);
            dgngVar3.J.ifPresent(new Consumer() { // from class: dgne
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
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_WAITING_FOR_TOS;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_WAITING_FOR_TERMS_AND_CONDITIONS_STATE;
    }

    @Override // defpackage.dgmn
    public final boolean h() {
        return true;
    }

    @Override // defpackage.dgmn
    public final boolean j() {
        return false;
    }

    @Override // defpackage.dgop
    public final boolean k(Message message, dgib dgibVar) {
        dgng dgngVar = this.a;
        dgngVar.F("WaitingForTermsAndConditionsState", message);
        if (dgng.al(message).ordinal() != 18) {
            return super.q(message, dgibVar);
        }
        dgkj dgkjVar = dgngVar.s;
        String str = dgngVar.h;
        dgkjVar.c(str);
        dgngVar.at(37);
        dgngVar.E();
        dgngVar.z.d("T&Cs rejected. Invoke failure", new Object[0]);
        dgngVar.n.q(dgngVar.m, ewrp.RCS_PROVISIONING_WAITING_FOR_TERMS_AND_CONDITIONS_STATE, 10, dgngVar.l, new dggp(str));
        dgngVar.T(dgngVar.af);
        return true;
    }
}
