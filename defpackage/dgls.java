package defpackage;

import android.os.Message;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.rcsprovisioning.RcsProvisioningListenableWorker;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgls extends dgmn {
    String a;
    final /* synthetic */ dgng b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgls(dgng dgngVar) {
        super(dgngVar);
        this.b = dgngVar;
    }

    private final void n(long j) {
        dgng dgngVar = this.b;
        if (dgngVar.J.isPresent()) {
            dgsz dgszVar = (dgsz) dgngVar.L.b();
            String str = dgngVar.h;
            dgszVar.E(str, true);
            long j2 = j / 1000;
            RcsProvisioningListenableWorker rcsProvisioningListenableWorker = (RcsProvisioningListenableWorker) dgngVar.J.get();
            rcsProvisioningListenableWorker.m("Provisioning Engine entered ReplayRequestState, request will be re-attempted in %s", Long.valueOf(j2));
            rcsProvisioningListenableWorker.u = 10;
            rcsProvisioningListenableWorker.g.m(str, Duration.ofSeconds(j2), 3, enxe.STATE_MACHINE_REPLAY);
            rcsProvisioningListenableWorker.i = new qao();
            rcsProvisioningListenableWorker.l();
        }
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "ReplayRequestState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        dgmn dgmnVar;
        dgng dgngVar = this.b;
        fcsu fcsuVar = dgngVar.L;
        dgsz dgszVar = (dgsz) fcsuVar.b();
        String str = dgngVar.h;
        this.a = dgszVar.l(str);
        super.b();
        int i = 0;
        if (((dgsz) fcsuVar.b()).K(str)) {
            ((dgsz) fcsuVar.b()).E(str, false);
            ((dgsz) fcsuVar.b()).q(str);
            dgmn dgmnVar2 = dgngVar.ae;
            if (dgngVar.f().d()) {
                dgngVar.z.d("Cannot replay request. RCS is disabled.", new Object[0]);
                dgmnVar2 = dgngVar.af;
            } else if (!TextUtils.isEmpty(this.a) && (dgmnVar = (dgmn) dgngVar.g.get(this.a)) != null && (dgmnVar.y() || dgmnVar.i())) {
                dgmnVar2 = dgmnVar;
            }
            p(dgmnVar2, dgmnVar2.g());
            return;
        }
        if (((dgsz) fcsuVar.b()).a(str) >= ((Long) dfpi.t().a.b.a()).longValue()) {
            dgngVar.as(ewrp.RCS_PROVISIONING_REPLAY_REQUEST_STATE, 6);
            p(dgngVar.am, ewrp.RCS_PROVISIONING_RETRY_STATE);
            return;
        }
        dgom dgomVar = dgngVar.Q;
        dgib dgibVar = dgib.MSG_RETRY_AFTER;
        if (dgomVar.p()) {
            dgibVar.getClass();
            Iterator it = dgomVar.h.iterator();
            it.getClass();
            while (it.hasNext()) {
                if (fdbq.f(((fcti) it.next()).a, dgibVar)) {
                    return;
                }
            }
        } else {
            dfnb dfnbVar = dgngVar.P;
            int iA = dgibVar.a();
            dfnn dfnnVar = dfnbVar.b;
            if (dfnnVar != null) {
                ArrayList arrayList = dfnnVar.l;
                int size = arrayList.size();
                while (i < size) {
                    int i2 = ((Message) arrayList.get(i)).what;
                    i++;
                    if (i2 == iA) {
                        return;
                    }
                }
            }
        }
        long jE = dgngVar.e();
        long jD = dgngVar.d();
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(jE) - Long.numberOfLeadingZeros(jD);
        int iA2 = ((dgsz) fcsuVar.b()).a(str);
        if (iNumberOfLeadingZeros > iA2) {
            jD = jE << iA2;
        }
        n(jD);
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_REPLAY_REQUEST;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_REPLAY_REQUEST_STATE;
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
        this.b.F("ReplayRequestState", message);
        if (dgng.al(message).ordinal() != 10) {
            return super.q(message, dgibVar);
        }
        n(((Integer) message.obj).intValue() * 1000);
        return true;
    }
}
