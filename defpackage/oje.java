package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oje extends lxd {
    public final Map a = new LinkedHashMap();

    public final void a(String str) {
        lxp lxpVar = (lxp) this.a.remove(str);
        if (lxpVar != null) {
            lxpVar.c();
        }
    }

    @Override // defpackage.lxd
    protected final void fC() {
        Map map = this.a;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((lxp) it.next()).c();
        }
        map.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(fctz.b(System.identityHashCode(this) & 4294967295L, 16));
        sb.append("} ViewModelStores (");
        Iterator it = this.a.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
