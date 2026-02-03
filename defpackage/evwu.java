package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evwu implements Map.Entry, fdcn {
    private final /* synthetic */ Map.Entry a;

    public evwu(Map.Entry entry) {
        entry.getClass();
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
