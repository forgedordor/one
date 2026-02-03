package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyie implements eyik, eygg {
    private static final Object a = new Object();
    private volatile eyik b;
    private volatile Object c = a;

    private eyie(eyik eyikVar) {
        this.b = eyikVar;
    }

    public static eygg a(eyik eyikVar) {
        if (eyikVar instanceof eygg) {
            return (eygg) eyikVar;
        }
        eyikVar.getClass();
        return new eyie(eyikVar);
    }

    public static eyik c(eyik eyikVar) {
        eyikVar.getClass();
        return eyikVar instanceof eyie ? eyikVar : new eyie(eyikVar);
    }

    private final synchronized Object d() {
        Object obj = this.c;
        Object obj2 = a;
        if (obj != obj2) {
            return obj;
        }
        Object objB = this.b.b();
        Object obj3 = this.c;
        if (obj3 != obj2 && obj3 != objB) {
            throw new IllegalStateException(a.j(objB, obj3, "Scoped provider was invoked recursively returning different results: ", " & ", ". This is likely due to a circular dependency."));
        }
        this.c = objB;
        this.b = null;
        return objB;
    }

    @Override // defpackage.fcsu
    public final Object b() {
        Object obj = this.c;
        return obj == a ? d() : obj;
    }
}
