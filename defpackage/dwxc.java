package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwxc extends dwwy {
    public int b;
    private final Set c = new HashSet();
    public final Map a = new HashMap();

    public dwxc(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            dwwy dwwyVar = (dwwy) it.next();
            this.c.add(new dwxa(this, dwwyVar));
            this.a.put(dwwyVar, null);
        }
    }

    private final synchronized void d() {
        Set set = this.c;
        this.b = set.size();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((dwxa) it.next()).a();
        }
    }

    private final synchronized void m() {
        this.b = -1;
        f();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((dwxa) it.next()).b();
        }
    }

    @Override // defpackage.dwwy
    protected final synchronized void a() {
        d();
    }

    @Override // defpackage.dwwy
    protected final synchronized void b() {
        m();
    }

    public dwxc(dwwy... dwwyVarArr) {
        for (int i = 0; i < 2; i++) {
            dwwy dwwyVar = dwwyVarArr[i];
            this.c.add(new dwxa(this, dwwyVar));
            this.a.put(dwwyVar, null);
        }
    }
}
