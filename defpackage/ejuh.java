package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejuh implements Serializable, ejug {
    private static final long serialVersionUID = -1352468805830701672L;
    final Iterable a;

    public ejuh(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((ejug) it.next()).getClass();
        }
        this.a = iterable;
    }

    @Override // defpackage.ejug
    public final boolean b(Object obj, Object obj2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((ejug) it.next()).b(obj, obj2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ejuh) {
            Iterable iterable = this.a;
            Iterable iterable2 = ((ejuh) obj).a;
            Iterator it = iterable.iterator();
            Iterator it2 = iterable2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!it2.hasNext() || !it.next().equals(it2.next())) {
                        break;
                    }
                } else if (!it2.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.a.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + it.next().hashCode();
        }
        return iHashCode;
    }
}
