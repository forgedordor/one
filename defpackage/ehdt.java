package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehdt {
    public static final ehdt a;
    public final ekgp b;
    private final ekgp c;

    static {
        ekon ekonVar = ekon.a;
        a = new ehdt(ekonVar, ekonVar);
    }

    public ehdt(Set set, Set set2) {
        ekgi ekgiVar = new ekgi();
        ekqg ekqgVarListIterator = ((ekon) set2).listIterator();
        while (ekqgVarListIterator.hasNext()) {
            ((ehdf) ekqgVarListIterator.next()).a(ekgiVar);
        }
        this.c = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ehdf) it.next()).a(ekgiVar2);
        }
        this.b = ekgiVar2.c();
    }

    public final ehds a(String str) {
        ehds ehdsVar = (ehds) this.c.get(str);
        return ehdsVar != null ? ehdsVar : (ehds) this.b.get(str);
    }

    public final ekhx b() {
        return this.b.keySet();
    }
}
