package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejxv<T> implements ejxr<T> {
    private static final ejxr a = new ejxr() { // from class: ejxu
        @Override // defpackage.ejxr
        public final Object get() {
            throw new IllegalStateException();
        }
    };
    private final ejyd b = new ejyd();
    private volatile ejxr c;
    private Object d;

    public ejxv(ejxr ejxrVar) {
        ejxrVar.getClass();
        this.c = ejxrVar;
    }

    @Override // defpackage.ejxr
    public final T get() {
        ejxr ejxrVar = this.c;
        ejxr ejxrVar2 = a;
        if (ejxrVar != ejxrVar2) {
            synchronized (this.b) {
                if (this.c != ejxrVar2) {
                    T t = (T) this.c.get();
                    this.d = t;
                    this.c = ejxrVar2;
                    return t;
                }
            }
        }
        return (T) this.d;
    }

    public final String toString() {
        Object obj = this.c;
        if (obj == a) {
            obj = "<supplier that returned " + String.valueOf(this.d) + ">";
        }
        return a.I(obj, "Suppliers.memoize(", ")");
    }
}
