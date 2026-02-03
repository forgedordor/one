package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqhy {
    public final ezol a;
    public final Iterable b;

    public eqhy(ezol ezolVar, Iterable iterable) {
        this.a = ezolVar;
        this.b = iterable;
    }

    public final Set a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            fcva.y(arrayList, ((eqhw) it.next()).a);
        }
        return fcva.av(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqhy)) {
            return false;
        }
        eqhy eqhyVar = (eqhy) obj;
        return fdbq.f(this.a, eqhyVar.a) && fdbq.f(this.b, eqhyVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "UserRegistration(id=" + this.a + ", devices=" + this.b + ")";
    }
}
