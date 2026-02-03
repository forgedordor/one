package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcxi implements Externalizable {
    private static final long serialVersionUID = 0;
    private Collection a;
    private final int b;

    public fcxi(Collection collection, int i) {
        this.a = collection;
        this.b = i;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws InvalidObjectException {
        Collection collectionA;
        objectInput.getClass();
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            throw new InvalidObjectException(a.e(b, "Unsupported flags value: ", "."));
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException(a.e(i2, "Illegal size value: ", "."));
        }
        int i3 = 0;
        if (i != 0) {
            fcxk fcxkVar = new fcxk(new fcxe(i2));
            while (i3 < i2) {
                fcxkVar.add(objectInput.readObject());
                i3++;
            }
            collectionA = fcwm.a(fcxkVar);
        } else {
            fcww fcwwVar = new fcww(i2);
            while (i3 < i2) {
                fcwwVar.add(objectInput.readObject());
                i3++;
            }
            collectionA = fcva.a(fcwwVar);
        }
        this.a = collectionA;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(this.b);
        objectOutput.writeInt(this.a.size());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public fcxi() {
        this(fcvo.a, 0);
    }
}
