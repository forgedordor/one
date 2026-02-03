package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elbw {
    public final Map a;
    public volatile transient Map.Entry b;

    public elbw(Map map) {
        this.a = map;
    }

    public final Object a(Object obj) {
        obj.getClass();
        Object objB = b(obj);
        return objB == null ? this.a.get(obj) : objB;
    }

    public final Object b(Object obj) {
        Map.Entry entry = this.b;
        if (entry == null || entry.getKey() != obj) {
            return null;
        }
        return entry.getValue();
    }
}
