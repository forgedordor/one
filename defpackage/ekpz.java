package defpackage;

import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ekpz implements Serializable {
    private static final long serialVersionUID = 0;
    final Object f;
    final Object g;

    public ekpz(Object obj, Object obj2) {
        obj.getClass();
        this.f = obj;
        this.g = obj2 == null ? this : obj2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.g) {
            objectOutputStream.defaultWriteObject();
        }
    }

    public final String toString() {
        String string;
        synchronized (this.g) {
            string = this.f.toString();
        }
        return string;
    }
}
