package com.google.android.apps.messaging.shared.net;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.net.DittoForegroundService;
import com.google.android.apps.messaging.ui.ditto.DittoActivity;
import com.google.android.apps.messaging.ui.gaia.GaiaDittoActivity;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.aiiw;
import defpackage.aipo;
import defpackage.auvh;
import defpackage.bvll;
import defpackage.cdip;
import defpackage.ceea;
import defpackage.cefj;
import defpackage.ceov;
import defpackage.cgdc;
import defpackage.cqce;
import defpackage.cqzr;
import defpackage.craf;
import defpackage.ekrg;
import defpackage.eooz;
import defpackage.eoqg;
import defpackage.fcsu;
import defpackage.kve;
import defpackage.kvf;
import defpackage.kvq;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class DittoForegroundService extends cefj {
    public static final cqce a = cqce.g("BugleServices", "DittoForegroundService");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/net/DittoForegroundService");
    public cqzr c;
    public fcsu d;
    public fcsu e;
    public fcsu f;
    public fcsu g;
    public fcsu h;
    public fcsu i;
    public fcsu j;
    private boolean k;

    public static Intent a(Context context) {
        return aiiw.c(context, DittoForegroundService.class, "android.intent.action.VIEW").a();
    }

    public final void b(Optional optional) {
        if (optional.isEmpty()) {
            a.r("Intent not available");
            return;
        }
        String id = this.c.a().getId();
        kve kveVar = new kve(R.drawable.quantum_ic_phonelink_off_black_18, getString(R.string.ditto_foreground_service_sign_out), (PendingIntent) optional.get());
        kveVar.d = true;
        kvf kvfVarA = kveVar.a();
        CharSequence text = getText(R.string.ditto_foreground_service_device_pairing_notification_title);
        CharSequence text2 = getText(R.string.ditto_foreground_service_device_pairing_notification_text);
        kvq kvqVar = new kvq(this, id);
        kvqVar.i(text);
        kvqVar.h(text2);
        kvqVar.r(R.drawable.quantum_ic_phonelink_white_24);
        kvqVar.l = 0;
        kvqVar.g = (PendingIntent) optional.get();
        if (craf.b) {
            kvqVar.e(kvfVarA);
        }
        startForeground(1, kvqVar.a());
        ((aipo) this.f.b()).b("Bugle.Ditto.Notification.Foreground.Duration");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new ceea();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        a.m("Destroying DittoForegroundService...");
        this.k = false;
        ((aipo) this.f.b()).k("Bugle.Ditto.Notification.Foreground.Duration");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (this.k) {
            return 2;
        }
        if (((Optional) this.d.b()).isEmpty()) {
            a.r("DittoForegroundService is not available in this device");
            return 2;
        }
        if (((Boolean) cdip.a.e()).booleanValue() && ((Optional) this.g.b()).isPresent()) {
            auvh.i(((bvll) this.h.b()).d().i(new eooz() { // from class: cedy
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    bvlj bvljVar = (bvlj) obj;
                    boolean z = bvljVar.c;
                    String str = bvljVar.d;
                    final DittoForegroundService dittoForegroundService = this.a;
                    if (!z || ejwk.c(str)) {
                        return eijx.e(((cgdc) dittoForegroundService.e.b()).c(dittoForegroundService));
                    }
                    ((ekrd) ((ekrd) DittoForegroundService.b.e()).h("com/google/android/apps/messaging/shared/net/DittoForegroundService", "getPendingIntentForManagingPairedDevices", 187, "DittoForegroundService.java")).q("Gaia device pairing is available");
                    eiju eijuVarG = eiju.g(((egej) dittoForegroundService.i.b()).c(str));
                    ejvr ejvrVar = new ejvr() { // from class: cedv
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            return Optional.of((efwo) obj2);
                        }
                    };
                    eoqg eoqgVar = eoqg.a;
                    return eijuVarG.h(ejvrVar, eoqgVar).e(egdj.class, new ejvr() { // from class: cedw
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            return Optional.empty();
                        }
                    }, eoqgVar).h(new ejvr() { // from class: cedx
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            Intent intentA;
                            Optional optional = (Optional) obj2;
                            if (optional.isEmpty()) {
                                ((ekrd) ((ekrd) DittoForegroundService.b.j()).h("com/google/android/apps/messaging/shared/net/DittoForegroundService", "getPendingIntentForManagingPairedDevices", 198, "DittoForegroundService.java")).q("Not able to get accountId when generating Gaia device pairing notification");
                            } else {
                                ((ekrd) ((ekrd) DittoForegroundService.b.e()).h("com/google/android/apps/messaging/shared/net/DittoForegroundService", "getPendingIntentForManagingPairedDevices", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "DittoForegroundService.java")).q("Retrieved accountId when generating Gaia device pairing notification");
                            }
                            DittoForegroundService dittoForegroundService2 = dittoForegroundService;
                            optional.getClass();
                            if (((Boolean) cdip.a.e()).booleanValue() && optional.isPresent()) {
                                intentA = aiiw.c(dittoForegroundService2, GaiaDittoActivity.class, "android.intent.action.VIEW").a();
                                intentA.getClass();
                                efyp.c(intentA, (efwo) optional.get());
                            } else {
                                intentA = aiiw.c(dittoForegroundService2, DittoActivity.class, "android.intent.action.VIEW").a();
                                intentA.getClass();
                            }
                            intentA.putExtra("started_from_notification", true);
                            return Optional.ofNullable(ebsn.a(dittoForegroundService2, -1, intentA, crag.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS)));
                        }
                    }, eoqgVar);
                }
            }, (Executor) this.j.b()), new Consumer() { // from class: cedz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    this.a.b((Optional) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, eoqg.a);
        } else {
            b(((cgdc) this.e.b()).c(this));
        }
        ((ceov) ((Optional) this.d.b()).get()).c();
        this.k = true;
        return 2;
    }
}
