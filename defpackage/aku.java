package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aku<K, V> implements Iterable<Map.Entry<K, V>> {
    public akq b;
    public akq c;
    public final WeakHashMap d = new WeakHashMap();
    public int e = 0;

    protected akq a(Object obj) {
        akq akqVar = this.b;
        while (akqVar != null && !akqVar.a.equals(obj)) {
            akqVar = akqVar.c;
        }
        return akqVar;
    }

    public Object b(Object obj) {
        akq akqVarA = a(obj);
        if (akqVarA == null) {
            return null;
        }
        this.e--;
        WeakHashMap weakHashMap = this.d;
        if (!weakHashMap.isEmpty()) {
            Iterator<K> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((akt) it.next()).dI(akqVarA);
            }
        }
        akq akqVar = akqVarA.d;
        akq akqVar2 = akqVarA.c;
        if (akqVar != null) {
            akqVar.c = akqVar2;
        } else {
            this.b = akqVar2;
        }
        akq akqVar3 = akqVarA.c;
        if (akqVar3 != null) {
            akqVar3.d = akqVar;
        } else {
            this.c = akqVar;
        }
        akqVarA.c = null;
        akqVarA.d = null;
        return akqVarA.b;
    }

    public final akq d(Object obj, Object obj2) {
        akq akqVar = new akq(obj, obj2);
        this.e++;
        akq akqVar2 = this.c;
        if (akqVar2 == null) {
            this.b = akqVar;
        } else {
            akqVar2.c = akqVar;
            akqVar.d = akqVar2;
        }
        this.c = akqVar;
        return akqVar;
    }

    public final akr e() {
        akr akrVar = new akr(this);
        this.d.put(akrVar, false);
        return akrVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aku)) {
            return false;
        }
        aku akuVar = (aku) obj;
        if (this.e != akuVar.e) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = akuVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry next = ((aks) it).next();
            Map.Entry next2 = ((aks) it2).next();
            if (next != null) {
                if (next != null || next.equals(next2)) {
                }
            } else if (next2 == null) {
                next2 = null;
                if (next != null) {
                }
            }
            return false;
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public final Object f(Object obj, Object obj2) {
        akq akqVarA = a(obj);
        if (akqVarA != null) {
            return akqVarA.b;
        }
        d(obj, obj2);
        return null;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((aks) it).next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        ako akoVar = new ako(this.b, this.c);
        this.d.put(akoVar, false);
        return akoVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(((aks) it).next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
