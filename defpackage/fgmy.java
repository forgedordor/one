package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgmy implements Serializable {
    private static final long serialVersionUID = -6471952376487863581L;
    private transient String a;

    public fgmy(String str) {
        this.a = str;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = objectInputStream.readUTF();
    }

    private Object readResolve() {
        return fgmz.i(this.a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this.a);
    }
}
