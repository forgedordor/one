package defpackage;

import java.net.SocketAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcsj {
    final Collection a;
    final int b;

    public fcsj(fbop fbopVar) {
        fbopVar.getClass();
        if (fbopVar.b.size() < 10) {
            this.a = fbopVar.b;
        } else {
            this.a = new HashSet(fbopVar.b);
        }
        Iterator it = fbopVar.b.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((SocketAddress) it.next()).hashCode();
        }
        this.b = iHashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcsj)) {
            return false;
        }
        fcsj fcsjVar = (fcsj) obj;
        if (fcsjVar.b == this.b) {
            Collection collection = fcsjVar.a;
            int size = collection.size();
            Collection<?> collection2 = this.a;
            if (size == collection2.size()) {
                return collection.containsAll(collection2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString();
    }
}
