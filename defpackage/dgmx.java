package defpackage;

import android.content.Context;
import android.os.Message;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgmx extends dgmn {
    final /* synthetic */ dgng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgmx(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "WaitingForGoogleTosState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        super.b();
        dgng dgngVar = this.a;
        dgngVar.A(ewps.GOOGLE_TOS_STAGE);
        if (dgngVar.u.H()) {
            dgngVar.M(dgib.MSG_GOOGLE_TOS_ACCEPTED);
            return;
        }
        Context context = dgngVar.m;
        dgngVar.n.y(context, 3, dgngVar.l, new dggp(dgngVar.h));
        dgngVar.at(6);
        dgngVar.K();
        dgic.c(context, 5, null);
        dgngVar.J.ifPresent(new Consumer() { // from class: dgmw
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

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_WAITING_FOR_GOOGLE_TOS;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_WAITING_FOR_GOOGLE_TOS_STATE;
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
        dgng dgngVar = this.a;
        dgngVar.F("WaitingForGoogleTosState", message);
        if (dgng.al(message).ordinal() != 16) {
            return super.q(message, dgibVar);
        }
        dgrs dgrsVar = dgngVar.u;
        Context context = dgngVar.m;
        if (!dgrsVar.H()) {
            dgngVar.K();
            dgic.c(context, 5, null);
            return true;
        }
        dgngVar.at(7);
        if (!dfpi.I()) {
            dgngVar.T(dgngVar.ah);
            return true;
        }
        if (!dgngVar.aE.d() && dfpi.C()) {
            dgngVar.w();
        }
        dgngVar.T(dgngVar.az);
        return true;
    }
}
