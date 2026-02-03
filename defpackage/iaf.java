package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iaf implements Map, iaw, fdcr {
    public iay a;
    public final Set b;
    public final Set c;
    private final Collection d;

    public iaf() {
        hvp hvpVar = hvp.a;
        hzg hzgVarB = hzt.b();
        iae iaeVar = new iae(hzgVarB.v(), hvpVar);
        if (!(hzgVarB instanceof hyz)) {
            iaeVar.h = new iae(1L, hvpVar);
        }
        this.a = iaeVar;
        this.b = new hzu(this);
        this.c = new hzv(this);
        this.d = new hzx(this);
    }

    public static final boolean f(iae iaeVar, int i, hux huxVar) {
        boolean z;
        synchronized (iag.a) {
            int i2 = iaeVar.b;
            if (i2 == i) {
                iaeVar.a = huxVar;
                z = true;
                iaeVar.b = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final int a() {
        return c().b;
    }

    public final int b() {
        return c().a.size();
    }

    public final iae c() {
        iay iayVar = this.a;
        iayVar.getClass();
        return (iae) hzt.j(iayVar, this);
    }

    @Override // java.util.Map
    public final void clear() {
        hzg hzgVarB;
        iay iayVar = this.a;
        iayVar.getClass();
        hux huxVar = ((iae) hzt.e(iayVar)).a;
        hvp hvpVar = hvp.a;
        if (hvpVar != huxVar) {
            iay iayVar2 = this.a;
            iayVar2.getClass();
            synchronized (hzt.c) {
                hzgVarB = hzt.b();
                iae iaeVar = (iae) hzt.l(iayVar2, this, hzgVarB);
                synchronized (iag.a) {
                    iaeVar.a = hvpVar;
                    iaeVar.b++;
                }
            }
            hzt.t(hzgVarB, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return c().a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return c().a.containsValue(obj);
    }

    @Override // defpackage.iaw
    public final iay d() {
        return this.a;
    }

    @Override // defpackage.iaw
    public final void e(iay iayVar) {
        iayVar.getClass();
        this.a = (iae) iayVar;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.b;
    }

    @Override // defpackage.iaw
    public final /* synthetic */ iay g(iay iayVar, iay iayVar2, iay iayVar3) {
        return null;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return c().a.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return c().a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        hux huxVar;
        int i;
        Object objPut;
        hzg hzgVarB;
        boolean zF;
        do {
            synchronized (iag.a) {
                iay iayVar = this.a;
                iayVar.getClass();
                iae iaeVar = (iae) hzt.e(iayVar);
                huxVar = iaeVar.a;
                i = iaeVar.b;
            }
            huxVar.getClass();
            huw huwVarA = huxVar.a();
            objPut = huwVarA.put(obj, obj2);
            hux huxVarA = huwVarA.a();
            if (fdbq.f(huxVarA, huxVar)) {
                break;
            }
            iay iayVar2 = this.a;
            iayVar2.getClass();
            synchronized (hzt.c) {
                hzgVarB = hzt.b();
                zF = f((iae) hzt.l(iayVar2, this, hzgVarB), i, huxVarA);
            }
            hzt.t(hzgVarB, this);
        } while (!zF);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        hux huxVar;
        int i;
        hzg hzgVarB;
        boolean zF;
        do {
            synchronized (iag.a) {
                iay iayVar = this.a;
                iayVar.getClass();
                iae iaeVar = (iae) hzt.e(iayVar);
                huxVar = iaeVar.a;
                i = iaeVar.b;
            }
            huxVar.getClass();
            huw huwVarA = huxVar.a();
            huwVarA.putAll(map);
            hux huxVarA = huwVarA.a();
            if (fdbq.f(huxVarA, huxVar)) {
                return;
            }
            iay iayVar2 = this.a;
            iayVar2.getClass();
            synchronized (hzt.c) {
                hzgVarB = hzt.b();
                zF = f((iae) hzt.l(iayVar2, this, hzgVarB), i, huxVarA);
            }
            hzt.t(hzgVarB, this);
        } while (!zF);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        hux huxVar;
        int i;
        Object objRemove;
        hzg hzgVarB;
        boolean zF;
        do {
            synchronized (iag.a) {
                iay iayVar = this.a;
                iayVar.getClass();
                iae iaeVar = (iae) hzt.e(iayVar);
                huxVar = iaeVar.a;
                i = iaeVar.b;
            }
            huxVar.getClass();
            huw huwVarA = huxVar.a();
            objRemove = huwVarA.remove(obj);
            hux huxVarA = huwVarA.a();
            if (fdbq.f(huxVarA, huxVar)) {
                break;
            }
            iay iayVar2 = this.a;
            iayVar2.getClass();
            synchronized (hzt.c) {
                hzgVarB = hzt.b();
                zF = f((iae) hzt.l(iayVar2, this, hzgVarB), i, huxVarA);
            }
            hzt.t(hzgVarB, this);
        } while (!zF);
        return objRemove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return b();
    }

    public final String toString() {
        iay iayVar = this.a;
        iayVar.getClass();
        return "SnapshotStateMap(value=" + ((iae) hzt.e(iayVar)).a + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.d;
    }
}
