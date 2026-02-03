package com.google.android.ims.provisioning.config;

import defpackage.dgis;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ImsConfiguration implements Serializable {
    private static final long serialVersionUID = -746053072179571299L;
    public String mAuthDigestPassword;
    public String mAuthDigestRealm;
    public String mAuthDigestUsername;
    public String mAuthenticationScheme;
    public String mDomain;
    public String mPcscfAddress;
    public int mPcsfPort;
    public String mPrivateIdentity;
    public String mPsMediaTransport;
    public String mPsRtpTransport;
    public String mPsSipTransport;
    public String mPublicIdentity;
    public String mUserName;
    public String mWifiMediaTransport;
    public String mWifiRtpTransport;
    public String mWifiSipTransport;
    public int mT1 = 500;
    public int mT2 = 9500;
    public int mT4 = 10000;
    public int mLocalSipPort = 5762;
    public float mQ = 0.0f;
    public boolean mKeepAlive = false;
    public String mPhoneContext = "";
    public int mRegRetryBaseTime = 1800;
    public int mRegRetryMaxTime = 3600;
    public String mNatUrlFmt = "sip";
    public String mIntUrlFmt = "sip";
    public boolean rcsVolteSingleRegistration = false;

    public static ImsConfiguration a(dgis dgisVar) {
        ImsConfiguration imsConfiguration = new ImsConfiguration();
        imsConfiguration.e(dgisVar.v());
        imsConfiguration.c(dgisVar.t());
        imsConfiguration.d(dgisVar.u());
        imsConfiguration.i(dgisVar.A());
        imsConfiguration.g(dgisVar.y());
        imsConfiguration.h(dgisVar.z());
        imsConfiguration.mT1 = dgisVar.f();
        imsConfiguration.mT2 = dgisVar.g();
        imsConfiguration.mT4 = dgisVar.h();
        imsConfiguration.mPrivateIdentity = dgisVar.s();
        imsConfiguration.f(dgisVar.w(), dgisVar.x());
        imsConfiguration.mDomain = dgisVar.n();
        imsConfiguration.mQ = dgisVar.a();
        imsConfiguration.mPcscfAddress = dgisVar.q();
        imsConfiguration.mPcsfPort = dgisVar.c();
        imsConfiguration.mKeepAlive = dgisVar.B();
        imsConfiguration.mPhoneContext = dgisVar.r();
        imsConfiguration.mAuthenticationScheme = dgisVar.m();
        imsConfiguration.mAuthDigestUsername = dgisVar.l();
        imsConfiguration.mAuthDigestPassword = dgisVar.j();
        imsConfiguration.mAuthDigestRealm = dgisVar.k();
        imsConfiguration.mRegRetryBaseTime = dgisVar.d();
        imsConfiguration.mRegRetryMaxTime = dgisVar.e();
        imsConfiguration.mNatUrlFmt = dgisVar.p();
        imsConfiguration.mIntUrlFmt = dgisVar.o();
        imsConfiguration.rcsVolteSingleRegistration = dgisVar.C();
        return imsConfiguration;
    }

    public static String b(int i) {
        return i == 0 ? "tel" : "sip";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String j(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = -169334160(0xfffffffff5e82a70, float:-5.8861016E32)
            r2 = 1
            java.lang.String r3 = "MSRP"
            java.lang.String r4 = "MSRPoTLS"
            if (r0 == r1) goto L1c
            r1 = 2376292(0x244264, float:3.329894E-39)
            if (r0 == r1) goto L14
            goto L24
        L14:
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L24
            r5 = 0
            goto L25
        L1c:
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L24
            r5 = r2
            goto L25
        L24:
            r5 = -1
        L25:
            if (r5 == 0) goto L2d
            if (r5 == r2) goto L2c
            java.lang.String r5 = "unknown"
            return r5
        L2c:
            return r4
        L2d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.ims.provisioning.config.ImsConfiguration.j(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String k(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 81486(0x13e4e, float:1.14186E-40)
            r2 = 1
            java.lang.String r3 = "SRTP"
            java.lang.String r4 = "RTP"
            if (r0 == r1) goto L1c
            r1 = 2554139(0x26f91b, float:3.579111E-39)
            if (r0 == r1) goto L14
            goto L24
        L14:
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L24
            r5 = r2
            goto L25
        L1c:
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L24
            r5 = 0
            goto L25
        L24:
            r5 = -1
        L25:
            if (r5 == 0) goto L2d
            if (r5 == r2) goto L2c
            java.lang.String r5 = "unknown"
            return r5
        L2c:
            return r3
        L2d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.ims.provisioning.config.ImsConfiguration.k(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String l(java.lang.String r7) {
        /*
            int r0 = r7.hashCode()
            r1 = -1479406420(0xffffffffa7d20cac, float:-5.8300448E-15)
            r2 = 2
            r3 = 1
            java.lang.String r4 = "SIPoUDP"
            java.lang.String r5 = "SIPoTLS"
            java.lang.String r6 = "SIPoTCP"
            if (r0 == r1) goto L2c
            r1 = -1479406138(0xffffffffa7d20dc6, float:-5.830164E-15)
            if (r0 == r1) goto L24
            r1 = -1479405428(0xffffffffa7d2108c, float:-5.830465E-15)
            if (r0 == r1) goto L1c
            goto L34
        L1c:
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L34
            r7 = r2
            goto L35
        L24:
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L34
            r7 = r3
            goto L35
        L2c:
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L34
            r7 = 0
            goto L35
        L34:
            r7 = -1
        L35:
            if (r7 == 0) goto L40
            if (r7 == r3) goto L3f
            if (r7 == r2) goto L3e
            java.lang.String r7 = "unknown"
            return r7
        L3e:
            return r4
        L3f:
            return r5
        L40:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.ims.provisioning.config.ImsConfiguration.l(java.lang.String):java.lang.String");
    }

    public final void c(String str) {
        this.mPsMediaTransport = j(str);
    }

    public final void d(String str) {
        this.mPsRtpTransport = k(str);
    }

    public final void e(String str) {
        this.mPsSipTransport = l(str);
    }

    public final void f(String str, String str2) {
        this.mPublicIdentity = str;
        this.mUserName = str2;
    }

    public final void g(String str) {
        this.mWifiMediaTransport = j(str);
    }

    public final void h(String str) {
        this.mWifiRtpTransport = k(str);
    }

    public final void i(String str) {
        this.mWifiSipTransport = l(str);
    }
}
