package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dgij {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final String c;

    public dgij(String str) {
        this.c = str;
    }

    public final int a(String str, int i) {
        String strE = e(str);
        if (strE == null) {
            return i;
        }
        try {
            return Integer.parseInt(strE);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public final dgij b(String str) {
        dgij dgijVar = new dgij(str);
        this.b.add(dgijVar);
        return dgijVar;
    }

    public final dgij c(String str) {
        for (dgij dgijVar : this.b) {
            if (ejuf.e(dgijVar.c, str)) {
                return dgijVar;
            }
        }
        return null;
    }

    public final dgij d(String str, String str2) {
        for (dgij dgijVar : this.b) {
            String strE = dgijVar.e(str);
            if (strE != null && ejuf.e(strE, str2)) {
                return dgijVar;
            }
        }
        return null;
    }

    public final String e(String str) {
        for (dgii dgiiVar : this.a) {
            if (ejuf.e(dgiiVar.a, str)) {
                String str2 = dgiiVar.b;
                return ejuf.e(str2, "X") ? "" : str2;
            }
        }
        return null;
    }

    public final boolean f(String str) {
        return e(str) != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(" : {\r\n");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            sb.append((dgij) it.next());
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            sb.append((dgii) it2.next());
        }
        sb.append("}\r\n");
        return sb.toString();
    }
}
