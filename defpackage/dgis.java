package defpackage;

import com.google.android.ims.provisioning.config.ImsConfiguration;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dgis {
    public static dgir D() {
        dgig dgigVar = new dgig();
        dgigVar.q("unknown");
        dgigVar.o("unknown");
        dgigVar.p("unknown");
        dgigVar.C("unknown");
        dgigVar.A("unknown");
        dgigVar.B("unknown");
        dgigVar.w(500);
        dgigVar.x(9500);
        dgigVar.y(10000);
        dgigVar.i(5762);
        dgigVar.n("");
        dgigVar.r("");
        dgigVar.z("");
        dgigVar.f("");
        dgigVar.s(0.0f);
        dgigVar.k("");
        dgigVar.l(-1);
        dgigVar.h(false);
        dgigVar.m("");
        dgigVar.e("");
        dgigVar.d("");
        dgigVar.b("");
        dgigVar.c("");
        dgigVar.u(1800);
        dgigVar.v(3600);
        dgigVar.j("sip");
        dgigVar.g("sip");
        dgigVar.t(false);
        return dgigVar;
    }

    public static dgir E(ImsConfiguration imsConfiguration) {
        dgir dgirVarD = D();
        if (!Objects.isNull(imsConfiguration)) {
            if (Objects.nonNull(imsConfiguration.mPsSipTransport)) {
                dgirVarD.q(imsConfiguration.mPsSipTransport);
            }
            if (Objects.nonNull(imsConfiguration.mPsMediaTransport)) {
                dgirVarD.o(imsConfiguration.mPsMediaTransport);
            }
            if (Objects.nonNull(imsConfiguration.mPsRtpTransport)) {
                dgirVarD.p(imsConfiguration.mPsRtpTransport);
            }
            if (Objects.nonNull(imsConfiguration.mWifiSipTransport)) {
                dgirVarD.C(imsConfiguration.mWifiSipTransport);
            }
            if (Objects.nonNull(imsConfiguration.mWifiMediaTransport)) {
                dgirVarD.A(imsConfiguration.mWifiMediaTransport);
            }
            if (Objects.nonNull(imsConfiguration.mWifiRtpTransport)) {
                dgirVarD.B(imsConfiguration.mWifiRtpTransport);
            }
            dgirVarD.w(imsConfiguration.mT1);
            dgirVarD.x(imsConfiguration.mT2);
            dgirVarD.y(imsConfiguration.mT4);
            dgirVarD.i(imsConfiguration.mLocalSipPort);
            if (Objects.nonNull(imsConfiguration.mPrivateIdentity)) {
                dgirVarD.n(imsConfiguration.mPrivateIdentity);
            }
            if (Objects.nonNull(imsConfiguration.mPublicIdentity)) {
                dgirVarD.r(imsConfiguration.mPublicIdentity);
            }
            if (Objects.nonNull(imsConfiguration.mUserName)) {
                dgirVarD.z(imsConfiguration.mUserName);
            }
            if (Objects.nonNull(imsConfiguration.mDomain)) {
                dgirVarD.f(imsConfiguration.mDomain);
            }
            dgirVarD.s(imsConfiguration.mQ);
            if (Objects.nonNull(imsConfiguration.mPcscfAddress)) {
                dgirVarD.k(imsConfiguration.mPcscfAddress);
            }
            dgirVarD.l(imsConfiguration.mPcsfPort);
            dgirVarD.h(imsConfiguration.mKeepAlive);
            if (Objects.nonNull(imsConfiguration.mPhoneContext)) {
                dgirVarD.m(imsConfiguration.mPhoneContext);
            }
            if (Objects.nonNull(imsConfiguration.mAuthenticationScheme)) {
                dgirVarD.e(imsConfiguration.mAuthenticationScheme);
            }
            if (Objects.nonNull(imsConfiguration.mAuthDigestUsername)) {
                dgirVarD.d(imsConfiguration.mAuthDigestUsername);
            }
            if (Objects.nonNull(imsConfiguration.mAuthDigestPassword)) {
                dgirVarD.b(imsConfiguration.mAuthDigestPassword);
            }
            if (Objects.nonNull(imsConfiguration.mAuthDigestRealm)) {
                dgirVarD.c(imsConfiguration.mAuthDigestRealm);
            }
            dgirVarD.u(imsConfiguration.mRegRetryBaseTime);
            dgirVarD.v(imsConfiguration.mRegRetryMaxTime);
            if (Objects.nonNull(imsConfiguration.mNatUrlFmt)) {
                dgirVarD.j(imsConfiguration.mNatUrlFmt);
            }
            if (Objects.nonNull(imsConfiguration.mIntUrlFmt)) {
                dgirVarD.g(imsConfiguration.mIntUrlFmt);
            }
            dgirVarD.t(imsConfiguration.rcsVolteSingleRegistration);
        }
        return dgirVarD;
    }

    public abstract String A();

    public abstract boolean B();

    public abstract boolean C();

    public abstract float a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract dgir i();

    public abstract String j();

    public abstract String k();

    public abstract String l();

    public abstract String m();

    public abstract String n();

    public abstract String o();

    public abstract String p();

    public abstract String q();

    public abstract String r();

    public abstract String s();

    public abstract String t();

    public abstract String u();

    public abstract String v();

    public abstract String w();

    public abstract String x();

    public abstract String y();

    public abstract String z();
}
