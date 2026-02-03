package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ekbm<E> extends ekbu<E> implements Serializable {
    private static final long serialVersionUID = 0;
    transient eknt a = g();
    transient long b;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        this.a = g();
        for (int i2 = 0; i2 < i; i2++) {
            a(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(j().size());
        for (eknh eknhVar : j()) {
            objectOutputStream.writeObject(eknhVar.b());
            objectOutputStream.writeInt(eknhVar.a());
        }
    }

    @Override // defpackage.ekbu, defpackage.ekni
    public final int a(Object obj, int i) {
        if (i == 0) {
            return b(obj);
        }
        ejwl.d(i > 0, "occurrences cannot be negative: %s", i);
        int iD = this.a.d(obj);
        long j = i;
        if (iD == -1) {
            this.a.p(obj, i);
            this.b += j;
            return 0;
        }
        int iC = this.a.c(iD);
        long j2 = iC + j;
        ejwl.e(j2 <= 2147483647L, "too many occurrences: %s", j2);
        this.a.n(iD, (int) j2);
        this.b += j;
        return iC;
    }

    @Override // defpackage.ekni
    public final int b(Object obj) {
        return this.a.b(obj);
    }

    @Override // defpackage.ekbu
    public final int c() {
        return this.a.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        eknt ekntVar = this.a;
        ekntVar.d++;
        Arrays.fill(ekntVar.a, 0, ekntVar.c, (Object) null);
        Arrays.fill(ekntVar.b, 0, ekntVar.c, 0);
        Arrays.fill(ekntVar.e, -1);
        Arrays.fill(ekntVar.f, -1L);
        ekntVar.c = 0;
        this.b = 0L;
    }

    @Override // defpackage.ekbu, defpackage.ekni
    public final int d(Object obj, int i) {
        ejwl.d(true, "occurrences cannot be negative: %s", i);
        int iD = this.a.d(obj);
        if (iD == -1) {
            return 0;
        }
        int iC = this.a.c(iD);
        if (iC > i) {
            this.a.n(iD, iC - i);
        } else {
            this.a.g(iD);
            i = iC;
        }
        this.b -= i;
        return iC;
    }

    @Override // defpackage.ekbu
    public final Iterator e() {
        return new ekbj(this);
    }

    @Override // defpackage.ekbu
    public final Iterator f() {
        return new ekbk(this);
    }

    public abstract eknt g();

    @Override // defpackage.ekbu, defpackage.ekni
    public final boolean h(Object obj, int i) {
        ekcw.c(i, "oldCount");
        ekcw.c(0, "newCount");
        int iD = this.a.d(obj);
        if (iD == -1) {
            return i == 0;
        }
        if (this.a.c(iD) != i) {
            return false;
        }
        this.a.g(iD);
        this.b -= i;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new eknm(this, j().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.ekni
    public final int size() {
        return eonc.f(this.b);
    }
}
