package defpackage;

import android.content.Context;
import android.os.Message;
import j$.util.Optional;
import java.net.MalformedURLException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dglp extends dgmn {
    final /* synthetic */ dgng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dglp(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    private final void n(dgiq dgiqVar) {
        boolean zBooleanValue;
        String strS;
        if (dfpi.z()) {
            dgng dgngVar = this.a;
            zBooleanValue = dgngVar.Y.c(dgngVar.h).L;
        } else {
            zBooleanValue = ((Boolean) dfaq.E().o().a()).booleanValue();
        }
        try {
            strS = this.a.s();
        } catch (MalformedURLException e) {
            this.a.z.f(e, "failed to get ACS URL for ProvisioningSuccessData", new Object[0]);
            strS = "";
            zBooleanValue = false;
        }
        cjtz cjtzVar = (cjtz) cjua.a.createBuilder();
        cjtzVar.copyOnWrite();
        cjua cjuaVar = (cjua) cjtzVar.instance;
        cjuaVar.b |= 1;
        cjuaVar.c = zBooleanValue;
        cjtzVar.copyOnWrite();
        cjua cjuaVar2 = (cjua) cjtzVar.instance;
        strS.getClass();
        cjuaVar2.b |= 2;
        cjuaVar2.d = strS;
        dgng dgngVar2 = this.a;
        cjtzVar.copyOnWrite();
        cjua cjuaVar3 = (cjua) cjtzVar.instance;
        String str = dgngVar2.j;
        str.getClass();
        cjuaVar3.b |= 4;
        cjuaVar3.e = str;
        cjtzVar.copyOnWrite();
        cjua cjuaVar4 = (cjua) cjtzVar.instance;
        String str2 = dgngVar2.h;
        str2.getClass();
        cjuaVar4.b |= 8;
        cjuaVar4.f = str2;
        cjua cjuaVar5 = (cjua) cjtzVar.build();
        try {
            dgngVar2.u.b.o(dhhc.g("provisioning_success_data_for_sim_", str2), cjuaVar5);
        } catch (dhhd e2) {
            dhja.j(e2, dgrs.a, "Error while putting provisioningSuccessData into Bugle storage for SIM", new Object[0]);
        }
        dgng dgngVar3 = this.a;
        try {
            dgngVar3.u.b.o(dhhc.g("provisioning_success_data_for_imsi_", dgngVar3.j), cjuaVar5);
        } catch (dhhd e3) {
            dhja.j(e3, dgrs.a, "Error while putting provisioningSuccessData into Bugle storage for IMSI", new Object[0]);
        }
        dgng dgngVar4 = this.a;
        if (((dflr) dgngVar4.Z.b()).a() && ((dflt) dgngVar4.ab.b()).a() && dgiqVar != null && dgiqVar.u().isPresent()) {
            deyo deyoVar = dgngVar4.n;
            Context context = dgngVar4.m;
            String str3 = dgngVar4.l;
            dggp dggpVar = new dggp(dgngVar4.h);
            ewof ewofVar = (ewof) ewoi.a.createBuilder();
            ewofVar.copyOnWrite();
            ewoi ewoiVar = (ewoi) ewofVar.instance;
            ewoiVar.d = 1;
            ewoiVar.b |= 2;
            deyoVar.i(context, str3, dggpVar, (ewoi) ewofVar.build());
        }
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "ProcessConfigurationState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        super.b();
        this.a.A(ewps.PROCESS_CONFIGURATION_STAGE);
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_PROCESS_CONFIGURATION;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_PROCESS_CONFIGURATION_STATE;
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
        return true;
    }

    @Override // defpackage.dgop
    public final boolean k(Message message, dgib dgibVar) {
        dgng dgngVar = this.a;
        dgngVar.F("ProcessConfigurationState", message);
        if (dgng.al(message).ordinal() != 12) {
            return super.q(message, dgibVar);
        }
        dgiq dgiqVar = (dgiq) message.obj;
        try {
            String strF = dgngVar.r.f();
            String str = dgngVar.h;
            int i = str.isEmpty() ? 2 : strF.isEmpty() ? 3 : str.equals(strF) ? 4 : 5;
            Optional optionalOf = Optional.of(str);
            dgsy dgsyVar = dgngVar.v;
            if (!dgsyVar.j(dgsyVar.e(optionalOf))) {
                long jLongValue = dhkl.a().longValue();
                ewpn ewpnVar = (ewpn) ewpo.a.createBuilder();
                ewpnVar.copyOnWrite();
                ewpo ewpoVar = (ewpo) ewpnVar.instance;
                ewpoVar.c = i - 1;
                ewpoVar.b |= 1;
                ewpo ewpoVar2 = (ewpo) ewpnVar.build();
                final ewpm ewpmVar = (ewpm) ewpp.a.createBuilder();
                ewpmVar.copyOnWrite();
                ewpp ewppVar = (ewpp) ewpmVar.instance;
                ewppVar.c = 25;
                ewppVar.b |= 1;
                ewpmVar.copyOnWrite();
                ewpp ewppVar2 = (ewpp) ewpmVar.instance;
                ewppVar2.b = 2 | ewppVar2.b;
                ewppVar2.d = jLongValue;
                ewpmVar.copyOnWrite();
                ewpp ewppVar3 = (ewpp) ewpmVar.instance;
                ewpoVar2.getClass();
                ewppVar3.f = ewpoVar2;
                ewppVar3.b |= 8;
                dgsyVar.s(new ejvr() { // from class: dgsp
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ekgp ekgpVar = dgsy.a;
                        return dgsy.b((ewqd) obj, (ewpp) ewpmVar.build());
                    }
                }, optionalOf);
            }
            dgiq dgiqVarA = dgngVar.s.a(dgiqVar, ewrp.RCS_PROVISIONING_PROCESS_CONFIGURATION_STATE, dgngVar.l, dgngVar.n, str);
            n(dgiqVarA);
            dgng dgngVar2 = this.a;
            if (dgngVar2.s.f(dgiqVar, dgiqVarA)) {
                dgngVar2.K();
                dgngVar2.T(dgngVar2.aw);
            } else {
                if (((dfmo) dgngVar2.V.b()).a() && ((dflo) dgngVar2.T.b()).a() && dgngVar2.ac() && !dgiqVarA.S() && dgiqVarA.e() == 0 && !dhla.d(dgngVar2.m)) {
                    ((ckkr) dgngVar2.U.b()).a(dgngVar2.h);
                }
                dgngVar2.T(dgngVar2.at);
            }
            return true;
        } catch (dhhd e) {
            dgng dgngVar3 = this.a;
            dgngVar3.v.o(43);
            dgngVar3.z.f(e, "persistConfigFile by RcsUserId fail, abort the provisioning and transition to retryState", new Object[0]);
            dgngVar3.T(dgngVar3.am);
            return true;
        }
    }
}
