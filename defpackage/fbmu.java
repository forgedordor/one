package defpackage;

import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbmu {
    public fbmw a;
    public IdentityHashMap b;

    public fbmu(fbmw fbmwVar) {
        this.a = fbmwVar;
    }

    public final fbmw a() {
        if (this.b != null) {
            fbmw fbmwVar = this.a;
            fbmw fbmwVar2 = fbmw.a;
            for (Map.Entry entry : fbmwVar.b.entrySet()) {
                if (!this.b.containsKey(entry.getKey())) {
                    this.b.put((fbmv) entry.getKey(), entry.getValue());
                }
            }
            this.a = new fbmw(this.b);
            this.b = null;
        }
        return this.a;
    }

    public final void b(fbmv fbmvVar, Object obj) {
        if (this.b == null) {
            this.b = new IdentityHashMap(1);
        }
        this.b.put(fbmvVar, obj);
    }
}
