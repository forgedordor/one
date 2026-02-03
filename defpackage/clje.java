package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.telephony.CarrierConfigManager;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.time.Duration;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clje implements cliy {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl");
    public final Context b;
    public final fdjx c;
    public final Set d;
    public final fduf e;
    private final cqbm f;
    private final Duration g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final fctc l;
    private fdvc m;

    public clje(Context context, fdjx fdjxVar, cqbm cqbmVar, Duration duration, Set set, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        context.getClass();
        fdjxVar.getClass();
        cqbmVar.getClass();
        set.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.b = context;
        this.c = fdjxVar;
        this.f = cqbmVar;
        this.g = duration;
        this.d = set;
        this.h = fcsuVar;
        this.i = fcsuVar2;
        this.j = fcsuVar3;
        this.k = fcsuVar4;
        cljh cljhVar = cljh.a;
        fduf fdufVarA = fdvf.a(cljhVar);
        this.e = fdufVarA;
        this.l = fctd.a(new fdae() { // from class: cliz
            @Override // defpackage.fdae
            public final Object invoke() {
                return (CarrierConfigManager) this.a.b.getSystemService(CarrierConfigManager.class);
            }
        });
        final long jA = fdkj.a(fdhi.j(fdhk.g(duration.getSeconds(), fdhl.d), fdhk.f(duration.getNano(), fdhl.a)));
        if (jA < 0) {
            throw new IllegalArgumentException("Debounce timeout should not be negative");
        }
        this.m = fdtg.b(new fdtm(jA != 0 ? new fdwr(new fdqj(new fdap() { // from class: fdqd
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return Long.valueOf(jA);
            }
        }, fdufVarA, null)) : fdufVarA, new cljb(this, null)), fdjxVar, fdur.a, cljhVar);
    }

    private final cljh l() {
        PersistableBundle config;
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleSatellite");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "getSatelliteConnectionType", 181, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("Detecting satellite connection type.");
        if (j() == null) {
            ekrw ekrwVarH2 = ekrgVar.h();
            ekrwVarH2.X(ekrzVar, "BugleSatellite");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "getSatelliteConnectionType", 207, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("Carrier config manager is null. Using non granular connection type");
            return cljh.b;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            CarrierConfigManager carrierConfigManagerJ = j();
            carrierConfigManagerJ.getClass();
            config = carrierConfigManagerJ.getConfig("carrier_roaming_ntn_connect_type_int");
        } else {
            CarrierConfigManager carrierConfigManagerJ2 = j();
            carrierConfigManagerJ2.getClass();
            config = carrierConfigManagerJ2.getConfig();
        }
        Integer numValueOf = config != null ? Integer.valueOf(config.getInt("carrier_roaming_ntn_connect_type_int")) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            ekrw ekrwVarH3 = ekrgVar.h();
            ekrwVarH3.X(ekrzVar, "BugleSatellite");
            ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "getSatelliteConnectionType", 194, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("New satellite connection type: automatic");
            return cljh.b;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            ekrw ekrwVarH4 = ekrgVar.h();
            ekrwVarH4.X(ekrzVar, "BugleSatellite");
            ((ekrd) ekrwVarH4.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "getSatelliteConnectionType", 198, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("New satellite connection type: manual");
            return cljh.c;
        }
        ekrw ekrwVarH5 = ekrgVar.h();
        ekrwVarH5.X(ekrzVar, "BugleSatellite");
        ((ekrd) ekrwVarH5.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "getSatelliteConnectionType", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("New satellite connection type: unknown");
        return cljh.a;
    }

    private final void m(axcm axcmVar) {
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleSatellite");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "updateSatelliteConnectionTypeForMyIdentity", 213, "ConversationSatelliteConnectionChangeListenerImpl.kt")).t("Detecting satellite connection type for: %s", axcmVar);
        if (j() != null && Build.VERSION.SDK_INT >= 34) {
            auvw.m(this.c, null, new cljd(this, axcmVar, null), 3);
            return;
        }
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrwVarH2.X(ekrzVar, "BugleSatellite");
        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "updateSatelliteConnectionTypeForMyIdentity", 244, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("Flag is off. Using non granular connection type");
        this.e.f(cljh.b);
    }

    @Override // defpackage.cliu
    public final void a(axcm axcmVar) {
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "offSatellite", 163, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("offSatellite");
        this.e.f(cljh.e);
    }

    @Override // defpackage.cliu
    public final void b(axcm axcmVar) {
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "onDefaultDataSatelliteEvent", 126, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("onDefaultDataSatelliteEvent: updating the state");
        if (((asag) this.i.b()).a()) {
            m(axcmVar);
        } else {
            this.e.f(l());
        }
    }

    @Override // defpackage.cliu
    public final void e(axcm axcmVar) {
        ekrg ekrgVar = a;
        ekrw ekrwVarE = ekrgVar.e();
        ekrz ekrzVar = eksq.a;
        ekrwVarE.X(ekrzVar, "BugleSatellite");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "onSmsSatelliteEvent", 135, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("onSmsSatelliteEvent");
        if (((asan) this.h.b()).a()) {
            ekrw ekrwVarH = ekrgVar.h();
            ekrwVarH.X(ekrzVar, "BugleSatellite");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "onSmsSatelliteEvent", 137, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("onSmsSatelliteEvent: updating the state...");
            if (((asag) this.i.b()).a()) {
                m(axcmVar);
                return;
            } else {
                this.e.f(l());
                return;
            }
        }
        if (((cqey) this.f.a()).w()) {
            ekrw ekrwVarH2 = ekrgVar.h();
            ekrwVarH2.X(ekrzVar, "BugleSatellite");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "onSmsSatelliteEvent", 152, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("onSmsSatelliteEvent: wifi available, ignoring the update.");
            return;
        }
        ekrw ekrwVarH3 = ekrgVar.h();
        ekrwVarH3.X(ekrzVar, "BugleSatellite");
        ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "onSmsSatelliteEvent", 145, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("onSmsSatelliteEvent: no wifi available, updating the state...");
        if (((asag) this.i.b()).a()) {
            m(axcmVar);
        } else {
            this.e.f(l());
        }
    }

    @Override // defpackage.cliu
    public final void f(axcm axcmVar) {
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleSatellite");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "onSatelliteManualConnectEligible", 110, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("onSatelliteManualConnectEligible");
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrwVarH2.X(ekrzVar, "BugleSatellite");
        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "onSatelliteManualConnectEligible", 112, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("Updating the state: eligible for manual satellite connection");
        this.e.f(cljh.d);
    }

    @Override // defpackage.cliu
    public final void g() {
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "offDefaultDataSatelliteToTerrestrial", 158, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("offDefaultDataSatelliteToTerrestrial");
        this.e.f(cljh.e);
    }

    @Override // defpackage.cliy
    public final fdvc h() {
        return this.m;
    }

    @Override // defpackage.cliy
    public final void i() {
        ekrg ekrgVar = a;
        ekrw ekrwVarG = ekrgVar.g();
        ekrz ekrzVar = eksq.a;
        ekrwVarG.X(ekrzVar, "BugleSatellite");
        ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "notifyInteractive", 93, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("notifyInteractive");
        fduf fdufVar = this.e;
        if (fdufVar.c() != cljh.a) {
            ekrw ekrwVarG2 = ekrgVar.g();
            ekrwVarG2.X(ekrzVar, "BugleSatellite");
            ((ekrd) ekrwVarG2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "notifyInteractive", 95, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("Connection state is not UNKNOWN, ignoring");
            return;
        }
        cqbm cqbmVar = this.f;
        if (((cqey) cqbmVar.a()).w() || !(((cqey) cqbmVar.a()).s() || ((cqey) cqbmVar.a()).q())) {
            ekrw ekrwVarH = ekrgVar.h();
            ekrwVarH.X(ekrzVar, "BugleSatellite");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "notifyInteractive", 104, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("Updating the state: no satellite connection.");
            fdufVar.f(cljh.e);
            return;
        }
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrwVarH2.X(ekrzVar, "BugleSatellite");
        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "notifyInteractive", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("Updating the state: has satellite connection.");
        fdufVar.f(l());
    }

    public final CarrierConfigManager j() {
        return (CarrierConfigManager) this.l.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.axcm r5, defpackage.fcxy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cljc
            if (r0 == 0) goto L13
            r0 = r6
            cljc r0 = (defpackage.cljc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cljc r0 = new cljc
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.k
            java.lang.Object r6 = r6.b()
            awzf r6 = (defpackage.awzf) r6
            r0.c = r3
            java.lang.Object r6 = r6.g(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            fcsu r5 = r4.j
            awxn r6 = (defpackage.awxn) r6
            java.lang.Object r5 = r5.b()
            awyu r5 = (defpackage.awyu) r5
            awyv r5 = r5.a(r6)
            j$.util.Optional r5 = r5.d()
            r5.getClass()
            java.lang.Object r5 = defpackage.fdct.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clje.k(axcm, fcxy):java.lang.Object");
    }

    @Override // defpackage.cliu
    public final /* synthetic */ void c(axcm axcmVar) {
    }

    @Override // defpackage.cliu
    public final /* synthetic */ void d(axcm axcmVar) {
    }
}
