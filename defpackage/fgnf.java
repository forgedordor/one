package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgnf extends fgon {
    private static final long serialVersionUID = -4481126543819298617L;
    public fgng a;
    public fgms b;

    public fgnf(fgng fgngVar, fgms fgmsVar) {
        this.a = fgngVar;
        this.b = fgmsVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.a = (fgng) objectInputStream.readObject();
        this.b = ((fgmu) objectInputStream.readObject()).a(this.a.b);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.a);
        objectOutputStream.writeObject(this.b.p());
    }

    @Override // defpackage.fgon
    protected final long a() {
        return this.a.a;
    }

    @Override // defpackage.fgon
    protected final fgmq b() {
        return this.a.b;
    }

    @Override // defpackage.fgon
    public final fgms c() {
        return this.b;
    }
}
