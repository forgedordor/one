package defpackage;

import android.os.Bundle;
import androidx.car.app.model.Alert;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmtp {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu h;
    private final Object i = new Object();
    private final Bundle g = new Bundle();
    private final HashMap j = new HashMap();

    public cmtp(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.h = fcsuVar3;
        this.a = fcsuVar4;
        this.b = fcsuVar5;
        this.c = fcsuVar6;
        this.d = fcsuVar7;
        ecaf.c().i(new ebzs("carrierConfigDump", new ebzo(this)));
    }

    public static Bundle a() {
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
        return bundle;
    }

    private static void e(Bundle bundle, TreeMap treeMap, cmtq cmtqVar) {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj == null) {
                obj = "null";
            }
            treeMap.put(str, new cmtf(obj, cmtqVar));
        }
    }

    private static void f(final Bundle bundle, Optional optional, final String str) {
        optional.ifPresent(new Consumer() { // from class: cmtn
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final Bundle b(int i) {
        cuuq cuuqVarA;
        Bundle bundle = new Bundle();
        synchronized (this.i) {
            HashMap map = this.j;
            Integer numValueOf = Integer.valueOf(i);
            cuuqVarA = (cuuq) map.get(numValueOf);
            if (cuuqVarA == null) {
                cuuqVarA = ((cuur) this.h.b()).a(i);
                map.put(numValueOf, cuuqVarA);
            }
        }
        f(bundle, cuuqVarA.c(), "mms_auto_retrieve_enabled_bool");
        f(bundle, cuuqVarA.d(), "mmsRoamingAutoRetrieveByDefault");
        f(bundle, cuuqVarA.g(), "enableWapPushSI");
        f(bundle, cuuqVarA.e(), "enableGroupMms");
        f(bundle, cuuqVarA.i(), "smsUsesSimpleCharactersOnly");
        f(bundle, cuuqVarA.f(), "enableSMSDeliveryReports");
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [alqm, java.lang.Object] */
    public final String c() {
        fcsu fcsuVar = this.e;
        Stream map = Collection.EL.stream(((crny) fcsuVar.b()).m()).map(new Function() { // from class: cmto
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((crof) obj).a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
        StringBuilder sb = new StringBuilder();
        int size = ekgbVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iIntValue = ((Integer) ekgbVar.get(i2)).intValue();
            Optional optionalI = ((crny) fcsuVar.b()).h(iIntValue).i(true);
            String str = (optionalI.isEmpty() || optionalI.get().w()) ? "empty\n" : "non-empty (redacted)\n";
            sb.append("Carrier config values based on subId: " + iIntValue + ":\nLine number: " + str + ((String) Collection.EL.stream(d(iIntValue, true).entrySet()).map(new Function() { // from class: cmtm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object objB = ((cmtr) entry.getValue()).b();
                    String str2 = (String) entry.getKey();
                    int iB = cmuc.b(objB) - 1;
                    return str2 + "=" + (iB != 4 ? iB != 5 ? objB.toString() : Arrays.toString((String[]) objB) : Arrays.toString((int[]) objB)) + ", Source: " + ((cmtr) entry.getValue()).a().toString();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining("\n"))));
            sb.append("\n");
        }
        return sb.toString();
    }

    public final TreeMap d(int i, boolean z) {
        TreeMap treeMap = new TreeMap();
        e(a(), treeMap, cmtq.DEFAULTS);
        if (this.f.b() != null) {
            e(((cmuy) this.b.b()).a(i), treeMap, cmtq.BUGLE_MMS_CONFIG);
            e(((cmux) this.a.b()).a(i), treeMap, cmtq.OEM_SPECIFIC_OVERRIDE);
            if (z) {
                e(((cmve) this.c.b()).a(i), treeMap, cmtq.PLATFORM);
            }
            e(((cmuo) this.d.b()).a(i), treeMap, cmtq.SERVER_SIDE_OVERRIDE_MOBILE_CONFIG);
        }
        e(b(i), treeMap, cmtq.USER_SETTING);
        e(this.g, treeMap, cmtq.DEBUG_MENU);
        return treeMap;
    }
}
