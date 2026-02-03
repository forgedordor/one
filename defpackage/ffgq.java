package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffgq implements Serializable {
    private static final long serialVersionUID = 1;
    public String a;
    private final Map b = new LinkedHashMap();

    public final void a(ffgp ffgpVar) throws ffgi {
        if (ffgpVar == null) {
            this.a = null;
            return;
        }
        String str = this.a;
        if (str != null && !str.equals(ffgpVar.a)) {
            throw new ffgi(this, ffgpVar);
        }
        this.a = ffgpVar.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            ffgp ffgpVar = (ffgp) it.next();
            String str = ffgpVar.a;
            sb.append("-");
            sb.append(str);
            if (ffgpVar.c != null) {
                sb.append(" ");
                sb.append(ffgpVar.c);
            }
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
