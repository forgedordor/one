package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iar implements Map.Entry, fdcq {
    final /* synthetic */ ias a;
    private final Object b;
    private Object c;

    public iar(ias iasVar) {
        this.a = iasVar;
        Map.Entry entry = iasVar.c;
        entry.getClass();
        this.b = entry.getKey();
        Map.Entry entry2 = iasVar.c;
        entry2.getClass();
        this.c = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        ias iasVar = this.a;
        iaf iafVar = iasVar.a;
        if (iafVar.a() != iasVar.b) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.c;
        iafVar.put(this.b, obj);
        this.c = obj;
        return obj2;
    }
}
