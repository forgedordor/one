package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmuh {
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/sms/config/MmsConfig");
    public final int a;
    public final Bundle b;
    public cmug c = null;

    public cmuh(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    public static void x(Bundle bundle, int i, String str, Object obj) {
        try {
            if (i == 0) {
                throw null;
            }
            int i2 = i - 1;
            if (i2 == 0) {
                bundle.putInt(str, Integer.parseInt(String.valueOf(obj)));
                return;
            }
            if (i2 == 1) {
                bundle.putBoolean(str, Boolean.parseBoolean(String.valueOf(obj)));
                return;
            }
            if (i2 == 2) {
                bundle.putLong(str, Long.parseLong(String.valueOf(obj)));
                return;
            }
            if (i2 == 3) {
                bundle.putString(str, String.valueOf(obj));
                return;
            }
            if (i2 == 4) {
                bundle.putIntArray(str, (int[]) obj);
            } else {
                if (i2 != 6) {
                    return;
                }
                ekrw ekrwVarJ = d.j();
                ekrwVarJ.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/sms/config/MmsConfig", "update", 303, "MmsConfig.java")).t("Attempted to update a carrier config value of unknown keytype. Key: %s", str);
            }
        } catch (NumberFormatException e) {
            ekrw ekrwVarJ2 = d.j();
            ekrwVarJ2.X(eksq.a, "Bugle");
            ekrd ekrdVar = (ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(e)).h("com/google/android/apps/messaging/shared/sms/config/MmsConfig", "update", 308, "MmsConfig.java");
            if (i == 0) {
                throw null;
            }
            ekrdVar.D("Attempted to update a carrier config value with incorrect keytype. Key: %s, keyType: %s", str, cmuc.a(i));
        }
    }

    public final int a() {
        return this.b.getInt("emailGatewaySmsToMmsTextThreshold", -1);
    }

    public final int b() {
        return this.b.getInt("maxMessageSize", 307200);
    }

    public final int c() {
        return this.b.getInt("maxSubjectLength", 40);
    }

    public final int d() {
        int i = this.b.getInt("maxMessageTextSize", -1);
        if (i >= 0) {
            return i;
        }
        return 10000;
    }

    public final int e() {
        int i = this.b.getInt("recipientLimit", Alert.DURATION_SHOW_INDEFINITELY);
        return i < 0 ? Alert.DURATION_SHOW_INDEFINITELY : i;
    }

    public final int f() {
        return this.b.getInt("smsToMmsTextLengthThreshold", -1);
    }

    final Optional g() {
        String string = this.b.getString("hiddenContactsData", "");
        return TextUtils.isEmpty(string) ? Optional.empty() : Optional.of(string);
    }

    public final String h() {
        return this.b.getString("emailGatewayNumber", "");
    }

    public final String i() {
        return this.b.getString("spamForwardingNumber", "");
    }

    public final boolean j() {
        return this.b.getBoolean("allowChangingMmsRoamingAutoRetrieve", true);
    }

    public final boolean k() {
        return this.b.getBoolean("enableWapPushSI", false);
    }

    public final boolean l() {
        return this.b.getBoolean("groupChatDefaultsToMMS", true);
    }

    public final boolean m() {
        return p() && this.b.getBoolean("enableGroupMms", true);
    }

    public final boolean n() {
        return this.b.getBoolean("mms_auto_retrieve_enabled_bool", true);
    }

    public final boolean o() {
        return this.b.getBoolean("mmsRoamingAutoRetrieveByDefault", false);
    }

    public final boolean p() {
        return this.b.getBoolean("enabledMMS", true);
    }

    public final boolean q() {
        return this.b.getBoolean("enabledNotifyWapMMSC", false);
    }

    public final boolean r() {
        return this.b.getBoolean("sendMultipartSmsAsSeparateMessages", false);
    }

    public final boolean s() {
        return this.b.getBoolean("smsDeliveryReportSettingOnByDefault", false);
    }

    public final boolean t() {
        return this.b.getBoolean("enableSMSDeliveryReports", true);
    }

    public final boolean u() {
        return this.b.getBoolean("smsUsesSimpleCharactersOnly", false);
    }

    public final boolean v() {
        return this.b.getBoolean("supportMmsContentDisposition", true);
    }

    public final boolean w() {
        return this.b.getBoolean("supportMmsPriority", true);
    }
}
