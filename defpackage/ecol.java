package defpackage;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ecol {
    final Object a;
    public final String b;
    public final ecoi[] c;
    HashMap d;
    public int e;
    private final fcsu f;
    private boolean g = true;

    public ecol(String str, fcsu fcsuVar, ecoi... ecoiVarArr) {
        this.b = str;
        this.c = ecoiVarArr;
        int length = ecoiVarArr.length;
        HashMap map = new HashMap(length > 0 ? 10 : 1);
        this.d = map;
        if (length == 0) {
            map.put(ecob.b, g());
        }
        this.e = 0;
        this.f = fcsuVar;
        this.a = new Object();
    }

    public final void c() {
        this.g = false;
    }

    protected final void d(Object obj, ecob ecobVar) {
        synchronized (this.a) {
            ecoc ecocVarG = (ecoc) this.d.get(ecobVar);
            if (ecocVarG == null) {
                ecocVarG = g();
                this.d.put(ecobVar, ecocVarG);
            }
            ecocVarG.b(obj);
            this.e++;
        }
        ecom ecomVar = ((econ) this.f).c;
        if (ecomVar != null) {
            ecoq ecoqVar = (ecoq) ecomVar;
            AtomicLong atomicLong = ecoqVar.c;
            if (atomicLong.incrementAndGet() >= 100) {
                Object obj2 = ecoqVar.e;
                synchronized (obj2) {
                    if (atomicLong.get() >= 100) {
                        synchronized (obj2) {
                            ScheduledFuture scheduledFuture = ((ecoq) ecomVar).d;
                            if (scheduledFuture == null || scheduledFuture.isDone() || ((ecoq) ecomVar).d.isCancelled()) {
                                final ecoq ecoqVar2 = (ecoq) ecomVar;
                                ((ecoq) ecomVar).d = ((ecoq) ecomVar).a.schedule(new Runnable() { // from class: ecop
                                    @Override // java.lang.Runnable
                                    public final void run() throws NoSuchAlgorithmException {
                                        ecoqVar2.b();
                                    }
                                }, 1L, TimeUnit.MILLISECONDS);
                            } else if (((ecoq) ecomVar).d.getDelay(TimeUnit.MILLISECONDS) > 100) {
                                ((ecoq) ecomVar).a();
                                final ecoq ecoqVar3 = (ecoq) ecomVar;
                                ((ecoq) ecomVar).d = ((ecoq) ecomVar).a.schedule(new Runnable() { // from class: ecop
                                    @Override // java.lang.Runnable
                                    public final void run() throws NoSuchAlgorithmException {
                                        ecoqVar3.b();
                                    }
                                }, 1L, TimeUnit.MILLISECONDS);
                            }
                        }
                        return;
                    }
                }
            }
            synchronized (ecoqVar.e) {
                ScheduledFuture scheduledFuture2 = ((ecoq) ecomVar).d;
                if (scheduledFuture2 == null || scheduledFuture2.isDone() || ((ecoq) ecomVar).d.isCancelled()) {
                    final ecoq ecoqVar4 = (ecoq) ecomVar;
                    ((ecoq) ecomVar).d = ((ecoq) ecomVar).a.schedule(new Runnable() { // from class: ecop
                        @Override // java.lang.Runnable
                        public final void run() throws NoSuchAlgorithmException {
                            ecoqVar4.b();
                        }
                    }, ((ecoq) ecomVar).b, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    protected final void e(Object... objArr) {
        ecoi[] ecoiVarArr = this.c;
        ejwl.a(ecoiVarArr.length == objArr.length);
        if (this.g) {
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj == null) {
                    throw new NullPointerException("Streamz " + this.b + " has null parameter: " + Arrays.toString(objArr));
                }
                if (!ecoiVarArr[i].b.isInstance(obj)) {
                    String str = this.b;
                    String string = obj.toString();
                    String strValueOf = String.valueOf(obj.getClass());
                    ecoi ecoiVar = ecoiVarArr[i];
                    throw new IllegalArgumentException("Streamz " + str + " has parameter {index: " + i + ", value: " + string + ", type: " + strValueOf + "}, but expected: {name: " + ecoiVar.a + ", type: " + ecoiVar.b.toString() + "}");
                }
            }
        }
    }

    final void f(ecoi... ecoiVarArr) {
        ecoi[] ecoiVarArr2 = this.c;
        if (Arrays.equals(ecoiVarArr2, ecoiVarArr)) {
            return;
        }
        throw new ecoo("Streamz " + this.b + " with field diffs: " + Arrays.toString(ecoiVarArr2) + " and " + Arrays.toString(ecoiVarArr));
    }

    public abstract ecoc g();
}
