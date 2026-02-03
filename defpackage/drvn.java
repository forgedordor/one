package defpackage;

import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Predicate$CC;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drvn extends drvm implements drvw {
    private final AtomicBoolean b;
    private final Class c;

    public drvn(Runnable runnable, Class cls) {
        super(runnable);
        this.b = new AtomicBoolean(false);
        this.c = cls;
    }

    @Override // defpackage.drvm
    public final synchronized void a(Executor executor) {
        this.b.set(false);
        drvv drvvVarA = drvv.a();
        Class cls = this.c;
        drvx drvxVar = new drvx(this, cls, drle.b(executor));
        synchronized (cls) {
            ConcurrentHashMap concurrentHashMap = drvvVarA.c;
            WeakHashMap weakHashMap = (WeakHashMap) concurrentHashMap.get(cls);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap();
                concurrentHashMap.put(cls, weakHashMap);
            } else if (weakHashMap.get(this) != null) {
                ((ekrd) ((ekrd) drvv.a.i()).h("com/google/android/libraries/inputmethod/notificationcenter/NotificationCenter", "registerListenerInternal", 378, "NotificationCenter.java")).D("Listener %s is already registered for notification %s", this, cls);
                return;
            }
            weakHashMap.put(this, drvxVar);
            drvq drvqVar = (drvq) drvvVarA.e.get(cls);
            if (drvqVar != null) {
                drvxVar.a(cls, drvqVar, this);
            }
            WeakHashMap weakHashMap2 = (WeakHashMap) drvvVarA.d.get(cls);
            ekgp ekgpVarJ = weakHashMap2 == null ? null : ekgp.j(weakHashMap2);
            if (ekgpVarJ != null) {
                ekqg ekqgVarListIterator = ekgpVarJ.entrySet().listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    final Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                    ((Executor) entry.getValue()).execute(new Runnable() { // from class: drvs
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((drvy) entry.getKey()).a();
                        }
                    });
                }
            }
            if (drvqVar != null) {
                drvxVar.b();
            }
        }
    }

    @Override // defpackage.drvm
    public final synchronized void b() {
        boolean z;
        final Class cls = this.c;
        drvv drvvVarA = drvv.a();
        synchronized (cls) {
            WeakHashMap weakHashMap = (WeakHashMap) drvvVarA.c.get(cls);
            z = false;
            if (weakHashMap != null) {
                drvx drvxVar = (drvx) weakHashMap.remove(this);
                if (drvxVar != null) {
                    drwc drwcVar = drvxVar.a;
                    ArrayDeque arrayDeque = drwcVar.e;
                    synchronized (arrayDeque) {
                        if (drwcVar.c) {
                            Collection.EL.removeIf(arrayDeque, new Predicate() { // from class: drvz
                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                    return Predicate$CC.$default$and(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                /* renamed from: negate */
                                public final /* synthetic */ Predicate mo538negate() {
                                    return Predicate$CC.$default$negate(this);
                                }

                                public final /* synthetic */ Predicate or(Predicate predicate) {
                                    return Predicate$CC.$default$or(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj) {
                                    drwb drwbVar = (drwb) obj;
                                    ekgp ekgpVar = drwc.a;
                                    if (drwbVar.b == cls) {
                                        return drwbVar.d == this;
                                    }
                                    return false;
                                }
                            });
                        } else {
                            arrayDeque.clear();
                        }
                    }
                    z = true;
                }
                if (weakHashMap.isEmpty()) {
                    drvvVarA.c.remove(cls);
                }
            }
        }
        if (z) {
            return;
        }
        ((ekrd) ((ekrd) drvv.a.j()).h("com/google/android/libraries/inputmethod/notificationcenter/NotificationCenter", "unregisterListener", 480, "NotificationCenter.java")).D("Listener %s was not registered for notification %s", this, cls);
    }

    @Override // defpackage.drvw
    public final void c(Class cls) {
        if (this.b.getAndSet(false)) {
            return;
        }
        drvp.b(String.valueOf(String.valueOf(cls)).concat(" component was already not ready"), false);
    }

    @Override // defpackage.drvw
    public final /* bridge */ /* synthetic */ void d(drvq drvqVar) {
        drvl drvlVar = (drvl) drvqVar;
        if (this.b.getAndSet(true)) {
            drvp.b(String.valueOf(String.valueOf(drvlVar.getClass())).concat(" component was already ready"), true);
        }
        b();
        this.a.run();
    }
}
