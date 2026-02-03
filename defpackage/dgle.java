package defpackage;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgle extends dgmn {
    final /* synthetic */ dgng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgle(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "ConfiguredState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        dgng dgngVar = this.a;
        fcsu fcsuVar = dgngVar.L;
        dgsz dgszVar = (dgsz) fcsuVar.b();
        String str = dgngVar.h;
        String strL = dgszVar.l(str);
        super.b();
        ((dgsz) fcsuVar.b()).p(str);
        ((dgsz) fcsuVar.b()).n(str);
        dgid dgidVarF = dgngVar.f();
        if (dgidVarF.d()) {
            dgngVar.z.d("RCS disabled in ConfiguredState: ".concat(dgidVarF.a()), new Object[0]);
            dgngVar.at(47);
            p(dgngVar.af, ewrp.RCS_PROVISIONING_DISABLED_STATE);
            return;
        }
        dgiq dgiqVarG = dgngVar.g();
        dgsy dgsyVar = dgngVar.v;
        dgsyVar.k(ewps.CONFIGURED_STAGE, dgngVar.l, true, str);
        if (dgiqVarG != null) {
            final int iH = dgkj.h(dgiqVarG);
            final int iE = dgiqVarG.e();
            final int iD = dgiqVarG.d();
            Optional optionalOf = Optional.of(str);
            if (!dgsyVar.j(dgsyVar.e(optionalOf))) {
                dgsyVar.r(new dgsx() { // from class: dgrv
                    @Override // defpackage.dgsx
                    public final void a(ewox ewoxVar) {
                        ekgp ekgpVar = dgsy.a;
                        ewoxVar.copyOnWrite();
                        ewpg ewpgVar = (ewpg) ewoxVar.instance;
                        ewpg ewpgVar2 = ewpg.a;
                        ewpgVar.p = iH - 1;
                        ewpgVar.b |= 4096;
                        ewoxVar.copyOnWrite();
                        ewpg ewpgVar3 = (ewpg) ewoxVar.instance;
                        ewpgVar3.b |= 8192;
                        ewpgVar3.q = iE;
                        ewoxVar.copyOnWrite();
                        ewpg ewpgVar4 = (ewpg) ewoxVar.instance;
                        ewpgVar4.b |= 16384;
                        ewpgVar4.r = iD;
                    }
                }, dgsyVar.e(optionalOf));
            }
        }
        deyo deyoVar = dgngVar.n;
        Context context = dgngVar.m;
        ewrp ewrpVar = ewrp.RCS_PROVISIONING_CONFIGURED_STATE;
        deyoVar.p(context, ewrpVar, dgkj.h(dgiqVarG), dgiqVarG.d(), dgngVar.l, new dggp(str));
        if (dgiqVarG.T()) {
            dgngVar.s.b(dgiqVarG, str);
            dgngVar.at(31);
            dgngVar.z.d("Successfully provisioned. Invoke success", new Object[0]);
            deyoVar.q(context, ewrpVar, 9, dgngVar.l, new dggp(str));
            final dhdq dhdqVar = new dhdq();
            dhdqVar.a = 30050;
            if (((Boolean) dfnr.a().b.b.a()).booleanValue()) {
                String strB = dgiqVarG.B();
                if (!TextUtils.isEmpty(strB)) {
                    String str2 = dgiqVarG.n().mPublicIdentity;
                    if (!TextUtils.isEmpty(str2)) {
                        dhdqVar.c = strB;
                        dhdqVar.b = dhjv.k(str2, dgngVar.x);
                        dhdqVar.d = dgngVar.r.e();
                    }
                }
            }
            dhdqVar.e = dgiqVarG.i().chatbotDirectoryUrl;
            dgngVar.o.ifPresent(new Consumer() { // from class: dglc
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((dfdv) obj).a(dhdqVar.a(), dhjl.PROVISIONING_ENGINE_STATE_MACHINE);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            dgngVar.J.ifPresent(new Consumer() { // from class: dgld
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((dgie) obj).o(1, this.a.a.h);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (dgngVar.n().booleanValue()) {
                ckje.a(context, 2, dgngVar.i);
            }
            dgvf.b();
            dgvf.a(context, 4);
        } else {
            if (!((dfmo) dgngVar.V.b()).a() && ((dflo) dgngVar.T.b()).a() && dgngVar.ac() && !dgiqVarG.S() && dgiqVarG.e() == 0 && !dhla.d(context)) {
                ((ckkr) dgngVar.U.b()).a(str);
            }
            dgngVar.z.d("Provisioned with disabled config (version <= 0). Invoke failure", new Object[0]);
            deyoVar.q(context, ewrpVar, 10, dgngVar.l, new dggp(str));
            dgngVar.E();
            if (dgngVar.n().booleanValue()) {
                ckje.a(context, 6, dgngVar.i);
            }
            dgvf.b();
            dgvf.a(context, 2);
        }
        if (strL == null) {
            Optional optionalJ = dgngVar.u.j(str);
            if (optionalJ.isPresent() && ((dgiq) optionalJ.get()).Y()) {
                dgngVar.z.d("trigger MSG_REFRESH_CONFIG by Configuration resetClient", new Object[0]);
                dgngVar.M(dgib.MSG_REFRESH_CONFIG);
            }
        }
        dgngVar.aq(true != dgiqVarG.T() ? 10 : 3);
        ((dgsz) fcsuVar.b()).M(str);
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_CONFIGURED;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_CONFIGURED_STATE;
    }

    @Override // defpackage.dgmn
    public final boolean h() {
        return true;
    }

    @Override // defpackage.dgmn
    public final boolean i() {
        dgng dgngVar = this.a;
        dgiq dgiqVarG = dgngVar.g();
        if (!dgiqVarG.ab()) {
            return false;
        }
        dgngVar.n.p(dgngVar.m, ewrp.RCS_PROVISIONING_CONFIGURED_STATE, dgkj.h(dgiqVarG), dgiqVarG.d(), dgngVar.l, new dggp(dgngVar.h));
        dgngVar.Q(this);
        return true;
    }

    @Override // defpackage.dgmn
    public final boolean j() {
        return false;
    }

    @Override // defpackage.dgop
    public final boolean k(Message message, dgib dgibVar) {
        dgng dgngVar = this.a;
        dgngVar.F("ConfiguredState", message);
        if (dgng.al(message).ordinal() != 11) {
            return super.q(message, dgibVar);
        }
        dgngVar.ap();
        dgngVar.S(ewps.CONFIGURED_STAGE);
        dgngVar.at(48);
        dgngVar.T(dgngVar.ae);
        return true;
    }
}
