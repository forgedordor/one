package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evtc implements Map.Entry {
    final /* synthetic */ evtf a;
    private final Map.Entry b;

    public evtc(evtf evtfVar, Map.Entry entry) {
        this.a = evtfVar;
        this.b = entry;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Map.Entry) && getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a.a.a(this.b.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object value = this.b.setValue(Integer.valueOf(((evst) obj).a()));
        if (value == null) {
            return null;
        }
        return this.a.a.a(value);
    }
}
