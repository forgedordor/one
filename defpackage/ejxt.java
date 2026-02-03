package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejxt<T> implements Serializable, ejxr {
    private static final long serialVersionUID = 0;
    final ejxr a;
    volatile transient boolean b;
    transient Object c;
    private transient ejyd d = new ejyd();

    public ejxt(ejxr ejxrVar) {
        ejxrVar.getClass();
        this.a = ejxrVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.d = new ejyd();
    }

    @Override // defpackage.ejxr
    public final T get() {
        if (!this.b) {
            synchronized (this.d) {
                if (!this.b) {
                    T t = (T) this.a.get();
                    this.c = t;
                    this.b = true;
                    return t;
                }
            }
        }
        return (T) this.c;
    }

    public final String toString() {
        Object obj;
        if (this.b) {
            obj = "<supplier that returned " + String.valueOf(this.c) + ">";
        } else {
            obj = this.a;
        }
        return a.b(obj, "Suppliers.memoize(", ")");
    }
}
