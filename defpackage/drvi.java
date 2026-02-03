package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import j$.time.Instant;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drvi implements drly {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/metrics/manager/MetricsManager");
    public static final drtr b;
    public final ConcurrentHashMap c;
    public final ArrayDeque d;
    public volatile boolean e;
    public elbx f;
    private final eosc g;
    private volatile eosc h;
    private final drvj i;
    private volatile List j;
    private final AtomicInteger k;
    private volatile boolean l;
    private volatile int m;
    private final drts n;
    private volatile drus o;

    static {
        b = drtt.a("timer_default_sample_rate", true != drxo.a ? 500L : 1000L);
    }

    public drvi(eosc eoscVar) {
        new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.j = null;
        this.d = new ArrayDeque();
        this.f = null;
        this.k = new AtomicInteger(0);
        drts drtsVar = new drts() { // from class: drva
        };
        this.n = drtsVar;
        this.o = new drut();
        drvj drvjVar = new drvj();
        this.i = drvjVar;
        drvjVar.b = new drvd();
        drtr drtrVar = b;
        this.m = ((Long) drtrVar.b()).intValue();
        drtt.c(drtsVar, drtrVar);
        drlx.a.a(this);
        this.g = eoscVar;
    }

    public final eosc a() {
        return this.g;
    }

    public final void b(drux druxVar, Object... objArr) {
        druy druyVar = this.i.a;
        if (druxVar == druz.BEGIN_SESSION || druxVar == druz.END_SESSION) {
            throw new IllegalArgumentException(String.format("Metrics type [%s] should not be used by developers.", druxVar));
        }
        Instant.now().toEpochMilli();
        SystemClock.elapsedRealtime();
        if (this.k.get() > 0 || this.c.get(druxVar) != null) {
            final drvh drvhVar = new drvh(druxVar, objArr);
            eork.r(eork.l(new Runnable() { // from class: drvb
                @Override // java.lang.Runnable
                public final void run() {
                    char c;
                    elbx elbxVar;
                    char c2;
                    boolean z;
                    ejyc ejycVar;
                    drvi drviVar = this.a;
                    ArrayDeque arrayDeque = drviVar.d;
                    arrayDeque.add(drvhVar);
                    if (drxl.a) {
                        drviVar.f = new elbx(new elbp());
                    }
                    while (!arrayDeque.isEmpty()) {
                        drvh drvhVar2 = (drvh) arrayDeque.poll();
                        if (drvhVar2 != null) {
                            ConcurrentHashMap concurrentHashMap = drviVar.c;
                            drux druxVar2 = drvhVar2.a;
                            final druw[] druwVarArr = (druw[]) concurrentHashMap.get(druxVar2);
                            char c3 = 0;
                            if (druwVarArr == null || druxVar2 == druu.a) {
                                c = 0;
                                ((ekrd) ((ekrd) drvi.a.g()).h("com/google/android/libraries/inputmethod/metrics/manager/MetricsManager", "processMetricsImpl", 801, "MetricsManager.java")).D("Metrics are not logged: MetricsType=%s, IMetricsProcessor=%s", druxVar2, new ekri() { // from class: drvc
                                    @Override // defpackage.ekri
                                    public final Object a() {
                                        ekrg ekrgVar = drvi.a;
                                        druw[] druwVarArr2 = druwVarArr;
                                        return druwVarArr2 != null ? Arrays.toString(druwVarArr2) : "null";
                                    }
                                });
                            } else {
                                int length = druwVarArr.length;
                                int i = 0;
                                while (i < length) {
                                    druw druwVar = druwVarArr[i];
                                    try {
                                        boolean z2 = drviVar.e;
                                        if (!druwVar.a()) {
                                            druwVar.b();
                                        }
                                        c2 = c3;
                                    } finally {
                                        if (!z) {
                                            i++;
                                            c3 = c2;
                                        }
                                    }
                                    i++;
                                    c3 = c2;
                                }
                                c = c3;
                            }
                            Object obj = drvhVar2.b[c];
                            if (obj != null && !(obj instanceof Integer) && !(obj instanceof Boolean) && !(obj instanceof Long) && !(obj instanceof String) && !(obj instanceof Double) && !(obj instanceof Float)) {
                                if (obj instanceof drjw) {
                                    ((drjw) obj).a();
                                } else if (obj instanceof MotionEvent) {
                                    ((MotionEvent) obj).recycle();
                                }
                            }
                            if (drxl.a && (elbxVar = drviVar.f) != null && new elba(elbxVar).size() != 0) {
                                HashMap mapH = ekmi.h(elbxVar.d().size());
                                for (Object obj2 : elbxVar.d()) {
                                    ArrayDeque arrayDeque2 = new ArrayDeque();
                                    arrayDeque2.addLast(new elbr(obj2));
                                    while (!arrayDeque2.isEmpty()) {
                                        elbr elbrVar = (elbr) arrayDeque2.removeLast();
                                        arrayDeque2.addLast(elbrVar);
                                        Object obj3 = elbrVar.a;
                                        if (elbrVar.b == null) {
                                            elbs elbsVar = (elbs) mapH.get(obj3);
                                            if (elbsVar == elbs.COMPLETE) {
                                                arrayDeque2.removeLast();
                                            } else {
                                                elbs elbsVar2 = elbs.PENDING;
                                                if (elbsVar == elbsVar2) {
                                                    Locale locale = Locale.getDefault();
                                                    drux druxVar3 = drvhVar2.a;
                                                    Object[] objArr2 = new Object[1];
                                                    objArr2[c] = druxVar3;
                                                    throw new IllegalStateException(String.format(locale, "Cycle detected while processing metrics type: %s", objArr2));
                                                }
                                                mapH.put(obj3, elbsVar2);
                                                elbrVar.b = new ArrayDeque(elbxVar.e(obj3));
                                            }
                                        }
                                        if (elbrVar.b.isEmpty()) {
                                            arrayDeque2.removeLast();
                                            mapH.put(obj3, elbs.COMPLETE);
                                        } else {
                                            arrayDeque2.addLast(new elbr(elbrVar.b.remove()));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (drxl.a) {
                        drviVar.f = null;
                    }
                }
            }, a()), new drvf(this), eoqg.a);
        }
    }
}
