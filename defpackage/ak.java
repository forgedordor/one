package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ak implements Serializable {
    private static final long serialVersionUID = 1;
    public boolean a = false;
    public final List b = new ArrayList();

    public final void a(aj ajVar) {
        List list = this.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ajVar.a;
            if (str.equals(((aj) it.next()).a)) {
                throw new IllegalArgumentException("Duplicate keyword: ".concat(String.valueOf(str)));
            }
        }
        list.add(ajVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (aj ajVar : this.b) {
            if (sb.length() != 0) {
                sb.append(";  ");
            }
            sb.append(ajVar);
        }
        return sb.toString();
    }
}
