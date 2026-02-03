package defpackage;

import android.content.Context;
import android.os.Message;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Optional;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dglw extends dgmn {
    final /* synthetic */ dgng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dglw(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "RequestWithHeState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        super.b();
        dgng dgngVar = this.a;
        dgngVar.A(ewps.REQUEST_WITH_HE_STAGE);
        dgsy dgsyVar = dgngVar.v;
        Optional optionalOf = Optional.of(dgngVar.h);
        if (!dgsyVar.j(dgsyVar.e(optionalOf))) {
            dgsyVar.s(new ejvr() { // from class: dgsv
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ewqd ewqdVar = (ewqd) obj;
                    ekgp ekgpVar = dgsy.a;
                    ewqc ewqcVar = (ewqc) ewqdVar.toBuilder();
                    ewpu ewpuVar = ewqdVar.e;
                    if (ewpuVar == null) {
                        ewpuVar = ewpu.a;
                    }
                    ewpl ewplVar = (ewpl) ewpuVar.toBuilder();
                    ewpd ewpdVar = ewpd.FALSE;
                    ewplVar.copyOnWrite();
                    ewpu ewpuVar2 = (ewpu) ewplVar.instance;
                    ewpuVar2.e = ewpdVar.d;
                    ewpuVar2.b |= 4;
                    ewpu ewpuVar3 = (ewpu) ewplVar.build();
                    ewqcVar.copyOnWrite();
                    ewqd ewqdVar2 = (ewqd) ewqcVar.instance;
                    ewpuVar3.getClass();
                    ewqdVar2.e = ewpuVar3;
                    ewqdVar2.b |= 4;
                    return (ewqd) ewqcVar.build();
                }
            }, optionalOf);
        }
        try {
            String strS = dgngVar.s();
            dgngVar.at(27);
            dgngVar.D(strS);
            ckiz ckizVarI = ckja.i(ewrp.RCS_PROVISIONING_REQUEST_WITH_HE_STATE, Optional.ofNullable(dgngVar.l));
            ckizVarI.f(strS);
            ewlg ewlgVarB = ckizVarI.b();
            ewlgVarB.copyOnWrite();
            ewlp ewlpVar = (ewlp) ewlgVarB.instance;
            ewlp ewlpVar2 = ewlp.a;
            strS.getClass();
            ewlpVar.b |= 2;
            ewlpVar.d = strS;
            dgngVar.N(dgib.MSG_SEND_CONFIG_REQUEST_OVER_MOBILE_NETWORK, ckizVarI.j());
        } catch (MalformedURLException e) {
            dgng dgngVar2 = this.a;
            dgngVar2.ao(dgib.MSG_EXCEPTION_CAUGHT, dgngVar2.k);
            ewrp ewrpVar = ewrp.RCS_PROVISIONING_REQUEST_WITH_HE_STATE;
            dgngVar2.H(ewrpVar);
            dgngVar2.z.e("Failed to request with header enrichment when building query. %s", dhiz.URI.c(e));
            dgngVar2.G(ewrpVar);
        }
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_REQUEST_WITH_HE;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_REQUEST_WITH_HE_STATE;
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
        dgngVar.F("RequestWithHeState", message);
        int iOrdinal = dgng.al(message).ordinal();
        if (iOrdinal == 4) {
            dgngVar.ax(message.arg1);
            return false;
        }
        if (iOrdinal == 24) {
            dgngVar.at(32);
            dgngVar.T(dgngVar.al);
            dgngVar.p.a((HttpURLConnection) message.obj, null, "RequestWithHeState");
            return true;
        }
        if (iOrdinal == 21) {
            dgngVar.at(33);
            dgngVar.T(dgngVar.al);
            return true;
        }
        if (iOrdinal == 22) {
            dgngVar.at(34);
            return false;
        }
        switch (iOrdinal) {
            case 41:
            case 43:
            case 45:
            case 46:
            case 47:
            case 48:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case 50:
            case 51:
            case 52:
                dgngVar.p.d(dgngVar.h, (HttpURLConnection) message.obj);
                break;
            case 42:
                HttpURLConnection httpURLConnection = (HttpURLConnection) message.obj;
                deyo deyoVar = dgngVar.n;
                Context context = dgngVar.m;
                ewrp ewrpVar = ewrp.RCS_PROVISIONING_REQUEST_WITH_HE_STATE;
                String str = dgngVar.l;
                String str2 = dgngVar.h;
                deyoVar.a(context, ewrpVar, str, new dggp(str2), ewrg.HE_REQUEST_SUCCESSFUL);
                dgngVar.T(dgngVar.aq);
                dgkn dgknVar = dgngVar.p;
                dgknVar.a(httpURLConnection, null, "RequestWithHeState");
                dgknVar.d(str2, httpURLConnection);
                return true;
            case 44:
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) message.obj;
                dgngVar.T(dgngVar.al);
                dgkn dgknVar2 = dgngVar.p;
                dgknVar2.a((HttpURLConnection) message.obj, null, "RequestWithHeState");
                dgknVar2.d(dgngVar.h, httpURLConnection2);
                return true;
        }
        return super.q(message, dgibVar);
    }
}
