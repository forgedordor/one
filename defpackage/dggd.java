package defpackage;

import android.content.Context;
import android.content.Intent;
import android.telephony.ims.ProvisioningManager;
import com.android.vcard.VCardConfig;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.Map;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dggd extends ProvisioningManager.RcsProvisioningCallback {
    public final AtomicBoolean d = new AtomicBoolean(false);
    private final String f;
    private final dgrs g;
    private final dgqw h;
    private final Context i;
    private final dgkj j;
    private final dggb k;
    private final int l;
    private final dfip m;
    private static final dhip e = new dhip("SingleRegistrationProvisioningListener[SR]");
    static final dfny a = dfod.a(190016284);
    static final dfny b = dfnv.b("enable_single_reg_preprovisioning_without_tos");
    static final dfny c = dfnv.b("disable_configuration_reset_on_callback_removed");

    public dggd(Context context, dgrs dgrsVar, dgqw dgqwVar, dgkj dgkjVar, dfip dfipVar, String str, int i, dggb dggbVar) {
        this.i = context;
        this.f = str;
        this.l = i;
        this.j = dgkjVar;
        this.g = dgrsVar;
        this.m = dfipVar;
        this.h = dgqwVar;
        this.k = dggbVar;
    }

    private final void a() {
        this.g.x(this.f, null);
    }

    private final void b(boolean z) {
        Intent intent = new Intent(RcsIntents.ACTION_RCS_SINGLE_REGISTRATION_PROVISIONING_EVENT);
        String str = this.f;
        Intent intentPutExtra = intent.putExtra(RcsIntents.EXTRA_SIM_ID, str);
        int i = this.l;
        Intent intentPutExtra2 = intentPutExtra.putExtra(RcsIntents.EXTRA_SUB_ID, i).putExtra(RcsIntents.EXTRA_SETUP_VENDOR_IMS, z);
        intentPutExtra2.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        dhjm.b(this.i, intentPutExtra2, "com.google.android.apps.messaging.rcsprovisioning.singleregistration.SingleRegistrationProvisioningEventReceiver", dhjl.SINGLE_REGISTRATION_PROVISIONING_LISTENER);
        dhja.d(e, "RcsSingleRegistrationProvisioningEvent was sent for simId: %s, subId: %d, setupVendorIms: %b", dhiz.SIM_ID.c(str), Integer.valueOf(i), Boolean.valueOf(z));
    }

    public final void onAutoConfigurationErrorReceived(int i, String str) {
        if (dfog.K() && this.g.F(this.f)) {
            dhja.r(e, "ignoring auto configuration error when SR is disabled: %d, %s", Integer.valueOf(i), str);
            return;
        }
        dhja.q("AutoConfiguration error received. Error Code: %d, Error Description: %s", Integer.valueOf(i), str);
        if (((Boolean) a.a()).booleanValue()) {
            this.k.c(i);
        }
    }

    public final void onConfigurationChanged(byte[] bArr) {
        if (dfog.K() && this.g.F(this.f)) {
            dhja.r(e, "ignoring RCS configuration update received when SR is disabled", new Object[0]);
            return;
        }
        dhip dhipVar = e;
        dhja.l(dhipVar, "RCS configuration update is received.", new Object[0]);
        Configuration configuration = new Configuration();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            Charset charsetDefaultCharset = StandardCharsets.UTF_8;
            ThreadLocal threadLocal = ffgz.a;
            ffhb ffhbVar = new ffhb();
            int i = ffgw.a;
            if (charsetDefaultCharset == null) {
                charsetDefaultCharset = Charset.defaultCharset();
            }
            InputStreamReader inputStreamReader = new InputStreamReader(byteArrayInputStream, charsetDefaultCharset);
            char[] cArr = (char[]) ffgz.a.get();
            Arrays.fill(cArr, (char) 0);
            while (true) {
                int i2 = inputStreamReader.read(cArr);
                if (i2 == -1) {
                    break;
                } else {
                    ffhbVar.write(cArr, 0, i2);
                }
            }
            String string = ffhbVar.toString();
            dhja.d(dhipVar, "%s", "RCS configuration XML:");
            for (String str : string.split("(?<=>)", -1)) {
                dhja.d(dhipVar, "%s", dhiz.GENERIC.c(str.trim()));
            }
            this.h.a(new ByteArrayInputStream(string.getBytes(StandardCharsets.UTF_8)), configuration, true);
            dhja.l(dhipVar, "RCS config was parsed successfully.", new Object[0]);
            if (((Boolean) a.a()).booleanValue()) {
                this.k.e(true);
            }
        } catch (dgqu | IOException e2) {
            dhja.j(e2, e, "Failed to parse the config received from Provisioning AOSP.", new Object[0]);
            if (((Boolean) a.a()).booleanValue()) {
                this.k.e(false);
            }
        }
        dgrs dgrsVar = this.g;
        String str2 = this.f;
        dgiq dgiqVarF = dgrsVar.f(str2);
        ImsConfiguration imsConfiguration = configuration.mImsConfiguration;
        ImsConfiguration imsConfigurationN = dgiqVarF.n();
        imsConfiguration.mDomain = imsConfigurationN.mDomain;
        imsConfiguration.f(imsConfigurationN.mPublicIdentity, imsConfigurationN.mUserName);
        imsConfiguration.mPcscfAddress = imsConfigurationN.mPcscfAddress;
        imsConfiguration.mPcsfPort = imsConfigurationN.mPcsfPort;
        this.j.d(configuration, dgrsVar.f(str2), str2);
        this.d.set(true);
        b(false);
    }

    public final void onConfigurationReset() {
        if (dfog.K() && this.g.F(this.f)) {
            dhja.r(e, "ignoring RCS configuration reset when SR is disabled", new Object[0]);
            return;
        }
        dhja.l(e, "RCS configuration is not longer valid.", new Object[0]);
        if (((Boolean) a.a()).booleanValue()) {
            this.k.f();
        }
        a();
        b(false);
    }

    public final void onPreProvisioningReceived(byte[] bArr) {
        if (dfog.K() && this.g.F(this.f)) {
            dhja.r(e, "ignoring preprovisioning event when SR is disabled.", new Object[0]);
            return;
        }
        if (((Boolean) b.a()).booleanValue()) {
            dhja.l(e, "triggering MVS pre-provisioning reconfiguration", new Object[0]);
            Intent intent = new Intent(RcsIntents.ACTION_RCS_RECONFIGURATION_REQUIRED);
            intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            dhjm.b(this.i, intent, "com.google.android.apps.messaging.rcsprovisioning.RcsProvisioningBroadcastReceiver", dhjl.SINGLE_REGISTRATION_PROVISIONING_LISTENER);
        } else {
            dhja.r(e, "Pre provisioning configuration received. This should never happen, because AM doesn't support self-provisioning.", new Object[0]);
        }
        if (((Boolean) a.a()).booleanValue()) {
            this.k.g();
        }
    }

    public final void onRemoved() {
        if (dfog.K() && this.g.F(this.f)) {
            dhja.r(e, "ignoring RCS configuration removed when SR is disabled", new Object[0]);
            return;
        }
        dhja.l(e, "The RcsProvisioningCallback instance is removed from AOSP.", new Object[0]);
        if (((Boolean) a.a()).booleanValue()) {
            this.k.d();
        }
        if (!((Boolean) c.a()).booleanValue()) {
            a();
        }
        b(true);
        dfip dfipVar = this.m;
        if (dfipVar != null) {
            dhja.c("[SR]: onCallbackTermination", new Object[0]);
            Map.EL.remove(dfipVar.a, Integer.valueOf(dfipVar.b), dfipVar.c);
        }
    }
}
