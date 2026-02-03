package com.google.android.apps.messaging.auto;

import android.content.Context;
import android.content.res.Resources;
import androidx.car.app.CarAppBinder;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.ains;
import defpackage.apnw;
import defpackage.cly;
import defpackage.cquc;
import defpackage.csc;
import defpackage.csd;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.fcsu;
import defpackage.lun;
import defpackage.lvj;
import defpackage.sye;
import defpackage.syw;
import defpackage.sza;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MessagingTemplateScreenServiceModule extends sye implements lun {
    public static final ekrg c = ekrg.c("com/google/android/apps/messaging/auto/MessagingTemplateScreenServiceModule");
    public fcsu d;
    public fcsu e;
    public fcsu f;
    public fcsu g;
    public syw h;
    private cly i;

    @Override // defpackage.cku
    public final csd b() throws Resources.NotFoundException {
        if ((getApplicationInfo().flags & 2) != 0) {
            return csd.a;
        }
        Context applicationContext = getApplicationContext();
        HashMap map = new HashMap();
        String[] stringArray = applicationContext.getResources().getStringArray(R.array.hosts_allowlist_sample);
        if (stringArray == null) {
            throw new IllegalArgumentException("Invalid allowlist res id: 2130903100");
        }
        for (String str : stringArray) {
            String[] strArrSplit = str.split(",", -1);
            if (strArrSplit.length != 2) {
                throw new IllegalArgumentException(a.a(str, "Invalid allowed host entry: '", "'"));
            }
            String strA = csc.a(strArrSplit[1]);
            String strA2 = csc.a(strArrSplit[0]);
            strA.getClass();
            strA2.getClass();
            List arrayList = (List) map.get(strA);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(strA, arrayList);
            }
            arrayList.add(strA2);
        }
        return new csd(applicationContext.getPackageManager(), map, false);
    }

    @Override // defpackage.lun
    public final void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final void d(lvj lvjVar) {
        ekrw ekrwVarE = c.e();
        ekrwVarE.X(eksq.a, "BugleAppOnAuto");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/auto/MessagingTemplateScreenServiceModule", "onResume", 96, "MessagingTemplateScreenServiceModule.java")).q("CarAppService onResume");
    }

    @Override // defpackage.lun
    public final void f(lvj lvjVar) {
        ekrw ekrwVarE = c.e();
        ekrwVarE.X(eksq.a, "BugleAppOnAuto");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/auto/MessagingTemplateScreenServiceModule", "onStop", 107, "MessagingTemplateScreenServiceModule.java")).q("CarAppService onStop");
    }

    @Override // defpackage.lun
    public final void fh(lvj lvjVar) {
    }

    @Override // defpackage.cku
    public final cly fi() {
        eieu eieuVarK = eiiy.k("MessagingTemplateScreenServiceModule#onCreateSession");
        try {
            sza szaVar = new sza(this);
            this.i = szaVar;
            szaVar.a.c(this);
            eieuVarK.close();
            return this.i;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.lun
    public final void gG(lvj lvjVar) {
        ekrw ekrwVarE = c.e();
        ekrwVarE.X(eksq.a, "BugleAppOnAuto");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/auto/MessagingTemplateScreenServiceModule", "onStart", 87, "MessagingTemplateScreenServiceModule.java")).q("CarAppService onStart");
        if (((apnw) this.g.b()).a()) {
            ((ains) this.f.b()).c("Bugle.Auto.App.Open");
        }
    }

    @Override // defpackage.cku, android.app.Service
    public final void onDestroy() {
        cquc cqucVar;
        ekrw ekrwVarE = c.e();
        ekrwVarE.X(eksq.a, "BugleAppOnAuto");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/auto/MessagingTemplateScreenServiceModule", "onDestroy", 118, "MessagingTemplateScreenServiceModule.java")).q("CarAppService onDestroy");
        syw sywVar = this.h;
        if (sywVar != null && (cqucVar = sywVar.g) != null) {
            cqucVar.a();
            sywVar.g = null;
        }
        this.i.a.d(this);
        Map map = this.a;
        synchronized (map) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((CarAppBinder) it.next()).destroy();
            }
            map.clear();
        }
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gF(lvj lvjVar) {
    }
}
