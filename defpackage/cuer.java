package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuer extends cmwg {
    public static final cqce a = cqce.g("Bugle", "BugleStartup");
    public final cqbm b;
    private final Context c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final eosc g;

    public cuer(Context context, fcsu fcsuVar, cqbm cqbmVar, fcsu fcsuVar2, fcsu fcsuVar3, eosc eoscVar) {
        this.c = context;
        this.d = fcsuVar;
        this.b = cqbmVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = eoscVar;
    }

    @Override // defpackage.cohg
    public final eieu a() {
        return eiiy.k("PhoneAsyncPermissionsStartupTask");
    }

    @Override // defpackage.cmwg
    public final eiju b() {
        try {
            cqce cqceVar = a;
            cqceVar.p("Registering SIM change receiver...");
            eieu eieuVarK = eiiy.k("PhoneAsyncPermissionsStartupTask#registerSimChangeReceiverAndUpdateAppConfig");
            try {
                lzx lzxVarA = lzx.a(this.c);
                clbg clbgVar = new clbg();
                IntentFilter intentFilterQ = dhey.q();
                HashMap map = lzxVarA.b;
                synchronized (map) {
                    lzw lzwVar = new lzw(intentFilterQ, clbgVar);
                    ArrayList arrayList = (ArrayList) map.get(clbgVar);
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                        map.put(clbgVar, arrayList);
                    }
                    arrayList.add(lzwVar);
                    for (int i = 0; i < intentFilterQ.countActions(); i++) {
                        String action = intentFilterQ.getAction(i);
                        HashMap map2 = lzxVarA.c;
                        ArrayList arrayList2 = (ArrayList) map2.get(action);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList(1);
                            map2.put(action, arrayList2);
                        }
                        arrayList2.add(lzwVar);
                    }
                }
                if (((crnp) this.e.b()).e()) {
                    cqceVar.p("Updating app config...");
                    ((ckyz) this.f.b()).a();
                }
                cqceVar.p("Done with SIM change receiver & app config.");
                eieuVarK.close();
            } finally {
            }
        } catch (RuntimeException e) {
            a.s("Failed to register SIM change receiver.", e);
        }
        a.p("Handling shared prefs upgrade & Load MMS Configuration...");
        final aijf aijfVar = (aijf) this.d.b();
        return eijx.f(new Runnable() { // from class: aijd
            @Override // java.lang.Runnable
            public final void run() {
                eieu eieuVarK2 = eiiy.k("SharedAsyncPermissionsStartupTask#initializeDataModelMmsLibSimInfoProviderAndCsLibFlags");
                final aijf aijfVar2 = aijfVar;
                try {
                    if (((crnp) aijfVar2.d.b()).e()) {
                        ((bwwe) aijfVar2.i.b()).c();
                        aijfVar2.b.registerReceiver((BroadcastReceiver) aijfVar2.k.b(), new IntentFilter("android.telephony.action.CARRIER_CONFIG_CHANGED"), 2);
                    }
                    eieu eieuVarK3 = eiiy.k("SharedAsyncPermissionsStartupTask#initializeSimInfoProviderAndCsLibFlags");
                    try {
                        ((dheq) aijfVar2.h.b()).i();
                        dfoc.m();
                        ((cmjz) aijfVar2.j.b()).a();
                        eieuVarK3.close();
                        fcsu fcsuVar = aijfVar2.c;
                        final int iD = ((crqv) fcsuVar.b()).d("shared_preferences_version", -1);
                        int i2 = Integer.parseInt(aijfVar2.b.getString(R.string.pref_version));
                        if (i2 > iD) {
                            ekrw ekrwVarH = aijf.a.h();
                            ekrwVarH.X(eksq.a, "Bugle");
                            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/SharedAsyncPermissionsStartupTask", "maybeHandleSharedPrefsUpgrade", 123, "SharedAsyncPermissionsStartupTask.java")).u("Upgrading shared prefs from %d to %d", iD, i2);
                            try {
                                ((crqv) fcsuVar.b()).c(iD);
                                ((crny) aijfVar2.e.b()).o(new crnx() { // from class: aije
                                    @Override // defpackage.crnx
                                    public final boolean a(int i3) {
                                        ((crqu) aijfVar2.f.b()).a(i3).c(iD);
                                        return true;
                                    }
                                });
                                ((crqv) fcsuVar.b()).j("shared_preferences_version", i2);
                            } catch (Exception e2) {
                                ekrw ekrwVarI = aijf.a.i();
                                ekrwVarI.X(eksq.a, "Bugle");
                                ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e2)).h("com/google/android/apps/messaging/shared/SharedAsyncPermissionsStartupTask", "maybeHandleSharedPrefsUpgrade", (char) 143, "SharedAsyncPermissionsStartupTask.java")).q("Failed to upgrade shared prefs");
                            }
                        } else if (i2 < iD) {
                            ekrw ekrwVarI2 = aijf.a.i();
                            ekrwVarI2.X(eksq.a, "Bugle");
                            ((ekrd) ((ekrd) ekrwVarI2).h("com/google/android/apps/messaging/shared/SharedAsyncPermissionsStartupTask", "maybeHandleSharedPrefsUpgrade", 148, "SharedAsyncPermissionsStartupTask.java")).u("Shared prefs downgrade requested and ignored. oldVersion = %d, newVersion = %d", iD, i2);
                        }
                        eieuVarK2.close();
                    } finally {
                    }
                } finally {
                }
            }
        }, aijfVar.g).h(new ejvr() { // from class: cueq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar2 = cuer.a;
                cqceVar2.p("Initializing RCS availability...");
                eieu eieuVarK2 = eiiy.k("PhoneAsyncPermissionsStartupTask#initializeRcsAvailability");
                try {
                    ((chza) this.a.b.a()).j();
                    cqceVar2.p("Done with RCS availability.");
                    eieuVarK2.close();
                    cuer.a.p("Done initializing with enabled individual init failures.");
                    return 0;
                } catch (Throwable th) {
                    try {
                        eieuVarK2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, this.g);
    }

    @Override // defpackage.cmwz
    public final boolean c() {
        return true;
    }
}
