package defpackage;

import androidx.car.app.model.Alert;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcsn extends fbqg {
    private final List a;
    private final AtomicInteger b;
    private final int c;

    public fcsn(List list, AtomicInteger atomicInteger) {
        ejwl.b(!list.isEmpty(), "empty list");
        this.a = list;
        this.b = atomicInteger;
        Iterator it = list.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((fbqg) it.next()).hashCode();
        }
        this.c = iHashCode;
    }

    @Override // defpackage.fbqg
    public final fbqc a(fbqd fbqdVar) {
        int andIncrement = this.b.getAndIncrement() & Alert.DURATION_SHOW_INDEFINITELY;
        List list = this.a;
        return ((fbqg) list.get(andIncrement % list.size())).a(fbqdVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fcsn)) {
            return false;
        }
        fcsn fcsnVar = (fcsn) obj;
        if (fcsnVar == this) {
            return true;
        }
        if (this.c == fcsnVar.c && this.b == fcsnVar.b) {
            List list = this.a;
            int size = list.size();
            List list2 = fcsnVar.a;
            if (size == list2.size() && new HashSet(list).containsAll(list2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        ejwf ejwfVarA = ejwg.a(fcsn.class);
        ejwfVarA.b("subchannelPickers", this.a);
        return ejwfVarA.toString();
    }
}
