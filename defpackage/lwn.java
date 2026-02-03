package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwn {
    public final Map a;
    public final lyl b;

    public lwn() {
        this.a = new LinkedHashMap();
        this.b = new lyl((byte[]) null);
    }

    public final piw a() {
        return this.b.d;
    }

    public final Object b(String str) {
        Object objC;
        str.getClass();
        lyl lylVar = this.b;
        try {
            fduf fdufVar = (fduf) lylVar.c.get(str);
            if (fdufVar != null && (objC = fdufVar.c()) != null) {
                return objC;
            }
            return lylVar.a.get(str);
        } catch (ClassCastException unused) {
            lylVar.a(str);
            return null;
        }
    }

    public final Object c(String str) {
        str.getClass();
        Object objA = this.b.a(str);
        if (((lwm) this.a.remove(str)) == null) {
            return objA;
        }
        throw null;
    }

    public final void d(String str, Object obj) {
        str.getClass();
        List list = lym.a;
        if (obj != null) {
            List list2 = lym.a;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((Class) it.next()).isInstance(obj)) {
                    }
                }
            }
            throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
        }
        Object obj2 = this.a.get(str);
        lvy lvyVar = obj2 instanceof lvy ? (lvy) obj2 : null;
        if (lvyVar != null) {
            lvyVar.m(obj);
        }
        this.b.b(str, obj);
    }

    public final void e(String str, piw piwVar) {
        this.b.b.put(str, piwVar);
    }

    public final boolean f() {
        return this.b.a.containsKey("FutureListenerState");
    }

    public lwn(Map map) {
        this.a = new LinkedHashMap();
        this.b = new lyl(map);
    }
}
