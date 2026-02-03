package defpackage;

import android.content.Context;
import android.os.Message;
import j$.util.Optional;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dglx extends dgmn {
    final /* synthetic */ dgng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dglx(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "RequestWithImsiState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        super.b();
        dgng dgngVar = this.a;
        if (dgngVar.G) {
            if (!dgngVar.ae()) {
                dgngVar.z.d("Request with IMSI is NOT supported when SIM is ABSENT", new Object[0]);
                p(dgngVar.af, ewrp.RCS_PROVISIONING_DISABLED_STATE);
                return;
            }
        } else if (!dgngVar.r.l(dgngVar.m)) {
            dgng dgngVar2 = this.a;
            dgngVar2.z.d("Request with IMSI is NOT supported when SIM is ABSENT", new Object[0]);
            p(dgngVar2.af, ewrp.RCS_PROVISIONING_DISABLED_STATE);
            return;
        }
        dgngVar.A(ewps.REQUEST_WITH_IMSI_STAGE);
        int iA = dgngVar.a();
        int iB = dgngVar.b();
        if (!dgngVar.U() && iA != 2 && iB != 2) {
            dgngVar.at(13);
        }
        dgngVar.I();
        if (dgngVar.W() && dgngVar.af()) {
            dgng dgngVar3 = this.a;
            dgngVar3.z.d("Request with IMSI is NOT supported when SMS connectivity is ABSENT. Transitioning to RetryState.", new Object[0]);
            p(dgngVar3.am, ewrp.RCS_PROVISIONING_RETRY_STATE);
            return;
        }
        dgjz dgjzVar = dgngVar.D;
        String str = dgngVar.h;
        if (dgjzVar.d(str)) {
            dgng dgngVar4 = this.a;
            dgngVar4.z.d("There is a pending user provided phone number verification request. Transitioning to RequestWithMsisdnState.", new Object[0]);
            p(dgngVar4.au, ewrp.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE);
            return;
        }
        try {
            ckiz ckizVarI = ckja.i(ewrp.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE, Optional.ofNullable(dgngVar.l));
            String strS = dgngVar.s();
            dgnj dgnjVar = dgngVar.q;
            Context context = dgngVar.m;
            String str2 = dgngVar.j;
            dgnjVar.d(context, str, strS, str2, ckizVarI);
            List listT = dgngVar.t();
            dgngVar.at(27);
            ckizVarI.k("Cookie", dgif.a(listT));
            dgngVar.v(ckizVarI);
            dgjw dgjwVarI = dgjx.i();
            dgngVar.u(this, ckizVarI, Optional.of(dgjwVarI));
            String strC = dgnjVar.c(str2, str);
            dgng.an(dgjwVarI, listT);
            dgjwVarI.c(strC);
            ((dgjr) dgjwVarI).e = Optional.ofNullable(dgngVar.l);
            if (dgngVar.Y.c(str).N) {
                dgngVar.F.b(dgjwVarI.a(), ckizVarI);
            }
            dgngVar.N(dgib.MSG_SEND_CONFIG_REQUEST, ckizVarI.j());
        } catch (MalformedURLException e) {
            dgng dgngVar5 = this.a;
            dgngVar5.ao(dgib.MSG_EXCEPTION_CAUGHT, dgngVar5.k);
            ewrp ewrpVar = ewrp.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE;
            dgngVar5.H(ewrpVar);
            dgngVar5.z.e("Failed to request with imsi when building query. %s", dhiz.URI.c(e));
            dgngVar5.G(ewrpVar);
        }
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_REQUEST_WITH_IMSI;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE;
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
        dgngVar.F("RequestWithImsiState", message);
        int iOrdinal = dgng.al(message).ordinal();
        if (iOrdinal == 4) {
            this.a.ax(message.arg1);
            return false;
        }
        if (iOrdinal == 7) {
            ((dgsz) dgngVar.L.b()).x(dgngVar.h, dgng.q(message));
            dgngVar.z(dgng.al(message), message.arg1, message.arg2, message.obj);
            dhia.i(dgngVar.m);
            return true;
        }
        if (iOrdinal == 22) {
            this.a.at(34);
            return false;
        }
        if (iOrdinal == 24) {
            this.a.at(32);
            return false;
        }
        InputStream inputStream = null;
        if (iOrdinal == 47) {
            dgng dgngVar2 = this.a;
            dgngVar2.p.a((HttpURLConnection) message.obj, null, "RequestWithImsiState");
            dgngVar2.aw(ewrp.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE, 401);
            if (!dfpi.X()) {
                return false;
            }
            dgngVar2.u.s(null);
            dgngVar2.T(dgngVar2.am);
            return true;
        }
        if (iOrdinal != 42) {
            if (iOrdinal != 43) {
                return super.q(message, dgibVar);
            }
            dgngVar.z.d("Request with IMSI failed: IMSI lookup or header enrichment not successful", new Object[0]);
            if (dgngVar.ad()) {
                dgngVar.T(dgngVar.au);
            } else {
                dgngVar.aw(ewrp.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE, 403);
                dgngVar.T(dgngVar.am);
            }
            dgngVar.p.a((HttpURLConnection) message.obj, null, "RequestWithImsiState");
            return true;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) message.obj;
        int i = message.arg2;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    dgngVar.p.d(dgngVar.h, httpURLConnection);
                    try {
                        dgngVar.y(dgib.MSG_CONFIG_DOC, dgngVar.y.a(inputStream));
                        dgngVar.T(dgngVar.ax);
                    } catch (IOException | IllegalArgumentException unused) {
                        dgng dgngVar3 = this.a;
                        dgngVar3.T(dgngVar3.ao);
                    }
                } catch (dgqu e) {
                    e = e;
                    dgng dgngVar4 = this.a;
                    dgngVar4.ao(dgib.MSG_EXCEPTION_CAUGHT, i);
                    ewrp ewrpVar = ewrp.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE;
                    dgngVar4.as(ewrpVar, 4);
                    dgngVar4.z.f(e, "Failed to parse configuration.", new Object[0]);
                    dgngVar4.G(ewrpVar);
                    return true;
                }
            } catch (IOException e2) {
                e = e2;
                dgng dgngVar42 = this.a;
                dgngVar42.ao(dgib.MSG_EXCEPTION_CAUGHT, i);
                ewrp ewrpVar2 = ewrp.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE;
                dgngVar42.as(ewrpVar2, 4);
                dgngVar42.z.f(e, "Failed to parse configuration.", new Object[0]);
                dgngVar42.G(ewrpVar2);
                return true;
            }
            return true;
        } finally {
            this.a.p.a(httpURLConnection, inputStream, "RequestWithImsiState");
        }
    }
}
