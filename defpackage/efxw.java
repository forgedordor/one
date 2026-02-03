package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.efxv;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efxw implements lun, efys {
    final /* synthetic */ efxv a;
    private boolean b = false;

    public efxw(efxv efxvVar) {
        this.a = efxvVar;
    }

    @Override // defpackage.lun
    public final void d(lvj lvjVar) {
        this.a.p();
    }

    @Override // defpackage.lun
    public final void fh(lvj lvjVar) {
        efxv efxvVar = this.a;
        efxvVar.j.c(this);
        efxy efxyVar = efxvVar.p.d;
        efxyVar.b = ejwi.j(Boolean.valueOf(efxyVar.c));
        efxyVar.a = null;
        efxyVar.d = 3;
    }

    @Override // defpackage.efys
    public final ListenableFuture g() {
        efxv efxvVar = this.a;
        efxv.a aVar = efxvVar.p;
        aVar.c = true;
        if (!aVar.b) {
            efyb efybVar = efxvVar.d;
            if (!efybVar.g() && !efybVar.f()) {
                return efxvVar.j();
            }
        }
        return eork.i(null);
    }

    @Override // defpackage.lun
    public final void gF(lvj lvjVar) {
        ekgb ekgbVar;
        efxv efxvVar = this.a;
        efxvVar.p = (efxv.a) new lxo(efxvVar.r).a(efxv.a.class);
        efxvVar.p.d.c = efxvVar.k;
        if (efxvVar.o == null) {
            efxvVar.o = egaq.d().a();
        }
        if (efyp.a(efxvVar.d.a()) && ((ekgbVar = ((egan) efxvVar.o).c) == null || !ekgbVar.isEmpty())) {
            ekgb ekgbVarA = efxvVar.i.a(((egan) efxvVar.o).c);
            IllegalStateException illegalStateException = new IllegalStateException("Requirement activity's AccountController should be set up with an empty list of account requirements. Did you forget to set the AccountController with Config.forRequirementActivity?".concat(ekgbVarA.isEmpty() ? "" : " Requirements: ".concat(String.valueOf(String.valueOf(ekgbVarA)))));
            if (!efxvVar.l) {
                throw illegalStateException;
            }
            ((ekrd) ((ekrd) ((ekrd) efxv.b.i()).g(illegalStateException)).h("com/google/apps/tiktok/account/api/controller/AccountControllerViewModelBacked$AccountControllerLifecycleObserver", "onCreate", (char) 1096, "AccountControllerViewModelBacked.java")).q("The requirement activity bit is set while the requirements are not overridden with an empty list. If the activity is not a requirement Activity, then it's likely the app is started by another malicious app which sets the requirement activity bit in the Intent");
        }
        if (efxvVar.p.d.a()) {
            efxvVar.p.a = efxv.c;
            efxvVar.q = efxvVar.h();
        }
        efxvVar.g.j(efxvVar.n);
        efxvVar.j.b(this);
    }

    @Override // defpackage.lun
    public final void gG(lvj lvjVar) {
        if (this.b) {
            this.a.p();
            return;
        }
        this.b = true;
        efxv efxvVar = this.a;
        if (efxvVar.p.d.a()) {
            ejwl.b(true ^ efxvVar.f.i(), "Should not have account before initial start.");
            efxvVar.q.getClass();
            efxs efxsVar = efxvVar.p.a;
            efxsVar.getClass();
            if (efxsVar.equals(efxv.c)) {
                efxvVar.o(((egan) efxvVar.o).b, efxvVar.q, 0);
            }
            efxvVar.q = null;
        } else {
            egac egacVar = efxvVar.f;
            efwo.b(egacVar.g());
            egacVar.o(egacVar.h());
            efxvVar.p();
        }
        if (efxvVar.p.d.b.g() && !((Boolean) efxvVar.p.d.b.c()).booleanValue() && efxvVar.k) {
            efxvVar.f.j();
        }
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void f(lvj lvjVar) {
    }
}
