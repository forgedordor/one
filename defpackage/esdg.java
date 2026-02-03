package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esdg implements escc {
    public final Set a;
    public final escc b;
    private final Set c;
    private final Set d;

    public esdg(esca escaVar, escc esccVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (escr escrVar : escaVar.c) {
            if (escrVar.a()) {
                if (escrVar.b()) {
                    hashSet4.add(escrVar.a);
                } else {
                    hashSet.add(escrVar.a);
                }
            } else if (escrVar.b()) {
                hashSet5.add(escrVar.a);
            } else {
                hashSet2.add(escrVar.a);
            }
        }
        if (!escaVar.g.isEmpty()) {
            hashSet.add(new esde(esdd.class, esfh.class));
        }
        this.c = DesugarCollections.unmodifiableSet(hashSet);
        this.d = DesugarCollections.unmodifiableSet(hashSet2);
        DesugarCollections.unmodifiableSet(hashSet3);
        this.a = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        Set set = escaVar.g;
        this.b = esccVar;
    }

    @Override // defpackage.escc
    public final esgu a(esde esdeVar) {
        throw null;
    }

    @Override // defpackage.escc
    public final esgu b(Class cls) {
        esde esdeVar = new esde(esdd.class, cls);
        if (this.d.contains(esdeVar)) {
            return this.b.a(esdeVar);
        }
        throw new esct(String.format("Attempting to request an undeclared dependency Provider<%s>.", esdeVar));
    }

    @Override // defpackage.escc
    public final esgu c(esde esdeVar) {
        throw null;
    }

    @Override // defpackage.escc
    public final Object d(esde esdeVar) {
        if (this.c.contains(esdeVar)) {
            return escb.b(this.b, esdeVar);
        }
        throw new esct(String.format("Attempting to request an undeclared dependency %s.", esdeVar));
    }

    @Override // defpackage.escc
    public final Object e(Class cls) {
        if (!this.c.contains(new esde(esdd.class, cls))) {
            throw new esct(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objC = escb.c(this.b, cls);
        if (!cls.equals(esfh.class)) {
            return objC;
        }
        return new esdf();
    }
}
