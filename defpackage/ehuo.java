package defpackage;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehuo {
    public static Map a(Set set) {
        csq csqVar = new csq();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = (AbstractMap.SimpleImmutableEntry) it.next();
            Set setNewSetFromMap = (Set) csqVar.get(simpleImmutableEntry.getKey());
            if (setNewSetFromMap == null) {
                setNewSetFromMap = Collections.newSetFromMap(new csq());
                csqVar.put((ehul) simpleImmutableEntry.getKey(), setNewSetFromMap);
            }
            setNewSetFromMap.add((fcsu) simpleImmutableEntry.getValue());
        }
        return csqVar;
    }
}
