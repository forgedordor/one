package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.provisioning.config.ServerMessage;
import com.google.android.ims.provisioning.config.WelcomeMessage;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgkj {
    private static final ekrg d = ekrg.c("com/google/android/ims/provisioning/engine/ProvisioningEngineConfigUtils");
    public final dhgz a;
    public final dgrs b;
    public final fcsu c;
    private final Context e;
    private final dgsy f;
    private final dexx g;
    private final crmx h;
    private final dheq i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final dhen o;

    public dgkj(Context context, dexx dexxVar, dhgz dhgzVar, dgsy dgsyVar, crmx crmxVar, dgrs dgrsVar, dhen dhenVar, dheq dheqVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        this.e = context;
        this.g = dexxVar;
        this.a = dhgzVar;
        this.f = dgsyVar;
        this.h = crmxVar;
        this.b = dgrsVar;
        this.o = dhenVar;
        this.i = dheqVar;
        this.c = fcsuVar;
        this.j = fcsuVar2;
        this.k = fcsuVar3;
        this.l = fcsuVar4;
        this.m = fcsuVar5;
        this.n = fcsuVar6;
    }

    static final boolean g(dgiq dgiqVar) {
        WelcomeMessage welcomeMessageT = dgiqVar.t();
        return (welcomeMessageT == null || !welcomeMessageT.mHasAcceptButton || welcomeMessageT.mHasRejectButton) ? false : true;
    }

    public static int h(dgiq dgiqVar) {
        if (dgiqVar == null) {
            return 3;
        }
        if (dgiqVar.T()) {
            return 2;
        }
        if (dgiqVar.U()) {
            return 5;
        }
        if (dgiqVar.W()) {
            return 6;
        }
        return dgiqVar.V() ? 4 : 1;
    }

    private final dgiq i(String str) {
        return this.b.f(str);
    }

    private final void j(dgiq dgiqVar, String str) {
        this.b.x(str, dgiqVar);
        this.g.d(this.e, dgiqVar.e(), dgiqVar.g(), dgiqVar.d(), dgiqVar.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dgiq a(defpackage.dgiq r18, defpackage.ewrp r19, java.lang.String r20, defpackage.deyo r21, java.lang.String r22) throws defpackage.dhhd {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgkj.a(dgiq, ewrp, java.lang.String, deyo, java.lang.String):dgiq");
    }

    final void b(dgiq dgiqVar, String str) {
        dhja.c("Set supported network to 3g and wifi", new Object[0]);
        ImsConfiguration imsConfigurationN = dgiqVar.n();
        if (imsConfigurationN == null) {
            dhja.g("Can't apply config, null ImsConfiguration - this is a bug!", new Object[0]);
            return;
        }
        dgiqVar.o().mAnonymousChat = true;
        String str2 = imsConfigurationN.mPublicIdentity;
        if (TextUtils.isEmpty(str2)) {
            dhja.k("Applied a config with an empty publicIdentity, msisdn and country data won't be available", new Object[0]);
            return;
        }
        crmx crmxVar = this.h;
        String strK = dhjv.k(str2, crmxVar);
        dhja.c("ProvisioningEngineConfigUtils parsed msisdn:[%s] from publicIdentity:[%s] for simId:[%s]", dhiz.PHONE_NUMBER.c(strK), dhiz.URI_SIP.c(str2), dhiz.SIM_ID.c(str));
        String strZ = null;
        if (strK != null) {
            try {
                strZ = crmxVar.z(new crnc(crmxVar.e(strK, null).a()));
            } catch (ephe e) {
                cqbd cqbdVarB = crmx.a.b();
                cqbdVarB.I("getCountryForPhone: Not able to parse");
                cqbdVarB.k(strK);
                cqbdVarB.s(e);
            }
        }
        dhgz dhgzVar = this.a;
        dhgzVar.o(strZ);
        dhgzVar.r(strK);
        ((dgsz) this.c.b()).v(str, strK);
    }

    @Deprecated
    final void c(String str) {
        dgiq dgiqVarF = this.b.f(str);
        if (dgiqVarF.a() == 2) {
            dgiqVarF = new Configuration();
        } else {
            dgiqVarF.C();
            dgiqVarF.F();
        }
        j(dgiqVarF, str);
    }

    public final void d(dgiq dgiqVar, dgiq dgiqVar2, String str) {
        if (dgiqVar == null) {
            dhja.c("Skipped processing null remote configuration", new Object[0]);
            return;
        }
        dhja.k("Configuration update received. Updating \nfrom [%s] \nto [%s]", dgiqVar2.y(), dgiqVar.y());
        boolean z = ((dfly) this.k.b()).a() && ((cebq) this.l.b()).c(str).I && (dgiqVar2.S() || g(dgiqVar2));
        int iC = dgiqVar.c();
        if (iC == 1) {
            dgiqVar.I(false);
            dgiqVar.G(System.currentTimeMillis() / 1000);
            j(dgiqVar, str);
            if (dfpi.W()) {
                dgiqVar.H(dgiqVar.e());
            }
            if (!dgiqVar.U()) {
                b(dgiqVar, str);
            }
            dhja.k("Provisioning refreshed with full configuration", new Object[0]);
            dgiqVar2 = dgiqVar;
        } else if (iC == 2 || iC == 3) {
            dgiqVar2.M(dgiqVar.d());
            dgiqVar2.N(dgiqVar.e());
            dgiqVar2.J(dgiqVar.q());
            dgiqVar2.O(dgiqVar.t());
            dgiqVar2.I(false);
            if (((dfmg) this.m.b()).a()) {
                dgiqVar2.E(dgiqVar.j());
            }
            if (Configuration.a.equals(dgiqVar.k())) {
                dhja.q("Received configuration with no token or invalid token during refresh.", new Object[0]);
            } else if (!dgiqVar2.k().equals(dgiqVar.k())) {
                dgiqVar2.K(dgiqVar.k());
                dhja.k("Received configuration with a new token during refresh", new Object[0]);
            }
            dgiqVar2.G(System.currentTimeMillis() / 1000);
            if (dfpi.W()) {
                dgiqVar2.H(dgiqVar2.e());
            }
            j(dgiqVar2, str);
            dhja.k("Provisioning refreshed with partial configuration.", new Object[0]);
        } else {
            dhja.k("Received carrier configuration in an unexpected format.", new Object[0]);
        }
        Optional optionalOf = Optional.of(str);
        ServerMessage serverMessageQ = dgiqVar2.q();
        if (serverMessageQ != null && serverMessageQ.mHasAcceptButton && serverMessageQ.mHasRejectButton && e(dgiqVar, dgiqVar2)) {
            if (!dgiqVar.m().C()) {
                optionalOf.isPresent();
                this.f.p(18, (String) optionalOf.get());
            }
        } else if (g(dgiqVar2) && !z) {
            if (!dgiqVar.m().C()) {
                optionalOf.isPresent();
                this.f.p(20, (String) optionalOf.get());
            }
            WelcomeMessage welcomeMessageT = dgiqVar2.t();
            dfiq dfiqVar = (dfiq) dfir.a.createBuilder();
            String str2 = welcomeMessageT.mMessage;
            dfiqVar.copyOnWrite();
            dfir dfirVar = (dfir) dfiqVar.instance;
            str2.getClass();
            dfirVar.b = 1 | dfirVar.b;
            dfirVar.c = str2;
            String str3 = welcomeMessageT.mTitle;
            dfiqVar.copyOnWrite();
            dfir dfirVar2 = (dfir) dfiqVar.instance;
            str3.getClass();
            dfirVar2.b = 2 | dfirVar2.b;
            dfirVar2.d = str3;
            boolean z2 = welcomeMessageT.mHasAcceptButton;
            dfiqVar.copyOnWrite();
            dfir dfirVar3 = (dfir) dfiqVar.instance;
            dfirVar3.b |= 4;
            dfirVar3.e = z2;
            boolean z3 = welcomeMessageT.hasSettingsButton;
            dfiqVar.copyOnWrite();
            dfir dfirVar4 = (dfir) dfiqVar.instance;
            dfirVar4.b |= 16;
            dfirVar4.g = z3;
            dfir dfirVar5 = (dfir) dfiqVar.build();
            final Bundle bundle = new Bundle();
            bundle.putByteArray("com.google.android.ims.provisioning.enginge.welcome_message", dfirVar5.toByteArray());
            optionalOf.ifPresent(new Consumer() { // from class: dgki
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    bundle.putString("com.google.android.ims.provisioning.sim.id.key", (String) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            dgic.c(this.e, 3, bundle);
        }
        dgiq dgiqVarF = this.b.f(str);
        if (!dgiqVarF.T() && !dgiqVarF.ad()) {
            dhja.c("Processed disabled configuration", new Object[0]);
            return;
        }
        if (!dgiqVarF.Z()) {
            dhja.c("Processed invalid version in configuration", new Object[0]);
        } else if (f(dgiqVar, dgiqVar2)) {
            dhja.c("Waiting for user to confirm configuration", new Object[0]);
        } else {
            dgiqVarF.L();
            j(dgiqVarF, str);
        }
    }

    final boolean e(dgiq dgiqVar, dgiq dgiqVar2) {
        if (dgiqVar2.q() == null) {
            return false;
        }
        if (!dgiqVar2.T() || !dgiqVar2.Z()) {
            return true;
        }
        if (dgiqVar2.a() == 0) {
            return dgiqVar.c() == 1;
        }
        if (!dgiqVar.m().C()) {
            this.f.o(19);
        }
        return false;
    }

    final boolean f(dgiq dgiqVar, dgiq dgiqVar2) {
        ServerMessage serverMessageQ;
        return e(dgiqVar, dgiqVar2) && (serverMessageQ = dgiqVar2.q()) != null && serverMessageQ.mHasRejectButton;
    }
}
