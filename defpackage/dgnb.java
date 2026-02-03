package defpackage;

import android.content.Context;
import android.os.Message;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgnb extends dgmn {
    final /* synthetic */ dgng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgnb(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "WaitingForOtpState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        super.b();
        dgng dgngVar = this.a;
        dgngVar.A(ewps.WAITING_FOR_OTP_STAGE);
        fcsu fcsuVar = dgngVar.L;
        dgsz dgszVar = (dgsz) fcsuVar.b();
        String str = dgngVar.h;
        long jD = dgszVar.d(str);
        if (jD != -1 && jD < dhkl.a().longValue()) {
            p(dgngVar.am, ewrp.RCS_PROVISIONING_RETRY_STATE);
            return;
        }
        long jLongValue = ((Long) dfog.o().a.Z.a()).longValue();
        ((dgsz) fcsuVar.b()).y(str, dhkl.a().longValue() + jLongValue);
        dgngVar.P(dgib.MSG_OTP_TIMEOUT, jLongValue);
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void c() {
        super.c();
        dgng dgngVar = this.a;
        ((dgsz) dgngVar.L.b()).y(dgngVar.h, -1L);
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_WAITING_FOR_OTP;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_WAITING_FOR_OTP_STATE;
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
        final dgng dgngVar = this.a;
        dgngVar.F("WaitingForOtpState", message);
        dgngVar.I();
        int iOrdinal = dgng.al(message).ordinal();
        if (iOrdinal == 7) {
            dgngVar.at(29);
            ((dgsz) dgngVar.L.b()).x(dgngVar.h, dgng.q(message));
            if (dgngVar.Q.p()) {
                dgngVar.y(dgib.MSG_VERIFY_OTP, message.obj);
                dgngVar.T(dgngVar.ap);
            } else {
                dgngVar.N(dgib.MSG_VERIFY_OTP, message.obj);
                dgngVar.T(dgngVar.ap);
            }
            return true;
        }
        if (iOrdinal != 27) {
            return super.q(message, dgibVar);
        }
        dgngVar.at(30);
        String strO = dgngVar.o();
        deyo deyoVar = dgngVar.n;
        Context context = dgngVar.m;
        deyoVar.u(context, new Supplier() { // from class: dgks
            @Override // java.util.function.Supplier
            public final Object get() {
                return dgngVar.l();
            }
        }, strO, 2, 0, dgngVar.l);
        dgngVar.z.e("Timed out waiting for OTP SMS", new Object[0]);
        ewrp ewrpVar = ewrp.RCS_PROVISIONING_WAITING_FOR_OTP_STATE;
        String str = dgngVar.l;
        String str2 = dgngVar.h;
        deyoVar.m(context, ewrpVar, str, new dggp(str2));
        dgngVar.as(ewrpVar, 5);
        if (dgngVar.V()) {
            dgngVar.E.b(str2, ewpa.SIM, dgngVar.l, cjtq.OTP_TIMEOUT);
        }
        dgngVar.T(dgngVar.am);
        return true;
    }
}
