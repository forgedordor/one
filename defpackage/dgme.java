package defpackage;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import j$.util.Optional;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgme extends dgmn {
    final /* synthetic */ dgng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgme(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    private final void s(MalformedURLException malformedURLException) {
        dgng dgngVar = this.a;
        ewrp ewrpVar = ewrp.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE;
        dgngVar.H(ewrpVar);
        dgngVar.z.e("Request with token failed while building query. %s", dhiz.URI.c(malformedURLException));
        dgngVar.G(ewrpVar);
        p(dgngVar.al, ewrp.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE);
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "RequestWithTokenState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        String strM;
        super.b();
        dgng dgngVar = this.a;
        dgngVar.A(ewps.REQUEST_WITH_TOKEN_STAGE);
        dgiq dgiqVarG = dgngVar.g();
        String strA = dgiqVarG.A();
        if (strA == null) {
            dgngVar.z.a("No token exist, Skip request with token", new Object[0]);
            p(dgngVar.ah, ewrp.RCS_PROVISIONING_READY_STATE);
            return;
        }
        if (dgngVar.G) {
            cmmh cmmhVar = dgngVar.H;
            cmmhVar.getClass();
            strM = dgngVar.u.n(cmmhVar);
        } else {
            strM = dgngVar.u.m();
        }
        String str = strM;
        int iC = dgngVar.c();
        try {
            ckiz ckizVarI = ckja.i(ewrp.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE, Optional.ofNullable(dgngVar.l));
            cebq cebqVar = dgngVar.Y;
            String str2 = dgngVar.h;
            ckizVarI.k("supported_provisioning_types", (String) Optional.of(cebqVar.d(str2).b).orElse(""));
            String strS = dgngVar.s();
            dgngVar.D(strS);
            dgnj dgnjVar = dgngVar.q;
            Context context = dgngVar.m;
            String str3 = dgngVar.j;
            dgnjVar.e(context, strS, dgiqVarG, str, strA, iC, str3, str2, ckizVarI);
            dgngVar.at(27);
            dgngVar.v(ckizVarI);
            dgjw dgjwVarI = dgjx.i();
            dgngVar.u(this, ckizVarI, Optional.of(dgjwVarI));
            dgjwVarI.c(dgnjVar.c(str3, str2));
            dgjwVarI.d(str);
            ((dgjr) dgjwVarI).e = Optional.ofNullable(dgngVar.l);
            if (cebqVar.c(str2).N) {
                dgngVar.F.b(dgjwVarI.a(), ckizVarI);
            }
            fcsu fcsuVar = dgngVar.Z;
            if (((dflr) fcsuVar.b()).a() && !((dflt) dgngVar.ab.b()).a()) {
                auvh.h(dgngVar.i(emey.RCS_MLS_PROVISIONING_START_FROM_CONFIG_REFRESH, strA, ckizVarI).h(new ejvr() { // from class: dgmc
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        this.a.n((ckiz) obj);
                        return null;
                    }
                }, eoqg.a));
                return;
            }
            if (!((dflr) fcsuVar.b()).a() || !((dflt) dgngVar.ab.b()).a()) {
                dgngVar.N(dgib.MSG_SEND_CONFIG_REQUEST, ckizVarI.j());
                return;
            }
            dgrs dgrsVar = dgngVar.u;
            String strP = dgrsVar.p(str2);
            String strA2 = dgif.a(dgngVar.t());
            if (!TextUtils.isEmpty(strP) && !TextUtils.isEmpty(strA2)) {
                ckizVarI.k("Cookie", strA2);
                auvh.h(dgngVar.j(emey.RCS_MLS_PROVISIONING_START_FROM_CONFIG_REFRESH, strP, ckizVarI).h(new ejvr() { // from class: dgmd
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        this.a.o((ckiz) obj);
                        return null;
                    }
                }, eoqg.a));
                dgrsVar.v(str2, "");
                return;
            }
            dgngVar.N(dgib.MSG_SEND_CONFIG_REQUEST, ckizVarI.j());
        } catch (MalformedURLException e) {
            dgng dgngVar2 = this.a;
            if (((dflr) dgngVar2.Z.b()).a()) {
                s(e);
                return;
            }
            ewrp ewrpVar = ewrp.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE;
            dgngVar2.H(ewrpVar);
            dgngVar2.z.e("Request with token failed while building query. %s", dhiz.URI.c(e));
            dgngVar2.G(ewrpVar);
            p(dgngVar2.al, ewrp.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE);
        }
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_REQUEST_WITH_TOKEN;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE;
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
        dgng dgngVar = this.a;
        dgngVar.F("RequestWithTokenState", message);
        int iOrdinal = dgng.al(message).ordinal();
        if (iOrdinal == 4) {
            dgngVar.ax(message.arg1);
            return false;
        }
        if (iOrdinal == 47) {
            dgngVar.p.a((HttpURLConnection) message.obj, null, "RequestWithTokenState");
            dgngVar.aw(ewrp.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE, 401);
            if (!dfpi.X()) {
                return false;
            }
            dgngVar.u.s(null);
            dgngVar.T(dgngVar.am);
            return true;
        }
        switch (iOrdinal) {
            case 42:
                dgngVar.J((HttpURLConnection) message.obj, message.arg2, this);
                return true;
            case 43:
                dgngVar.p.a((HttpURLConnection) message.obj, null, "RequestWithTokenState");
                dgkj dgkjVar = dgngVar.s;
                String str = dgngVar.h;
                dgrs dgrsVar = dgkjVar.b;
                dgiq dgiqVarF = dgrsVar.f(str);
                if (dgiqVarF == null || dgiqVarF.a() != 2) {
                    dgkjVar.c(str);
                } else {
                    dgrsVar.x(str, null);
                }
                dhgz dhgzVar = dgkjVar.a;
                dhgzVar.q(false);
                dhgzVar.o(null);
                dhgzVar.r("");
                ((dgsz) dgkjVar.c.b()).v(str, "");
                dhgzVar.y();
                dgngVar.aw(ewrp.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE, 403);
                dgngVar.T(dgngVar.am);
                return true;
            case 44:
                dgngVar.p.a((HttpURLConnection) message.obj, null, "RequestWithTokenState");
                dgngVar.s.c(dgngVar.h);
                dgngVar.T(dgngVar.ah);
                return true;
            default:
                return super.q(message, dgibVar);
        }
    }

    public final /* synthetic */ void n(ckiz ckizVar) {
        try {
            this.a.N(dgib.MSG_SEND_CONFIG_REQUEST, ckizVar.j());
        } catch (MalformedURLException e) {
            s(e);
        }
    }

    public final /* synthetic */ void o(ckiz ckizVar) {
        try {
            dgng dgngVar = this.a;
            dgngVar.z.d("Found stored nonce, requesting MLS sign-up with config refresh.", new Object[0]);
            dgngVar.N(dgib.MSG_SEND_CONFIG_REQUEST, ckizVar.j());
        } catch (MalformedURLException e) {
            s(e);
        }
    }
}
