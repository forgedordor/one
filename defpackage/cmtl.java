package defpackage;

import android.os.Bundle;
import androidx.car.app.model.Alert;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmtl {
    public static final /* synthetic */ int l = 0;
    private static final ekgb m = ekgb.C("aliasEnabled", "allowChangingMmsRoamingAutoRetrieve", "allowEditingSmscAddress", "allowEnablingWapPushSI", "enabledMMS", "enabledNotifyWapMMSC", "enabledTransID", "enableGroupMms", "enableMultipartSMS", "enableWapPushSI", "groupChatDefaultsToMMS", "mms_auto_retrieve_enabled_bool", "mmsRoamingAutoRetrieveByDefault", "sendMultipartSmsAsSeparateMessages", "smsEncodingChangeable", "smsUsesSimpleCharactersOnly", "supportHttpCharsetHeader", "supportMmsContentDisposition", "supportMmsPriority", "useCustomUserAgent");
    private static final ekgb n = ekgb.C("aliasMaxChars", "aliasMinChars", "emailGatewaySmsToMmsTextThreshold", "httpSocketTimeout", "maxImageHeight", "maxImageWidth", "maxMessageTextSize", "recipientLimit", "smsToMmsTextLengthThreshold", "smsToMmsTextThreshold", "maxMessageSize", "maxSubjectLength", new String[0]);
    private static final ekgb o = ekgb.v("emailGatewayNumber", "httpParams", "naiSuffix", "spamForwardingNumber", "uaProfTagName");
    public final cmtg a;
    public final cmtp b;
    public final cmux c;
    public final cmuy d;
    public final cmve e;
    public final cmuo f;
    public final Bundle g;
    public final Bundle h;
    public Bundle i;
    public Bundle j;
    public Bundle k;
    private final Bundle p;
    private final Bundle q;

    public cmtl(cmtg cmtgVar, cmtp cmtpVar, cmux cmuxVar, cmuy cmuyVar, cmve cmveVar, cmuo cmuoVar) {
        this.a = cmtgVar;
        this.b = cmtpVar;
        this.c = cmuxVar;
        this.d = cmuyVar;
        this.e = cmveVar;
        this.f = cmuoVar;
        Bundle bundle = new Bundle();
        bundle.putBoolean("enabledMMS", true);
        bundle.putBoolean("enabledTransID", false);
        bundle.putBoolean("enabledNotifyWapMMSC", false);
        bundle.putBoolean("aliasEnabled", false);
        bundle.putBoolean("enableMultipartSMS", true);
        bundle.putBoolean("enableSMSDeliveryReports", true);
        bundle.putBoolean("enableGroupMms", true);
        bundle.putBoolean("supportMmsContentDisposition", true);
        bundle.putBoolean("config_cellBroadcastAppLinks", true);
        bundle.putBoolean("sendMultipartSmsAsSeparateMessages", false);
        bundle.putBoolean("supportHttpCharsetHeader", false);
        bundle.putBoolean("groupChatDefaultsToMMS", true);
        bundle.putBoolean("smsEncodingChangeable", true);
        bundle.putBoolean("smsUsesSimpleCharactersOnly", false);
        bundle.putBoolean("allowEnablingWapPushSI", false);
        bundle.putBoolean("enableWapPushSI", false);
        bundle.putBoolean("supportMmsPriority", true);
        bundle.putBoolean("mms_auto_retrieve_enabled_bool", true);
        bundle.putBoolean("mmsRoamingAutoRetrieveByDefault", false);
        bundle.putBoolean("smsDeliveryReportSettingOnByDefault", false);
        bundle.putBoolean("allowChangingMmsRoamingAutoRetrieve", true);
        bundle.putBoolean("useCustomUserAgent", false);
        bundle.putBoolean("allowEditingSmscAddress", false);
        bundle.putInt("maxMessageSize", 307200);
        bundle.putInt("maxImageHeight", 480);
        bundle.putInt("maxImageWidth", 640);
        bundle.putInt("recipientLimit", Alert.DURATION_SHOW_INDEFINITELY);
        bundle.putInt("httpSocketTimeout", kx.a);
        bundle.putInt("aliasMinChars", 2);
        bundle.putInt("aliasMaxChars", 48);
        bundle.putInt("smsToMmsTextThreshold", -1);
        bundle.putInt("smsToMmsTextLengthThreshold", -1);
        bundle.putInt("maxMessageTextSize", -1);
        bundle.putInt("maxSubjectLength", 40);
        bundle.putInt("emailGatewaySmsToMmsTextThreshold", -1);
        bundle.putString("uaProfTagName", "x-wap-profile");
        bundle.putString("httpParams", "");
        bundle.putString("emailGatewayNumber", "");
        bundle.putString("naiSuffix", "");
        bundle.putString("hiddenContactsData", "");
        bundle.putString("smsErrorDescMap", "");
        bundle.putString("spamForwardingNumber", "");
        this.p = bundle;
        this.g = new Bundle();
        this.h = new Bundle();
        this.i = new Bundle();
        this.j = new Bundle();
        this.k = new Bundle();
        this.q = new Bundle();
    }

    private static Optional d(Bundle bundle, String str) {
        if (bundle == null || !bundle.containsKey(str)) {
            return Optional.empty();
        }
        String string = bundle.getString(str);
        if (string == null) {
            string = "null";
        }
        return Optional.of(string);
    }

    public final elhv a(String str) {
        if (!m.contains(str)) {
            throw new IllegalArgumentException(a.a(str, "Carrier config key: ", " does not refer to a boolean value"));
        }
        elhu elhuVar = (elhu) elhv.a.createBuilder();
        Bundle bundle = this.p;
        if (bundle.containsKey(str)) {
            boolean z = bundle.getBoolean(str);
            elhuVar.copyOnWrite();
            elhv elhvVar = (elhv) elhuVar.instance;
            elhvVar.b |= 4;
            elhvVar.e = z;
            elhuVar.copyOnWrite();
            elhv elhvVar2 = (elhv) elhuVar.instance;
            elhvVar2.b |= 1;
            elhvVar2.c = z;
            elhuVar.copyOnWrite();
            elhv elhvVar3 = (elhv) elhuVar.instance;
            elhvVar3.d = 1;
            elhvVar3.b |= 2;
        }
        Bundle bundle2 = this.g;
        if (bundle2.containsKey(str)) {
            boolean z2 = bundle2.getBoolean(str);
            elhuVar.copyOnWrite();
            elhv elhvVar4 = (elhv) elhuVar.instance;
            elhvVar4.b |= 8;
            elhvVar4.f = z2;
            elhuVar.copyOnWrite();
            elhv elhvVar5 = (elhv) elhuVar.instance;
            elhvVar5.b |= 1;
            elhvVar5.c = z2;
            elhuVar.copyOnWrite();
            elhv elhvVar6 = (elhv) elhuVar.instance;
            elhvVar6.d = 2;
            elhvVar6.b |= 2;
        }
        Bundle bundle3 = this.h;
        if (bundle3.containsKey(str)) {
            boolean z3 = bundle3.getBoolean(str);
            elhuVar.copyOnWrite();
            elhv elhvVar7 = (elhv) elhuVar.instance;
            elhvVar7.b |= 16;
            elhvVar7.g = z3;
            elhuVar.copyOnWrite();
            elhv elhvVar8 = (elhv) elhuVar.instance;
            elhvVar8.b |= 1;
            elhvVar8.c = z3;
            elhuVar.copyOnWrite();
            elhv elhvVar9 = (elhv) elhuVar.instance;
            elhvVar9.d = 3;
            elhvVar9.b |= 2;
        }
        Bundle bundle4 = this.i;
        if (bundle4 != null && bundle4.containsKey(str)) {
            boolean z4 = this.i.getBoolean(str);
            elhuVar.copyOnWrite();
            elhv elhvVar10 = (elhv) elhuVar.instance;
            elhvVar10.b |= 32;
            elhvVar10.h = z4;
            elhuVar.copyOnWrite();
            elhv elhvVar11 = (elhv) elhuVar.instance;
            elhvVar11.b |= 1;
            elhvVar11.c = z4;
            elhuVar.copyOnWrite();
            elhv elhvVar12 = (elhv) elhuVar.instance;
            elhvVar12.d = 4;
            elhvVar12.b |= 2;
        }
        if (this.k.containsKey(str)) {
            boolean z5 = this.k.getBoolean(str);
            elhuVar.copyOnWrite();
            elhv elhvVar13 = (elhv) elhuVar.instance;
            elhvVar13.b |= 128;
            elhvVar13.j = z5;
            elhuVar.copyOnWrite();
            elhv elhvVar14 = (elhv) elhuVar.instance;
            elhvVar14.b |= 1;
            elhvVar14.c = z5;
            elhuVar.copyOnWrite();
            elhv elhvVar15 = (elhv) elhuVar.instance;
            elhvVar15.d = 8;
            elhvVar15.b |= 2;
        }
        Bundle bundle5 = this.q;
        if (bundle5.containsKey(str)) {
            boolean z6 = bundle5.getBoolean(str);
            elhuVar.copyOnWrite();
            elhv elhvVar16 = (elhv) elhuVar.instance;
            elhvVar16.b |= 256;
            elhvVar16.k = z6;
            elhuVar.copyOnWrite();
            elhv elhvVar17 = (elhv) elhuVar.instance;
            elhvVar17.b |= 1;
            elhvVar17.c = z6;
            elhuVar.copyOnWrite();
            elhv elhvVar18 = (elhv) elhuVar.instance;
            elhvVar18.d = 7;
            elhvVar18.b |= 2;
        }
        if (this.j.containsKey(str)) {
            boolean z7 = this.j.getBoolean(str);
            elhuVar.copyOnWrite();
            elhv elhvVar19 = (elhv) elhuVar.instance;
            elhvVar19.b |= 64;
            elhvVar19.i = z7;
            elhuVar.copyOnWrite();
            elhv elhvVar20 = (elhv) elhuVar.instance;
            elhvVar20.b |= 1;
            elhvVar20.c = z7;
            elhuVar.copyOnWrite();
            elhv elhvVar21 = (elhv) elhuVar.instance;
            elhvVar21.d = 5;
            elhvVar21.b |= 2;
        }
        return (elhv) elhuVar.build();
    }

    public final embi b(String str) {
        if (!n.contains(str)) {
            throw new IllegalArgumentException(a.a(str, "Carrier config key: ", " does not refer to an int value"));
        }
        embh embhVar = (embh) embi.a.createBuilder();
        Bundle bundle = this.p;
        if (bundle.containsKey(str)) {
            int i = bundle.getInt(str);
            embhVar.copyOnWrite();
            embi embiVar = (embi) embhVar.instance;
            embiVar.b |= 4;
            embiVar.e = i;
            embhVar.copyOnWrite();
            embi embiVar2 = (embi) embhVar.instance;
            embiVar2.b |= 1;
            embiVar2.c = i;
            embhVar.copyOnWrite();
            embi embiVar3 = (embi) embhVar.instance;
            embiVar3.d = 1;
            embiVar3.b |= 2;
        }
        Bundle bundle2 = this.g;
        if (bundle2.containsKey(str)) {
            int i2 = bundle2.getInt(str);
            embhVar.copyOnWrite();
            embi embiVar4 = (embi) embhVar.instance;
            embiVar4.b |= 8;
            embiVar4.f = i2;
            embhVar.copyOnWrite();
            embi embiVar5 = (embi) embhVar.instance;
            embiVar5.b |= 1;
            embiVar5.c = i2;
            embhVar.copyOnWrite();
            embi embiVar6 = (embi) embhVar.instance;
            embiVar6.d = 2;
            embiVar6.b |= 2;
        }
        Bundle bundle3 = this.h;
        if (bundle3.containsKey(str)) {
            int i3 = bundle3.getInt(str);
            embhVar.copyOnWrite();
            embi embiVar7 = (embi) embhVar.instance;
            embiVar7.b |= 16;
            embiVar7.g = i3;
            embhVar.copyOnWrite();
            embi embiVar8 = (embi) embhVar.instance;
            embiVar8.b |= 1;
            embiVar8.c = i3;
            embhVar.copyOnWrite();
            embi embiVar9 = (embi) embhVar.instance;
            embiVar9.d = 3;
            embiVar9.b |= 2;
        }
        Bundle bundle4 = this.i;
        if (bundle4 != null && bundle4.containsKey(str)) {
            int i4 = this.i.getInt(str);
            embhVar.copyOnWrite();
            embi embiVar10 = (embi) embhVar.instance;
            embiVar10.b |= 32;
            embiVar10.h = i4;
            embhVar.copyOnWrite();
            embi embiVar11 = (embi) embhVar.instance;
            embiVar11.b |= 1;
            embiVar11.c = i4;
            embhVar.copyOnWrite();
            embi embiVar12 = (embi) embhVar.instance;
            embiVar12.d = 4;
            embiVar12.b |= 2;
        }
        if (this.k.containsKey(str)) {
            int i5 = this.k.getInt(str);
            embhVar.copyOnWrite();
            embi embiVar13 = (embi) embhVar.instance;
            embiVar13.b |= 128;
            embiVar13.j = i5;
            embhVar.copyOnWrite();
            embi embiVar14 = (embi) embhVar.instance;
            embiVar14.b |= 1;
            embiVar14.c = i5;
            embhVar.copyOnWrite();
            embi embiVar15 = (embi) embhVar.instance;
            embiVar15.d = 8;
            embiVar15.b |= 2;
        }
        Bundle bundle5 = this.q;
        if (bundle5.containsKey(str)) {
            int i6 = bundle5.getInt(str);
            embhVar.copyOnWrite();
            embi embiVar16 = (embi) embhVar.instance;
            embiVar16.b |= 256;
            embiVar16.k = i6;
            embhVar.copyOnWrite();
            embi embiVar17 = (embi) embhVar.instance;
            embiVar17.b |= 1;
            embiVar17.c = i6;
            embhVar.copyOnWrite();
            embi embiVar18 = (embi) embhVar.instance;
            embiVar18.d = 7;
            embiVar18.b |= 2;
        }
        if (this.j.containsKey(str)) {
            int i7 = this.j.getInt(str);
            embhVar.copyOnWrite();
            embi embiVar19 = (embi) embhVar.instance;
            embiVar19.b |= 64;
            embiVar19.i = i7;
            embhVar.copyOnWrite();
            embi embiVar20 = (embi) embhVar.instance;
            embiVar20.b |= 1;
            embiVar20.c = i7;
            embhVar.copyOnWrite();
            embi embiVar21 = (embi) embhVar.instance;
            embiVar21.d = 5;
            embiVar21.b |= 2;
        }
        return (embi) embhVar.build();
    }

    public final emit c(String str) {
        if (!o.contains(str)) {
            throw new IllegalArgumentException(a.a(str, "Carrier config key: ", " does not refer to a String value"));
        }
        emis emisVar = (emis) emit.a.createBuilder();
        Optional optionalD = d(this.p, str);
        if (optionalD.isPresent()) {
            Object obj = optionalD.get();
            emisVar.copyOnWrite();
            emit emitVar = (emit) emisVar.instance;
            emitVar.b |= 4;
            emitVar.e = (String) obj;
            Object obj2 = optionalD.get();
            emisVar.copyOnWrite();
            emit emitVar2 = (emit) emisVar.instance;
            emitVar2.b |= 1;
            emitVar2.c = (String) obj2;
            emisVar.copyOnWrite();
            emit emitVar3 = (emit) emisVar.instance;
            emitVar3.d = 1;
            emitVar3.b |= 2;
        }
        Optional optionalD2 = d(this.g, str);
        if (optionalD2.isPresent()) {
            Object obj3 = optionalD2.get();
            emisVar.copyOnWrite();
            emit emitVar4 = (emit) emisVar.instance;
            emitVar4.b |= 8;
            emitVar4.f = (String) obj3;
            Object obj4 = optionalD2.get();
            emisVar.copyOnWrite();
            emit emitVar5 = (emit) emisVar.instance;
            emitVar5.b |= 1;
            emitVar5.c = (String) obj4;
            emisVar.copyOnWrite();
            emit emitVar6 = (emit) emisVar.instance;
            emitVar6.d = 2;
            emitVar6.b |= 2;
        }
        Optional optionalD3 = d(this.h, str);
        if (optionalD3.isPresent()) {
            Object obj5 = optionalD3.get();
            emisVar.copyOnWrite();
            emit emitVar7 = (emit) emisVar.instance;
            emitVar7.b |= 16;
            emitVar7.g = (String) obj5;
            Object obj6 = optionalD3.get();
            emisVar.copyOnWrite();
            emit emitVar8 = (emit) emisVar.instance;
            emitVar8.b |= 1;
            emitVar8.c = (String) obj6;
            emisVar.copyOnWrite();
            emit emitVar9 = (emit) emisVar.instance;
            emitVar9.d = 3;
            emitVar9.b |= 2;
        }
        Optional optionalD4 = d(this.i, str);
        if (optionalD4.isPresent()) {
            Object obj7 = optionalD4.get();
            emisVar.copyOnWrite();
            emit emitVar10 = (emit) emisVar.instance;
            emitVar10.b |= 32;
            emitVar10.h = (String) obj7;
            Object obj8 = optionalD4.get();
            emisVar.copyOnWrite();
            emit emitVar11 = (emit) emisVar.instance;
            emitVar11.b |= 1;
            emitVar11.c = (String) obj8;
            emisVar.copyOnWrite();
            emit emitVar12 = (emit) emisVar.instance;
            emitVar12.d = 4;
            emitVar12.b |= 2;
        }
        Optional optionalD5 = d(this.k, str);
        if (optionalD5.isPresent()) {
            Object obj9 = optionalD5.get();
            emisVar.copyOnWrite();
            emit emitVar13 = (emit) emisVar.instance;
            emitVar13.b |= 128;
            emitVar13.j = (String) obj9;
            Object obj10 = optionalD5.get();
            emisVar.copyOnWrite();
            emit emitVar14 = (emit) emisVar.instance;
            emitVar14.b |= 1;
            emitVar14.c = (String) obj10;
            emisVar.copyOnWrite();
            emit emitVar15 = (emit) emisVar.instance;
            emitVar15.d = 8;
            emitVar15.b |= 2;
        }
        Optional optionalD6 = d(this.q, str);
        if (optionalD6.isPresent()) {
            Object obj11 = optionalD6.get();
            emisVar.copyOnWrite();
            emit emitVar16 = (emit) emisVar.instance;
            emitVar16.b |= 256;
            emitVar16.k = (String) obj11;
            Object obj12 = optionalD6.get();
            emisVar.copyOnWrite();
            emit emitVar17 = (emit) emisVar.instance;
            emitVar17.b |= 1;
            emitVar17.c = (String) obj12;
            emisVar.copyOnWrite();
            emit emitVar18 = (emit) emisVar.instance;
            emitVar18.d = 7;
            emitVar18.b |= 2;
        }
        Optional optionalD7 = d(this.j, str);
        if (optionalD7.isPresent()) {
            Object obj13 = optionalD7.get();
            emisVar.copyOnWrite();
            emit emitVar19 = (emit) emisVar.instance;
            emitVar19.b |= 64;
            emitVar19.i = (String) obj13;
            Object obj14 = optionalD7.get();
            emisVar.copyOnWrite();
            emit emitVar20 = (emit) emisVar.instance;
            emitVar20.b |= 1;
            emitVar20.c = (String) obj14;
            emisVar.copyOnWrite();
            emit emitVar21 = (emit) emisVar.instance;
            emitVar21.d = 5;
            emitVar21.b |= 2;
        }
        return (emit) emisVar.build();
    }
}
