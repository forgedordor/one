package com.google.android.ims.provisioning.config;

import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import defpackage.dfog;
import defpackage.dfpi;
import defpackage.dgiq;
import defpackage.dgis;
import defpackage.dhkl;
import defpackage.ejuf;
import defpackage.ejxr;
import defpackage.ejxx;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;
import j$.util.Optional;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class Configuration implements Serializable, dgiq {
    private static final long serialVersionUID = -426160916861745022L;
    public String mDeviceId;
    public ServerMessage mServerMessage;
    public String mTachyonAuthToken;
    public String mVerifiedSmsToken;
    public MlsConfiguration mlsConfiguration;
    public boolean tachygramEnabled;
    public String tachyonUrl;
    public WelcomeMessage welcomeMessage;
    private static final ekrg b = ekrg.c("com/google/android/ims/provisioning/config/Configuration");
    public static final Token a = new Token("", 0);
    private int mConfigState = 0;
    private Token mToken = a;
    public int mType = 0;
    public ImsConfiguration mImsConfiguration = new ImsConfiguration();
    public InstantMessageConfiguration mInstantMessageConfiguration = new InstantMessageConfiguration();
    public MediaConfiguration mMediaConfiguration = new MediaConfiguration();
    public CapabilityConfiguration mCapabilityDiscoveryConfiguration = new CapabilityConfiguration();
    public final ConfirmationConfiguration mConfirmationConfiguration = new ConfirmationConfiguration();
    public SecondaryDeviceConfiguration mSecondaryDeviceConfiguration = new SecondaryDeviceConfiguration();
    public PresenceConfiguration mPresenceConfiguration = new PresenceConfiguration();
    public XdmsConfiguration mXdmsConfiguration = new XdmsConfiguration();
    public UserExperienceConfiguration mUserExperienceConfig = new UserExperienceConfiguration();
    public ServicesConfiguration mServicesConfiguration = new ServicesConfiguration();
    public ChatbotConfiguration mChatbotConfiguration = new ChatbotConfiguration();
    public InvalidConfigReason invalidConfigReason = InvalidConfigReason.INVALID_CONFIG_REASON_UNSPECIFIED;
    private boolean mReconfigRequested = false;
    private final int mMessageTech = 0;
    private int rcsState = 0;
    public String iccids = "";
    public int mValiditySecs = 0;
    private long mLastUpdateSecs = 0;
    public int mVersion = 0;
    private transient ejxr c = ejxx.a(new ejxr() { // from class: dgik
        @Override // defpackage.ejxr
        public final Object get() {
            ImsConfiguration imsConfiguration = this.a.mImsConfiguration;
            return imsConfiguration != null ? dgis.E(imsConfiguration).a() : dgis.D().a();
        }
    });

    /* compiled from: PG */
    public enum InvalidConfigReason {
        INVALID_CONFIG_REASON_UNSPECIFIED,
        CARRIER_INELIGIBLE,
        UPI_INELIGIBLE,
        UNSUPPORTED_CLIENT_VENDOR,
        UNSUPPORTED_CLIENT_VERSION,
        FROZEN_REGION,
        ATTESTATION_FAILURE,
        UNSUPPORTED_ACTION
    }

    /* compiled from: PG */
    public static class Token implements Serializable {
        private static final long serialVersionUID = 1;
        public final long mExpirationTime;
        public final String mValue;

        public Token(String str, long j) {
            this.mValue = str;
            this.mExpirationTime = dhkl.a().longValue() + TimeUnit.SECONDS.toMillis(j);
        }
    }

    @Override // defpackage.dgiq
    public final String A() {
        Token token = this.mToken;
        String str = token.mValue;
        if (token == a || str == null || ejuf.e("", str)) {
            return null;
        }
        return str;
    }

    @Override // defpackage.dgiq
    public final String B() {
        return this.mVerifiedSmsToken;
    }

    @Override // defpackage.dgiq
    public final void C() {
        this.mToken = a;
    }

    @Override // defpackage.dgiq
    public final void D(final ImsConfiguration imsConfiguration) {
        this.mImsConfiguration = imsConfiguration;
        this.c = ejxx.a(new ejxr() { // from class: dgil
            @Override // defpackage.ejxr
            public final Object get() {
                Configuration.Token token = Configuration.a;
                return dgis.E(imsConfiguration).a();
            }
        });
    }

    @Override // defpackage.dgiq
    public final void E(InvalidConfigReason invalidConfigReason) {
        this.invalidConfigReason = invalidConfigReason;
    }

    @Override // defpackage.dgiq
    public final void F() {
        this.mValiditySecs = 0;
        this.mVersion = 0;
    }

    @Override // defpackage.dgiq
    public final void G(long j) {
        this.mLastUpdateSecs = j;
    }

    @Override // defpackage.dgiq
    public final void H(int i) {
        this.rcsState = i;
    }

    @Override // defpackage.dgiq
    public final void I(boolean z) {
        this.mReconfigRequested = z;
    }

    @Override // defpackage.dgiq
    public final void J(ServerMessage serverMessage) {
        this.mServerMessage = serverMessage;
    }

    @Override // defpackage.dgiq
    public final void K(Token token) {
        if (token == null) {
            this.mToken = a;
        } else {
            this.mToken = token;
        }
    }

    @Override // defpackage.dgiq
    public final void L() {
        ae();
    }

    @Override // defpackage.dgiq
    public final void M(int i) {
        this.mValiditySecs = i;
    }

    @Override // defpackage.dgiq
    public final void N(int i) {
        this.mVersion = i;
    }

    @Override // defpackage.dgiq
    public final void O(WelcomeMessage welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    @Override // defpackage.dgiq
    public final boolean P() {
        return this.tachygramEnabled;
    }

    @Override // defpackage.dgiq
    public final boolean Q() {
        return A() != null;
    }

    @Override // defpackage.dgiq
    public final boolean R() {
        return this.mValiditySecs == -2 && this.mVersion == -2;
    }

    @Override // defpackage.dgiq
    public final boolean S() {
        return this.mValiditySecs == 0 && this.mVersion == 0 && this.mLastUpdateSecs == 0;
    }

    @Override // defpackage.dgiq
    public final boolean T() {
        return this.mVersion > 0;
    }

    @Override // defpackage.dgiq
    public final boolean U() {
        return this.mValiditySecs == 0 && this.mVersion == 0;
    }

    @Override // defpackage.dgiq
    public final boolean V() {
        return this.mValiditySecs == -1 && this.mVersion == -1;
    }

    @Override // defpackage.dgiq
    public final boolean W() {
        return this.mValiditySecs > 0 && this.mVersion == 0;
    }

    @Override // defpackage.dgiq
    public final boolean X() {
        return this.mReconfigRequested;
    }

    @Override // defpackage.dgiq
    public final boolean Y() {
        return this.mVersion == 0 && this.mValiditySecs == 0;
    }

    @Override // defpackage.dgiq
    public final boolean Z() {
        return this.mValiditySecs >= 0 || this.mVersion >= 0 || this.mReconfigRequested;
    }

    @Override // defpackage.dgiq
    public final int a() {
        return this.mConfigState;
    }

    @Override // defpackage.dgiq
    public final boolean aa() {
        return T() && this.mConfigState == 1 && g() > 0 && !this.mReconfigRequested;
    }

    @Override // defpackage.dgiq
    public final boolean ab() {
        return T() && !ac() && this.mConfigState == 1 && g() > 0;
    }

    @Override // defpackage.dgiq
    public final boolean ac() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(dhkl.a().longValue());
        int i = this.mValiditySecs;
        int iMax = i / 10;
        if (i > 25200) {
            iMax = Math.max(iMax, 25200);
        }
        int i2 = this.mValiditySecs;
        return i2 == 0 || seconds - this.mLastUpdateSecs >= ((long) (i2 - iMax)) || this.mReconfigRequested;
    }

    @Override // defpackage.dgiq
    public final boolean ad() {
        return this.mConfigState == 3;
    }

    @Override // defpackage.dgiq
    public final void ae() {
        this.mConfigState = 1;
    }

    @Override // defpackage.dgiq
    public final int b() {
        return this.rcsState;
    }

    @Override // defpackage.dgiq
    public final int c() {
        return this.mType;
    }

    @Override // defpackage.dgiq
    public final int d() {
        return this.mValiditySecs;
    }

    @Override // defpackage.dgiq
    public final int e() {
        return this.mVersion;
    }

    @Override // defpackage.dgiq
    @Deprecated
    public final long f() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(dhkl.a().longValue());
        int i = this.mValiditySecs;
        int iMax = i / 10;
        if (i > 25200) {
            iMax = Math.max(iMax, 25200);
        }
        return Math.max(0L, (this.mValiditySecs - iMax) - (seconds - this.mLastUpdateSecs));
    }

    @Override // defpackage.dgiq
    public final long g() {
        return Math.max(0L, this.mValiditySecs - (TimeUnit.MILLISECONDS.toSeconds(dhkl.a().longValue()) - this.mLastUpdateSecs));
    }

    @Override // defpackage.dgiq
    public final CapabilityConfiguration h() {
        return this.mCapabilityDiscoveryConfiguration;
    }

    @Override // defpackage.dgiq
    public final ChatbotConfiguration i() {
        return this.mChatbotConfiguration;
    }

    @Override // defpackage.dgiq
    public final InvalidConfigReason j() {
        InvalidConfigReason invalidConfigReason = this.invalidConfigReason;
        return invalidConfigReason == null ? InvalidConfigReason.INVALID_CONFIG_REASON_UNSPECIFIED : invalidConfigReason;
    }

    @Override // defpackage.dgiq
    public final Token k() {
        return this.mToken;
    }

    @Override // defpackage.dgiq
    public final ConfirmationConfiguration l() {
        return this.mConfirmationConfiguration;
    }

    @Override // defpackage.dgiq
    public final dgis m() {
        return (dgis) this.c.get();
    }

    @Override // defpackage.dgiq
    @Deprecated
    public final ImsConfiguration n() {
        return this.mImsConfiguration;
    }

    @Override // defpackage.dgiq
    public final InstantMessageConfiguration o() {
        return this.mInstantMessageConfiguration;
    }

    @Override // defpackage.dgiq
    public final PresenceConfiguration p() {
        return this.mPresenceConfiguration;
    }

    @Override // defpackage.dgiq
    public final ServerMessage q() {
        return this.mServerMessage;
    }

    @Override // defpackage.dgiq
    public final ServicesConfiguration r() {
        return this.mServicesConfiguration;
    }

    @Override // defpackage.dgiq
    public final UserExperienceConfiguration s() {
        return this.mUserExperienceConfig;
    }

    @Override // defpackage.dgiq
    public final WelcomeMessage t() {
        return this.welcomeMessage;
    }

    @Override // defpackage.dgiq
    public final Optional u() {
        return Optional.ofNullable(this.mlsConfiguration);
    }

    @Override // defpackage.dgiq
    public final Optional v() {
        String str = (String) dfog.o().a.aH.a();
        if (str.isEmpty()) {
            return Optional.ofNullable(this.tachyonUrl);
        }
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleRcsEngine");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/ims/provisioning/config/Configuration", "getTachyonPhoneChannelUrl", 735, "Configuration.java")).t("Using Tachyon URL override for testing: %s", str);
        return Optional.of(str);
    }

    @Override // defpackage.dgiq
    public final String w() {
        return this.mDeviceId;
    }

    @Override // defpackage.dgiq
    public final String x() {
        return this.iccids;
    }

    @Override // defpackage.dgiq
    public final String y() {
        StringBuilder sb = new StringBuilder("Type: ");
        sb.append(this.mType);
        sb.append(", Version: ");
        sb.append(this.mVersion);
        sb.append(", Validity: ");
        sb.append(this.mValiditySecs);
        sb.append(", Last updated: ");
        sb.append(this.mLastUpdateSecs);
        sb.append(", Remaining validity: ");
        sb.append(g());
        sb.append(", Reconfiguration requested: ");
        sb.append(this.mReconfigRequested);
        sb.append(", Messaging technology: ");
        sb.append(this.mInstantMessageConfiguration.mMessageTech == 0 ? "SIMPLE_IM" : "CPM");
        sb.append(", rcsVolteSingleRegistration: ");
        sb.append(m().C());
        if (dfpi.E()) {
            sb.append("Invalid configreason: ".concat(String.valueOf(String.valueOf(j()))));
        }
        return sb.toString();
    }

    @Override // defpackage.dgiq
    public final String z() {
        return this.mTachyonAuthToken;
    }
}
