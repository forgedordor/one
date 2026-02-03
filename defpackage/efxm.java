package defpackage;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efxm implements lun, efys {
    final /* synthetic */ efxj a;
    private boolean b;
    private boolean c = false;
    private Bundle d;

    public efxm(efxj efxjVar) {
        this.a = efxjVar;
    }

    @Override // defpackage.lun
    public final void d(lvj lvjVar) {
        this.a.p();
    }

    @Override // defpackage.lun
    public final void fh(lvj lvjVar) {
        this.a.j.c(this);
    }

    @Override // defpackage.efys
    public final ListenableFuture g() {
        efxj efxjVar = this.a;
        efxjVar.r = true;
        if (!efxjVar.q) {
            efxn efxnVar = efxjVar.d;
            if (!efxnVar.h() && !efxnVar.g()) {
                return efxjVar.j();
            }
        }
        return eork.i(null);
    }

    @Override // defpackage.lun
    public final void gF(lvj lvjVar) {
        ekgb ekgbVar;
        efxj efxjVar = this.a;
        if (efxjVar.o == null) {
            efxjVar.o = egaq.d().a();
        }
        if (efyp.a(efxjVar.d.a()) && ((ekgbVar = ((egan) efxjVar.o).c) == null || !ekgbVar.isEmpty())) {
            ekgb ekgbVarA = efxjVar.i.a(((egan) efxjVar.o).c);
            IllegalStateException illegalStateException = new IllegalStateException("Requirement activity's AccountController should be set up with an empty list of account requirements. Did you forget to set the AccountController with Config.forRequirementActivity?".concat(ekgbVarA.isEmpty() ? "" : " Requirements: ".concat(String.valueOf(String.valueOf(ekgbVarA)))));
            if (!efxjVar.l) {
                throw illegalStateException;
            }
            ((ekrd) ((ekrd) ((ekrd) efxj.b.i()).g(illegalStateException)).h("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$AccountControllerLifecycleObserver", "onCreate", (char) 1108, "AccountControllerImpl.java")).q("The requirement activity bit is set while the requirements are not overridden with an empty list. If the activity is not a requirement Activity, then it's likely the app is started by another malicious app which sets the requirement activity bit in the Intent");
        }
        ehnu ehnuVar = efxjVar.t;
        Bundle bundleA = ehnuVar.U().d() ? ehnuVar.U().a("tiktok_account_controller_saved_instance_state") : null;
        this.d = bundleA;
        boolean z = true;
        if (bundleA != null && (efxjVar.k || !bundleA.getBoolean("tiktok_accounts_disabled"))) {
            z = false;
        }
        this.b = z;
        if (z) {
            efxjVar.p = efxj.c;
            efxjVar.s = efxjVar.h();
        } else {
            Bundle bundle = this.d;
            efxs efxsVar = efxs.a;
            evrr evrrVar = evrr.a;
            evuq evuqVar = evuq.a;
            efxjVar.p = (efxs) ProtoParsers.f(bundle, "state_latest_operation", efxsVar, evrr.a);
            efxjVar.q = this.d.getBoolean("state_pending_op");
        }
        efxjVar.g.j(efxjVar.n);
        efxjVar.j.b(this);
    }

    @Override // defpackage.lun
    public final void gG(lvj lvjVar) {
        if (this.c) {
            this.a.p();
            return;
        }
        this.c = true;
        if (this.b) {
            efxj efxjVar = this.a;
            ejwl.b(true ^ efxjVar.f.i(), "Should not have account before initial start.");
            efxjVar.s.getClass();
            efxs efxsVar = efxjVar.p;
            efxsVar.getClass();
            if (efxsVar.equals(efxj.c)) {
                efxjVar.o(((egan) efxjVar.o).b, efxjVar.s, 0);
            }
            efxjVar.s = null;
        } else {
            efxj efxjVar2 = this.a;
            egac egacVar = efxjVar2.f;
            efwo.b(egacVar.g());
            egacVar.o(egacVar.h());
            efxjVar2.r = this.d.getBoolean("state_do_not_revalidate");
            efxjVar2.p();
        }
        Bundle bundle = this.d;
        if (bundle != null) {
            efxj efxjVar3 = this.a;
            if (efxjVar3.k && !bundle.getBoolean("tiktok_accounts_disabled")) {
                efxjVar3.f.j();
            }
        }
        this.d = null;
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void f(lvj lvjVar) {
    }
}
