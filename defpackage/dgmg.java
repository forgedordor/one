package defpackage;

import android.os.Message;
import com.google.android.apps.messaging.shared.rcsprovisioning.RcsProvisioningListenableWorker;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgmg extends dgmn {
    final /* synthetic */ dgng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgmg(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    /* JADX WARN: Type inference failed for: r9v9, types: [dgie, java.lang.Object] */
    private final void n(long j) {
        dgng dgngVar = this.a;
        fcsu fcsuVar = dgngVar.L;
        dgsz dgszVar = (dgsz) fcsuVar.b();
        String str = dgngVar.h;
        dgngVar.z.d("scheduleRetry, currentRetry = %s, retryMillis = %s", Long.valueOf(dgszVar.c(str)), Long.valueOf(j));
        ((dgsz) fcsuVar.b()).w(str, j + System.currentTimeMillis());
        if (dgngVar.J.isPresent()) {
            ((dgsz) fcsuVar.b()).r(str);
            ((dgsz) fcsuVar.b()).w(str, 0L);
            o();
            dgngVar.J.get().o(4, str);
        }
    }

    private final void o() {
        dgng dgngVar = this.a;
        dgngVar.A(ewps.RETRY_STAGE);
        dgsy dgsyVar = dgngVar.v;
        Optional optionalOf = Optional.of(dgngVar.h);
        if (!dgsyVar.j(dgsyVar.e(optionalOf))) {
            dgsyVar.r(new dgsx() { // from class: dgsk
                @Override // defpackage.dgsx
                public final void a(ewox ewoxVar) {
                    ekgp ekgpVar = dgsy.a;
                    ewoxVar.copyOnWrite();
                    ewpg ewpgVar = (ewpg) ewoxVar.instance;
                    ewpg ewpgVar2 = ewpg.a;
                    ewpgVar.b |= 32768;
                    ewpgVar.s = -1L;
                }
            }, dgsyVar.e(optionalOf));
        }
        dgngVar.aq(5);
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "RetryState";
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [j$.time.temporal.Temporal, java.lang.Object] */
    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        super.b();
        dgng dgngVar = this.a;
        fcsu fcsuVar = dgngVar.L;
        dgsz dgszVar = (dgsz) fcsuVar.b();
        String str = dgngVar.h;
        dgszVar.n(str);
        if (((Boolean) dgng.d.a()).booleanValue()) {
            Optional optionalH = ((dgsz) fcsuVar.b()).h(str);
            ((dgsz) fcsuVar.b()).o(str);
            if (optionalH.isPresent() && dgngVar.J.isPresent()) {
                Duration durationBetween = Duration.between(dgngVar.K.f(), optionalH.get());
                Duration duration = dgng.f;
                if (durationBetween.compareTo(duration) > 0) {
                    durationBetween = duration;
                }
                if (durationBetween.isNegative()) {
                    durationBetween = Duration.ZERO;
                }
                RcsProvisioningListenableWorker rcsProvisioningListenableWorker = (RcsProvisioningListenableWorker) dgngVar.J.get();
                rcsProvisioningListenableWorker.m("Provisioning Engine entered RetryState, provisioning task will be rescheduled in %s", durationBetween);
                rcsProvisioningListenableWorker.u = 7;
                rcsProvisioningListenableWorker.g.m(str, durationBetween, 3, enxe.STATE_MACHINE_RETRY);
                rcsProvisioningListenableWorker.i = new qao();
                rcsProvisioningListenableWorker.l();
                o();
                return;
            }
        }
        long jC = ((dgsz) fcsuVar.b()).c(str);
        dgngVar.z.d("nextRetry = %s", Long.valueOf(jC));
        if (jC != 0) {
            n(jC - System.currentTimeMillis());
            return;
        }
        long jE = dgngVar.e();
        long jD = dgngVar.d();
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(jE) - Long.numberOfLeadingZeros(jD);
        int iB = ((dgsz) fcsuVar.b()).b(str);
        long j = iNumberOfLeadingZeros > iB ? jE << iB : jD;
        dgngVar.z.a("getRetryDelayFromRetryCount, minDelayMs = %s, maxDelayMs = %s, maxShiftCount = %s, retryCount = %s, backoffDelay = %s", Long.valueOf(jE), Long.valueOf(jD), Integer.valueOf(iNumberOfLeadingZeros), Integer.valueOf(iB), Long.valueOf(j));
        n(j);
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_RETRY;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_RETRY_STATE;
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
        this.a.F("RetryState", message);
        if (dgng.al(message).ordinal() != 10) {
            return super.q(message, dgibVar);
        }
        n(((Integer) message.obj).intValue() * 1000);
        return true;
    }
}
