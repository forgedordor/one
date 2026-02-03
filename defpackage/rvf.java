package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rvf {
    private final Map a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;
    private long d;

    public rvf(long j) {
        this.b = j;
        this.c = j;
    }

    private final void b() {
        k(this.c);
    }

    protected int a(Object obj) {
        return 1;
    }

    public final void e() {
        k(0L);
    }

    public final synchronized void f(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
        this.c = Math.round(this.b * f);
        b();
    }

    public final synchronized long g() {
        return this.c;
    }

    public final synchronized Object h(Object obj) {
        rve rveVar = (rve) this.a.get(obj);
        if (rveVar == null) {
            return null;
        }
        return rveVar.a;
    }

    public final synchronized Object i(Object obj, Object obj2) {
        int iA = a(obj2);
        long j = iA;
        if (j >= this.c) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.d += j;
        }
        rve rveVar = (rve) this.a.put(obj, obj2 == null ? null : new rve(obj2, iA));
        if (rveVar != null) {
            this.d -= rveVar.b;
            Object obj3 = rveVar.a;
            if (!obj3.equals(obj2)) {
                c(obj, obj3);
            }
        }
        b();
        if (rveVar != null) {
            return rveVar.a;
        }
        return null;
    }

    public final synchronized Object j(Object obj) {
        rve rveVar = (rve) this.a.remove(obj);
        if (rveVar == null) {
            return null;
        }
        this.d -= rveVar.b;
        return rveVar.a;
    }

    public final synchronized void k(long j) {
        while (this.d > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            rve rveVar = (rve) entry.getValue();
            this.d -= rveVar.b;
            Object key = entry.getKey();
            it.remove();
            c(key, rveVar.a);
        }
    }

    protected void c(Object obj, Object obj2) {
    }
}
