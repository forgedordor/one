package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecoq implements Application.ActivityLifecycleCallbacks, ecom {
    private static final long g = TimeUnit.MINUTES.toMillis(1);
    public final ScheduledExecutorService a;
    public ScheduledFuture d;
    public ecod f;
    private final econ h;
    public final AtomicLong c = new AtomicLong(0);
    public final long b = g;
    protected final Object e = new Object();

    private ecoq(ecod ecodVar, ScheduledExecutorService scheduledExecutorService, econ econVar) {
        this.f = ecodVar;
        this.a = scheduledExecutorService;
        this.h = econVar;
    }

    public static ecoq c(ecod ecodVar, ScheduledExecutorService scheduledExecutorService, econ econVar, Application application) {
        ecoq ecoqVar = new ecoq(ecodVar, scheduledExecutorService, econVar);
        if (application != null) {
            application.registerActivityLifecycleCallbacks(ecoqVar);
        }
        econVar.c = ecoqVar;
        return ecoqVar;
    }

    public final void a() {
        synchronized (this.e) {
            ScheduledFuture scheduledFuture = this.d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.d = null;
            }
        }
    }

    public final void b() throws NoSuchAlgorithmException {
        int i;
        ArrayList arrayList;
        int i2;
        ArrayList arrayList2;
        int i3;
        int i4;
        this.c.set(0L);
        ecod ecodVar = this.f;
        ArrayList arrayList3 = new ArrayList();
        econ econVar = this.h;
        synchronized (econVar.b) {
            Iterator it = econVar.a.values().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                ecol ecolVar = (ecol) it.next();
                ecoi[] ecoiVarArr = ecolVar.c;
                HashMap map = new HashMap(ecoiVarArr.length > 0 ? 10 : 1);
                ecok ecokVar = new ecok(ecolVar.b, ecoiVarArr);
                synchronized (ecolVar.a) {
                    ecokVar.c = ecolVar.d;
                    ecokVar.d = ecolVar.e;
                    ecolVar.d = map;
                    ecolVar.e = 0;
                }
                arrayList3.add(ecokVar);
            }
        }
        ejqr ejqrVar = (ejqr) ejqs.a.createBuilder();
        int size = arrayList3.size();
        int i5 = 0;
        while (true) {
            dbyk dbykVarJ = null;
            esxe esxeVar = null;
            if (i5 >= size) {
                ejqs ejqsVar = (ejqs) ejqrVar.build();
                if (ejqsVar.b.size() != 0) {
                    dbykVarJ = ecodVar.a.j(ejqsVar);
                    dbykVarJ.k = ecodVar.b;
                    Iterator it2 = ecodVar.c.iterator();
                    while (it2.hasNext()) {
                        dbykVarJ.g((String) it2.next());
                    }
                }
                if (dbykVarJ != null) {
                    dbykVarJ.c();
                    return;
                }
                return;
            }
            ecok ecokVar2 = (ecok) arrayList3.get(i5);
            if (ecokVar2.d == 0) {
                arrayList = arrayList3;
                i2 = size;
            } else {
                eswx eswxVar = (eswx) esxe.a.createBuilder();
                String str = ecokVar2.a;
                long jA = econ.a(str);
                eswxVar.copyOnWrite();
                esxe esxeVar2 = (esxe) eswxVar.instance;
                esxeVar2.b |= 2;
                esxeVar2.c = jA;
                ecoi[] ecoiVarArr2 = ecokVar2.b;
                int length = ecoiVarArr2.length;
                for (int i6 = i; i6 < length; i6++) {
                    long jA2 = econ.a(ecoiVarArr2[i6].a);
                    eswxVar.copyOnWrite();
                    esxe esxeVar3 = (esxe) eswxVar.instance;
                    evta evtaVar = esxeVar3.d;
                    if (!evtaVar.c()) {
                        esxeVar3.d = evsn.mutableCopy(evtaVar);
                    }
                    esxeVar3.d.g(jA2);
                }
                for (Map.Entry entry : ecokVar2.c.entrySet()) {
                    eswy eswyVar = (eswy) esxd.a.createBuilder();
                    ecob ecobVar = (ecob) entry.getKey();
                    ecoc ecocVar = (ecoc) entry.getValue();
                    if (ecoiVarArr2.length > 0) {
                        Object[] objArr = ecobVar.c;
                        ArrayList arrayList4 = new ArrayList(objArr.length);
                        int i7 = 0;
                        while (i7 < objArr.length) {
                            eswz eswzVar = (eswz) esxa.a.createBuilder();
                            Object obj = objArr[i7];
                            ArrayList arrayList5 = arrayList3;
                            if (obj instanceof String) {
                                String str2 = (String) obj;
                                eswzVar.copyOnWrite();
                                esxa esxaVar = (esxa) eswzVar.instance;
                                str2.getClass();
                                i4 = size;
                                esxaVar.b = 1;
                                esxaVar.c = str2;
                            } else {
                                i4 = size;
                                if (obj instanceof Integer) {
                                    Integer num = (Integer) obj;
                                    num.intValue();
                                    eswzVar.copyOnWrite();
                                    esxa esxaVar2 = (esxa) eswzVar.instance;
                                    esxaVar2.b = 2;
                                    esxaVar2.c = num;
                                } else {
                                    if (!(obj instanceof Boolean)) {
                                        throw new IllegalArgumentException("Metric " + str + " has field " + i7 + " with an unexpected value: " + String.valueOf(obj));
                                    }
                                    Boolean bool = (Boolean) obj;
                                    bool.booleanValue();
                                    eswzVar.copyOnWrite();
                                    esxa esxaVar3 = (esxa) eswzVar.instance;
                                    esxaVar3.b = 3;
                                    esxaVar3.c = bool;
                                }
                            }
                            arrayList4.add((esxa) eswzVar.build());
                            i7++;
                            arrayList3 = arrayList5;
                            size = i4;
                        }
                        arrayList2 = arrayList3;
                        i3 = size;
                        eswyVar.copyOnWrite();
                        esxd esxdVar = (esxd) eswyVar.instance;
                        evtg evtgVar = esxdVar.c;
                        if (!evtgVar.c()) {
                            esxdVar.c = evsn.mutableCopy(evtgVar);
                        }
                        evpz.addAll(arrayList4, esxdVar.c);
                    } else {
                        arrayList2 = arrayList3;
                        i3 = size;
                    }
                    esxc esxcVarA = ecocVar.a();
                    eswyVar.copyOnWrite();
                    esxd esxdVar2 = (esxd) eswyVar.instance;
                    esxcVarA.getClass();
                    esxdVar2.d = esxcVarA;
                    esxdVar2.b |= 1;
                    eswxVar.copyOnWrite();
                    esxe esxeVar4 = (esxe) eswxVar.instance;
                    esxd esxdVar3 = (esxd) eswyVar.build();
                    esxdVar3.getClass();
                    evtg evtgVar2 = esxeVar4.e;
                    if (!evtgVar2.c()) {
                        esxeVar4.e = evsn.mutableCopy(evtgVar2);
                    }
                    esxeVar4.e.add(esxdVar3);
                    arrayList3 = arrayList2;
                    size = i3;
                }
                arrayList = arrayList3;
                i2 = size;
                esxeVar = (esxe) eswxVar.build();
            }
            if (esxeVar != null) {
                ejqrVar.copyOnWrite();
                ejqs ejqsVar2 = (ejqs) ejqrVar.instance;
                evtg evtgVar3 = ejqsVar2.b;
                if (!evtgVar3.c()) {
                    ejqsVar2.b = evsn.mutableCopy(evtgVar3);
                }
                ejqsVar2.b.add(esxeVar);
            }
            i5++;
            arrayList3 = arrayList;
            size = i2;
            i = 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        synchronized (this.e) {
            b();
            a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
