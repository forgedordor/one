package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dnmg extends dnmj {
    public abstract dnkb b(dnjw dnjwVar);

    public abstract Set c();

    @Override // defpackage.dnmj
    public final Set f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(c().size());
        Iterator it = c().iterator();
        while (it.hasNext()) {
            linkedHashSet.add(b((dnjw) it.next()));
        }
        return linkedHashSet;
    }
}
