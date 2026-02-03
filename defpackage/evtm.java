package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evtm implements Map.Entry {
    public final Map.Entry a;

    public evtm(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((evto) this.a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof evuh)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        evto evtoVar = (evto) this.a.getValue();
        evuh evuhVar = evtoVar.a;
        evtoVar.b = null;
        evtoVar.a = (evuh) obj;
        return evuhVar;
    }
}
