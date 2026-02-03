package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class deif {
    public final Set a;
    private final Executor b;
    private final dzis c;
    private Object d;

    protected deif(Executor executor, dzfh dzfhVar) {
        executor.getClass();
        this.b = executor;
        this.a = new HashSet();
        this.c = new dziu(dzfhVar);
    }

    protected abstract void a(Object obj, Object obj2);

    public final int b() {
        int size;
        synchronized (this) {
            size = this.a.size();
        }
        return size;
    }

    protected final Object c() {
        Object obj;
        synchronized (this) {
            obj = this.d;
        }
        return obj;
    }

    public final void d(final Object obj) {
        synchronized (this) {
            this.a.add(obj);
            final Object obj2 = this.d;
            if (obj2 != null) {
                this.b.execute(new Runnable() { // from class: deie
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a(obj, obj2);
                    }
                });
            }
        }
    }

    public final void e() {
        synchronized (this) {
            this.d = null;
            this.a.clear();
        }
    }

    public final void f(final Object obj) {
        synchronized (this) {
            dcnb dcnbVar = deht.a;
            ekrw ekrwVarN = dcnbVar.n();
            dzis dzisVar = this.c;
            Set set = this.a;
            ekrwVarN.I("[ListenersManager(%s)] Notifying %s registered listeners of new value=%s", dzisVar, Integer.valueOf(set.size()), obj);
            if (Objects.equals(this.d, obj)) {
                dcnbVar.n().D("[ListenersManager(%s)] Skipping notification for newValue=%s, it is the same as previously notified.", dzisVar, obj);
                return;
            }
            this.d = obj;
            ArrayList arrayList = new ArrayList(set);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                final Object obj2 = arrayList.get(i);
                this.b.execute(new Runnable() { // from class: deid
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a(obj2, obj);
                    }
                });
            }
        }
    }

    public final String toString() {
        String str;
        synchronized (this) {
            str = "ListenersManager{@" + System.identityHashCode(this) + " logId=" + ((dziu) this.c).a + ", listeners=" + this.a.toString() + "}";
        }
        return str;
    }
}
