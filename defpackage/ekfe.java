package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekfe extends ekff {
    private static final long serialVersionUID = 0;
    transient int c;

    public ekfe() {
        this(12, 2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.c = 2;
        int i = objectInputStream.readInt();
        r(new ekdi(12));
        ekos.b(this, objectInputStream, i);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        ekos.c(this, objectOutputStream);
    }

    @Override // defpackage.ekbx, defpackage.ekbi
    public final /* bridge */ /* synthetic */ Collection a() {
        return new ekdk(this.c);
    }

    public ekfe(int i, int i2) {
        super(new ekdi(i));
        this.c = 2;
        ejwl.a(true);
        this.c = i2;
    }
}
