package defpackage;

import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwg {
    public final LinkedHashMap a;

    public cwg() {
        this(16);
    }

    public final Object a(Object obj, Object obj2) {
        return this.a.put(obj, obj2);
    }

    public final Object b(Object obj) {
        obj.getClass();
        return this.a.remove(obj);
    }

    public final Set c() {
        Set setEntrySet = this.a.entrySet();
        setEntrySet.getClass();
        return setEntrySet;
    }

    public final boolean d() {
        return this.a.isEmpty();
    }

    public cwg(int i) {
        this.a = new LinkedHashMap(i, 0.75f, true);
    }
}
