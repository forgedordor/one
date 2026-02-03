package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekko extends ekkc {
    private static final long serialVersionUID = 3;

    public ekko(ekkp ekkpVar, ekkp ekkpVar2, ejvp ejvpVar, int i, ConcurrentMap concurrentMap) {
        super(ekkpVar, ekkpVar2, ejvpVar, i, concurrentMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        ekka ekkaVar = new ekka();
        int i2 = ekkaVar.b;
        ejwl.n(i2 == -1, "initial capacity was already set to %s", i2);
        ejwl.a(i >= 0);
        ekkaVar.b = i;
        ekkp ekkpVar = ekkaVar.d;
        ejwl.p(ekkpVar == null, "Key strength was already set to %s", ekkpVar);
        ekkp ekkpVar2 = this.a;
        ekkpVar2.getClass();
        ekkaVar.d = ekkpVar2;
        if (ekkpVar2 != ekkp.STRONG) {
            ekkaVar.a = true;
        }
        ekkaVar.f(this.b);
        ejvp ejvpVar = this.c;
        ejvp ejvpVar2 = ekkaVar.f;
        ejwl.p(ejvpVar2 == null, "key equivalence was already set to %s", ejvpVar2);
        ejvpVar.getClass();
        ekkaVar.f = ejvpVar;
        ekkaVar.a = true;
        int i3 = this.d;
        int i4 = ekkaVar.c;
        ejwl.n(i4 == -1, "concurrency level was already set to %s", i4);
        ejwl.a(i3 > 0);
        ekkaVar.c = i3;
        this.e = ekkaVar.e();
        while (true) {
            Object object = objectInputStream.readObject();
            if (object == null) {
                return;
            } else {
                this.e.put(object, objectInputStream.readObject());
            }
        }
    }

    private Object readResolve() {
        return this.e;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.e.size());
        for (Map.Entry entry : this.e.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
        objectOutputStream.writeObject(null);
    }
}
