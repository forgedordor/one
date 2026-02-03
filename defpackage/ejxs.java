package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejxs<T> implements Serializable, ejxr {
    private static final long serialVersionUID = 0;
    final ejxr a;
    final long b;
    volatile transient Object c;
    volatile transient long d;
    private transient ejyd e = new ejyd();

    public ejxs(ejxr ejxrVar, long j) {
        this.a = ejxrVar;
        this.b = j;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.e = new ejyd();
    }

    @Override // defpackage.ejxr
    public final T get() {
        long j = this.d;
        long jNanoTime = System.nanoTime();
        if (j == 0 || jNanoTime - j >= 0) {
            synchronized (this.e) {
                if (j == this.d) {
                    T t = (T) this.a.get();
                    this.c = t;
                    long j2 = jNanoTime + this.b;
                    if (j2 == 0) {
                        j2 = 1;
                    }
                    this.d = j2;
                    return t;
                }
            }
        }
        return (T) this.c;
    }

    public final String toString() {
        return "Suppliers.memoizeWithExpiration(" + this.a.toString() + ", " + this.b + ", NANOS)";
    }
}
