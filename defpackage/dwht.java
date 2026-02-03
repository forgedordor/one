package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwht implements dwhu {
    private static dwht d;
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    private dwht() {
    }

    public static synchronized dwht a() {
        dwht dwhtVar = d;
        if (dwhtVar != null) {
            return dwhtVar;
        }
        dwht dwhtVar2 = new dwht();
        d = dwhtVar2;
        return dwhtVar2;
    }

    @Override // defpackage.dwhu
    public final void b(dzfh dzfhVar, dwqw dwqwVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dwhu) it.next()).b(dzfhVar, dwqwVar);
        }
    }
}
