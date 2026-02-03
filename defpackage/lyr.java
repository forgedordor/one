package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lyr {
    public static final lxk a(Map map) {
        Collection collectionValues = map.values();
        collectionValues.getClass();
        lyt[] lytVarArr = (lyt[]) collectionValues.toArray(new lyt[0]);
        return new lyq((lyt[]) Arrays.copyOf(lytVarArr, lytVarArr.length));
    }

    public static final void b(fddy fddyVar, fdap fdapVar, Map map) {
        if (!map.containsKey(fddyVar)) {
            map.put(fddyVar, new lyt(fddyVar, fdapVar));
            return;
        }
        throw new IllegalArgumentException("A `initializer` with the same `clazz` has already been added: " + lze.a(fddyVar) + '.');
    }
}
