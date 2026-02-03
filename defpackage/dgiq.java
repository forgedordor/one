package defpackage;

import com.google.android.ims.provisioning.config.CapabilityConfiguration;
import com.google.android.ims.provisioning.config.ChatbotConfiguration;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.ConfirmationConfiguration;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.provisioning.config.PresenceConfiguration;
import com.google.android.ims.provisioning.config.ServerMessage;
import com.google.android.ims.provisioning.config.ServicesConfiguration;
import com.google.android.ims.provisioning.config.UserExperienceConfiguration;
import com.google.android.ims.provisioning.config.WelcomeMessage;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface dgiq {
    String A();

    String B();

    void C();

    void D(ImsConfiguration imsConfiguration);

    void E(Configuration.InvalidConfigReason invalidConfigReason);

    void F();

    void G(long j);

    void H(int i);

    void I(boolean z);

    void J(ServerMessage serverMessage);

    void K(Configuration.Token token);

    void L();

    void M(int i);

    void N(int i);

    void O(WelcomeMessage welcomeMessage);

    boolean P();

    boolean Q();

    boolean R();

    boolean S();

    boolean T();

    boolean U();

    boolean V();

    boolean W();

    boolean X();

    boolean Y();

    boolean Z();

    int a();

    boolean aa();

    boolean ab();

    boolean ac();

    boolean ad();

    void ae();

    int b();

    int c();

    int d();

    int e();

    long f();

    long g();

    CapabilityConfiguration h();

    ChatbotConfiguration i();

    Configuration.InvalidConfigReason j();

    Configuration.Token k();

    ConfirmationConfiguration l();

    dgis m();

    @Deprecated
    ImsConfiguration n();

    InstantMessageConfiguration o();

    PresenceConfiguration p();

    ServerMessage q();

    ServicesConfiguration r();

    UserExperienceConfiguration s();

    WelcomeMessage t();

    Optional u();

    Optional v();

    String w();

    String x();

    String y();

    String z();
}
