package defpackage;

import android.content.Context;
import android.os.Message;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgnd extends dgmn {
    final /* synthetic */ dgng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgnd(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "WaitingForRcsDefaultOnState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        super.b();
        dgng dgngVar = this.a;
        dgngVar.A(ewps.RCS_DEFAULT_ON_STAGE);
        dgjq dgjqVar = dgngVar.aF;
        cjxj cjxjVarA = dgjqVar.a();
        cjxj cjxjVar = cjxj.LEGAL_FYI_SEEN;
        if (cjxjVarA.equals(cjxjVar)) {
            p(dgngVar.az, ewrp.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE);
            return;
        }
        Context context = dgngVar.m;
        if (!dhla.d(context)) {
            dgngVar.n.y(context, 6, dgngVar.l, new dggp(dgngVar.h));
            dgngVar.at(59);
            dgic.c(context, 24, null);
            if (dgngVar.ai() && dgjqVar.a().equals(cjxj.RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED)) {
                dgngVar.at(62);
                p(dgngVar.az, ewrp.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE);
                return;
            } else {
                dgngVar.K();
                dgngVar.J.ifPresent(new Consumer() { // from class: dgnc
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ((dgie) obj).o(3, this.a.a.h);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
        }
        dgngVar.z.d("Skipping legal FYI for Wear device", new Object[0]);
        dgrs dgrsVar = dgngVar.u;
        cjxm cjxmVar = (cjxm) dgrsVar.e().toBuilder();
        cjxmVar.copyOnWrite();
        ((cjxn) cjxmVar.instance).h = cjxjVar.a();
        evvp evvpVarB = evwz.b(dgngVar.K.f());
        cjxmVar.copyOnWrite();
        cjxn cjxnVar = (cjxn) cjxmVar.instance;
        evvpVarB.getClass();
        cjxnVar.f = evvpVarB;
        cjxnVar.b |= 1;
        dgrsVar.z((cjxn) cjxmVar.build());
        p(dgngVar.az, ewrp.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE);
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_WAITING_FOR_RCS_DEFAULT_ON;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_WAITING_FOR_RCS_DEFAULT_ON_STATE;
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
        return false;
    }

    @Override // defpackage.dgop
    public final boolean k(Message message, dgib dgibVar) {
        return super.q(message, dgibVar);
    }
}
