package defpackage;

import android.content.Context;
import android.os.Message;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.Map;
import java.util.function.Consumer;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dglv extends dgmn {
    final /* synthetic */ dgng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dglv(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    private final dgmn o() {
        String strH = "";
        dgng dgngVar = this.a;
        try {
            strH = dgngVar.u.b.h(dhhc.g("provisioning_target_after_attestation", dgngVar.h), "", "bugle");
        } catch (dhhd e) {
            dhja.j(e, dgrs.a, "Error while getting attestation nonce from Bugle storage", new Object[0]);
        }
        Map map = this.a.g;
        if (map.containsKey(strH)) {
            return (dgmn) map.get(strH);
        }
        return null;
    }

    private final void s(HttpURLConnection httpURLConnection) throws XmlPullParserException, IOException {
        dgng dgngVar;
        XmlPullParser xmlPullParserNewPullParser;
        int eventType;
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            dgngVar = this.a;
            xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
        } catch (IOException | XmlPullParserException e) {
            dgng dgngVar2 = this.a;
            dgngVar2.z.c(e, "Failed to parse the attestation response", new Object[0]);
            dgngVar2.G(ewrp.RCS_PROVISIONING_REQUEST_ATTESTATION_STATE);
            n(6);
            dgrs dgrsVar = dgngVar2.u;
            String str = dgngVar2.h;
            dgrsVar.v(str, "");
            dgngVar2.p.b(str);
        }
        for (eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
            if (eventType == 2 && xmlPullParserNewPullParser.getName().equals("nonce")) {
                String strTrim = xmlPullParserNewPullParser.nextText().trim();
                dgrs dgrsVar2 = dgngVar.u;
                String str2 = dgngVar.h;
                dgrsVar2.v(str2, strTrim);
                dgngVar.p.d(str2, httpURLConnection);
                u();
                return;
            }
        }
        throw new IOException("Received attestation response doesn't include a nonce");
    }

    private final void t(dgmn dgmnVar) {
        try {
            ewrp ewrpVar = ewrp.RCS_PROVISIONING_REQUEST_ATTESTATION_STATE;
            dgng dgngVar = this.a;
            ckiz ckizVarI = ckja.i(ewrpVar, Optional.ofNullable(dgngVar.l));
            String strS = dgngVar.s();
            dgnj dgnjVar = dgngVar.q;
            Context context = dgngVar.m;
            String str = dgngVar.h;
            dgnjVar.d(context, str, strS, dgngVar.j, ckizVarI);
            dgngVar.v(ckizVarI);
            dgngVar.u(this, ckizVarI, Optional.empty());
            ckizVarI.l("client_authenticity_support", "goog-mls");
            dgngVar.u.A(str, dgmnVar.a());
            dgngVar.N(dgib.MSG_SEND_CONFIG_REQUEST, ckizVarI.j());
        } catch (MalformedURLException e) {
            dgng dgngVar2 = this.a;
            dgngVar2.ao(dgib.MSG_EXCEPTION_CAUGHT, dgngVar2.k);
            ewrp ewrpVar2 = ewrp.RCS_PROVISIONING_REQUEST_ATTESTATION_STATE;
            dgngVar2.H(ewrpVar2);
            dgngVar2.z.e("Failed to build attestation request query. %s", dhiz.URI.c(e));
            dgngVar2.G(ewrpVar2);
        }
    }

    private final void u() {
        dgmn dgmnVarO = o();
        if (dgmnVarO == null) {
            dgng dgngVar = this.a;
            dgngVar.z.b("Target state after attestation not found", new Object[0]);
            m();
            dgngVar.T(dgngVar.am);
            return;
        }
        dgng dgngVar2 = this.a;
        if (dgmnVarO.equals(dgngVar2.ak)) {
            dgngVar2.u.h(dgngVar2.h).ifPresentOrElse(new Consumer() { // from class: dglt
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    dglv dglvVar = this.a;
                    dgng dgngVar3 = dglvVar.a;
                    dglvVar.p(dgngVar3.ak, ewrp.RCS_PROVISIONING_REQUEST_WITH_MSISDN_TOKEN_STATE);
                    dgngVar3.N(dgib.MSG_VERIFY_NUMBER_SUCCESS, (String) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Runnable() { // from class: dglu
                @Override // java.lang.Runnable
                public final void run() {
                    dglv dglvVar = this.a;
                    dglvVar.a.G(ewrp.RCS_PROVISIONING_REQUEST_ATTESTATION_STATE);
                    dglvVar.m();
                    dglvVar.n(5);
                    throw new IllegalStateException("Attestation was requested without a verified MSISDN token");
                }
            });
        } else {
            dgmn dgmnVar = dgngVar2.ar;
            if (dgmnVarO.equals(dgmnVar)) {
                dgngVar2.T(dgmnVar);
            } else {
                dgngVar2.z.b("Transitioning to %s after attestation is not supported.", dgmnVarO.a());
                n(7);
                m();
            }
        }
        dgngVar2.u.A(dgngVar2.h, "");
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "RequestAttestationState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        super.b();
        this.a.A(ewps.REQUEST_ATTESTATION_STAGE);
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_REQUEST_ATTESTATION;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_REQUEST_ATTESTATION_STATE;
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
    public final boolean k(Message message, dgib dgibVar) throws XmlPullParserException, IOException {
        dgng dgngVar = this.a;
        dgngVar.F("RequestAttestationState", message);
        int iOrdinal = dgng.al(message).ordinal();
        if (iOrdinal == 8) {
            dgngVar.at(49);
            n(10);
            return false;
        }
        if (iOrdinal == 14) {
            t(dgngVar.ak);
            return true;
        }
        if (iOrdinal == 24) {
            dgngVar.at(32);
            n(10);
            return false;
        }
        if (iOrdinal == 40) {
            t(dgngVar.ar);
            return true;
        }
        if (iOrdinal == 42) {
            Object obj = message.obj;
            if (obj instanceof HttpURLConnection) {
                s((HttpURLConnection) obj);
            } else {
                dgngVar.z.b("Request attestation response is invalid %s", message.obj);
                dgngVar.T(dgngVar.am);
            }
            return true;
        }
        if (iOrdinal != 44) {
            if (iOrdinal != 52) {
                return super.q(message, dgibVar);
            }
            u();
            n(8);
            return true;
        }
        dgngVar.u.r(dgngVar.h);
        n(9);
        m();
        dgngVar.T(dgngVar.ah);
        return true;
    }

    public final void m() {
        dgng dgngVar = this.a;
        dgrs dgrsVar = dgngVar.u;
        String str = dgngVar.h;
        dgrsVar.A(str, "");
        dgrsVar.v(str, "");
        dgngVar.p.b(str);
    }

    public final void n(int i) {
        dgng dgngVar = this.a;
        dgmn dgmnVarO = o();
        dgngVar.ar(dgmnVarO == dgngVar.ak ? 3 : dgmnVarO == dgngVar.ar ? 4 : 1, i);
    }
}
