package com.google.android.apps.messaging.shared.fcm.impl;

import android.text.TextUtils;
import defpackage.aill;
import defpackage.ains;
import defpackage.auvh;
import defpackage.cdbr;
import defpackage.cdcw;
import defpackage.cmxk;
import defpackage.cmxm;
import defpackage.cmxn;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.dggw;
import defpackage.dxjk;
import defpackage.dxmy;
import defpackage.dzfh;
import defpackage.dztc;
import defpackage.eieh;
import defpackage.eieu;
import defpackage.eigp;
import defpackage.eiiy;
import defpackage.ekgp;
import defpackage.ellf;
import defpackage.ellg;
import defpackage.ellh;
import defpackage.esju;
import defpackage.eyas;
import defpackage.eyat;
import defpackage.eyau;
import defpackage.eyav;
import defpackage.fcsu;
import defpackage.feln;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class BugleFirebaseMessagingService extends cdcw {
    private static final cqce h = cqce.g("BugleNetwork", "BugleFirebaseMessagingService");
    public Map a;
    public ains b;
    public eigp c;
    public fcsu d;
    public fcsu e;
    public fcsu f;

    public BugleFirebaseMessagingService() {
        dztc.a.d(dzfh.b(getClass()));
    }

    private final void h(String str, int i, String str2) {
        eieu eieuVarK = eiiy.k("BugleFirebaseMessagingService::logTickle");
        try {
            eyat eyatVar = (eyat) eyau.a.createBuilder();
            eyatVar.copyOnWrite();
            ((eyau) eyatVar.instance).b = i;
            if (str != null) {
                eyatVar.copyOnWrite();
                ((eyau) eyatVar.instance).c = str;
            }
            eyas eyasVar = (eyas) eyav.a.createBuilder();
            eyasVar.copyOnWrite();
            ((eyav) eyasVar.instance).f = feln.a(96);
            eyasVar.copyOnWrite();
            ((eyav) eyasVar.instance).d = 1;
            eyasVar.copyOnWrite();
            ((eyav) eyasVar.instance).e = 28;
            eyasVar.copyOnWrite();
            eyav eyavVar = (eyav) eyasVar.instance;
            eyau eyauVar = (eyau) eyatVar.build();
            eyauVar.getClass();
            eyavVar.g = eyauVar;
            eyavVar.b |= 1;
            if (str2 != null) {
                eyasVar.copyOnWrite();
                ((eyav) eyasVar.instance).c = str2;
            }
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            ellf ellfVar = ellf.BUGLE_TACHYON_TRANSPORT_EVENT;
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            ellhVar.j = ellfVar.f11do;
            ellhVar.b |= 1;
            ellgVar.copyOnWrite();
            ellh ellhVar2 = (ellh) ellgVar.instance;
            eyav eyavVar2 = (eyav) eyasVar.build();
            eyavVar2.getClass();
            ellhVar2.R = eyavVar2;
            ellhVar2.c |= 262144;
            ((aill) this.d.b()).j(ellgVar);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void a(esju esjuVar) {
        eieh eiehVarC = this.c.c("BugleFirebaseMessagingService.onMessageReceived", "com/google/android/apps/messaging/shared/fcm/impl/BugleFirebaseMessagingService", "onMessageReceived", 74);
        try {
            String str = "";
            String str2 = (esjuVar.c() == null || !esjuVar.c().containsKey("event")) ? "" : (String) esjuVar.c().get("event");
            if (esjuVar.c() != null && esjuVar.c().containsKey("tickle")) {
                str = (String) esjuVar.c().get("tickle");
            }
            if (dxmy.a(dxjk.b(esjuVar), esjuVar.d(), dxjk.a(esjuVar))) {
                str2 = "gnp_chime_message";
            }
            cmxn cmxnVar = (cmxn) this.f.b();
            if (((Boolean) cmxn.n.e()).booleanValue() && !((ConcurrentHashMap) cmxnVar.x.get(cmxm.TACHYGRAM_MESSAGE_ARRIVED.ordinal())).containsKey(str)) {
                cmxnVar.b(cmxm.TICKLE_ARRIVED, str, new cmxk(cmxnVar));
            }
            auvh.h(((dggw) this.e.b()).g());
            fcsu fcsuVar = (fcsu) this.a.get(str2);
            cqbd cqbdVarA = fcsuVar != null ? h.a() : h.e();
            cqbdVarA.I("Received firebase message");
            cqbdVarA.A("with event", str2);
            cqbdVarA.A("with data", esjuVar.c());
            cqbdVarA.A("handler", fcsuVar);
            cqbdVarA.r();
            if (fcsuVar != null) {
                h(str2, ((cdbr) fcsuVar.b()).a(esjuVar), str);
                ((cdbr) fcsuVar.b()).b(esjuVar);
            } else {
                h(str2, 0, str);
            }
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void b(String str) {
        eieh eiehVarC = this.c.c("BugleFirebaseMessagingService.onNewToken", "com/google/android/apps/messaging/shared/fcm/impl/BugleFirebaseMessagingService", "onNewToken", 114);
        try {
            this.b.c("Bugle.Ditto.NewFcmToken.Counts");
            if (TextUtils.isEmpty(str)) {
                h.r("Received empty new token.");
            } else {
                for (fcsu fcsuVar : ((ekgp) this.a).values()) {
                    cqbd cqbdVarA = fcsuVar != null ? h.a() : h.b();
                    cqbdVarA.I("Received new token");
                    cqbdVarA.A("handler", fcsuVar);
                    cqbdVarA.r();
                    if (fcsuVar != null) {
                        ((cdbr) fcsuVar.b()).c();
                    }
                }
            }
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
