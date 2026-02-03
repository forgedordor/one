package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csdn {
    public final Set a;

    public csdn() {
        this(fcvq.a);
    }

    public final int a() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((csdl) it.next()).n;
        }
        return i;
    }

    public final csdn b(csdl csdlVar, boolean z) {
        return (z || csdlVar.c()) ? new csdn(fcwm.h(this.a, csdlVar)) : new csdn(fcwm.f(this.a, csdlVar));
    }

    public final boolean c(csdl csdlVar, boolean z) {
        if (csdlVar.c()) {
            return true;
        }
        if (!z) {
            Set set = this.a;
            if (set.size() == 1 && set.contains(csdlVar)) {
                return true;
            }
            return set.isEmpty();
        }
        Set set2 = this.a;
        if (set2.isEmpty()) {
            return true;
        }
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            if (((csdl) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    public final boolean d() {
        Set set = this.a;
        if (set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((csdl) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        Set set = this.a;
        if (set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((csdl) it.next()).c()) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof csdn)) {
            return false;
        }
        return fdbq.f(this.a, ((csdn) obj).a);
    }

    public final boolean f() {
        if (g() || e()) {
            return false;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (!((csdl) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    public final boolean g() {
        return this.a.isEmpty();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public csdn(Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((csdl) obj) != csdl.a) {
                arrayList.add(obj);
            }
        }
        this.a = fcva.av(arrayList);
    }
}
