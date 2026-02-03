package defpackage;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pew {
    public final Map a = new LinkedHashMap();

    public final void a(phj phjVar) {
        phjVar.getClass();
        int i = phjVar.a;
        Map map = this.a;
        Integer numValueOf = Integer.valueOf(i);
        Object treeMap = map.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            map.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        Integer numValueOf2 = Integer.valueOf(phjVar.b);
        if (treeMap2.containsKey(numValueOf2)) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(numValueOf2) + " with " + phjVar);
        }
        treeMap2.put(numValueOf2, phjVar);
    }
}
