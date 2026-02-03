package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rvz {
    public List a = null;

    public final void a(rvz rvzVar) {
        List list = rvzVar.a;
        if (list == null) {
            return;
        }
        if (this.a == null) {
            this.a = new ArrayList(list.size());
        }
        Iterator it = rvzVar.a.iterator();
        while (it.hasNext()) {
            this.a.add((rvy) it.next());
        }
    }

    public final String toString() {
        if (this.a == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            sb.append(((rvy) it.next()).toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
