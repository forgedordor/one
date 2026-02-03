package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvwi {
    private static dvwi a;
    private final Map b = new HashMap();

    public static synchronized dvwi a() {
        if (a == null) {
            a = new dvwi();
        }
        return a;
    }

    public final synchronized void b(Uri uri) {
        Map map = this.b;
        if (map.containsKey(uri)) {
            Iterator it = ((Set) map.get(uri)).iterator();
            while (it.hasNext()) {
                ((ContentObserver) it.next()).dispatchChange(false, uri);
            }
        }
    }

    final synchronized void c(Uri uri, ContentObserver contentObserver) {
        Set setNewSetFromMap;
        Map map = this.b;
        if (map.containsKey(uri)) {
            setNewSetFromMap = (Set) map.get(uri);
        } else {
            setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
            map.put(uri, setNewSetFromMap);
        }
        setNewSetFromMap.add(contentObserver);
    }
}
