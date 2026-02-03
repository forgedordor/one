package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekou extends ekao {
    final Iterator a;
    final Iterator b;
    final /* synthetic */ Set c;
    final /* synthetic */ Set d;

    public ekou(Set set, Set set2) {
        this.c = set;
        this.d = set2;
        this.a = set.iterator();
        this.b = set2.iterator();
    }

    @Override // defpackage.ekao
    protected final Object a() {
        Set set;
        Object next;
        Iterator it = this.a;
        if (it.hasNext()) {
            return it.next();
        }
        do {
            Iterator it2 = this.b;
            if (!it2.hasNext()) {
                b();
                return null;
            }
            set = this.c;
            next = it2.next();
        } while (set.contains(next));
        return next;
    }
}
