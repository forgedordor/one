package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgoh implements Serializable {
    private static final long serialVersionUID = -6212696554273812441L;
    private transient fgmz a;

    public fgoh(fgmz fgmzVar) {
        this.a = fgmzVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = (fgmz) objectInputStream.readObject();
    }

    private Object readResolve() {
        return fgoi.O(this.a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.a);
    }
}
