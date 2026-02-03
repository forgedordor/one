package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akn extends aku {
    public final HashMap a = new HashMap();

    @Override // defpackage.aku
    public final akq a(Object obj) {
        return (akq) this.a.get(obj);
    }

    @Override // defpackage.aku
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.a.remove(obj);
        return objB;
    }

    public final boolean c(Object obj) {
        return this.a.containsKey(obj);
    }
}
