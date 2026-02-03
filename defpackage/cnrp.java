package defpackage;

import android.util.LruCache;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnrp implements cqci {
    public static final /* synthetic */ int g = 0;
    private static final ekhx h = ekhx.v(' ', '@', '.', ',', ':', '-', '(', ')', '+', '[', ']', '{', '}', '<', '>');
    public final fcsu a;
    public final LruCache b;
    public final LruCache c;
    public final LruCache d;
    public final LruCache e;
    public final LruCache f;
    private final avoj i;
    private final LruCache j;
    private final LruCache k;
    private final ekrg l;

    public cnrp(avoj avojVar, fcsu fcsuVar) {
        avojVar.getClass();
        fcsuVar.getClass();
        this.i = avojVar;
        this.a = fcsuVar;
        cczi ccziVar = cmqf.b;
        Object objE = ccziVar.e();
        objE.getClass();
        this.b = new LruCache(((Number) objE).intValue());
        Object objE2 = ccziVar.e();
        objE2.getClass();
        this.c = new LruCache(((Number) objE2).intValue());
        Object objE3 = ccziVar.e();
        objE3.getClass();
        this.d = new LruCache(((Number) objE3).intValue());
        Object objE4 = ccziVar.e();
        objE4.getClass();
        this.j = new LruCache(((Number) objE4).intValue());
        Object objE5 = ccziVar.e();
        objE5.getClass();
        this.e = new LruCache(((Number) objE5).intValue());
        Object objE6 = ccziVar.e();
        objE6.getClass();
        this.f = new LruCache(((Number) objE6).intValue());
        Object objE7 = ccziVar.e();
        objE7.getClass();
        this.k = new LruCache(((Number) objE7).intValue());
        this.l = ekrg.c("com/google/android/apps/messaging/shared/telephony/forwardsync/ForwardSyncCache");
    }

    static /* synthetic */ Object e(cnrp cnrpVar, LruCache lruCache, Object obj, fcsu fcsuVar, String str, fdap fdapVar, fdap fdapVar2, int i) {
        if ((i & 16) != 0) {
            fdapVar = new fdap() { // from class: cnrj
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    int i2 = cnrp.g;
                    obj2.getClass();
                    return obj2.toString();
                }
            };
        }
        fdap fdapVar3 = fdapVar;
        if ((i & 32) != 0) {
            fdapVar2 = new fdap() { // from class: cnrk
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    int i2 = cnrp.g;
                    obj2.getClass();
                    return obj2.toString();
                }
            };
        }
        fdap fdapVar4 = fdapVar2;
        if ((i & 8) != 0) {
            str = "";
        }
        return cnrpVar.f(lruCache, obj, fcsuVar, str, fdapVar3, fdapVar4);
    }

    private final Object f(LruCache lruCache, Object obj, fcsu fcsuVar, String str, fdap fdapVar, fdap fdapVar2) {
        Object objB;
        synchronized (lruCache) {
            objB = lruCache.get(obj);
            if (objB == null) {
                objB = fcsuVar.b();
                lruCache.put(obj, objB);
                String str2 = (String) fdapVar.invoke(obj);
                objB.getClass();
                ((ekrd) this.l.g().h("com/google/android/apps/messaging/shared/telephony/forwardsync/ForwardSyncCache", "getOrCreateFromCache", 196, "ForwardSyncCache.kt")).I("cache update [%s]: [%s] -> [%s]", str, str2, (String) fdapVar2.invoke(objB));
            }
        }
        return objB;
    }

    public final alqm a(String str, int i, fcsu fcsuVar) {
        return (alqm) f(this.j, i + "::" + str, fcsuVar, "miCache", new fdap() { // from class: cnrl
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str2 = (String) obj;
                str2.getClass();
                return this.a.c(str2);
            }
        }, new fdap() { // from class: cnrm
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                alqm alqmVar = (alqm) obj;
                alqmVar.getClass();
                return this.a.c(alqmVar.toString());
            }
        });
    }

    public final cmtz b(cnqj cnqjVar, fcsu fcsuVar) {
        return (cmtz) e(this, this.k, cnqjVar, fcsuVar, "threadDataCache", null, new fdap() { // from class: cnrn
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cmtz cmtzVar = (cmtz) obj;
                int i = cnrp.g;
                cmtzVar.getClass();
                return String.valueOf(cmtzVar.hashCode());
            }
        }, 16);
    }

    public final String c(String str) {
        ArrayList arrayList = new ArrayList(str.length());
        for (int i = 0; i < str.length(); i++) {
            arrayList.add(Character.valueOf(this.i.a(h).a(str.charAt(i))));
        }
        return fcva.aF(arrayList, "", null, null, null, 62);
    }

    public final void d() {
        this.b.evictAll();
        this.c.evictAll();
        this.d.evictAll();
        this.j.evictAll();
        this.e.evictAll();
        this.k.evictAll();
        this.f.evictAll();
    }

    @Override // defpackage.cqci
    public final void i(int i) {
        ((ekrd) this.l.h().h("com/google/android/apps/messaging/shared/telephony/forwardsync/ForwardSyncCache", "reclaimMemory", 215, "ForwardSyncCache.kt")).q("reclaimMemory: Clearing caches");
        d();
    }
}
