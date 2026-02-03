package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffgr implements Serializable {
    private static final long serialVersionUID = 1;
    public final Map a = new LinkedHashMap();
    public final Map b = new LinkedHashMap();
    public final List c = new ArrayList();
    public final Map d = new LinkedHashMap();

    public final List a() {
        return new ArrayList(this.a.values());
    }

    public final ffgq b(ffgp ffgpVar) {
        return (ffgq) this.d.get(ffgpVar.a);
    }

    public final boolean c(String str) {
        Map map = this.a;
        String strA = ffgv.a(str);
        return map.containsKey(strA) || this.b.containsKey(strA);
    }

    public final void d(ffgp ffgpVar) {
        if (ffgpVar.b()) {
            this.b.put(ffgpVar.b, ffgpVar);
        }
        this.a.put(ffgpVar.a, ffgpVar);
    }

    public final String toString() {
        return "[ Options: [ short " + this.a.toString() + " ] [ long " + this.b + " ]";
    }
}
