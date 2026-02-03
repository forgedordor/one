package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.PersistableBundle;
import android.telephony.CarrierConfigManager;
import android.telephony.SubscriptionInfo;
import defpackage.cebq;
import defpackage.ckzp;
import defpackage.cmlb;
import defpackage.cmmh;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.dfaq;
import defpackage.dfpi;
import defpackage.dhff;
import defpackage.dhja;
import defpackage.dhka;
import defpackage.dhkf;
import defpackage.dhkp;
import defpackage.dhks;
import defpackage.dhkv;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.fcsu;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class ConfigSmsReceiver extends ckzp {
    private static final cqce f = cqce.g("Bugle", "ConfigSmsReceiver");
    public fcsu a;
    public fcsu b;
    public fcsu c;
    public fcsu d;
    public fcsu e;

    @Override // defpackage.cldb
    protected final int a() {
        return 2;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.b.b()).c("ConfigSmsReceiver Receive broadcast", "com/google/android/apps/messaging/shared/receiver/ConfigSmsReceiver", "beginRootTrace", 59);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.ConfigSmsReceiver.Latency";
    }

    @Override // defpackage.clca
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.ConfigSmsReceiver.Latency";
    }

    @Override // defpackage.clca
    public final void g(Context context, final Intent intent) throws dhkf {
        CarrierConfigManager carrierConfigManager;
        cqce cqceVar = f;
        cqbd cqbdVarD = cqceVar.d();
        cqbdVarD.I("processBroadcast");
        cqbdVarD.I(intent);
        cqbdVarD.r();
        this.a.b();
        int iM = m(intent);
        Uri data = intent.getData();
        boolean zEquals = false;
        int port = data != null ? data.getPort() : 0;
        if (iM != port) {
            cqbd cqbdVarC = cqceVar.c();
            cqbdVarC.I("processSmsIntent, port not matching, ignoring.");
            cqbdVarC.y("expectedPort", iM);
            cqbdVarC.y("actual port", port);
            cqbdVarC.r();
            return;
        }
        boolean zH = dhka.h(context);
        cqbd cqbdVarC2 = cqceVar.c();
        cqbdVarC2.I("shouldNotifyListeners:");
        cqbdVarC2.B("isDefaultSmsApp", zH);
        cqbdVarC2.r();
        if (zH) {
            ((Optional) this.c.b()).ifPresent(new Consumer() { // from class: ckzg
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Iterator it = ((Set) obj).iterator();
                    while (it.hasNext()) {
                        ((cldv) it.next()).s(intent);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            boolean zK = dhka.k(context);
            PersistableBundle config = null;
            if (dhkv.g(context).a.getPhoneCount() > 1) {
                try {
                    List listD = dhks.b(context).d();
                    if (listD != null && !listD.isEmpty()) {
                        Iterator it = listD.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                zEquals = true;
                                break;
                            }
                            int subscriptionId = ((SubscriptionInfo) it.next()).getSubscriptionId();
                            try {
                                try {
                                    carrierConfigManager = dhkp.a(context).a;
                                } catch (SecurityException e) {
                                    throw new dhkf("READ_PHONE_STATE permission is missing.", e);
                                }
                            } catch (dhkf unused) {
                                dhja.g("Missing permissions, can't read carrier configs.", new Object[0]);
                            }
                            PersistableBundle configForSubId = carrierConfigManager != null ? carrierConfigManager.getConfigForSubId(subscriptionId) : null;
                            String string = configForSubId == null ? "" : configForSubId.getString("config_ims_package_override_string", "");
                            dhja.k("KEY_CONFIG_IMS_PACKAGE_OVERRIDE_STRING: %s", string);
                            if (!"com.google.android.ims".equals(string)) {
                                break;
                            }
                        }
                    } else {
                        dhja.k("No active subscription, returning false.", new Object[0]);
                    }
                } catch (dhkf unused2) {
                    dhja.k("No permission to getActiveSubscriptionInfo", new Object[0]);
                }
            } else {
                try {
                    try {
                        CarrierConfigManager carrierConfigManager2 = dhkp.a(context).a;
                        if (carrierConfigManager2 != null) {
                            config = carrierConfigManager2.getConfig();
                        }
                    } catch (SecurityException e2) {
                        throw new dhkf("READ_PHONE_STATE permission is missing.", e2);
                    }
                } catch (dhkf unused3) {
                    dhja.g("Missing permissions, can't read carrier configs.", new Object[0]);
                }
                String string2 = config != null ? config.getString("config_ims_package_override_string", "") : "";
                dhja.k("KEY_CONFIG_IMS_PACKAGE_OVERRIDE_STRING: %s", string2);
                zEquals = string2.equals("com.google.android.ims");
            }
            cqce cqceVar2 = f;
            cqbd cqbdVarC3 = cqceVar2.c();
            cqbdVarC3.I("shouldIgnoreBroadcast:");
            cqbdVarC3.B("shouldUseCarrierServicesJibeService", zK);
            cqbdVarC3.B("isCsApkImsService", zEquals);
            cqbdVarC3.r();
            if (!zK || zEquals) {
                cqceVar2.q("processSmsIntent. RCS Engine should not be running in CarrierServices, returning.");
                return;
            }
            cqceVar2.p("processSmsIntent, forwarding sms Intent to CarrierServices.");
            Intent intent2 = new Intent("com.google.android.ims.action.RAW_SMS_RECEIVED");
            intent2.putExtra("original_intent", intent);
            dhff.c(context, intent2);
            intent2.setPackage("com.google.android.ims");
            context.sendBroadcast(intent2);
        }
    }

    @Override // defpackage.clca
    public final boolean i(Intent intent) {
        return true;
    }

    final int m(Intent intent) {
        int iIntValue;
        if (dfpi.z()) {
            int intExtra = intent.getIntExtra("subscription", -1);
            if (intExtra < 0) {
                cqbd cqbdVarE = f.e();
                cqbdVarE.I("Invalid/Missing subId in intent.");
                cqbdVarE.y("subId", intExtra);
                cqbdVarE.r();
            }
            int iMax = Math.max(intExtra, -1);
            try {
                iIntValue = ((cebq) this.d.b()).c(((cmmh) ((cmlb) this.e.b()).i(iMax).orElseThrow()).c).k;
                cqbd cqbdVarA = f.a();
                cqbdVarA.I("getSmsPort from mobileConfig");
                cqbdVarA.y("expectedPort", iIntValue);
                cqbdVarA.r();
            } catch (NoSuchElementException unused) {
                cqbd cqbdVarE2 = f.e();
                cqbdVarE2.I("no SimSubscriptionInfo found for subId in the intent.");
                cqbdVarE2.y("subId", iMax);
                cqbdVarE2.r();
                return 0;
            }
        } else {
            iIntValue = ((Integer) dfaq.E().C().a()).intValue();
            cqbd cqbdVarA2 = f.a();
            cqbdVarA2.I("getSmsPort from RcsFlags");
            cqbdVarA2.y("expectedPort", iIntValue);
            cqbdVarA2.r();
        }
        return Math.max(0, iIntValue);
    }
}
