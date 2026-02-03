package defpackage;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqqe extends cqpz {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/gservices/BugleGservicesImpl");
    public final Object b = new Object();
    public volatile boolean c;
    public final Context d;
    public final eosc e;
    public final List f;
    private final BroadcastReceiver g;

    public cqqe(Context context, eosc eoscVar, eosc eoscVar2) {
        cqqd cqqdVar = new cqqd(this);
        this.g = cqqdVar;
        this.f = new ArrayList();
        this.d = context;
        this.e = eoscVar2;
        auvh.h(eoscVar.submit(eiid.k(new Runnable() { // from class: cqqc
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr;
                eieu eieuVarK = eiiy.k("BugleGservicesImpl#initializeGservices");
                final cqqe cqqeVar = this.a;
                try {
                    Context context2 = cqqeVar.d;
                    context2.getClass();
                    ContentResolver contentResolver = context2.getContentResolver();
                    String[] strArr2 = {"bugle_"};
                    devf devfVar = devd.a;
                    synchronized (devfVar) {
                        ((devn) devfVar).c(contentResolver);
                        if (((devn) devfVar).h.length == 0) {
                            ((devn) devfVar).h = new String[1];
                            System.arraycopy(strArr2, 0, ((devn) devfVar).h, 0, 1);
                            strArr = ((devn) devfVar).h;
                        } else {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Collections.addAll(linkedHashSet, ((devn) devfVar).h);
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            String str = strArr2[0];
                            if (linkedHashSet.add(str)) {
                                linkedHashSet2.add(str);
                            }
                            if (linkedHashSet2.isEmpty()) {
                                strArr = new String[0];
                            } else {
                                ArrayList arrayList = new ArrayList(linkedHashSet);
                                Collections.sort(arrayList);
                                HashMap map = new HashMap();
                                int size = arrayList.size();
                                String str2 = null;
                                for (int i = 0; i < size; i++) {
                                    String str3 = (String) arrayList.get(i);
                                    if (str2 == null || !str3.startsWith(str2)) {
                                        str2 = str3;
                                    } else {
                                        map.put(str3, str2);
                                        linkedHashSet2.remove(str3);
                                    }
                                }
                                if (linkedHashSet2.isEmpty()) {
                                    strArr = new String[0];
                                } else {
                                    if (!map.isEmpty()) {
                                        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                        Iterator it = linkedHashSet.iterator();
                                        while (it.hasNext()) {
                                            String str4 = (String) it.next();
                                            String str5 = (String) map.get(str4);
                                            if (str5 != null) {
                                                linkedHashSet3.add(str5);
                                            } else {
                                                linkedHashSet3.add(str4);
                                            }
                                        }
                                        linkedHashSet = linkedHashSet3;
                                    }
                                    ((devn) devfVar).h = (String[]) linkedHashSet.toArray(new String[0]);
                                    strArr = (String[]) linkedHashSet2.toArray(new String[0]);
                                }
                            }
                        }
                        if (!((devn) devfVar).g) {
                            ((devn) devfVar).b(contentResolver, ((devn) devfVar).h);
                        } else if (strArr.length != 0) {
                            ((devn) devfVar).g = false;
                            ((devn) devfVar).b(contentResolver, strArr);
                        }
                    }
                    Object obj = cqqeVar.b;
                    synchronized (obj) {
                        cqqeVar.c = true;
                        obj.notifyAll();
                    }
                    eieuVarK.close();
                    ekrw ekrwVarE = cqqe.a.e();
                    ekrwVarE.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/util/gservices/BugleGservicesImpl", "<init>", 83, "BugleGservicesImpl.java")).t("GServicesValues:\n%s", new ekri() { // from class: cqqb
                        @Override // defpackage.ekri
                        public final Object a() {
                            return cqqeVar.j();
                        }
                    });
                } catch (Throwable th) {
                    try {
                        eieuVarK.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        })));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
        kxj.g(context, cqqdVar, intentFilter);
    }

    private final Map k() {
        l("bugle_");
        Context context = this.d;
        context.getClass();
        return devd.d(context.getContentResolver(), "bugle_");
    }

    private final void l(String str) {
        eieu eieuVarK = eiiy.k("BugleGservicesImpl#assertKeyAndWaitForGservices");
        try {
            boolean z = true;
            if (!str.startsWith("bugle_") && !str.equals("android_id") && !str.equals("device_country")) {
                z = false;
            }
            ejwl.a(z);
            while (true) {
                if (this.c) {
                    break;
                }
                Object obj = this.b;
                synchronized (obj) {
                    if (this.c) {
                        break;
                    }
                    try {
                        obj.wait(60000L);
                    } catch (InterruptedException e) {
                        ekrw ekrwVarI = a.i();
                        ekrwVarI.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/util/gservices/BugleGservicesImpl", "assertKeyAndWaitForGservices", 190, "BugleGservicesImpl.java")).q("Waited too long for gservices");
                    }
                }
            }
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

    @Override // defpackage.cqpz
    public final float a(String str, float f) throws NumberFormatException {
        Object obj;
        Float fValueOf;
        l(str);
        if (cqqf.c(str)) {
            if (cqqf.c == null) {
                return 0.0f;
            }
            return cqqf.c.getFloat(str);
        }
        ContentResolver contentResolver = this.d.getContentResolver();
        devf devfVar = devd.a;
        devn.e(contentResolver);
        synchronized (devfVar) {
            ((devn) devfVar).c(contentResolver);
            obj = ((devn) devfVar).f;
            fValueOf = (Float) devn.f(((devn) devfVar).e, str, Float.valueOf(f));
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        String strA = ((devn) devfVar).a(contentResolver, str, null);
        if (strA != null) {
            try {
                float f2 = Float.parseFloat(strA);
                fValueOf = Float.valueOf(f2);
                f = f2;
            } catch (NumberFormatException unused) {
            }
        }
        synchronized (devfVar) {
            ((devn) devfVar).d(obj, ((devn) devfVar).e, str, fValueOf);
        }
        return f;
    }

    @Override // defpackage.cqpz
    public final int b(String str, int i) {
        l(str);
        if (!cqqf.c(str)) {
            return devd.a(this.d.getContentResolver(), str, i);
        }
        if (cqqf.c == null) {
            return 0;
        }
        return cqqf.c.getInt(str);
    }

    @Override // defpackage.cqpz
    public final long c(String str, long j) {
        l(str);
        if (!cqqf.c(str)) {
            return devd.b(this.d.getContentResolver(), str, j);
        }
        if (cqqf.c == null) {
            return 0L;
        }
        return cqqf.c.getLong(str);
    }

    @Override // defpackage.cqpz
    public final String d() {
        return j();
    }

    @Override // defpackage.cqpz
    public final String e(String str, String str2) {
        l(str);
        return cqqf.c(str) ? cqqf.c == null ? "" : ejwk.b(cqqf.c.getString(str)) : devd.c(this.d.getContentResolver(), str, str2);
    }

    @Override // defpackage.cqpz
    public final Map f() {
        return k();
    }

    @Override // defpackage.cqpz
    public final void g(Runnable runnable) {
        List list = this.f;
        synchronized (list) {
            list.add(runnable);
        }
    }

    @Override // defpackage.cqpz
    public final void h() {
        this.d.sendBroadcast(new Intent("android.server.checkin.CHECKIN"));
    }

    @Override // defpackage.cqpz
    public final boolean i(String str, boolean z) {
        l(str);
        if (!cqqf.c(str)) {
            return devd.e(this.d.getContentResolver(), str, z);
        }
        if (cqqf.c == null) {
            return false;
        }
        return cqqf.c.getBoolean(str);
    }

    public final String j() {
        StringBuilder sb = new StringBuilder();
        Map mapK = k();
        if (mapK.isEmpty()) {
            sb.append("No bugle gservices keys/values");
        } else {
            for (String str : mapK.keySet()) {
                sb.append(String.format("%s: %s\n", str, (String) mapK.get(str)));
            }
        }
        return sb.toString();
    }
}
