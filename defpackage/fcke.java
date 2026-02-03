package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcke {
    final boolean a;
    final List b;
    final Collection c;
    final Collection d;
    final int e;
    final fckn f;
    final boolean g;
    final boolean h;

    public fcke(List list, Collection collection, Collection collection2, fckn fcknVar, boolean z, boolean z2, boolean z3, int i) {
        this.b = list;
        collection.getClass();
        this.c = collection;
        this.f = fcknVar;
        this.d = collection2;
        this.g = z;
        this.a = z2;
        this.h = z3;
        this.e = i;
        ejwl.m(!z2 || list == null, "passThrough should imply buffer is null");
        ejwl.m((z2 && fcknVar == null) ? false : true, "passThrough should imply winningSubstream != null");
        ejwl.m(!z2 || (collection.size() == 1 && collection.contains(fcknVar)) || (collection.size() == 0 && fcknVar.b), "passThrough should imply winningSubstream is drained");
        ejwl.m((z && fcknVar == null) ? false : true, "cancelled should imply committed");
    }

    final fcke a(fckn fcknVar) {
        Collection collectionUnmodifiableCollection;
        boolean z = this.h;
        ejwl.m(!z, "hedging frozen");
        fckn fcknVar2 = this.f;
        ejwl.m(fcknVar2 == null, "already committed");
        Collection collection = this.d;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(fcknVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(fcknVar);
            collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
        }
        return new fcke(this.b, this.c, collectionUnmodifiableCollection, fcknVar2, this.g, this.a, z, this.e + 1);
    }

    final fcke b() {
        return this.h ? this : new fcke(this.b, this.c, this.d, this.f, this.g, this.a, true, this.e);
    }

    final fcke c(fckn fcknVar) {
        Collection collectionUnmodifiableCollection;
        ejwl.m(!this.a, "Already passThrough");
        if (fcknVar.b) {
            collectionUnmodifiableCollection = this.c;
        } else {
            Collection collection = this.c;
            if (collection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(fcknVar);
            } else {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.add(fcknVar);
                collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection2 = collectionUnmodifiableCollection;
        fckn fcknVar2 = this.f;
        boolean z = fcknVar2 != null;
        List list = this.b;
        if (z) {
            ejwl.m(fcknVar2 == fcknVar, "Another RPC attempt has already committed");
            list = null;
        }
        return new fcke(list, collection2, this.d, fcknVar2, this.g, z, this.h, this.e);
    }
}
