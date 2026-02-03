package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxa {
    public final Map a = new LinkedHashMap();
    public final Map b = new LinkedHashMap();

    public final fxc a(fwz fwzVar) {
        return (fxc) this.a.get(fwzVar);
    }

    public final void b(fwz fwzVar) {
        Map map = this.a;
        fxc fxcVar = (fxc) map.get(fwzVar);
        if (fxcVar != null) {
        }
        map.remove(fwzVar);
    }
}
