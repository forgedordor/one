package defpackage;

import android.os.Message;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgli extends dgmn {
    final /* synthetic */ dgng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgli(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "EnabledState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        super.b();
        dgng dgngVar = this.a;
        fcsu fcsuVar = dgngVar.L;
        dgsz dgszVar = (dgsz) fcsuVar.b();
        String str = dgngVar.h;
        dgngVar.l = dgszVar.k(str);
        dgngVar.z.b = dgngVar.l;
        if (dgngVar.l == null) {
            dgngVar.ap();
        }
        dgngVar.J.ifPresent(new Consumer() { // from class: dglh
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dgie) obj).n(this.a.a.l);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dgid dgidVarF = dgngVar.f();
        final dgsy dgsyVar = dgngVar.v;
        final String str2 = dgngVar.l;
        final Optional optionalOf = Optional.of(str);
        dhja.c("updateProvisioningAttemptMetadata, provisioningSessionId=%s", str2);
        if (!dgsyVar.j(dgsyVar.e(optionalOf))) {
            dgsyVar.s(new ejvr() { // from class: dgsn
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return dgsyVar.d((ewqd) obj, str2, optionalOf);
                }
            }, optionalOf);
        }
        dgngVar.A(ewps.ENABLED_STAGE);
        dgsyVar.l(dgidVarF, Optional.of(str));
        final int iB = ((dgsz) fcsuVar.b()).b(str);
        Optional optionalOf2 = Optional.of(str);
        if (!dgsyVar.j(dgsyVar.e(optionalOf2))) {
            dgsyVar.r(new dgsx() { // from class: dgsa
                @Override // defpackage.dgsx
                public final void a(ewox ewoxVar) {
                    ekgp ekgpVar = dgsy.a;
                    ewoxVar.copyOnWrite();
                    ewpg ewpgVar = (ewpg) ewoxVar.instance;
                    ewpg ewpgVar2 = ewpg.a;
                    ewpgVar.b |= 65536;
                    ewpgVar.t = iB;
                }
            }, dgsyVar.e(optionalOf2));
        }
        final enxe enxeVar = dgngVar.W;
        Optional optionalOf3 = Optional.of(str);
        if (!dgsyVar.j(dgsyVar.e(optionalOf3))) {
            dgsyVar.r(new dgsx() { // from class: dgrw
                @Override // defpackage.dgsx
                public final void a(ewox ewoxVar) {
                    ekgp ekgpVar = dgsy.a;
                    ewoxVar.copyOnWrite();
                    ewpg ewpgVar = (ewpg) ewoxVar.instance;
                    ewpg ewpgVar2 = ewpg.a;
                    ewpgVar.A = enxeVar.ab;
                    ewpgVar.b |= 16777216;
                }
            }, dgsyVar.e(optionalOf3));
        }
        boolean zE = dgidVarF.e();
        if (!dgngVar.N) {
            String str3 = dgngVar.I.a().c;
            boolean z = zE && str3.equals(str);
            if (!z) {
                dgke dgkeVar = dgngVar.z;
                dhiz dhizVar = dhiz.SIM_ID;
                dgkeVar.e("Can't proceed with provisioning. Trying to provision simId: %s. Current default call simId: %s. Is RCS enabled: %s", dhizVar.c(str), dhizVar.c(str3), Boolean.valueOf(zE));
            }
            zE = z;
        }
        if (zE) {
            dgiq dgiqVarG = dgngVar.g();
            int iMax = Math.max(dgiqVarG.e(), 0);
            if (iMax != dgiqVarG.b()) {
                dgngVar.z.a("set rcs state %d", Integer.valueOf(iMax));
                dgiqVarG.H(iMax);
                dgngVar.u.x(str, dgiqVarG);
            }
            p(dgngVar.ag, ewrp.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE);
        } else {
            p(dgngVar.af, ewrp.RCS_PROVISIONING_DISABLED_STATE);
        }
        dgvf.b();
        dgvf.a(dgngVar.m, 3);
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_ENABLED;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_ENABLED_STATE;
    }

    @Override // defpackage.dgmn
    public final boolean h() {
        return true;
    }

    @Override // defpackage.dgmn
    public final boolean j() {
        return true;
    }

    @Override // defpackage.dgop
    public final boolean k(Message message, dgib dgibVar) {
        this.a.F("EnabledState", message);
        return super.q(message, dgibVar);
    }
}
