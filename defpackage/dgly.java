package defpackage;

import android.os.Message;
import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Optional;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgly extends dgmn {
    final /* synthetic */ dgng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgly(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    private final void n(final ewpa ewpaVar) {
        dgng dgngVar = this.a;
        dgsy dgsyVar = dgngVar.v;
        Optional optionalOf = Optional.of(dgngVar.h);
        if (dgsyVar.j(dgsyVar.e(optionalOf))) {
            return;
        }
        dgsyVar.r(new dgsx() { // from class: dgsm
            @Override // defpackage.dgsx
            public final void a(ewox ewoxVar) {
                ekgp ekgpVar = dgsy.a;
                ewoxVar.copyOnWrite();
                ewpg ewpgVar = (ewpg) ewoxVar.instance;
                ewpg ewpgVar2 = ewpg.a;
                ewpgVar.n = ewpaVar.d;
                ewpgVar.b |= 1024;
            }
        }, dgsyVar.e(optionalOf));
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "RequestWithMsisdnState";
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0224  */
    @Override // defpackage.dgmn, defpackage.dfmy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgly.b():void");
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_REQUEST_WITH_MSISDN;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE;
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
        Optional optionalEmpty;
        dgng dgngVar = this.a;
        dgngVar.F("RequestWithMsisdnState", message);
        int iOrdinal = dgng.al(message).ordinal();
        if (iOrdinal == 4) {
            this.a.ax(message.arg1);
            return false;
        }
        if (iOrdinal == 7) {
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
            dgngVar2.p.a((HttpURLConnection) message.obj, null, "RequestWithMsisdnState");
            dgngVar2.aw(ewrp.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE, 401);
            if (!dfpi.X()) {
                return false;
            }
            dgngVar2.u.s(null);
            dgngVar2.T(dgngVar2.am);
            return true;
        }
        switch (iOrdinal) {
            case 42:
                HttpURLConnection httpURLConnection = (HttpURLConnection) message.obj;
                int i = message.arg2;
                try {
                    try {
                        try {
                            inputStream = httpURLConnection.getInputStream();
                            dgngVar.y(dgib.MSG_CONFIG_DOC, dgngVar.y.a(inputStream));
                            dgngVar.D.c(dgngVar.h);
                            dgngVar.T(dgngVar.ax);
                        } catch (dgqu e) {
                            dgng dgngVar3 = this.a;
                            dgngVar3.ao(dgib.MSG_EXCEPTION_CAUGHT, i);
                            ewrp ewrpVar = ewrp.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE;
                            dgngVar3.as(ewrpVar, 4);
                            dgngVar3.z.f(e, "Failed to parse configuration.", new Object[0]);
                            dgngVar3.G(ewrpVar);
                        }
                    } catch (IOException unused) {
                        dgng dgngVar4 = this.a;
                        dgkn dgknVar = dgngVar4.p;
                        String str = dgngVar4.h;
                        dgknVar.d(str, httpURLConnection);
                        dgngVar4.D.c(str);
                        dgngVar4.T(dgngVar4.ao);
                    }
                    return true;
                } finally {
                    this.a.p.a(httpURLConnection, inputStream, "RequestWithMsisdnState");
                }
            case 43:
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) message.obj;
                InputStream errorStream = httpURLConnection2.getErrorStream();
                Configuration configuration = new Configuration();
                configuration.mType = 2;
                configuration.mValiditySecs = 0;
                configuration.mVersion = 0;
                dgng dgngVar5 = this.a;
                dgngVar5.u.x(dgngVar5.h, configuration);
                dgngVar5.p.a(httpURLConnection2, errorStream, "RequestWithMsisdnState");
                dgngVar5.aw(ewrp.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE, 403);
                dgngVar5.T(dgngVar5.af);
                return true;
            case 45:
                dgng dgngVar6 = this.a;
                HttpURLConnection httpURLConnection3 = (HttpURLConnection) message.obj;
                if ("?1".equals(httpURLConnection3.getHeaderField("DEVICE_THROTTLED"))) {
                    String str2 = dgngVar6.h;
                    dgjz dgjzVar = dgngVar6.D;
                    cjtu cjtuVarB = dgjzVar.b.b(str2);
                    Optional optionalB = dgjzVar.b(cjtuVarB);
                    if (optionalB.isPresent() && (((cjtt) optionalB.get()).b & 2) == 0) {
                        String headerField = httpURLConnection3.getHeaderField("Retry-After");
                        ((eksl) ((eksl) dgjz.a.h()).h("com/google/android/ims/provisioning/engine/ForcePhoneNumberVerificationUtil", "getRetryAfterTimestamp", 152, "ForcePhoneNumberVerificationUtil.java")).t("Force verification request otp throttled. Retry-after value: %s", headerField);
                        if (ejwk.c(headerField)) {
                            optionalEmpty = Optional.empty();
                        } else {
                            try {
                                optionalEmpty = Optional.of(evxc.e(Integer.parseInt(headerField)));
                            } catch (NumberFormatException e2) {
                                ((eksl) ((eksl) ((eksl) dgjz.a.i()).g(e2)).h("com/google/android/ims/provisioning/engine/ForcePhoneNumberVerificationUtil", "getRetryAfterTimestamp", 161, "ForcePhoneNumberVerificationUtil.java")).t("Exception parsing Retry-After field: %s", headerField);
                                optionalEmpty = Optional.empty();
                            }
                        }
                        dgjzVar.b.t(str2, dgjzVar.a(cjtuVarB, cjtq.OTP_FORCE_VERIFICATION_THROTTLED, optionalEmpty));
                        ((eksl) ((eksl) dgjz.a.h()).h("com/google/android/ims/provisioning/engine/ForcePhoneNumberVerificationUtil", "handleIfThrottledResponse", 143, "ForcePhoneNumberVerificationUtil.java")).q("Received throttled response for force verification request. Storing record.");
                    }
                }
                dgng dgngVar7 = this.a;
                if (dgngVar7.V()) {
                    dgngVar7.E.b(dgngVar7.h, ewpa.SIM, dgngVar7.l, cjtq.OTP_THROTTLED);
                }
                break;
            case 44:
                return false;
            default:
                return super.q(message, dgibVar);
        }
    }
}
