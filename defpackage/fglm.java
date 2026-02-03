package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fglm {
    private List a;

    public final List a() {
        List list = this.a;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.a == null) {
            this.a = new ArrayList();
        }
        if (this.a.isEmpty()) {
            this.a.addAll(list);
            return;
        }
        fgll fgllVar = (fgll) this.a.get(this.a.size() - 1);
        fgll fgllVar2 = (fgll) list.get(0);
        int i = fgllVar.a;
        int i2 = fgllVar.b;
        int i3 = fgllVar2.a;
        throw null;
    }

    public final void c(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            b(((fgle) it.next()).f());
        }
    }
}
