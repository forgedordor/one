package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhu {
    public final Map a = new HashMap();

    public rhu() {
        new HashMap();
    }

    final void a(res resVar, rhm rhmVar) {
        Map map = this.a;
        if (rhmVar.equals(map.get(resVar))) {
            map.remove(resVar);
        }
    }
}
