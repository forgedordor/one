package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qzk {
    public final int a;
    public final byte[] b;
    public final Map c;
    public final List d;
    public final boolean e;

    public qzk(int i, byte[] bArr, Map map, List list, boolean z) {
        this.a = i;
        this.b = bArr;
        this.c = map;
        this.d = list == null ? null : DesugarCollections.unmodifiableList(list);
        this.e = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qzk(int i, byte[] bArr, boolean z, List list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qzh qzhVar = (qzh) it.next();
                treeMap.put(qzhVar.a, qzhVar.b);
            }
        }
        this(i, bArr, treeMap, list, z);
    }
}
