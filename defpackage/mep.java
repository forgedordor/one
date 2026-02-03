package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mep<E> implements Iterable<E> {
    public final Object a = new Object();
    public final Map b = new HashMap();
    public Set c = Collections.EMPTY_SET;
    public List d = Collections.EMPTY_LIST;

    public final int a(Object obj) {
        int iIntValue;
        synchronized (this.a) {
            Map map = this.b;
            iIntValue = map.containsKey(obj) ? ((Integer) map.get(obj)).intValue() : 0;
        }
        return iIntValue;
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.a) {
            it = this.d.iterator();
        }
        return it;
    }
}
