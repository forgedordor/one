package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class riq implements rig {
    private final rim a;
    private final rip b;
    private final Map c;
    private final Map d;
    private final int e;
    private int f;

    public riq() {
        this.a = new rim();
        this.b = new rip();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = 4194304;
    }

    private final rif f(Class cls) {
        rif rikVar;
        Map map = this.d;
        rif rifVar = (rif) map.get(cls);
        if (rifVar != null) {
            return rifVar;
        }
        if (cls.equals(int[].class)) {
            rikVar = new rin();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(String.valueOf(cls.getSimpleName())));
            }
            rikVar = new rik();
        }
        map.put(cls, rikVar);
        return rikVar;
    }

    private final Object g(rio rioVar, Class cls) {
        rim rimVar = this.a;
        rif rifVarF = f(cls);
        Object objA = rimVar.a(rioVar);
        if (objA != null) {
            this.f -= rifVarF.a(objA) * rifVarF.b();
            i(rifVarF.a(objA), cls);
        }
        if (objA != null) {
            return objA;
        }
        if (Log.isLoggable(rifVarF.d(), 2)) {
            Log.v(rifVarF.d(), "Allocated " + rioVar.a + " bytes");
        }
        return rifVarF.c(rioVar.a);
    }

    private final NavigableMap h(Class cls) {
        Map map = this.c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    private final void i(int i, Class cls) {
        NavigableMap navigableMapH = h(cls);
        Integer numValueOf = Integer.valueOf(i);
        Integer num = (Integer) navigableMapH.get(numValueOf);
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapH.remove(numValueOf);
                return;
            } else {
                navigableMapH.put(numValueOf, Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + toString());
    }

    private final void j(int i) {
        while (this.f > i) {
            Object objB = this.a.b();
            rvi.f(objB);
            rif rifVarF = f(objB.getClass());
            this.f -= rifVarF.a(objB) * rifVarF.b();
            i(rifVarF.a(objB), objB.getClass());
            if (Log.isLoggable(rifVarF.d(), 2)) {
                Log.v(rifVarF.d(), "evicted: " + rifVarF.a(objB));
            }
        }
    }

    @Override // defpackage.rig
    public final synchronized Object a(int i, Class cls) {
        Integer num;
        int i2;
        num = (Integer) h(cls).ceilingKey(Integer.valueOf(i));
        return g((num == null || ((i2 = this.f) != 0 && this.e / i2 < 2 && num.intValue() > i * 8)) ? this.b.d(i, cls) : this.b.d(num.intValue(), cls), cls);
    }

    @Override // defpackage.rig
    public final synchronized void b() {
        j(0);
    }

    @Override // defpackage.rig
    public final synchronized void c(Object obj) {
        Class<?> cls = obj.getClass();
        rif rifVarF = f(cls);
        int iA = rifVarF.a(obj);
        int iB = rifVarF.b() * iA;
        int i = this.e;
        if (iB <= (i >> 1)) {
            rio rioVarD = this.b.d(iA, cls);
            this.a.c(rioVarD, obj);
            NavigableMap navigableMapH = h(cls);
            Integer num = (Integer) navigableMapH.get(Integer.valueOf(rioVarD.a));
            Integer numValueOf = Integer.valueOf(rioVarD.a);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapH.put(numValueOf, Integer.valueOf(iIntValue));
            this.f += iB;
            j(i);
        }
    }

    @Override // defpackage.rig
    public final synchronized void d(int i) {
        if (i >= 40) {
            b();
        } else if (i >= 20 || i == 15) {
            j(this.e >> 1);
        }
    }

    @Override // defpackage.rig
    public final synchronized Object e(Class cls) {
        return g(this.b.d(8, cls), cls);
    }

    public riq(int i) {
        this.a = new rim();
        this.b = new rip();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = i;
    }
}
