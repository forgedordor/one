package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffgo extends ffgs {
    private static final long serialVersionUID = 8161889051578563249L;

    public ffgo(List list) {
        StringBuilder sb = new StringBuilder("Missing required option");
        sb.append(list.size() == 1 ? "" : "s");
        sb.append(": ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        super(sb.toString());
    }
}
