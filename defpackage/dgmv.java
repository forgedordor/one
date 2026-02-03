package defpackage;

import android.os.Message;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgmv extends dgmn {
    final /* synthetic */ dgng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgmv(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "WaitingForAppOpenState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        super.b();
        dgng dgngVar = this.a;
        Optional optional = dgngVar.aa;
        if (optional.isEmpty()) {
            p(dgngVar.ag, ewrp.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE);
            return;
        }
        dgngVar.A(ewps.WAITING_FOR_APP_OPEN_STAGE);
        aiul aiulVar = (aiul) optional.get();
        final eiju eijuVarA = aiulVar.a();
        final eiju eijuVarJ = aiulVar.j(3);
        eijw eijwVarM = eijx.m(eijuVarA, eijuVarJ);
        Callable callable = new Callable() { // from class: aiug
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = aiul.d;
                boolean z = true;
                if (((Instant) eork.q(eijuVarA)).equals(Instant.EPOCH) && ((Instant) eork.q(eijuVarJ)).equals(Instant.EPOCH)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        };
        eoqg eoqgVar = eoqg.a;
        auvh.h(eijwVarM.a(callable, eoqgVar).h(new ejvr() { // from class: dgmu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                final dgmv dgmvVar = this.a;
                if (zBooleanValue) {
                    dgmvVar.p(dgmvVar.a.ah, ewrp.RCS_PROVISIONING_READY_STATE);
                    return null;
                }
                dgmvVar.a.J.ifPresent(new Consumer() { // from class: dgmt
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        ((dgie) obj2).o(3, dgmvVar.a.h);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return null;
            }
        }, eoqgVar));
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_WAITING_FOR_APP_OPEN;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_WAITING_FOR_APP_OPEN_STATE;
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
        return super.q(message, dgibVar);
    }
}
