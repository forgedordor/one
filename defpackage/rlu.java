package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rlu {
    private final rlz a;
    private final rlt b;

    public rlu(lcd lcdVar) {
        rlz rlzVar = new rlz(lcdVar);
        this.b = new rlt();
        this.a = rlzVar;
    }

    public final synchronized List a(Class cls) {
        return this.a.c(cls);
    }

    public final synchronized List b(Class cls) {
        Map map = this.b.a;
        rls rlsVar = (rls) map.get(cls);
        List list = rlsVar == null ? null : rlsVar.a;
        if (list != null) {
            return list;
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(this.a.b(cls));
        if (((rls) map.put(cls, new rls(listUnmodifiableList))) == null) {
            return listUnmodifiableList;
        }
        throw new IllegalStateException("Already cached loaders for model: ".concat(String.valueOf(String.valueOf(cls))));
    }

    public final synchronized void c(Class cls, Class cls2, rlr rlrVar) {
        this.a.d(cls, cls2, rlrVar);
        this.b.a();
    }

    public final synchronized void d(Class cls, Class cls2, rlr rlrVar) {
        this.a.e(cls, cls2, rlrVar);
        this.b.a();
    }
}
