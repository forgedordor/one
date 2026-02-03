package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekby extends ekbz {
    private static final long serialVersionUID = 0;
    transient int c;

    public ekby() {
        super(new ekdi(12));
        ekcw.c(3, "expectedValuesPerKey");
        this.c = 3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.c = 3;
        int i = objectInputStream.readInt();
        r(new ekdi());
        ekos.b(this, objectInputStream, i);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        ekos.c(this, objectOutputStream);
    }

    @Override // defpackage.ekap, defpackage.ekbi
    public final /* bridge */ /* synthetic */ Collection a() {
        return new ArrayList(this.c);
    }
}
