package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebbz {
    private Map a;

    public ebbz(Map map) {
        this.a = map;
    }

    public final void a() {
        ecem.c();
        this.a.getClass();
        for (ebbx ebbxVar : ebbx.values()) {
            ebby ebbyVar = (ebby) this.a.get(ebbxVar);
            if (ebbyVar != null) {
                ebbyVar.a();
            }
        }
        this.a = null;
    }
}
