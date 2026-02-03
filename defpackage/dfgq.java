package defpackage;

import android.net.Uri;
import android.os.PersistableBundle;
import android.telephony.TelephonyManager;
import android.telephony.gba.UaSecurityProtocolIdentifier;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfgq {
    public final dfhc a;
    public final dfgd b;
    private final dhkv c;
    private final eosc d;

    public dfgq(dhkv dhkvVar, eosc eoscVar, dfhc dfhcVar, dfgd dfgdVar) {
        this.c = dhkvVar;
        this.d = eoscVar;
        this.a = dfhcVar;
        this.b = dfgdVar;
    }

    public final ListenableFuture a(String str, boolean z) throws dhkf {
        Uri uri;
        SettableFuture settableFutureCreate = SettableFuture.create();
        dfgn dfgnVar = new dfgn(this, settableFutureCreate);
        TelephonyManager telephonyManager = this.c.a;
        PersistableBundle carrierConfig = telephonyManager.getCarrierConfig();
        int i = carrierConfig.getInt("gba_ua_security_organization_int");
        int i2 = carrierConfig.getInt("gba_ua_security_protocol_int");
        int i3 = carrierConfig.getInt("gba_ua_tls_cipher_suite_int");
        dhja.c("[SR] Creating the security protocol identifier: organization - %s, protocol - %s, cipher suite - %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        UaSecurityProtocolIdentifier uaSecurityProtocolIdentifierBuild = new UaSecurityProtocolIdentifier.Builder().setOrg(i).setProtocol(i2).setTlsCipherSuite(i3).build();
        try {
            dfny dfnyVar = dfhq.a;
            String str2 = (String) dfog.o().a.s.a();
            if (TextUtils.isEmpty(str2)) {
                Uri uri2 = Uri.parse(str);
                uri = Uri.parse(String.format("%s://%s@%s", uri2.getScheme(), "3GPP-bootstrapping", uri2.getHost()));
            } else {
                uri = Uri.parse(str2);
                String userInfo = uri.getUserInfo();
                if (userInfo == null || !userInfo.equals("3GPP-bootstrapping")) {
                    throw new IllegalStateException(String.format("Wrong NAF ID %s. GBA mode is %s instead of %s.", uri, uri.getUserInfo(), "3GPP-bootstrapping"));
                }
                if (!TextUtils.isEmpty(uri.getPath())) {
                    throw new IllegalStateException(String.format("Wrong NAF ID %s. The path should be empty, but was %s.", uri, uri.getPath()));
                }
            }
            Uri uri3 = uri;
            dhja.c("[SR] Making a bootstrap authentication request to %s with forcedBootstrapping = %s", uri3, Boolean.valueOf(z));
            try {
                try {
                    telephonyManager.bootstrapAuthenticationRequest(5, uri3, new dhkc(uaSecurityProtocolIdentifierBuild).a, z, this.d, new dhkb(dfgnVar).a);
                    return settableFutureCreate;
                } catch (SecurityException e) {
                    throw new dhkf("PERFORM_IMS_SINGLE_REGISTRATION and MODIFY_PHONE_STATE permissions required", e);
                }
            } catch (dhkf e2) {
                dfhc dfhcVar = this.a;
                ewgq ewgqVar = (ewgq) ewgv.a.createBuilder();
                ewgqVar.copyOnWrite();
                ewgv ewgvVar = (ewgv) ewgqVar.instance;
                ewgvVar.c = 1;
                ewgvVar.b |= 1;
                ewgqVar.copyOnWrite();
                ewgv ewgvVar2 = (ewgv) ewgqVar.instance;
                ewgvVar2.d = 2;
                ewgvVar2.b |= 2;
                dfhcVar.a(4, (ewgv) ewgqVar.build());
                settableFutureCreate.setException(e2);
                return settableFutureCreate;
            }
        } catch (IllegalStateException e3) {
            dfhc dfhcVar2 = this.a;
            ewgq ewgqVar2 = (ewgq) ewgv.a.createBuilder();
            ewgqVar2.copyOnWrite();
            ewgv ewgvVar3 = (ewgv) ewgqVar2.instance;
            ewgvVar3.c = 1;
            ewgvVar3.b |= 1;
            ewgqVar2.copyOnWrite();
            ewgv ewgvVar4 = (ewgv) ewgqVar2.instance;
            ewgvVar4.d = 4;
            ewgvVar4.b |= 2;
            dfhcVar2.a(4, (ewgv) ewgqVar2.build());
            settableFutureCreate.setException(e3);
            return settableFutureCreate;
        }
    }
}
