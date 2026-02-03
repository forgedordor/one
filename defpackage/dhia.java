package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.SparseArray;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhia {
    public static dbzq b;
    private static dbyl c;
    private static dheq f;
    private static dcdt g;
    private static crny h;
    private static dejx i;
    private static eosc j;
    public static final dhip a = new dhip("RcsAnalyticsUtil");
    private static final SparseArray d = new SparseArray();
    private static final AtomicInteger e = new AtomicInteger();

    public static int a(final String str) {
        dbzf dbzfVar;
        if (!h()) {
            dhja.d(a, "Analytics are disabled. Ignoring UMA timer %s", str);
            return -1;
        }
        final dbzq dbzqVar = b;
        dbzqVar.getClass();
        ReentrantReadWriteLock reentrantReadWriteLock = dbzqVar.d;
        final dbzh dbzhVar = dbzq.k;
        reentrantReadWriteLock.writeLock().lock();
        try {
            dbze dbzeVar = (dbze) dbzqVar.h.get(str);
            if (dbzeVar == null) {
                dbzfVar = (dbzp) dbzqVar.b(str, new ejxr() { // from class: dbzc
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return new dbzp(dbzqVar, str, dbzhVar);
                    }
                });
                reentrantReadWriteLock.writeLock().unlock();
            } else {
                try {
                    dbzf dbzfVar2 = (dbzf) dbzeVar;
                    if (!dbzhVar.equals(dbzfVar2.f)) {
                        throw new IllegalArgumentException(a.v(str, "alias mismatch: "));
                    }
                    dbzqVar.d.writeLock().unlock();
                    dbzfVar = dbzfVar2;
                } catch (ClassCastException e2) {
                    throw new IllegalArgumentException(a.v(str, "another type of counter exists with name: "), e2);
                }
            }
            dbzo dbzoVar = new dbzo((dbzp) dbzfVar);
            int andIncrement = e.getAndIncrement();
            SparseArray sparseArray = d;
            synchronized (sparseArray) {
                sparseArray.put(andIncrement, dbzoVar);
            }
            return andIncrement;
        } catch (Throwable th) {
            dbzqVar.d.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x004a A[Catch: NumberFormatException -> 0x0072, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0072, blocks: (B:4:0x0014, B:6:0x001b, B:7:0x004a), top: B:12:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.elvs b(android.content.Context r6) {
        /*
            dhkv r6 = defpackage.dhkv.g(r6)
            java.lang.String r6 = r6.m()
            elvs r0 = defpackage.elvs.a
            evsf r0 = r0.createBuilder()
            elvr r0 = (defpackage.elvr) r0
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L4a
            int r3 = r6.length()     // Catch: java.lang.NumberFormatException -> L72
            r4 = 5
            if (r3 < r4) goto L4a
            r3 = 3
            java.lang.String r2 = r6.substring(r2, r3)     // Catch: java.lang.NumberFormatException -> L72
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L72
            r0.copyOnWrite()     // Catch: java.lang.NumberFormatException -> L72
            MessageType extends evsn<MessageType, BuilderType> r4 = r0.instance     // Catch: java.lang.NumberFormatException -> L72
            elvs r4 = (defpackage.elvs) r4     // Catch: java.lang.NumberFormatException -> L72
            int r5 = r4.b     // Catch: java.lang.NumberFormatException -> L72
            r1 = r1 | r5
            r4.b = r1     // Catch: java.lang.NumberFormatException -> L72
            r4.c = r2     // Catch: java.lang.NumberFormatException -> L72
            java.lang.String r6 = r6.substring(r3)     // Catch: java.lang.NumberFormatException -> L72
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L72
            r0.copyOnWrite()     // Catch: java.lang.NumberFormatException -> L72
            MessageType extends evsn<MessageType, BuilderType> r1 = r0.instance     // Catch: java.lang.NumberFormatException -> L72
            elvs r1 = (defpackage.elvs) r1     // Catch: java.lang.NumberFormatException -> L72
            int r2 = r1.b     // Catch: java.lang.NumberFormatException -> L72
            r2 = r2 | 2
            r1.b = r2     // Catch: java.lang.NumberFormatException -> L72
            r1.d = r6     // Catch: java.lang.NumberFormatException -> L72
            goto L72
        L4a:
            dhip r3 = defpackage.dhia.a     // Catch: java.lang.NumberFormatException -> L72
            java.lang.String r4 = "Invalid mcc/mnc from system %s."
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.NumberFormatException -> L72
            r5[r2] = r6     // Catch: java.lang.NumberFormatException -> L72
            defpackage.dhja.d(r3, r4, r5)     // Catch: java.lang.NumberFormatException -> L72
            r0.copyOnWrite()     // Catch: java.lang.NumberFormatException -> L72
            MessageType extends evsn<MessageType, BuilderType> r6 = r0.instance     // Catch: java.lang.NumberFormatException -> L72
            elvs r6 = (defpackage.elvs) r6     // Catch: java.lang.NumberFormatException -> L72
            int r3 = r6.b     // Catch: java.lang.NumberFormatException -> L72
            r1 = r1 | r3
            r6.b = r1     // Catch: java.lang.NumberFormatException -> L72
            r6.c = r2     // Catch: java.lang.NumberFormatException -> L72
            r0.copyOnWrite()     // Catch: java.lang.NumberFormatException -> L72
            MessageType extends evsn<MessageType, BuilderType> r6 = r0.instance     // Catch: java.lang.NumberFormatException -> L72
            elvs r6 = (defpackage.elvs) r6     // Catch: java.lang.NumberFormatException -> L72
            int r1 = r6.b     // Catch: java.lang.NumberFormatException -> L72
            r1 = r1 | 2
            r6.b = r1     // Catch: java.lang.NumberFormatException -> L72
            r6.d = r2     // Catch: java.lang.NumberFormatException -> L72
        L72:
            evsn r6 = r0.build()
            elvs r6 = (defpackage.elvs) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhia.b(android.content.Context):elvs");
    }

    public static void c(int i2) {
        if (i2 == -1) {
            dhja.d(a, "CancelTimer: Ignoring invalid UMA timer key %d", -1);
            return;
        }
        SparseArray sparseArray = d;
        synchronized (sparseArray) {
            sparseArray.remove(i2);
        }
    }

    public static void d(String str) {
        if (!h()) {
            dhja.d(a, "Analytics are disabled. Ignoring UMA counter %s", str);
            return;
        }
        dbzq dbzqVar = b;
        dbzqVar.getClass();
        dbzqVar.c(str).a(0L, 1L, dbzq.b);
        f();
    }

    public static void e(Context context, dheq dheqVar, dcdt dcdtVar, crny crnyVar, eosc eoscVar, dejx dejxVar) {
        g = dcdtVar;
        h = crnyVar;
        i = dejxVar;
        j = eoscVar;
        dcdtVar.getClass();
        if (dcdtVar.h(context, 12200000) != 0) {
            dhja.d(a, "Google Play Service unavailable. Clearcut logging is disabled!", new Object[0]);
            return;
        }
        f = dheqVar;
        List list = dbyl.m;
        c = new dbyi(context, "ANDROID_MESSAGING").c();
        b = new dbzq(c, "BUGLE_COUNTERS", Alert.DURATION_SHOW_INDEFINITELY);
        d.clear();
        e.set(0);
    }

    public static void f() {
        if (!h()) {
            dhja.r(a, "sendCounters invoked though logging disabled!", new Object[0]);
            return;
        }
        dhja.l(a, "Sending counters: %s", b);
        dbzq dbzqVar = b;
        dbzqVar.getClass();
        dbzqVar.f();
    }

    public static void g(int i2) {
        dbzo dbzoVar;
        if (i2 == -1) {
            dhja.d(a, "StopTimer: Ignoring invalid UMA timer key %d", -1);
            return;
        }
        SparseArray sparseArray = d;
        synchronized (sparseArray) {
            dbzoVar = (dbzo) sparseArray.get(i2);
            sparseArray.remove(i2);
        }
        if (dbzoVar == null) {
            dhja.r(a, "StopTimer: Unknown UMA timer key %d", Integer.valueOf(i2));
            return;
        }
        dbzoVar.a.a(SystemClock.elapsedRealtime() - dbzoVar.b, 1L, dbzq.b);
        f();
    }

    public static boolean h() {
        if (c == null) {
            return false;
        }
        return ((Boolean) dfaq.E().f().a()).booleanValue();
    }

    public static void i(Context context) {
        elku elkuVar;
        elty eltyVar;
        elrw elrwVar = (elrw) elrx.a.createBuilder();
        elrwVar.copyOnWrite();
        elrx elrxVar = (elrx) elrwVar.instance;
        int i2 = 8;
        elrxVar.c = 8;
        elrxVar.b |= 1;
        elkq elkqVar = (elkq) elku.a.createBuilder();
        crny crnyVar = h;
        crnyVar.getClass();
        crof crofVarK = crnyVar.k();
        String strU = crofVarK.u();
        if (strU != null) {
            elkqVar.copyOnWrite();
            elku elkuVar2 = (elku) elkqVar.instance;
            elkuVar2.b |= 1;
            elkuVar2.c = strU;
        }
        String strQ = crofVarK.q();
        if (strQ != null) {
            elkqVar.copyOnWrite();
            elku elkuVar3 = (elku) elkqVar.instance;
            elkuVar3.b |= 2;
            elkuVar3.d = strQ;
        }
        if (h()) {
            dheq dheqVar = f;
            dheqVar.getClass();
            int i3 = true != dheqVar.k() ? 1 : 2;
            elkqVar.copyOnWrite();
            elku elkuVar4 = (elku) elkqVar.instance;
            elkuVar4.e = i3 - 1;
            elkuVar4.b |= 4;
            elkuVar = (elku) elkqVar.build();
        } else {
            dhja.d(a, "RcsAnalytics is NOT initialized, event will be ignored", new Object[0]);
            elkuVar = (elku) elkqVar.build();
        }
        elrwVar.copyOnWrite();
        elrx elrxVar2 = (elrx) elrwVar.instance;
        elkuVar.getClass();
        elrxVar2.f = elkuVar;
        elrxVar2.b |= 16;
        int i4 = 3;
        int i5 = context.getSharedPreferences("bugle", 0).getInt("seamless_provisioning_progress", 0) == 2 ? 3 : 2;
        elrwVar.copyOnWrite();
        elrx elrxVar3 = (elrx) elrwVar.instance;
        elrxVar3.g = i5 - 1;
        elrxVar3.b |= 32;
        elvs elvsVarB = b(context);
        elrwVar.copyOnWrite();
        elrx elrxVar4 = (elrx) elrwVar.instance;
        elvsVarB.getClass();
        elrxVar4.h = elvsVarB;
        elrxVar4.b |= 64;
        crny crnyVar2 = h;
        crnyVar2.getClass();
        crof crofVarK2 = crnyVar2.k();
        int i6 = Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        elhn elhnVar = (elhn) elho.b.createBuilder();
        boolean zB = crofVarK2.B();
        elhnVar.copyOnWrite();
        elho elhoVar = (elho) elhnVar.instance;
        elhoVar.c |= 4;
        elhoVar.f = zB;
        elhnVar.copyOnWrite();
        elho elhoVar2 = (elho) elhnVar.instance;
        elhoVar2.c |= 16;
        elhoVar2.h = i6 != 0;
        boolean zIsDataEnabled = dhkv.g(context).a.isDataEnabled();
        elhnVar.copyOnWrite();
        elho elhoVar3 = (elho) elhnVar.instance;
        elhoVar3.c |= 32;
        elhoVar3.i = zIsDataEnabled;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            elhnVar.copyOnWrite();
            elho elhoVar4 = (elho) elhnVar.instance;
            elhoVar4.e = 6;
            elhoVar4.c |= 2;
            elhnVar.copyOnWrite();
            elho elhoVar5 = (elho) elhnVar.instance;
            elhoVar5.d = 0;
            elhoVar5.c |= 1;
        } else {
            switch (dhhz.a[activeNetworkInfo.getDetailedState().ordinal()]) {
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 3;
                    break;
                case 3:
                    i2 = 4;
                    break;
                case 4:
                    i2 = 5;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                    break;
                case 8:
                    i2 = 9;
                    break;
                case 9:
                    i2 = 10;
                    break;
                case 10:
                    i2 = 11;
                    break;
                case 11:
                    i2 = 12;
                    break;
                case 12:
                    i2 = 13;
                    break;
                case 13:
                    i2 = 14;
                    break;
                default:
                    i2 = 1;
                    break;
            }
            elhnVar.copyOnWrite();
            elho elhoVar6 = (elho) elhnVar.instance;
            elhoVar6.e = i2 - 1;
            elhoVar6.c |= 2;
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                i4 = 2;
            } else if (type != 1) {
                i4 = type != 6 ? 5 : 4;
            }
            elhnVar.copyOnWrite();
            elho elhoVar7 = (elho) elhnVar.instance;
            elhoVar7.d = i4 - 1;
            elhoVar7.c |= 1;
        }
        elho elhoVar8 = (elho) elhnVar.build();
        elrwVar.copyOnWrite();
        elrx elrxVar5 = (elrx) elrwVar.instance;
        elhoVar8.getClass();
        elrxVar5.d = elhoVar8;
        elrxVar5.b |= 2;
        elrwVar.copyOnWrite();
        elrx elrxVar6 = (elrx) elrwVar.instance;
        elrxVar6.e = 6;
        elrxVar6.b |= 4;
        elrx elrxVar7 = (elrx) elrwVar.build();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_RCS_PROVISIONING;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elrxVar7.getClass();
        ellhVar2.t = elrxVar7;
        ellhVar2.b |= 4096;
        if (!h()) {
            dhip dhipVar = a;
            ellf ellfVarB = ellf.b(((ellh) ellgVar.instance).j);
            if (ellfVarB == null) {
                ellfVarB = ellf.UNKNOWN_BUGLE_EVENT_TYPE;
            }
            dhja.d(dhipVar, "Analytics are disabled. Ignoring Clearcut event of type %d", Integer.valueOf(ellfVarB.f11do));
            return;
        }
        int iIntValue = ((Integer) dfaq.E().D().a()).intValue();
        if (iIntValue == -1) {
            eltyVar = null;
        } else {
            eltx eltxVar = (eltx) elty.a.createBuilder();
            eltxVar.copyOnWrite();
            elty eltyVar2 = (elty) eltxVar.instance;
            eltyVar2.b |= 1;
            eltyVar2.c = iIntValue;
            eltyVar = (elty) eltxVar.build();
        }
        if (eltyVar != null) {
            ellgVar.copyOnWrite();
            ellh ellhVar3 = (ellh) ellgVar.instance;
            ellhVar3.s = eltyVar;
            ellhVar3.b |= 2048;
        }
        dbyl dbylVar = c;
        dbylVar.getClass();
        dbyk dbykVarJ = dbylVar.j(ellgVar.build());
        dbykVarJ.j(-1);
        if (!dfog.B()) {
            dbykVarJ.c();
            return;
        }
        dejx dejxVar = i;
        dejxVar.getClass();
        ListenableFuture listenableFutureA = drgi.a(dejxVar.b());
        dhhy dhhyVar = new dhhy(dbykVarJ);
        eosc eoscVar = j;
        eoscVar.getClass();
        eika.l(listenableFutureA, dhhyVar, eoscVar);
    }
}
