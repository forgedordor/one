package defpackage;

import defpackage.evuh;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evsl<ContainingType extends evuh, Type> extends evrp<ContainingType, Type> {
    final evuh a;
    public final Object b;
    final evuh c;
    public final evsk d;

    public evsl(evuh evuhVar, Object obj, evuh evuhVar2, evsk evskVar) {
        if (evuhVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (evskVar.c == evwh.MESSAGE && evuhVar2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.a = evuhVar;
        this.b = obj;
        this.c = evuhVar2;
        this.d = evskVar;
    }

    @Override // defpackage.evrp
    public final int a() {
        return this.d.b;
    }

    public final evwh b() {
        return this.d.c;
    }

    public final Object c(Object obj) {
        evsk evskVar = this.d;
        if (!evskVar.d) {
            return d(obj);
        }
        if (evskVar.a() != evwi.ENUM) {
            return obj;
        }
        evur evurVar = new evur(evur.a, 0, true);
        List list = (List) obj;
        evurVar.d(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            evurVar.add(d(it.next()));
        }
        evurVar.b();
        return evurVar;
    }

    final Object d(Object obj) {
        evsk evskVar = this.d;
        if (evskVar.a() != evwi.ENUM) {
            return obj;
        }
        return evskVar.a.a(((Integer) obj).intValue());
    }

    final Object e(Object obj) {
        return this.d.a() == evwi.ENUM ? Integer.valueOf(((evst) obj).a()) : obj;
    }

    public final boolean f() {
        return this.d.d;
    }
}
