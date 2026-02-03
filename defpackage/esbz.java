package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esbz {
    public String a = null;
    public int b;
    public escf c;
    private final Set d;
    private final Set e;
    private int f;
    private final Set g;

    @SafeVarargs
    public esbz(esde esdeVar, esde... esdeVarArr) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.f = 0;
        this.b = 0;
        this.g = new HashSet();
        hashSet.add(esdeVar);
        for (esde esdeVar2 : esdeVarArr) {
            esdc.c(esdeVar2);
        }
        Collections.addAll(this.d, esdeVarArr);
    }

    public final esca a() {
        esdc.a(this.c != null, "Missing required property: factory.");
        return new esca(this.a, new HashSet(this.d), new HashSet(this.e), this.f, this.b, this.c, this.g);
    }

    public final void b(escr escrVar) {
        if (this.d.contains(escrVar.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.e.add(escrVar);
    }

    public final void c() {
        esdc.a(1 == (this.f ^ 1), "Instantiation type has already been set.");
        this.f = 1;
    }

    @SafeVarargs
    public esbz(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.f = 0;
        this.b = 0;
        this.g = new HashSet();
        hashSet.add(new esde(esdd.class, cls));
        for (Class cls2 : clsArr) {
            esdc.c(cls2);
            this.d.add(new esde(esdd.class, cls2));
        }
    }
}
