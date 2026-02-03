package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoMedia;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dewk {
    public static final dhip a = new dhip("BusinessInfoRetriever");
    public final dewj b;
    final dewj c;
    private final Context d;
    private final BusinessInfoDatabase e;
    private final crmx f;
    private final dgfu g;
    private final ConcurrentHashMap h;
    private final ConcurrentHashMap i;
    private final ConcurrentHashMap j;

    public dewk(Context context, BusinessInfoDatabase businessInfoDatabase, crmx crmxVar, dgfu dgfuVar) {
        dewg dewgVar = new dewg(this, TimeUnit.MICROSECONDS, new LinkedBlockingQueue());
        this.b = dewgVar;
        this.c = new dewh(this, TimeUnit.MICROSECONDS, new LinkedBlockingQueue());
        this.h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.d = context;
        this.e = businessInfoDatabase;
        dewgVar.allowCoreThreadTimeOut(true);
        this.f = crmxVar;
        this.g = dgfuVar;
    }

    final dewd a(String str) {
        dewd dewdVar = new dewd(str, this.d, 0, this.e, this.g);
        dewd dewdVar2 = (dewd) this.i.putIfAbsent(str, dewdVar);
        if (dewdVar2 == null) {
            dhja.l(a, "Caching new business media runnable for botId %s", dhiz.GENERIC.c(str));
            return dewdVar;
        }
        dhja.l(a, "Returning cached business media runnable for botId %s", dhiz.GENERIC.c(str));
        return dewdVar2;
    }

    final dewd b(String str) {
        dewd dewdVar = new dewd(str, this.d, 2, this.e, this.g);
        dewd dewdVar2 = (dewd) this.i.putIfAbsent(String.valueOf(str).concat("-verifier-logo"), dewdVar);
        if (dewdVar2 == null) {
            dhja.l(a, "Caching new business media runnable for verifier logo for botId %s", dhiz.GENERIC.c(str));
            return dewdVar;
        }
        dhja.l(a, "Returning cached business media runnable for verifier logo for botId %s", dhiz.GENERIC.c(str));
        return dewdVar2;
    }

    public final dewe c(String str, crmx crmxVar) {
        boolean z = dfnr.d() && BusinessInfoData.getVerifiedBotPlatform(str) == 1;
        dewe deweVar = new dewe(str, this.d, this.e, z, crmxVar);
        dewe deweVar2 = (dewe) this.h.putIfAbsent(str + "_" + z, deweVar);
        if (deweVar2 == null) {
            dhja.l(a, "Caching new business metadata runnable for botId %s", dhiz.GENERIC.c(str));
            return deweVar;
        }
        dhja.l(a, "Returning cached business metadata runnable for botId %s", dhiz.GENERIC.c(str));
        return deweVar2;
    }

    public final dewi d(String str) {
        dewi dewiVar = c(str, this.f).d;
        dewi dewiVar2 = dewi.INFO_LOCALLY_AVAILABLE;
        if (dewiVar != dewiVar2) {
            return dewiVar;
        }
        dewd dewdVarA = a(str);
        return (dfnr.d() && BusinessInfoData.getVerifiedBotPlatform(str) == 1 && dewdVarA.d == dewiVar2) ? b(str).d : dewdVarA.d;
    }

    public final void e(String str) {
        dewd dewdVarB;
        BusinessInfoDatabase businessInfoDatabase = this.e;
        businessInfoDatabase.getClass();
        for (Integer num : BusinessInfoMedia.ALL_MEDIA_TYPES) {
            int iIntValue = num.intValue();
            if (TextUtils.isEmpty(businessInfoDatabase.getLocalMediaPath(str, iIntValue))) {
                if (iIntValue == 0) {
                    dhja.l(a, "Logo image does not exist locally for botId %s", dhiz.GENERIC.c(str));
                    iIntValue = 0;
                } else if (iIntValue == 1) {
                    dhja.l(a, "Hero image does not exist locally for botId %s", dhiz.GENERIC.c(str));
                    iIntValue = 1;
                } else if (iIntValue == 2) {
                    dhja.l(a, "Verifier logo image does not exist locally for botId %s", dhiz.GENERIC.c(str));
                    iIntValue = 2;
                } else {
                    dhja.l(a, "Unknown media type %d does not exist locally for botId %s", num, dhiz.GENERIC.c(str));
                }
                if (iIntValue == 0) {
                    dhja.l(a, "Queuing download of logo for botId %s", dhiz.GENERIC.c(str));
                    dewdVarB = a(str);
                } else if (iIntValue == 1) {
                    dhja.l(a, "Queuing download of hero image for botId %s", dhiz.GENERIC.c(str));
                    dewdVarB = new dewd(str, this.d, 1, businessInfoDatabase, this.g);
                } else {
                    if (iIntValue != 2) {
                        throw new IllegalStateException(String.format("Unhandled business media type %d", Integer.valueOf(iIntValue)));
                    }
                    if (dfnr.d() && BusinessInfoData.getVerifiedBotPlatform(str) == 1) {
                        dhja.l(a, "Queuing download of verifier logo image for botId %s", dhiz.GENERIC.c(str));
                        dewdVarB = b(str);
                    } else {
                        dhja.l(a, "Skipping unsupported download of verifier logo for botId %s", dhiz.GENERIC.c(str));
                    }
                }
                this.c.a(dewdVarB);
            } else if (iIntValue == 0) {
                dhja.l(a, "Logo image exists locally for botId %s", dhiz.GENERIC.c(str));
            } else if (iIntValue == 1) {
                dhja.l(a, "Hero image exists locally for botId %s", dhiz.GENERIC.c(str));
            } else if (iIntValue == 2) {
                dhja.l(a, "Verifier logo image exists locally for botId %s", dhiz.GENERIC.c(str));
            } else {
                dhja.l(a, "Unknown media type %d exists locally for botId %s", num, dhiz.GENERIC.c(str));
            }
        }
    }

    public final boolean f(String str) {
        dewi dewiVarD = d(str);
        return dewiVarD == dewi.INFO_LOCALLY_AVAILABLE || dewiVarD == dewi.SERVER_ERROR || dewiVarD == dewi.CLIENT_ERROR;
    }

    public final void g(String str, dgzh dgzhVar) {
        if (TextUtils.isEmpty(str)) {
            dhja.h(a, "RBM botId is missing for bot info retrieval.", new Object[0]);
            return;
        }
        dewe deweVarC = c(str, this.f);
        if (dgzhVar != null) {
            ConcurrentHashMap concurrentHashMap = this.j;
            if (!concurrentHashMap.containsKey(str)) {
                concurrentHashMap.putIfAbsent(str, new CopyOnWriteArraySet());
            }
            ((CopyOnWriteArraySet) concurrentHashMap.get(str)).add(dgzhVar);
        }
        if (deweVarC.d == dewi.INFO_LOCALLY_AVAILABLE) {
            dhip dhipVar = a;
            dhiz dhizVar = dhiz.GENERIC;
            dhja.l(dhipVar, "Bot info is locally available for botId: %s", dhizVar.c(str));
            e(str);
            Long lQueryExpiryMillisByBotId = this.e.queryExpiryMillisByBotId(str);
            Long lA = dhkl.a();
            long jLongValue = lA.longValue();
            if (lQueryExpiryMillisByBotId != null && lQueryExpiryMillisByBotId.longValue() > jLongValue) {
                dhja.l(dhipVar, "Bot info has not expired for botId: %s expiry: %d currentTime: %d", dhizVar.c(str), lQueryExpiryMillisByBotId, lA);
                h(str);
                return;
            }
        }
        dhja.l(a, "Running bot info retrieval for botId: %s", dhiz.GENERIC.c(str));
        this.b.a(deweVarC);
    }

    public final void h(String str) {
        ConcurrentHashMap concurrentHashMap = this.j;
        if (!concurrentHashMap.containsKey(str)) {
            dhja.l(a, "No listeners set for botId %s", dhiz.GENERIC.c(str));
            return;
        }
        dhja.l(a, "Notifying and removing listeners for botId %s", dhiz.GENERIC.c(str));
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(str);
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            dgzh dgzhVar = (dgzh) it.next();
            dgzn dgznVar = dgzhVar.a;
            String str2 = dgzhVar.b;
            dewk dewkVar = dgzhVar.c;
            if (str.equals(str2) && dewkVar.f(str)) {
                Object obj = dgznVar.P;
                synchronized (obj) {
                    obj.notifyAll();
                }
            }
            copyOnWriteArraySet.remove(dgzhVar);
        }
    }
}
